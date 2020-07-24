package tr.com.turksat.stajyer.magazatakip.jsfbean;

import tr.com.turksat.stajyer.magazatakip.domain.*;
import tr.com.turksat.stajyer.magazatakip.service.KullaniciService;
import tr.com.turksat.stajyer.magazatakip.service.MusteriService;
import tr.com.turksat.stajyer.magazatakip.service.MusteriHesabiService;
import tr.com.turksat.stajyer.magazatakip.service.SatisService;
import tr.com.turksat.stajyer.magazatakip.service.UrunCesidiService;
import tr.com.turksat.stajyer.magazatakip.service.UrunTanimiService;
import tr.com.turksat.stajyer.magazatakip.service.UrunService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.event.AjaxBehaviorEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class KullaniciForm implements Serializable {

    KullaniciService kullaniciService = new KullaniciService();
    MusteriService musteriService= new MusteriService();
    MusteriHesabiService musteriHesabiService= new MusteriHesabiService();
    SatisService satisService= new SatisService();
    UrunCesidiService urunCesidiService= new UrunCesidiService();
    UrunTanimiService urunTanimiService= new UrunTanimiService();
    UrunService urunService= new UrunService();

    List<MarkaTipi> markalar = new ArrayList();
    List<UrunTipi> urunTipleri = new ArrayList();
    List<Kullanici> kullanicilar = new ArrayList<>();
    List<Musteri> musteriList = new ArrayList<>();
    List<MusteriHesabi> musteriHesabiList = new ArrayList<>();
    List<Satis> satisList = new ArrayList<>();
    List<UrunCesidi> urunCesitList = new ArrayList<>();
    List<UrunTanimi> urunTanimiList = new ArrayList<>();
    List<Urun> urunList = new ArrayList<>();

    private Kullanici kullanici;
    private Musteri musteri;
    private MusteriHesabi hesap;
    private Satis satis;
    private UrunCesidi urunCesidi;
    private UrunTanimi urunTanimi;
    private Urun urun;


    private String silinecekUrunTipi = "";
    private String urunTipiid = "";
    private UrunTipi uruntipi;
    private ModelTipi modeltipi = new ModelTipi();
    private MarkaTipi markatipi = new MarkaTipi();


    public KullaniciForm() {

    }

    @PostConstruct
    public void init() {
        uruntipi = new UrunTipi();
        kullanici = new Kullanici();
        modeltipi = new ModelTipi();
        markatipi = new MarkaTipi();
        musteri = new Musteri();
        hesap = new MusteriHesabi();
        urunTanimi = new UrunTanimi();
        urunCesidi = new UrunCesidi();
        satis= new Satis();
        urun = new Urun();


//        markalar= new KullaniciService().getMarkalar(uruntipi);
//        urunTipleri=new KullaniciService().getUrunTipleri();
        UrunTipi x = new UrunTipi();
        x.setUruntipi("deneme");
        x.setId(1);
        UrunTipi y = new UrunTipi();
        y.setUruntipi("11");
        y.setId(2);
        urunTipleri.add(x);
        urunTipleri.add(y);


        kullanicilar = kullaniciService.getKullanicilar();
        musteriList = musteriService.getMusteri();
        musteriHesabiList = musteriHesabiService.getHesap();
        urunCesitList = urunCesidiService.getUrunCesidi();
        urunTanimiList = urunTanimiService.getUrunTanimi();
        satisList = satisService.getSatis();
        urunList = urunService.getUrun();
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    //KULLANICI SET
    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }


    //URUN TİP SET VE GET
    public UrunTipi getUruntipi() {
        return uruntipi;
    }

    public void setUruntipi(UrunTipi uruntipi) {
        this.uruntipi = uruntipi;
    }

    //MODEL TİP SET VE GET
    public ModelTipi getModeltipi() {
        return modeltipi;
    }

    public void setModeltipi(ModelTipi modeltipi) {
        this.modeltipi = modeltipi;
    }

    //MARKA TİP SET GET
    public MarkaTipi getMarkatipi() {
        return markatipi;
    }

    public void setMarkatipi(MarkaTipi markatipi) {
        this.markatipi = markatipi;
    }


    //MODEL TİPLERİ LİSTESİ SET VE GET
    public List<ModelTipi> getModeltiplist() {
        return new ArrayList<>();
    }

    //SİLİNECEK URUNUNTİPİNİN SET VE GET
    public String getSilinecekUrunTipi() {
        return silinecekUrunTipi;
    }

    public void setSilinecekUrunTipi(String silinecekUrunTipi) {
        this.silinecekUrunTipi = silinecekUrunTipi;
    }


    //URUN TİPİ IDSİ SET VE GET
    public String getId() {
        return urunTipiid;
    }

    public void setId(String id) {
        this.urunTipiid = id;
    }


    //GİRİŞ YAP
    public String kullaniciGiris() {
//        KullaniciService service = new KullaniciService();
//        if (service.kullaniciGiris(kullanici)) {
//            return "anaekran/anaekran";
//        }
        return "uruntanimi";
    }

    public String urunTipiEkle() {
        if (uruntipi.getId() == -1) {
            KullaniciService service = new KullaniciService();
//            service.UruntipEkle(uruntipi);
        } else {
            KullaniciService service = new KullaniciService();
//            service.UruntipGuncelle(uruntipi);
        }
        uruntipi = new UrunTipi();
        return null;
    }

    public String kullaniciKaydet() {
        KullaniciService service = new KullaniciService();
//        service.kullaniciKaydet(kullanici);
        return null;
    }

    public String sil() {
        System.out.println("urunTipi" + silinecekUrunTipi);
        KullaniciService service = new KullaniciService();
//        service.urunTipiSil(silinecekUrunTipi);
        return null;
    }

    public void urunTipiTemizle() {
        this.uruntipi = null;
    }

    public String guncelle() {
        System.out.println("urunTipi" + silinecekUrunTipi);
        KullaniciService service = new KullaniciService();
//        uruntipi = service.getUrunTipi(urunTipiid);
        return null;
    }

    public List<MarkaTipi> getMarkalar() {
        return markalar;
    }

    public void setMarkalar(List<MarkaTipi> markalar) {
        this.markalar = markalar;
    }

    public List<UrunTipi> getUrunTipleri() {
        return urunTipleri;
    }

    public void setUrunTipleri(List<UrunTipi> urunTipleri) {
        this.urunTipleri = urunTipleri;
    }

    public void filtreMarka() {
        if (uruntipi != null && uruntipi.getId() != -1) ;
//            markalar=new KullaniciService().getMarkalar(uruntipi);
    }

    public void filtreMarka2(AjaxBehaviorEvent event) {
        if (uruntipi != null) ;
//            markalar=new KullaniciService().getMarkalar(uruntipi);

    }

    public List<Kullanici> getKullanicilar() {
        kullanicilar = kullaniciService.getKullanicilar();
        return kullanicilar;
    }

    public List<Musteri> getMusteriList() {
        musteriList = musteriService.getMusteri();
        return musteriList;
    }

    public List<MusteriHesabi> getMusteriHesabiList() {
        musteriHesabiList=musteriHesabiService.getHesap();
        return musteriHesabiList;
    }

    public List<Satis> getSatisList() {
        satisList=satisService.getSatis();
        return satisList;
    }

    public List<UrunCesidi> getUrunCesitList() {
        urunCesitList=urunCesidiService.getUrunCesidi();
        return urunCesitList;
    }

    public List<UrunTanimi> getUrunTanimiList() {
        urunTanimiList=urunTanimiService.getUrunTanimi();
        return urunTanimiList;
    }

    public List<Urun> getUrunList() {
        urunList=urunService.getUrun();
        return urunList;

    }
}