package tr.com.turksat.stajyer.magazatakip.service;

import tr.com.turksat.stajyer.magazatakip.dao.MusteriHesapDao;
import tr.com.turksat.stajyer.magazatakip.domain.MusteriHesabi;

import java.util.List;

public class MusteriHesabiService {

    MusteriHesapDao musteriHesapDao;

    public MusteriHesabiService() {
        musteriHesapDao = new MusteriHesapDao();

    }

    public boolean hesapSil(MusteriHesabi hesap) {
        return musteriHesapDao.hesapSil(hesap);
    }

    public List<MusteriHesabi> getHesap() {
        return musteriHesapDao.getHesap();
    }
}