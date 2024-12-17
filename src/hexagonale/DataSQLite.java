package hexagonale;


import java.sql.*;

public class DataSQLite {
    private final Connection connection;

    public DataSQLite() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sample2.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    protected Connection getConnection() {
        return connection;
    }
}
