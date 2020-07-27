package tr.com.turksat.stajyer.magazatakip.domain;

public class Musteri {

    private Integer id = -1;
    private String musteriAd;
    private String musteriSoyad;
    private Integer musteriTelefon;
    private String musteriEmail;
    private String musteriAdres;
    private String musteriCinsiyet;
    private Integer musteriYas;

    public Musteri() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getMusteriSoyad() {
        return musteriSoyad;
    }

    public void setMusteriSoyad(String musteriSoyad) {
        this.musteriSoyad = musteriSoyad;
    }

    public Integer getMusteriTelefon() {
        return musteriTelefon;
    }

    public void setMusteriTelefon(Integer musteriTelefon) {
        this.musteriTelefon = musteriTelefon;
    }

    public String getMusteriEmail() {
        return musteriEmail;
    }

    public void setMusteriEmail(String musteriEmail) {
        this.musteriEmail = musteriEmail;
    }

    public String getMusteriAdres() {
        return musteriAdres;
    }

    public void setMusteriAdres(String musteriAdres) {
        this.musteriAdres = musteriAdres;
    }

    public String getMusteriCinsiyet() {
        return musteriCinsiyet;
    }

    public void setMusteriCinsiyet(String musteriCinsiyet) {
        this.musteriCinsiyet = musteriCinsiyet;
    }

    public Integer getMusteriYas() {
        return musteriYas;
    }

    public void setMusteriYas(Integer musteriYas) {
        this.musteriYas = musteriYas;
    }
}