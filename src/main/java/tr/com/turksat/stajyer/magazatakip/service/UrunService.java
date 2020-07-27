package tr.com.turksat.stajyer.magazatakip.service;

import tr.com.turksat.stajyer.magazatakip.dao.UrunDao;
import tr.com.turksat.stajyer.magazatakip.domain.Urun;

import java.util.List;

public class UrunService {

    UrunDao urunDao;

    public UrunService() {
        urunDao = new UrunDao();
    }

    public boolean urunSil(Urun urun) {
        return urunDao.urunSil(urun);
    }

    public List<Urun> getUrun() {

        return urunDao.getUrun();

    }
    public Urun urunEkle(Urun urun) {
        return urunDao.urunEkle(urun);
    }

    public void getUpdate(List<Urun> urunList) {
        urunDao.urunGuncelle(urunList);
    }
}