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

/**
 *
 * @author vektorel
 */
@Entity
@Table
public class tblmodel {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ad;
    private long markaid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public long getMarkaid() {
        return markaid;
    }

    public void setMarkaid(long markaid) {
        this.markaid = markaid;
    }
    
    
}
