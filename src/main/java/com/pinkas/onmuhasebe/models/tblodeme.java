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
public class tblodeme {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long personelid;
    private long musteriid;
    private Date tarih;
    private String odemeturu;
    private double tutar;
    private Date createdate;
    private Date updatedate;
    private long outid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPersonelid() {
        return personelid;
    }

    public void setPersonelid(long personelid) {
        this.personelid = personelid;
    }

    public long getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(long musteriid) {
        this.musteriid = musteriid;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getOdemeturu() {
        return odemeturu;
    }

    public void setOdemeturu(String odemeturu) {
        this.odemeturu = odemeturu;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
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
