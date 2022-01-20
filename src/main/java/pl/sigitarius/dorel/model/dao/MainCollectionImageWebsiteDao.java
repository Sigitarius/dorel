package pl.sigitarius.dorel.model.dao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.db.MainCollectionImageWebsite;
import pl.sigitarius.dorel.model.pim.Item;
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
public class MainCollectionImageWebsiteDao {

	private static final String SELECT_ALL_WEBSITE_IMAGES = "SELECT * FROM Main_collection_image_website";
	private static final String INSERT_INTO_MAIN_COLLECTION = "INSERT INTO Main_collection_image_website VALUES(?, ?)";
	private static final String DELETE_MAIN_COLLECTION = "DELETE Main_collection_image_website WHERE article_number = ?";

    private final MsSqlConnection connection;

	public List<MainCollectionImageWebsite> getAllImages() {
		List<MainCollectionImageWebsite> images = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_ALL_WEBSITE_IMAGES);

			while(rs.next()){
				images.add(new MainCollectionImageWebsite(rs.getLong("article_number"),
						rs.getString("path")));
			}

		} catch (SQLException e) {
			log.error("Failed to retrieve MainCollectionImageWebsite from DB", e);
			throw new RuntimeException(e);
		}
		return images;
	}


	public void insertMainCollectionImageWebsite(Item item) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(INSERT_INTO_MAIN_COLLECTION);

			pstmt.setLong(1, item.getArticleNumber());
			pstmt.setString(2, item.getMainCollectionImageWebsite());
			log.info("Adding MainCollectionImageWebsite for " + item.getArticleNumber());

			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to save MainCollectionImageWebsite to DB", e);
			throw new RuntimeException(e);
		}
	}


	public void deleteByArticleNumber(long articleNumber) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(DELETE_MAIN_COLLECTION);
			pstmt.setLong(1, articleNumber);
			int deleted = pstmt.executeUpdate();
			if(deleted > 0){
				log.info("Remove MainCollectionImageWebsite - article_number " + articleNumber);
			}
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to delete MainCollectionImageWebsite from DB", e);
			throw new RuntimeException(e);
		}
	}
}
