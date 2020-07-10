Proje
run komutu: "clean install jetty:run"   
url: http://localhost:9091/kodsis-stajyer/giris.jsf

--Manuel Veritabanı ve rol oluşturulur

CREATE ROLE stajyer LOGIN
  ENCRYPTED PASSWORD '1'
  SUPERUSER INHERIT CREATEDB CREATEROLE NOREPLICATION;
  
CREATE DATABASE stajyer
  WITH OWNER = stajyer
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
	   CONNECTION LIMIT = -1;

CREATE SCHEMA IF NOT EXISTS stajyer ;
	
-- kullanıcı tablosunun ve verilerinin oluşturulması
--aşağıdaki maven komutu çalıştırılarak db migrate olur
--oluşturulan diğer sorgular V3__1_migration.sql diye artan sırada versiyonlanarak eklenir.
-- compile flyway:migrate	      
	   
drop table if exists stajyer.tb_kullanici;
	   
CREATE TABLE stajyer.tb_kullanici (
  id BIGINT NOT NULL,
  kullanici_adi VARCHAR(255),
  sifre VARCHAR(255),
  CONSTRAINT kullanici_pkey PRIMARY KEY(id)
) ;

ALTER TABLE stajyer.tb_kullanici OWNER TO stajyer;
   
  
 INSERT INTO  stajyer.tb_kullanici ( id,  kullanici_adi,  sifre)  VALUES ( 1, 'admin', '1');
 INSERT INTO  stajyer.tb_kullanici ( id,  kullanici_adi,  sifre)  VALUES ( 1, 'stajyer', '2');  
	   
	   