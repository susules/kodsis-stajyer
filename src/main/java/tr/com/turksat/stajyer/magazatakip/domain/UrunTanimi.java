package tr.com.turksat.stajyer.magazatakip.domain;

import java.sql.Date;


public class UrunTanimi {

    private Integer id = -1;
    private Integer urunCesitId;
    private String urunRenk;
    private String urunMarka;
    private String urunModel;
    private Date uretimTarihi;
    private Date sistemeEklemeTarihi;
    private Integer urunGarantiYil;

    public UrunTanimi(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUrunCesitId() {
        return urunCesitId;
    }

    public void setUrunCesitId(Integer urunCesitId) {
        this.urunCesitId = urunCesitId;
    }

    public String getUrunRenk() {
        return urunRenk;
    }

    public void setUrunRenk(String urunRenk) {
        this.urunRenk = urunRenk;
    }

    public String getUrunMarka() {
        return urunMarka;
    }

    public void setUrunMarka(String urunMarka) {
        this.urunMarka = urunMarka;
    }

    public String getUrunModel() {
        return urunModel;
    }

    public void setUrunModel(String urunModel) {
        this.urunModel = urunModel;
    }

    public Date getUretimTarihi() {
        return uretimTarihi;
    }

    public void setUretimTarihi(Date uretimTarihi) {
        this.uretimTarihi = uretimTarihi;
    }

    public Date getSistemeEklemeTarihi() {
        return sistemeEklemeTarihi;
    }

    public void setSistemeEklemeTarihi(Date sistemeEklemeTarihi) {
        this.sistemeEklemeTarihi = sistemeEklemeTarihi;
    }

    public Integer getUrunGarantiYil() {
        return urunGarantiYil;
    }

    public void setUrunGarantiYil(Integer urunGarantiYil) {
        this.urunGarantiYil = urunGarantiYil;
    }
}
