package tr.com.turksat.stajyer.magazatakip.jsfbean;

import tr.com.turksat.stajyer.magazatakip.domain.Urun;
import tr.com.turksat.stajyer.magazatakip.service.UrunService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class UrunForm implements Serializable {

    UrunService urunService = new UrunService();
    List<Urun> urunList = new ArrayList<>();
    private Urun urun;

    public UrunForm() {

    }

    @PostConstruct
    public void init() {
        urun = new Urun();
        urunList = urunService.getUrun();
    }

    public List<Urun> getUrunList() {
        urunList = urunService.getUrun();
        return urunList;
    }

    public void getAdd() {
        urunService.urunEkle(urun);
        this.urunList = this.getUrunList();
        this.urun = new Urun();
    }

    public boolean getSil(Urun urun) {
        return urunService.urunSil(urun);
    }

    public Object getUrun() {
        return urun = new Urun();
    }

    public void getUpdate() {
        urunService.getUpdate(urunList);
        this.urunList = this.getUrunList();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Güncelleme Başarılı"));
    }
}
