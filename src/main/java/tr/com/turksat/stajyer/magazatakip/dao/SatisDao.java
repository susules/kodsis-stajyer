package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.Satis;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SatisDao {

    public Satis satisEkle(Satis satis) {
        Connection con = null;
        PreparedStatement ps = null;
        String query = "insert into Satis (id,hesap_id,urun_id,satis_tarihi,odeme_sekli) values (?,?,?,?,?)";
        try {
            con = Database.getInstance().getConnection();
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, satis.getId());
            preparedStmt.setInt(2, satis.getUrunId());
            preparedStmt.setInt(3, satis.getHesapId());
            preparedStmt.setDate(4,new Date(satis.getSatisTarihi().getTime()));
            preparedStmt.setString(5, satis.getOdemeSekli());

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
        } return satis;
    }

    public List<Satis> getSatis() {

        Connection con = null;
        PreparedStatement ps = null;
        List<Satis> satisList = new ArrayList<>();
        try {  con = Database.getInstance().getConnection();
            ps = con.prepareStatement(
                    "select * from satis");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) // found
            {
                Satis satis = new Satis();
                satis.setId(rs.getInt(1));
                satis.setUrunId(rs.getInt(2));
                satis.setHesapId(rs.getInt(3));
                satis.setSatisTarihi(rs.getDate (4));
                satis.setOdemeSekli(rs.getString(5));
                satisList.add(satis);
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
        return satisList;
    }

    public boolean satisSil(Satis satis) {
        Connection con = null;
        PreparedStatement ps = null;

        try {  con = Database.getInstance().getConnection();
            ps = con.prepareStatement ("delete from satis where id= ?");

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