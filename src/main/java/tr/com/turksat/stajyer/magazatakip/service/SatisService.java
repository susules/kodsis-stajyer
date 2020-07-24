package tr.com.turksat.stajyer.magazatakip.service;

import tr.com.turksat.stajyer.magazatakip.dao.SatisDao;
import tr.com.turksat.stajyer.magazatakip.domain.Satis;

import java.util.List;

public class SatisService {

    SatisDao satisDao;

    public SatisService() {
        satisDao = new SatisDao();

    }

    public boolean satisSil(Satis satis) {
        return satisDao.satisSil(satis);
    }

    public List<Satis> getSatis() {
        return satisDao.getSatis();
    }
}