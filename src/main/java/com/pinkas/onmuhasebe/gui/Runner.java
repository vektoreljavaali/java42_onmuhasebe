/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinkas.onmuhasebe.gui;

import com.pinkas.onmuhasebe.models.tblkasa;
import com.pinkas.onmuhasebe.models.tblmarka;
import com.pinkas.onmuhasebe.models.tblmodel;
import com.pinkas.onmuhasebe.models.tblmusteri;
import com.pinkas.onmuhasebe.models.tblurun;
import com.pinkas.onmuhasebe.models.tblusers;
import com.pinkas.onmuhasebe.util.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vektorel
 */
public class Runner {
    public static void main(String[] args) {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tt = ss.beginTransaction();
        
//    tblkasa ks = new tblkasa();
//    ks.setKasaadi("Peşin Kasası");
//    ks.setMiktar(0);
//    ss.save(ks);
//    ks = new tblkasa();
//    ks.setKasaadi("Kredi Kartı Kasası");
//    ks.setMiktar(0);
//    ss.save(ks);
//
//    tblmusteri ms = new tblmusteri();
//    ms.setAd("Muhammet");
//    ms.setSoyad("Hoca");
//    ss.save(ms);
//
//    ms = new tblmusteri();
//    ms.setAd("Derya");
//    ms.setSoyad("AKMAN");
//    ss.save(ms);
//
//    ms = new tblmusteri();
//    ms.setAd("Hüseyin");
//    ms.setSoyad("DÖNMEZ");
//    ss.save(ms);
//
//    tblurun ur = new tblurun();
//    ur.setAd("Ürün-1");
//    ur.setFiyat(20);
//    ur.setStokadedi(60);
//    ss.save(ur);
//    ur = new tblurun();
//    ur.setAd("Ürün-2");
//    ur.setFiyat(134);
//    ur.setStokadedi(99);
//    ss.save(ur);
               
        tblmarka mrk = new tblmarka();
        mrk.setAd("Marka-1");
        ss.save(mrk);

        mrk = new tblmarka();
        mrk.setAd("Marka-2");
        ss.save(mrk);
        
        mrk = new tblmarka();
        mrk.setAd("Marka-3");
        ss.save(mrk);
        
        
        tblmodel md = new tblmodel();
        md.setAd("Model-1");
        md.setMarkaid(1);
        ss.save(md);
        md = new tblmodel();
        md.setAd("Model-2");
        md.setMarkaid(1);
        ss.save(md);
        md = new tblmodel();
        md.setAd("Model-3");
        md.setMarkaid(2);
        ss.save(md);
        
        
        tt.commit();

        ss.close();
    }
   
}
