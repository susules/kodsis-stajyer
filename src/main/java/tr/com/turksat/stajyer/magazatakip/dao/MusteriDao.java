package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.Musteri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MusteriDao {

    public Musteri musteriEkle(Musteri musteri) {
        Connection con = null;
        PreparedStatement ps = null;
        String query = "insert into Musteri (id,ad,soyad,telefon,e_mail,adres,cinsiyet,yas) values (?,?,?,?,?,?,?,?)";
        try {
            con = Database.getInstance().getConnection();
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, musteri.getId());
            preparedStmt.setString(2, musteri.getMAd());
            preparedStmt.setString(3, musteri.getMSoyad());
            preparedStmt.setInt(4, musteri.getMTelefon());
            preparedStmt.setString(5, musteri.getMEmail());
            preparedStmt.setString(6, musteri.getMAdres());
            preparedStmt.setString(7, musteri.getMCinsiyet());
            preparedStmt.setInt(8, musteri.getMYas());


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
        } return musteri;
    }

    public List<Musteri> getMusteri() {

        Connection con = null;
        PreparedStatement ps = null;
        List<Musteri> musteriList = new ArrayList<>();
        try {  con = Database.getInstance().getConnection();
            ps = con.prepareStatement(
                    "select * from musteri");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) // found
            {
                Musteri musteri = new Musteri();
                musteri.setId(rs.getInt(1));
                musteri.setMAd(rs.getString(2));
                musteri.setMSoyad(rs.getString(3));
                musteri.setMTelefon(rs.getInt(4));
                musteri.setMEmail(rs.getString(5));
                musteri.setMAdres(rs.getString(6));
                musteri.setMCinsiyet(rs.getString(7));
                musteri.setMYas(rs.getInt(8));
                musteriList.add(musteri);
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
        return musteriList;
    }

    public boolean musteriSil(Musteri musteri) {
        Connection con = null;
        PreparedStatement ps = null;

        try {  con = Database.getInstance().getConnection();
            ps = con.prepareStatement ("delete from musteri where id= ?");

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