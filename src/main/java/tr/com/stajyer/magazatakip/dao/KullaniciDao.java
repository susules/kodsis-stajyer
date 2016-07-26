package tr.com.stajyer.magazatakip.dao;

import tr.com.stajyer.magazatakip.domain.Kullanici;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by scinkir on 25.06.2015.
 */
public class KullaniciDao {

    public boolean  girisYap(Kullanici kullanici){
        Connection con = null;
        PreparedStatement ps = null;
        try {

            con = Database.getConnection();
            ps = con.prepareStatement(
                    "select kullaniciAdi, sifre from kullanici where kullaniciAdi= ? and sifre= ? ");
            ps.setString(1, kullanici.getKullaniciAdi());
            ps.setString(2, kullanici.getSifre());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // found
            {

                return true;
            }
            else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("hatalı giriş");
            return false;
        } finally {
            Database.close(con);
        }
    }
}
