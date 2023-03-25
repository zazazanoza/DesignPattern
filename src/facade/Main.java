package facade;

import java.sql.SQLException;

import facade.database.WeaponDAO;

public class Main {

    public static void main(String[] args) throws SQLException {
        
        WeaponDAO w = new WeaponDAO();
        System.out.println(w.getWeapon(1));
        System.out.println(w.getWeapon(3));
        System.out.println(w.getWeaponAll());
        
        
        //        try {
        //            Connection con = DriverManager.getConnection(
        //                    "jdbc:mysql://localhost/dpdb?allowPublicKeyRetrieval=true", //接続先
        //                    "root", //user
        //                    "root" //password
        //            );
        //
        //            PreparedStatement pstmt = con.prepareStatement("select * from test1");
        //            ResultSet rs = pstmt.executeQuery();
        //
        //            while (rs.next()) {
        //                System.out.println(rs.getString("id"));
        //                System.out.println(rs.getString("name"));
        //            }
        //
        //            // 後処理（リソースのクローズ）
        //            rs.close();
        //            pstmt.close();
        //            con.close();
        //
        //        } catch (SQLException e) {
        //            // TODO 自動生成された catch ブロック
        //            e.printStackTrace();
        //        }
        //
        //    }
    }

}
