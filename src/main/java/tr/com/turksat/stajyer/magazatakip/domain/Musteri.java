package tr.com.turksat.stajyer.magazatakip.domain;

public class Musteri {

    private Integer id = -1;
    private String MAd;
    private String MSoyad;
    private Integer MTelefon;
    private String MEmail;
    private String MAdres;
    private String MCinsiyet;
    private Integer MYas;

    public Musteri() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMAd() {
        return MAd;
    }

    public void setMAd(String MAd) {
        this.MAd = MAd;
    }

    public String getMSoyad() {
        return MSoyad;
    }

    public void setMSoyad(String MSoyad) {
        this.MSoyad = MSoyad;
    }

    public Integer getMTelefon() {
        return MTelefon;
    }

    public void setMTelefon(Integer MTelefon) {
        this.MTelefon = MTelefon;
    }

    public String getMEmail() {
        return MEmail;
    }

    public void setMEmail(String MEmail) {
        this.MEmail = MEmail;
    }

    public String getMAdres() {
        return MAdres;
    }

    public void setMAdres(String MAdres) {
        this.MAdres = MAdres;
    }

    public String getMCinsiyet() {
        return MCinsiyet;
    }

    public void setMCinsiyet(String MCinsiyet) {
        this.MCinsiyet = MCinsiyet;
    }

    public Integer getMYas() {
        return MYas;
    }

    public void setMYas(Integer Myas) {
        this.MYas = MYas;
    }
}