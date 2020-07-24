package tr.com.turksat.stajyer.magazatakip.service;

import tr.com.turksat.stajyer.magazatakip.dao.UrunCesidiDao;
import tr.com.turksat.stajyer.magazatakip.domain.UrunCesidi;

import java.util.List;

public class UrunCesidiService {

    UrunCesidiDao urunCesidiDao;

    public UrunCesidiService() {
        urunCesidiDao = new UrunCesidiDao();

    }
    public boolean cesitSil(UrunCesidi urunCesidi) {
        return urunCesidiDao.cesitSil(urunCesidi);
    }

    public List<UrunCesidi> getUrunCesidi() {
        return urunCesidiDao.getUrunCesidi();
    }
}