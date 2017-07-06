package tr.com.turksat.stajyer.magazatakip.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by scinkir on 25.06.2015.
 */
public class Database {

    public static Connection getConnection() {
        try {
            Class.forName("Driver");
            Connection con = DriverManager.getConnection("veritabanı",
                    "kullanıcıAdı", "Şifre");
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() HATASI" + ex.getMessage());
            return null;
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}
