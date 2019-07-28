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
public class tblfatura {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String irsaliyeno;
    private String faturano;
    private Date tarih;
    private long firmaid;
    private double toplamfiyat;
    private double kdvtutar;
    private double geneltoplam;
    private Date createdate;
    private Date updatedate;
    private long outid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIrsaliyeno() {
        return irsaliyeno;
    }

    public void setIrsaliyeno(String irsaliyeno) {
        this.irsaliyeno = irsaliyeno;
    }

    public String getFaturano() {
        return faturano;
    }

    public void setFaturano(String faturano) {
        this.faturano = faturano;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public long getFirmaid() {
        return firmaid;
    }

    public void setFirmaid(long firmaid) {
        this.firmaid = firmaid;
    }

    public double getToplamfiyat() {
        return toplamfiyat;
    }

    public void setToplamfiyat(double toplamfiyat) {
        this.toplamfiyat = toplamfiyat;
    }

    public double getKdvtutar() {
        return kdvtutar;
    }

    public void setKdvtutar(double kdvtutar) {
        this.kdvtutar = kdvtutar;
    }

    public double getGeneltoplam() {
        return geneltoplam;
    }

    public void setGeneltoplam(double geneltoplam) {
        this.geneltoplam = geneltoplam;
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
