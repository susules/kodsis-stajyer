
 INSERT INTO  stajyer.tb_kullanici ( id,  kullanici_adi,  sifre)  VALUES ( 11, 'admin1', '1');
 INSERT INTO  stajyer.tb_kullanici ( id,  kullanici_adi,  sifre)  VALUES ( 22, 'stajyer2', '2');

 INSERT INTO  stajyer.musteri ( id,ad,soyad,telefon,e_mail,adres,cinsiyet,yas)  VALUES ( 1, 'Ali','Keleş',94535543,'admin','admin','admin', 1);
 INSERT INTO  stajyer.musteri ( id,ad,soyad,telefon,e_mail,adres,cinsiyet,yas)  VALUES ( 22, 'admin','admin',34567,'admin','admin','admin', 43);

 INSERT INTO  stajyer.musteri_Hesabi ( id, musteri_id)  VALUES ( 1,1);
 INSERT INTO  stajyer.musteri_Hesabi ( id, musteri_id)  VALUES ( 2,22);
 INSERT INTO  stajyer.musteri_Hesabi ( id, musteri_id)  VALUES ( 4,1);

 INSERT INTO  stajyer.urun_cesidi ( id,urun_cesit_ad)  VALUES ( 1, 'cep telefonu');
 INSERT INTO  stajyer.urun_cesidi ( id,urun_cesit_ad)  VALUES ( 2, 'tablet');
 INSERT INTO  stajyer.urun_cesidi ( id,urun_cesit_ad)  VALUES ( 3, 'notebook');
 INSERT INTO  stajyer.urun_cesidi ( id,urun_cesit_ad)  VALUES ( 4, 'televizyon');
 INSERT INTO  stajyer.urun_cesidi ( id,urun_cesit_ad)  VALUES ( 5, 'modem');

 INSERT INTO  stajyer.urun_tanimi ( id,urun_cesit_id,urun_renk,urun_marka,urun_model,uretim_tarihi,sisteme_eklenme_tarihi,urun_garanti_yil)
 VALUES ( 1, 1,'kırmızı','samsung','XT5','2020-11-12','2020-11-12'::date,2);
 INSERT INTO  stajyer.urun_tanimi ( id,urun_cesit_id,urun_renk,urun_marka,urun_model,uretim_tarihi,sisteme_eklenme_tarihi,urun_garanti_yil)
 VALUES ( 2, 2,'mavi','apple','AYG4','2020-11-12'::date,'2020-11-12'::date, 3);
 INSERT INTO  stajyer.urun_tanimi ( id,urun_cesit_id,urun_renk,urun_marka,urun_model,uretim_tarihi,sisteme_eklenme_tarihi,urun_garanti_yil)
 VALUES ( 3, 3,'siyah','asus','BBI5','2020-11-12'::date,'2020-11-12'::date, 1);
 INSERT INTO  stajyer.urun_tanimi ( id,urun_cesit_id,urun_renk,urun_marka,urun_model,uretim_tarihi,sisteme_eklenme_tarihi,urun_garanti_yil)
 VALUES ( 4, 4,'beyaz','vestel','AD3X','2020-11-12'::date,'2020-11-12'::date, 4);
 INSERT INTO  stajyer.urun_tanimi ( id,urun_cesit_id,urun_renk,urun_marka,urun_model,uretim_tarihi,sisteme_eklenme_tarihi,urun_garanti_yil)
 VALUES ( 5, 5,'gri','ttnet','TRK7','2020-11-12'::date,'2020-11-12'::date, 3);

 INSERT INTO  stajyer.urun ( id,urun_tanim_id,urun_fiyat,urun_adet,baslangic_urun_sayisi,iade_durumu)  VALUES ( 1, 2,4000,650,1000,'iade edilemez');
 INSERT INTO  stajyer.urun ( id,urun_tanim_id,urun_fiyat,urun_adet,baslangic_urun_sayisi,iade_durumu)  VALUES ( 2, 1,5788,4799,6000,'iade edilebilir');
 INSERT INTO  stajyer.urun ( id,urun_tanim_id,urun_fiyat,urun_adet,baslangic_urun_sayisi,iade_durumu)  VALUES ( 3, 4,1600,1000,3500,'iade edilebilir');
 INSERT INTO  stajyer.urun ( id,urun_tanim_id,urun_fiyat,urun_adet,baslangic_urun_sayisi,iade_durumu)  VALUES ( 4, 5,7000,700,4000,'iade edilemez');
 INSERT INTO  stajyer.urun ( id,urun_tanim_id,urun_fiyat,urun_adet,baslangic_urun_sayisi,iade_durumu)  VALUES ( 5, 3,3570,600,2400,'iade edilebilir');

 INSERT INTO  stajyer.satis ( id,hesap_id,urun_id,satis_tarihi,odeme_sekli)  VALUES ( 1, 1, 1, '2020-11-12'::date,'nakit');
 INSERT INTO  stajyer.satis ( id,hesap_id,urun_id,satis_tarihi,odeme_sekli)  VALUES ( 2, 1, 2, '2020-01-03'::date,'kart');


