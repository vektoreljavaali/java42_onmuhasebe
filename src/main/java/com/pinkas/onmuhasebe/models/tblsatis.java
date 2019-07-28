/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinkas.onmuhasebe.models;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.envers.Audited;

/**
 *
 * @author vektorel
 */
@Entity
@Table
@Audited
public class tblsatis {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long kasaid;
    private long musteriid;
    private long personelid;
    private Date islemtarihi;
    private Date satistarihi;
    private double toplamfiyat;
    private double odenen;
    private double kalan;
    private Date createdate;
    private Date updatedate;
    private long outid;

    @OneToMany(mappedBy = "satis")
    private List<tblsatisdetay> satisdetay;
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getKasaid() {
        return kasaid;
    }

    public void setKasaid(long kasaid) {
        this.kasaid = kasaid;
    }

    public long getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(long musteriid) {
        this.musteriid = musteriid;
    }

    public long getPersonelid() {
        return personelid;
    }

    public void setPersonelid(long personelid) {
        this.personelid = personelid;
    }

    public Date getIslemtarihi() {
        return islemtarihi;
    }

    public void setIslemtarihi(Date islemtarihi) {
        this.islemtarihi = islemtarihi;
    }

    public Date getSatistarihi() {
        return satistarihi;
    }

    public void setSatistarihi(Date satistarihi) {
        this.satistarihi = satistarihi;
    }

    public double getToplamfiyat() {
        return toplamfiyat;
    }

    public void setToplamfiyat(double toplamfiyat) {
        this.toplamfiyat = toplamfiyat;
    }

    public double getOdenen() {
        return odenen;
    }

    public void setOdenen(double odenen) {
        this.odenen = odenen;
    }

    public double getKalan() {
        return kalan;
    }

    public void setKalan(double kalan) {
        this.kalan = kalan;
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
