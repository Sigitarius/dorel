package pl.sigitarius.dorel.model.dao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.db.Ean;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@RequiredArgsConstructor
public class EanSpecializedStoreDao {

    private static final String INSERT_EAN_SPECIALIZED_STORE = "INSERT INTO EAN_SpecializedStore VALUES(?)";
    private static final String SELECT_FROM_EAN_SPECIALIZED_STORE = "SELECT EAN FROM EAN_SpecializedStore";

    private final MsSqlConnection connection;

    public Set<Ean> getEans() {
        Set<Ean> eans = new HashSet<>();
        try (Connection con = DriverManager.getConnection(connection.getURL())) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SELECT_FROM_EAN_SPECIALIZED_STORE);
            while (rs.next()) {
                eans.add(new Ean(rs.getString("ean")));
            }
        } catch (SQLException e) {
            log.error("Failed to retrieve EANs from the database", e);
            throw new RuntimeException(e);
        }
        return eans;
    }

    public void insertEans(Set<String> eans) {
        try (Connection con = DriverManager.getConnection(connection.getURL())) {
            PreparedStatement pstmt = con.prepareStatement(INSERT_EAN_SPECIALIZED_STORE);

            for (String ean : eans) {
                pstmt.setString(1, ean);
                pstmt.addBatch();
            }
            pstmt.executeBatch();
            pstmt.close();

        } catch (SQLException e) {
            log.error("Failed to save EANs to the database", e);
            throw new RuntimeException(e);
        }
    }
}
