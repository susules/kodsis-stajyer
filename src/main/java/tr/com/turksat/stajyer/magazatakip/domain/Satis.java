package tr.com.turksat.stajyer.magazatakip.domain;

import java.sql.Date;
import java.text.DateFormat;

public class Satis {

    private Integer id = -1;
    private Integer urunId;
    private Integer hesapId;
    private Date satisTarihi;
    private String odemeSekli;

    public Satis(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUrunId() {
        return urunId;
    }

    public void setUrunId(Integer urunId) {
        this.urunId = urunId;
    }

    public Integer getHesapId() {
        return hesapId;
    }

    public void setHesapId(Integer hesapId) {
        this.hesapId = hesapId;
    }

    public Date getSatisTarihi() {
        return satisTarihi;
    }

    public void setSatisTarihi(Date satisTarihi) {
        this.satisTarihi = satisTarihi;
    }

    public String getOdemeSekli() {
        return odemeSekli;
    }

    public void setOdemeSekli(String odemeSekli) {
        this.odemeSekli = odemeSekli;
    }

}
