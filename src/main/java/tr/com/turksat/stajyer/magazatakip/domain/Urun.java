package tr.com.turksat.stajyer.magazatakip.domain;

public class Urun {

    private Integer id = -1;
    private Integer urunTanimiId;
    private  UrunTanimi urunTanimi;
    private Integer urunFiyat;
    private Integer urunAdet;
    private Integer baslangicUrunSayisi;
    private String iadeDurumu;

    public Urun(){
        urunTanimi= new UrunTanimi();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUrunTanimiId() {
        return urunTanimiId;
    }

    public void setUrunTanimiId(Integer urunTanimiId) {
        this.urunTanimiId = urunTanimiId;
    }

    public UrunTanimi getUrunTanimi() {
        return urunTanimi;
    }

    public void setUrunTanimi(UrunTanimi urunTanimi) {
        this.urunTanimi = urunTanimi;
    }

    public Integer getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(Integer urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public Integer getUrunAdet() {
        return urunAdet;
    }

    public void setUrunAdet(Integer urunAdet) {
        this.urunAdet = urunAdet;
    }

    public Integer getBaslangicUrunSayisi() {
        return baslangicUrunSayisi;
    }

    public void setBaslangicUrunSayisi(Integer baslangicUrunSayisi) {
        this.baslangicUrunSayisi = baslangicUrunSayisi;
    }

    public String getIadeDurumu() {
        return iadeDurumu;
    }

    public void setIadeDurumu(String iadeDurumu) {
        this.iadeDurumu = iadeDurumu;
    }
}
