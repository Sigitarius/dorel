package pl.sigitarius.dorel.model.dao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.db.FeatureImagesWebsite;
import pl.sigitarius.dorel.model.pim.ImageItem;
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
public class FeatureImageWebsiteDao {

    private static final String SELECT_ALL_WEBSITE_IMAGES = "SELECT * FROM Feature_images_website";
    private static final String INSERT_INTO_WEBSITE_IMAGES = "INSERT INTO Feature_images_website (article_number, image_id, path) VALUES (?, ?, ?)";
    private static final String DELETE_WEBSITE_IMAGES = "DELETE Feature_images_website WHERE article_number = ?";

    private final MsSqlConnection connection;

    public List<FeatureImagesWebsite> getAllImages() {
        List<FeatureImagesWebsite> images = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(connection.getURL())) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SELECT_ALL_WEBSITE_IMAGES);

            while (rs.next()) {
                images.add(new FeatureImagesWebsite(rs.getLong("article_number"),
                        rs.getInt("id"),
                        rs.getInt("image_id"),
                        rs.getString("path")));
            }

        } catch (SQLException e) {
            log.error("Failed to retrieve WebsiteImages from DB", e);
            throw new RuntimeException(e);
        }
        return images;
    }

    public void insertWebsiteImages(Item item) {
        try (Connection con = DriverManager.getConnection(connection.getURL())) {
            PreparedStatement pstmt = con.prepareStatement(INSERT_INTO_WEBSITE_IMAGES);

            List<ImageItem> items = item.getFeatureImagesWebsite().getItem();
            for (ImageItem imageItem : items) {
                pstmt.setLong(1, item.getArticleNumber());
                pstmt.setInt(2, imageItem.getID());
                pstmt.setString(3, imageItem.getPATH());
                pstmt.addBatch();
            }

            pstmt.executeBatch();
            pstmt.close();
        } catch (SQLException e) {
            log.error("Failed to save WebsiteImages to DB", e);
            throw new RuntimeException(e);
        }
    }


    public void deleteByArticleNumber(long articleNumber) {
        try (Connection con = DriverManager.getConnection(connection.getURL())) {
            PreparedStatement pstmt = con.prepareStatement(DELETE_WEBSITE_IMAGES);
            pstmt.setLong(1, articleNumber);
            int deleted = pstmt.executeUpdate();
            if (deleted > 0) {
                log.info("Remove WebsiteImages - article_number " + articleNumber);
            }
            pstmt.close();
        } catch (SQLException e) {
            log.error("Failed to delete WebsiteImages from DB", e);
            throw new RuntimeException(e);
        }
    }
}
