package tr.com.turksat.stajyer.magazatakip.service;

import tr.com.turksat.stajyer.magazatakip.dao.MusteriDao;
import tr.com.turksat.stajyer.magazatakip.domain.Musteri;

import java.util.List;

public class MusteriService {

    MusteriDao musteriDao;

    public MusteriService() {
        musteriDao = new MusteriDao();

    }

    public boolean musteriSil(Musteri musteri) {
        return musteriDao.musteriSil(musteri);
    }

    public List<Musteri> getMusteri() {
        return musteriDao.getMusteri();
    }

    public Musteri musteriEkle(Musteri musteri) {
        return musteriDao.musteriEkle(musteri);
    }

    public void getUpdate(List<Musteri> musteriList) {
        musteriDao.musteriGuncelle(musteriList);
    }
}