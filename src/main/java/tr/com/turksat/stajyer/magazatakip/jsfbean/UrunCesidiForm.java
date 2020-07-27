package tr.com.turksat.stajyer.magazatakip.jsfbean;

import tr.com.turksat.stajyer.magazatakip.domain.UrunCesidi;
import tr.com.turksat.stajyer.magazatakip.service.UrunCesidiService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class UrunCesidiForm  implements Serializable {

    UrunCesidiService urunCesidiService= new UrunCesidiService();
    List<UrunCesidi> urunCesitList = new ArrayList<>();
    private UrunCesidi urunCesidi;

    public UrunCesidiForm() {

    }

    @PostConstruct
    public void init() {
        urunCesidi = new UrunCesidi();
        urunCesitList = urunCesidiService.getUrunCesidi();
    }

    public List<UrunCesidi> getUrunCesitList() {
        urunCesitList=urunCesidiService.getUrunCesidi();
        return urunCesitList;
    }
}
