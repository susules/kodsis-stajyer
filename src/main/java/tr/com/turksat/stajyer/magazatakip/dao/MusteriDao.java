package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.Musteri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            preparedStmt.setString(2, musteri.getMusteriAd());
            preparedStmt.setString(3, musteri.getMusteriSoyad());
            preparedStmt.setInt(4, musteri.getMusteriTelefon());
            preparedStmt.setString(5, musteri.getMusteriEmail());
            preparedStmt.setString(6, musteri.getMusteriAdres());
            preparedStmt.setString(7, musteri.getMusteriCinsiyet());
            preparedStmt.setInt(8, musteri.getMusteriYas());


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
                ex2.printStackTrace();
            }//end finally try
            Database.close(con);
        }
        return musteri;
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
                musteri.setMusteriAd(rs.getString(2));
                musteri.setMusteriSoyad(rs.getString(3));
                musteri.setMusteriTelefon(rs.getInt(4));
                musteri.setMusteriEmail(rs.getString(5));
                musteri.setMusteriAdres(rs.getString(6));
                musteri.setMusteriCinsiyet(rs.getString(7));
                musteri.setMusteriYas(rs.getInt(8));

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

//    public boolean musteriSil(Musteri musteri) {
//        Connection con = null;
//        PreparedStatement ps = null;
//
//        try {  con = Database.getInstance().getConnection();
//            ps = con.prepareStatement ("delete from musteri where id= ?");
//
//        } catch (Exception ex) {
//            System.out.println("hatalı islem");
//        } finally {
//            try {
//                if (ps != null)
//                    ps.close();
//            } catch (Exception se2) {
//            }// nothing we can do
//            try {
//                if (con != null)
//                    con.close();
//            } catch (Exception se) {
//                se.printStackTrace();
//            }//end finally try
//        }return false;
//    }
public boolean musteriSil(Musteri musteri) {
    boolean basariliMi = false;
    String sqlQuery = "delete from musteri where id= ?";
    try (Connection connection = Database.getInstance().getConnection();
         PreparedStatement preparedStatement = connection
                 .prepareStatement(sqlQuery)) {

        preparedStatement.setInt(1, musteri.getId());

        int rowCount = preparedStatement.executeUpdate();
        basariliMi = true;
    } catch (SQLException e) {
        System.out.println(e);
    }
    return basariliMi;
   }
    public void musteriGuncelle(List<Musteri> musteriList) {
        String sqlQuery = "UPDATE musteri SET ad = ? , soyad = ? , telefon = ? , e_mail = ? , adres = ? , cinsiyet = ? , yas = ?  WHERE id = ?";

        int affectedrows = 0;

        try (Connection connection = Database.getInstance().getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sqlQuery)) {

            for (Musteri musteri:musteriList) {
                pstmt.setString(1, musteri.getMusteriAd());
                pstmt.setString(2, musteri.getMusteriSoyad());
                pstmt.setInt(3, musteri.getMusteriTelefon());
                pstmt.setString(4, musteri.getMusteriEmail());
                pstmt.setString(5, musteri.getMusteriAdres());
                pstmt.setString(6, musteri.getMusteriCinsiyet());
                pstmt.setInt(7, musteri.getMusteriYas());
                pstmt.setInt(8, musteri.getId());

                affectedrows = pstmt.executeUpdate();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}