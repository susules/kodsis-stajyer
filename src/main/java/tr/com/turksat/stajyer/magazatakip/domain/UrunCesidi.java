package tr.com.turksat.stajyer.magazatakip.domain;

public class UrunCesidi {
    private String cesitAdi;
    private Integer id = -1;

    public UrunCesidi() {

    }

    public String getCesitAdi() {
        return cesitAdi;
    }

    public void setCesitAdi(String uruncesidi) {
        this.cesitAdi = uruncesidi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
