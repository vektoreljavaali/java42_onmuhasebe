/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinkas.onmuhasebe.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.envers.Audited;

/**
 *
 * @author vektorel
 */
@Entity
@Table
@Audited
public class tblusers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String kullaniciadi;
    private String sifre;
    private long outid;
    private long musteriid;
    private int yetkiid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public long getOutid() {
        return outid;
    }

    public void setOutid(long outid) {
        this.outid = outid;
    }

    public long getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(long musteriid) {
        this.musteriid = musteriid;
    }

    public int getYetkiid() {
        return yetkiid;
    }

    public void setYetkiid(int yetkiid) {
        this.yetkiid = yetkiid;
    }
    
    
}
