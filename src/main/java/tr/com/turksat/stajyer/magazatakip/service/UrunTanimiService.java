package tr.com.turksat.stajyer.magazatakip.service;

import tr.com.turksat.stajyer.magazatakip.dao.UrunTanimiDao;
import tr.com.turksat.stajyer.magazatakip.domain.UrunTanimi;

import java.util.List;

public class UrunTanimiService {

    UrunTanimiDao urunTanimiDao;

    public UrunTanimiService() {
        urunTanimiDao = new UrunTanimiDao();

    }

    public boolean urunTanimiSil(UrunTanimi urunTanimi) {
        return urunTanimiDao.urunTanimiSil(urunTanimi);
    }

    public List<UrunTanimi> getUrunTanimi() {
        return urunTanimiDao.getUrunTanimi();
    }
}