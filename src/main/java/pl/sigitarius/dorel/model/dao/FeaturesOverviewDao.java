package pl.sigitarius.dorel.model.dao;

import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.pim.Item;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Slf4j
public class FeaturesOverviewDao {

	private static final String INSERT_INTO_FEATURES_OVERVIEW = "INSERT INTO Features_overview VALUES(?, ?, ?)";
	private static final String DELETE_FEATURES_OVERVIEW = "DELETE Features_overview WHERE article_number = ?";

	private MsSqlConnection connection;

	public FeaturesOverviewDao(MsSqlConnection connection) {
		this.connection = connection;
	}


	public void insertFeatureOverview(Item item) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(INSERT_INTO_FEATURES_OVERVIEW);

			pstmt.setLong(1, item.getArticleNumber());
			pstmt.setString(2, item.getFeaturesOverviewShortText());
			pstmt.setString(3, item.getFeaturesOverviewLongText());
			log.info("Adding FeatureOverview for " + item.getArticleNumber());

			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to save FeatureOverview to DB", e);
			throw new RuntimeException(e);
		}
	}


	public void deleteByArticleNumber(long articleNumber) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(DELETE_FEATURES_OVERVIEW);
			pstmt.setLong(1, articleNumber);
			int deleted = pstmt.executeUpdate();
			if(deleted > 0){
				log.info("Remove FeatureOverview - article_number " + articleNumber);
			}
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to delete FeatureOverview from DB", e);
			throw new RuntimeException(e);
		}
	}
}
