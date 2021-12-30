package pl.sigitarius.dorel.model.dao;

import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.pim.Item;
import pl.sigitarius.dorel.model.pim.LabelItem;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Slf4j
public class AttributeDao {

	private static final String INSERT_INTO_ATTRIBUTES = "INSERT INTO Attribute VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?" +
			", ?, ?)";
	private static final String DELETE_ATTRIBUTES = "DELETE Attribute WHERE article_number = ?";

	private MsSqlConnection connection;

	public AttributeDao(MsSqlConnection connection) {
		this.connection = connection;
	}


	public void insertAtribute(Item item) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(INSERT_INTO_ATTRIBUTES);

			pstmt.setLong(1, item.getArticleNumber());
			LabelItem brand = item.getBrand().getItem();
			pstmt.setObject(2, brand != null ? brand.getID() : null);
			pstmt.setObject(3,  brand != null ? brand.getLABEL() : null);
			LabelItem family = item.getFamily().getItem();
			pstmt.setObject(4, family != null ? family.getID() : null);
			pstmt.setObject(5, family != null ? family.getLABEL() : null);
			LabelItem line = item.getLine().getItem();
			pstmt.setObject(6, line != null ? line.getID() : null);
			pstmt.setObject(7, line != null ? line.getLABEL() : null);
			LabelItem range = item.getRange().getItem();
			pstmt.setObject(8, range != null ? range.getID() : null);
			pstmt.setObject(9, range != null ? range.getLABEL() : null);
			LabelItem approximateAgeTextExt = item.getApproximateAgeTextExt().getItem();
			pstmt.setObject(10, approximateAgeTextExt != null ? approximateAgeTextExt.getID() : null);
			pstmt.setObject(11, approximateAgeTextExt != null ? approximateAgeTextExt.getLABEL() : null);
			LabelItem lengthClassExt = item.getLengthClassExt().getItem();
			pstmt.setObject(12, lengthClassExt != null ? lengthClassExt.getID() : null);
			pstmt.setObject(13, lengthClassExt != null ? lengthClassExt.getLABEL() : null);
			log.info("Adding Attributes for " + item.getArticleNumber());

			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to save Attributes to DB", e);
			throw new RuntimeException(e);
		}
	}


	public void deleteByArticleNumber(long articleNumber) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(DELETE_ATTRIBUTES);
			pstmt.setLong(1, articleNumber);
			int deleted = pstmt.executeUpdate();
			if(deleted > 0){
				log.info("Remove Attributes - article_number " + articleNumber);
			}
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to delete Attributes from DB", e);
			throw new RuntimeException(e);
		}
	}
}
