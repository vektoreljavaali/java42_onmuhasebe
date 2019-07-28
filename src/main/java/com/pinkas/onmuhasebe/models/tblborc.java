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


/**
 *
 * @author vektorel
 */
@Entity
@Table

public class tblborc {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long musteriid;
    private double borc;
    private Date createdate;
    private Date updatedate;
    private long outid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(long musteriid) {
        this.musteriid = musteriid;
    }

    public double getBorc() {
        return borc;
    }

    public void setBorc(double borc) {
        this.borc = borc;
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
