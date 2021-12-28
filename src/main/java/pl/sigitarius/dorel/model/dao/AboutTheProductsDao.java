package pl.sigitarius.dorel.model.dao;

import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.pim.Item;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Slf4j
public class AboutTheProductsDao {

	private static final String INSERT_INTO_ABOUT_THE_PRODUCTS = "INSERT INTO About_the_products VALUES(?, ?, ?)";
	private static final String DELETE_ABOUT_THE_PRODUCTS = "DELETE About_the_products WHERE article_number = ?";

	private MsSqlConnection connection;

	public AboutTheProductsDao(MsSqlConnection connection) {
		this.connection = connection;
	}


	public void insertAboutTheProducts(Item item) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(INSERT_INTO_ABOUT_THE_PRODUCTS);

			pstmt.setLong(1, item.getArticleNumber());
			pstmt.setString(2, item.getIntroTextConsumer());
			pstmt.setString(3, item.getLongDescription2NdPart());
			log.info("Adding About the products for " + item.getArticleNumber());

			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to save AboutTheProducts to DB", e);
			throw new RuntimeException(e);
		}
	}


	public void deleteByArticleNumber(long articleNumber) {
		try (Connection con = DriverManager.getConnection(connection.getURL())) {
			PreparedStatement pstmt = con.prepareStatement(DELETE_ABOUT_THE_PRODUCTS);
			pstmt.setLong(1, articleNumber);
			int deleted = pstmt.executeUpdate();
			if(deleted > 0){
				log.info("Remove AboutTheProducts - article_number " + articleNumber);
			}
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to delete AboutTheProducts from DB", e);
			throw new RuntimeException(e);
		}
	}

}
