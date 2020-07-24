package tr.com.turksat.stajyer.magazatakip.dao;

import tr.com.turksat.stajyer.magazatakip.domain.UrunTanimi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UrunTanimiDao {

    public UrunTanimi urunTanimiEkle(UrunTanimi urunTanimi) {
        Connection con = null;
        PreparedStatement ps = null;
        String query = "insert into UrunTanimi (id,urun_cesit_id,urun_renk,urun_marka,urun_model,uretim_tarihi,sisteme_eklenme_tarihi,urun_garanti_yil) values (?,?,?,?,?,?,?,?)";
        try {
            con = Database.getInstance().getConnection();
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, urunTanimi.getId());
            preparedStmt.setInt(2, urunTanimi.getUrunCesitId());
            preparedStmt.setString(3, urunTanimi.getUrunRenk());
            preparedStmt.setString(4, urunTanimi.getUrunMarka());
            preparedStmt.setString(5, urunTanimi.getUrunModel());
            preparedStmt.setDate(6, urunTanimi.getUretimTarihi());
            preparedStmt.setDate(7, urunTanimi.getSistemeEklemeTarihi());
            preparedStmt.setInt(8, urunTanimi.getUrunGarantiYil());

            preparedStmt.executeUpdate(query);
            System.out.println("Bilgiler tabloya eklendi");
        } catch (Exception ex) {
            System.out.println("Hatalı islem." + ex.getLocalizedMessage());
            return null;
        } finally {
            try {
                if (ps != null)
                    ps.close();
            } catch (Exception ex1) {
            }// nothing we can do
            try {
                if (con != null)
                    con.close();
            } catch (Exception ex2) {
                ex2.printStackTrace();
            }//end finally try
            Database.close(con);
        }
        return urunTanimi;
    }
        public List<UrunTanimi> getUrunTanimi(){

            Connection con = null;
            PreparedStatement ps = null;
            List<UrunTanimi> urunTanimiList = new ArrayList<>();
            try {  con = Database.getInstance().getConnection();
                ps = con.prepareStatement(
                        "select * from urun_tanimi");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) // found
                {
                    UrunTanimi urunTanimi = new UrunTanimi();
                    urunTanimi.setId(rs.getInt(1));
                    urunTanimi.setUrunCesitId(rs.getInt(2));
                    urunTanimi.setUrunRenk(rs.getString(3));
                    urunTanimi.setUrunMarka(rs.getString (4));
                    urunTanimi.setUrunModel(rs.getString(5));
                    urunTanimi.setUretimTarihi(rs.getDate(6));
                    urunTanimi.setSistemeEklemeTarihi(rs.getDate(7));
                    urunTanimi.setUrunGarantiYil(rs.getInt(8));


                    urunTanimiList.add(urunTanimi);
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
            return urunTanimiList;
        }

        public boolean urunTanimiSil(UrunTanimi urunTanimi) {
            Connection con = null;
            PreparedStatement ps = null;

            try {  con = Database.getInstance().getConnection();
             ps = con.prepareStatement ("delete from urun_tanimi where id= ?");

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
