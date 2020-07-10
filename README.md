Veritabanı ve rol

CREATE ROLE stajyer LOGIN
  ENCRYPTED PASSWORD '1'
  SUPERUSER INHERIT CREATEDB CREATEROLE NOREPLICATION;
  
CREATE DATABASE stajyer
  WITH OWNER = stajyer
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
	   CONNECTION LIMIT = -1;
	   
--şema ve kullanıcı tablosunun oluşturulması
	      
CREATE SCHEMA IF NOT EXISTS stajyer ;
	   
drop table if exists stajyer.tb_kullanici;
	   
CREATE TABLE stajyer.tb_kullanici (
  id BIGINT NOT NULL,
  kullanici_adi VARCHAR(255),
  sifre VARCHAR(255),
  CONSTRAINT kullanici_pkey PRIMARY KEY(id)
) ;


ALTER TABLE stajyer.tb_kullanici
  OWNER TO stajyer;
	   
	   