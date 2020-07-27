package tr.com.turksat.stajyer.magazatakip.jsfbean;

import tr.com.turksat.stajyer.magazatakip.domain.Musteri;
import tr.com.turksat.stajyer.magazatakip.service.MusteriService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class MusteriForm implements Serializable {

    MusteriService musteriService = new MusteriService();
    List<Musteri> musteriList = new ArrayList<>();
    private Musteri musteri;

    public MusteriForm() {

    }

    @PostConstruct
    public void init() {
        musteri = new Musteri();
        musteriList = musteriService.getMusteri();
    }

    public List<Musteri> getMusteriList() {
        musteriList = musteriService.getMusteri();
        return musteriList;
    }
    public void getAdd() {
        musteriService.musteriEkle(musteri);
        this.musteriList = this.getMusteriList();
        this.musteri = new Musteri();
    }
    public boolean getSil(Musteri musteri) {
        return musteriService.musteriSil(musteri);
    }

    public Object getMusteri() {
        return musteri;
    }

    public void getUpdate() {
        musteriService.getUpdate(musteriList);
        this.musteriList = this.getMusteriList();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Güncelleme Başarılı"));
    }
}
