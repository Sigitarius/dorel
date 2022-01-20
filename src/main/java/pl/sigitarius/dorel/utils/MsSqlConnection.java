package pl.sigitarius.dorel.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MsSqlConnection {

	private static final Logger log = LogManager.getLogger();

	public static final String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String CONN_STRING = "jdbc:sqlserver://";

	private String connName;
	private String host;
    private int port;
    private String database;
    private String username;
    private String password;

    Connection con;

    public MsSqlConnection() {
    }

    public MsSqlConnection(String connName, String host, int port, String database, String username, String password) {
        this.connName = connName;
        this.host = host;
        this.port = port;
        this.database = database;
        this.username = username;
        this.password = password;
    }

    public static MsSqlConnection getDefaultConnection() {
        Configuration conf = new Configuration();
        return new MsSqlConnection("default", conf.get("default.host"),
                Integer.parseInt(conf.get("default.port")), conf.get("default.database"), conf.get("default.username"),
                conf.get("default.password"));
    }

    public void connect() {
        con = getConnection();
    }

    public String getURL() {
        return CONN_STRING + host + ":" + port + ";databaseName=" + database + ";user=" + username + ";password="
                + password;
    }

    public boolean testConnection() throws SQLException {
        boolean isValid = false;
        try (Connection con = DriverManager.getConnection(getURL())) {
            isValid = con.isValid(5);
        }
        return isValid;
    }


	public Connection getConnection() {
		try {
			con = DriverManager.getConnection(getURL());
		} catch (SQLException e) {
			log.error(e);
			throw new RuntimeException();
		}
		return con;
	}

	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			log.error(e);
			throw new RuntimeException();
		}
	}

	public PreparedStatement createPreparedStatement(String sql) {
		PreparedStatement ps = null;
		try (Connection con = DriverManager.getConnection(getURL())) {
			ps = con.prepareStatement(sql);
			ps.execute();
		} catch (SQLException e) {
			log.error(e);
			throw new RuntimeException();
		}
		return ps;
	}

	public String getConnName() {
		return connName;
	}

	public void setConnName(String connName) {
		this.connName = connName;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String url) {
		this.host = url;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
