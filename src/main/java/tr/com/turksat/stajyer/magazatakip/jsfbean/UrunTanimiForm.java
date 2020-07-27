package tr.com.turksat.stajyer.magazatakip.jsfbean;

import tr.com.turksat.stajyer.magazatakip.domain.UrunTanimi;
import tr.com.turksat.stajyer.magazatakip.service.UrunTanimiService;

import javax.annotation.PostConstruct;
import javax.el.MethodExpression;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@ManagedBean
public class UrunTanimiForm implements Serializable {

    UrunTanimiService urunTanimiService= new UrunTanimiService();
    List<tr.com.turksat.stajyer.magazatakip.domain.UrunTanimi> urunTanimiList = new ArrayList<>();
    private UrunTanimi urunTanimi;

    public UrunTanimiForm() {

    }

    @PostConstruct
    public void init() {
        urunTanimi = new UrunTanimi();
        urunTanimiList = urunTanimiService.getUrunTanimi();
    }

    public List<UrunTanimi> getUrunTanimiList() {
        return urunTanimiList;
    }

    public Object getUrunTanimi() {
        return urunTanimi = new UrunTanimi();
    }
}
