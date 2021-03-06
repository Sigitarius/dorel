package pl.sigitarius.dorel.model.dao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.db.SellingPoints;
import pl.sigitarius.dorel.model.pim.Item;
import pl.sigitarius.dorel.model.pim.UspItem;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class SellingPointsDao {

    private static final String SELECT_ALL_SELLING_POINTS = "SELECT * FROM Selling_points";
    private static final String INSERT_INTO_SELLING_POINTS = "INSERT INTO Selling_points VALUES(?, ?, ?, ?, ?)";
    private static final String DELETE_SELLING_POINTS = "DELETE Selling_points WHERE article_number = ?";

    private final MsSqlConnection connection;

    public List<SellingPoints> getAllSellingPoints() {
        List<SellingPoints> sellingPoints = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(connection.getURL())) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SELECT_ALL_SELLING_POINTS);

            while (rs.next()) {
                sellingPoints.add(new SellingPoints(rs.getLong("article_number"),
                        rs.getInt("usp_id"),
                        rs.getString("usp_title"),
                        rs.getString("usp_long_text"),
                        rs.getString("usp_image_website")));
            }

        } catch (SQLException e) {
            log.error("Failed to retrieve SellingPoints from DB", e);
            throw new RuntimeException(e);
        }
        return sellingPoints;
    }

    public void insertSellingPoints(Item item) {
        try (Connection con = DriverManager.getConnection(connection.getURL())) {
            PreparedStatement pstmt = con.prepareStatement(INSERT_INTO_SELLING_POINTS);

            List<UspItem> items = item.getUSP().getItem();
            for (UspItem imageItem : items) {
                pstmt.setLong(1, item.getArticleNumber());
                pstmt.setInt(2, imageItem.getID());
                pstmt.setString(3, imageItem.getUSPTitle());
				pstmt.setString(4, imageItem.getUSPLongText());
				pstmt.setString(5, imageItem.getUSPImageWebsite());
				pstmt.addBatch();
			}

			pstmt.executeBatch();
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to save SellingPoints to DB", e);
			throw new RuntimeException(e);
		}
	}


	public void deleteByArticleNumber(long articleNumber) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(DELETE_SELLING_POINTS);
			pstmt.setLong(1, articleNumber);
			int deleted = pstmt.executeUpdate();
			if(deleted > 0){
				log.info("Remove SellingPoints - article_number " + articleNumber);
			}
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to delete SellingPoints from DB", e);
			throw new RuntimeException(e);
		}
	}
}
