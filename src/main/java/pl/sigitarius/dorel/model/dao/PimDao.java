package pl.sigitarius.dorel.model.dao;

import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.db.Pim;
import pl.sigitarius.dorel.model.pim.Item;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PimDao {

	private static final String SELECT_FROM_PIM = "SELECT * FROM Pim";
	private static final String INSERT_INTO_PIM = "INSERT INTO Pim OUTPUT Inserted.ID VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String DELETE_PIM = "DELETE Pim WHERE article_number = ?";

	private MsSqlConnection connection;

	public PimDao(MsSqlConnection connection) {
		this.connection = connection;
	}


	public List<Pim> getPimItems() {
		List<Pim> items = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_FROM_PIM);
			while (rs.next()) {
				items.add(new Pim(
						rs.getInt("id"),
						rs.getTimestamp("created").toLocalDateTime(),
						rs.getTimestamp("changed").toLocalDateTime(),
						rs.getLong("parent_id"),
						rs.getLong("pdmarticle_id"),
						rs.getString("label"),
						rs.getString("first_collection_year"),
						rs.getString("seo_product_name"),
						rs.getString("seo_description"),
						rs.getLong("article_number"),
						rs.getString("external_key"),
						rs.getString("sku"),
						rs.getString("ean13_barcode_text"),
						rs.getString("erp_full_product_name"),
						rs.getString("commercial_product_name"),
						rs.getString("gross_weight"),
						rs.getString("net_weight"),
						rs.getString("volume"),
						rs.getString("product_weight")
						));
			}
		} catch (SQLException e) {
			log.error("Failed to retrieve Pim items from the database", e);
			throw new RuntimeException(e);
		}
		return items;
	}

	public void deletePimByArticleNumber(long articleNumber) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(DELETE_PIM);
			pstmt.setLong(1, articleNumber);
			int deleted = pstmt.executeUpdate();
			if(deleted > 0){
				log.info("Remove Pim - article_number " + articleNumber);
			}
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to delete Pim from DB", e);
			throw new RuntimeException(e);
		}
	}


	public int insertPim(Pim pim) {
		int lastIdentity = 0;
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(INSERT_INTO_PIM);

			pstmt.setInt(1, pim.getId());
			LocalDateTime created = pim.getCreated();
			pstmt.setTimestamp(2, created != null ? Timestamp.valueOf(created) : null);
			LocalDateTime changed = pim.getChanged();
			pstmt.setTimestamp(3, changed != null ? Timestamp.valueOf(changed) : null);
			pstmt.setLong(4, pim.getParentId());
			pstmt.setLong(5, pim.getPdmarticleId());
			pstmt.setString(6, pim.getLabel());
			pstmt.setString(7, pim.getFirstCollectionYear());
			pstmt.setString(8, pim.getSeoProductName());
			pstmt.setString(9, pim.getSeoDescription());
			pstmt.setLong(10, pim.getArticleNumber());
			pstmt.setString(11, pim.getExternalKey());
			pstmt.setString(12, pim.getSku());
			pstmt.setString(13, pim.getEan13BarcodeText());
			pstmt.setString(14, pim.getErpFullProductName());
			pstmt.setString(15, pim.getCommercialProductName());
			pstmt.setString(16, pim.getGrossWeight());
			pstmt.setString(17, pim.getNetWeight());
			pstmt.setString(18, pim.getVolume());
			pstmt.setString(19, pim.getProductWeight());
			log.info("Adding " + pim);

			ResultSet identities = pstmt.executeQuery();
			identities.next();
			lastIdentity = identities.getInt(1);
			identities.close();

			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to save Pim to DB", e);
			throw new RuntimeException(e);
		}
		return lastIdentity;
	}

	public int insertPim(Item item) {
		int lastIdentity = 0;
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(INSERT_INTO_PIM);

			pstmt.setInt(1, item.getID());
			Timestamp created = Timestamp.valueOf(item.getCreated());
			pstmt.setTimestamp(2, created);
			Timestamp changed = Timestamp.valueOf(item.getChanged());
			pstmt.setTimestamp(3, changed);
			pstmt.setLong(4, item.getParentID());
			pstmt.setLong(5, item.getPdmarticleID());
			pstmt.setString(6, item.getLabel());
			pstmt.setString(7, item.getFirstCollectionYear());
			pstmt.setString(8, item.getSEOProductName());
			pstmt.setString(9, item.getSEODescription());
			pstmt.setLong(10, item.getArticleNumber());
			pstmt.setString(11, item.getExternalKey());
			pstmt.setString(12, item.getSku());
			pstmt.setString(13, item.getEAN13BarcodeText());
			pstmt.setString(14, item.getERPFullProductName());
			pstmt.setString(15, item.getCommercialProductName());
			pstmt.setString(16, item.getGrossWeight());
			pstmt.setString(17, item.getNetWeight());
			pstmt.setString(18, item.getVolume());
			pstmt.setString(19, item.getProductWeight());
			log.info("Adding " + item);

			ResultSet identities = pstmt.executeQuery();
			identities.next();
			lastIdentity = identities.getInt(1);
			identities.close();

			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to save Pim to DB", e);
			throw new RuntimeException(e);
		}
		return lastIdentity;
	}


}
