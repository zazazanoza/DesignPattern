package facade.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private Connection con;

    //データベースに接続して、connectionを返す
    ConnectionDB() throws SQLException {
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost/dpdb?allowPublicKeyRetrieval=true", //接続先
                "", //user
                "" //password
        );
    }

    Connection getCon() {
        return con;
    }

    void closeDPDB() throws SQLException {
        con.close();
    }

}
