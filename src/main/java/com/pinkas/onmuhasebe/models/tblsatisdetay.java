/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinkas.onmuhasebe.models;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.envers.Audited;

/**
 *
 * @author vektorel
 */
@Entity
@Table
@Audited
public class tblsatisdetay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long satisid;
    private long urunid;
    private double birimfiyat;
    private int birimadedi;
    private double toplamfiyat;
    private int kdv;
    private Date createdate;
    private Date updatedate;
    private long outid;

    @JoinTable(name = "satis_id")
    @ManyToOne(cascade = CascadeType.ALL )
    private tblsatis satis;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSatisid() {
        return satisid;
    }

    public void setSatisid(long satisid) {
        this.satisid = satisid;
    }

    public long getUrunid() {
        return urunid;
    }

    public void setUrunid(long urunid) {
        this.urunid = urunid;
    }

    public double getBirimfiyat() {
        return birimfiyat;
    }

    public void setBirimfiyat(double birimfiyat) {
        this.birimfiyat = birimfiyat;
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

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
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
