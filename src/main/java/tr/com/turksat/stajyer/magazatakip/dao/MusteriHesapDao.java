package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.MusteriHesabi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MusteriHesapDao {

    public MusteriHesabi hesapEkle(MusteriHesabi hesap) {

        Connection con = null;
        PreparedStatement ps = null;
        String query= "insert into MusteriHesabi(id,musteri_id) values (?,?)";
        try {
            con = Database.getInstance().getConnection();
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, hesap.getId());
            preparedStmt.setInt(2, hesap.getMusteri_id());

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
        } return hesap;
    }

    public List<MusteriHesabi> getHesap() {

        Connection con = null;
        PreparedStatement ps = null;
        List<MusteriHesabi> hesapList = new ArrayList<>();
        try {  con = Database.getInstance().getConnection();
            ps = con.prepareStatement(
                    "select * from musteri_hesabi");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) // found
            {
                MusteriHesabi hesap = new MusteriHesabi();
                hesap.setId(rs.getInt(1));
                hesap.setMusteri_id(rs.getInt(2));
                hesapList.add(hesap);
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
        return hesapList;
    }

    public boolean hesapSil(MusteriHesabi hesap) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Database.getInstance().getConnection();
            ps = con.prepareStatement ("delete from musteri_hesabi where id= ?");

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
