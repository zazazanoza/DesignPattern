package facade.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WeaponDAO {

    public String getWeapon(int number) throws SQLException {
        String weapon = "";
        ConnectionDB db = new ConnectionDB();
        PreparedStatement pstmt = db.getCon().prepareStatement("select * from weapon where id = ?");
        pstmt.setInt(1,number);
        
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            weapon = rs.getString("name");
        }

        db.closeDPDB();

        return weapon;
    }

    public List<String> getWeaponAll() throws SQLException {
        List<String> weapons = new ArrayList<>();
        ConnectionDB db = new ConnectionDB();
        PreparedStatement pstmt = db.getCon().prepareStatement("select * from weapon");

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            weapons.add(rs.getString("name"));
        }

        db.closeDPDB();

        return weapons;
    }
}
