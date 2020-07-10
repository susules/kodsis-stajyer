

drop table if exists stajyer.tb_kullanici;

CREATE TABLE stajyer.tb_kullanici (
  id BIGINT NOT NULL,
  kullanici_adi VARCHAR(255),
  sifre VARCHAR(255),
  CONSTRAINT kullanici_pkey PRIMARY KEY(id)
) ;


ALTER TABLE stajyer.tb_kullanici
  OWNER TO stajyer;

 INSERT INTO  stajyer.tb_kullanici ( id,  kullanici_adi,  sifre)  VALUES ( 1, 'admin', '1');
 INSERT INTO  stajyer.tb_kullanici ( id,  kullanici_adi,  sifre)  VALUES ( 1, 'stajyer', '2');