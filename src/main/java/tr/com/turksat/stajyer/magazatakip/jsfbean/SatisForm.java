package tr.com.turksat.stajyer.magazatakip.jsfbean;

import tr.com.turksat.stajyer.magazatakip.domain.Satis;
import tr.com.turksat.stajyer.magazatakip.service.SatisService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class SatisForm  implements Serializable {

    SatisService satisService= new SatisService();
    List<Satis> satisList = new ArrayList<>();
    private Satis satis;

    public SatisForm() {

    }

    @PostConstruct
    public void init() {
        satis= new Satis();
        satisList = satisService.getSatis();
    }

    public List<Satis> getSatisList() {
        satisList=satisService.getSatis();
        return satisList;
    }
}
