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
public class tblkasa {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String kasaadi;
    private double miktar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKasaadi() {
        return kasaadi;
    }

    public void setKasaadi(String kasaadi) {
        this.kasaadi = kasaadi;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }
    
    
}
