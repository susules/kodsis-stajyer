package tr.com.turksat.stajyer.magazatakip.jsfbean;

import tr.com.turksat.stajyer.magazatakip.domain.MusteriHesabi;
import tr.com.turksat.stajyer.magazatakip.service.MusteriHesabiService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class MusteriHesabiForm implements Serializable {

    MusteriHesabiService musteriHesabiService= new MusteriHesabiService();
    List<MusteriHesabi> musteriHesabiList = new ArrayList<>();
    private MusteriHesabi hesap;

    @PostConstruct
    public void init() {
        hesap = new MusteriHesabi();
        musteriHesabiList = musteriHesabiService.getHesap();
    }

    public List<MusteriHesabi> getMusteriHesabiList() {
        musteriHesabiList=musteriHesabiService.getHesap();
        return musteriHesabiList;
    }
}
