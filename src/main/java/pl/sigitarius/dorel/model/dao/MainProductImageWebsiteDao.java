package pl.sigitarius.dorel.model.dao;

import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.db.MainProductImageWebsite;
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
public class MainProductImageWebsiteDao {

	private static final String SELECT_ALL_WEBSITE_IMAGES = "SELECT * FROM Main_product_image_website";
	private static final String INSERT_INTO_MAIN_PRODUCT = "INSERT INTO Main_product_image_website VALUES(?, ?)";
	private static final String DELETE_MAIN_PRODUCT = "DELETE Main_product_image_website WHERE article_number = ?";

	private MsSqlConnection connection;

	public MainProductImageWebsiteDao(MsSqlConnection connection) {
		this.connection = connection;
	}

	public List<MainProductImageWebsite> getAllImages() {
		List<MainProductImageWebsite> images = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_ALL_WEBSITE_IMAGES);

			while(rs.next()){
				images.add(new MainProductImageWebsite(rs.getLong("article_number"),
						rs.getString("path")));
			}

		} catch (SQLException e) {
			log.error("Failed to retrieve MainProductImageWebsite from DB", e);
			throw new RuntimeException(e);
		}
		return images;
	}


	public void insertMainProductImageWebsite(Item item) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(INSERT_INTO_MAIN_PRODUCT);

			pstmt.setLong(1, item.getArticleNumber());
			pstmt.setString(2, item.getMainProductImageWebsite());
			log.info("Adding MainProductImageWebsite for " + item.getArticleNumber());

			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to save MainProductImageWebsite to DB", e);
			throw new RuntimeException(e);
		}
	}


	public void deleteByArticleNumber(long articleNumber) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(DELETE_MAIN_PRODUCT);
			pstmt.setLong(1, articleNumber);
			int deleted = pstmt.executeUpdate();
			if(deleted > 0){
				log.info("Remove MainProductImageWebsite - article_number " + articleNumber);
			}
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to delete MainProductImageWebsite from DB", e);
			throw new RuntimeException(e);
		}
	}
}
