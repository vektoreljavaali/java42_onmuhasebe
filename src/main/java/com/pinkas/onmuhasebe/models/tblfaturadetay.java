/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinkas.onmuhasebe.models;

import java.util.Date;
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
public class tblfaturadetay {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long faturaid;
    private long urunid;
    private double fiyat;
    private int kdv;
    private int birimadedi;
    private double toplamfiyat;
    private Date createdate;
    private Date updatedate;
    private long outid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFaturaid() {
        return faturaid;
    }

    public void setFaturaid(long faturaid) {
        this.faturaid = faturaid;
    }

    public long getUrunid() {
        return urunid;
    }

    public void setUrunid(long urunid) {
        this.urunid = urunid;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }

    public int getBirimadedi() {
        return birimadedi;
    }

    public void setBirimadedi(int birimadedi) {
        this.birimadedi = birimadedi;
    }

    public double getToplamfiyat() {
        return toplamfiyat;
    }

    public void setToplamfiyat(double toplamfiyat) {
        this.toplamfiyat = toplamfiyat;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public long getOutid() {
        return outid;
    }

    public void setOutid(long outid) {
        this.outid = outid;
    }
    
            
}
