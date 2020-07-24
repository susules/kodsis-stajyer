package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.UrunCesidi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UrunCesidiDao {

    public UrunCesidi urunCesidEkle(UrunCesidi uruncesidi) {

        Connection con = null;
        PreparedStatement ps = null;
        String query= "insert into UrunCesidi (id,urun_cesit_ad) values (?,?)";
        try {
            con = Database.getInstance().getConnection();
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, uruncesidi.getId());
            preparedStmt.setString(2, uruncesidi.getCesitAdi());

            preparedStmt.executeUpdate(query);
            System.out.println("Bilgiler tabloya eklendi");

        } catch (Exception ex) {
            System.out.println("Hatalı islem." + ex.getLocalizedMessage());
            return null;
        } finally {try {
            if (ps != null)
                ps.close();
        } catch (Exception ex1) {
        }// nothing we can do
            try {if (con != null)
                con.close();
            } catch (Exception ex2) {
                ex2.printStackTrace();}//end finally try
            Database.close(con);
        } return uruncesidi;
    }

    public List<UrunCesidi> getUrunCesidi() {

        Connection con = null;
        PreparedStatement ps = null;
        List<UrunCesidi> urunCesitList = new ArrayList<>();
        try {  con = Database.getInstance().getConnection();
            ps = con.prepareStatement(
                    "select * from urun_cesidi");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) // found
            {
                UrunCesidi urunCesidi = new UrunCesidi();
                urunCesidi.setId(rs.getInt(1));
                urunCesidi.setCesitAdi(rs.getString(2));
                urunCesitList.add(urunCesidi);
            }
        } catch (Exception e) {
            System.out.println("Hatalı islem.");
        } finally {
            try {
                if (ps != null)
                    ps.close();
            }
            catch (Exception e1) {
            }// nothing we can do
            try {
                if (con != null)
                    con.close();
            }
            catch (Exception e2) {
                e2.printStackTrace();
            }//end finally try
        }
        return urunCesitList;
    }

    public boolean cesitSil(UrunCesidi urunCesidi) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Database.getInstance().getConnection();
            ps = con.prepareStatement ("delete from urun_cesidi where id= ?");

        } catch (Exception ex) {
            System.out.println("hatalı islem");
        } finally {
            try {
                if (ps != null)
                    ps.close();
            } catch (Exception se2) {
            }// nothing we can do
            try {
                if (con != null)
                    con.close();
            } catch (Exception se) {
                se.printStackTrace();
            }//end finally try
        }return false;
    }
}