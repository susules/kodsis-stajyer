
drop table if exists stajyer.musteri;

CREATE TABLE stajyer.musteri (

  id integer NOT NULL,
  ad text,
  soyad text,
  telefon integer,
  e_mail text,
  adres text,
  cinsiyet text,
  yas integer,
  CONSTRAINT musteri_pkey PRIMARY KEY (id)
) ;

CREATE TABLE stajyer.musteri_hesabi (

 id integer NOT NULL,
  musteri_id integer,
  CONSTRAINT musteri_hesabi_pkey PRIMARY KEY (id),
  CONSTRAINT musteri_hesabi_musteri_id_fkey FOREIGN KEY (musteri_id)
      REFERENCES musteri (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE stajyer.urun_cesidi (

  id integer NOT NULL,
  urun_cesit_ad text,
  CONSTRAINT urun_cesidi_pkey PRIMARY KEY (id)
) ;
CREATE TABLE stajyer.urun_tanimi (

  id integer NOT NULL,
  urun_cesit_id integer,
  urun_renk text,
  urun_marka text,
  urun_model text,
  uretim_tarihi date,
  sisteme_eklenme_tarihi date,
  urun_garanti_yil integer,
  CONSTRAINT urun_tanimi_pkey PRIMARY KEY (id),
  CONSTRAINT urun_tanimi_urun_cesit_id_fkey FOREIGN KEY (urun_cesit_id)
      REFERENCES urun_cesidi (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION

) ;

CREATE TABLE stajyer.urun (

  id integer NOT NULL,
  urun_tanim_id integer,
  urun_fiyat integer,
  urun_adet integer,
  baslangic_urun_sayisi integer,
  iade_durumu text,
  CONSTRAINT urun_pkey PRIMARY KEY (id),
  CONSTRAINT urun_urun_tanim_id_fkey FOREIGN KEY (urun_tanim_id)
      REFERENCES urun_tanimi (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION

) ;
CREATE TABLE stajyer.satis (

  id integer NOT NULL,
  hesap_id integer,
  urun_id integer,
  satis_tarihi date,
  odeme_sekli text,
  CONSTRAINT satis_pkey PRIMARY KEY (id),
  CONSTRAINT satis_hesap_id_fkey FOREIGN KEY (hesap_id)
      REFERENCES musteri_hesabi (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT satis_urun_id_fkey FOREIGN KEY (urun_id)
      REFERENCES urun (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION

) ;

ALTER TABLE stajyer.tb_kullanici
  OWNER TO stajyer;