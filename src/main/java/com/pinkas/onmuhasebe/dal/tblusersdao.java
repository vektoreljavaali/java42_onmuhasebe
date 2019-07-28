/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinkas.onmuhasebe.dal;

import com.pinkas.onmuhasebe.models.tblusers;
import com.pinkas.onmuhasebe.util.VeritabaniIsletimcisi;
import org.hibernate.Session;
import com.pinkas.onmuhasebe.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author vektorel
 */
public class tblusersdao extends VeritabaniIsletimcisi<tblusers>{
    
    public boolean ispassword(String kullaniciadi, String sifre){
           // Bağlantı Açıyoruz
           Session ss = NewHibernateUtil.getSessionFactory().openSession();
           Criteria cr = ss.createCriteria(tblusers.class);
           // Kriter Tanımı yapıyoruz
           cr.add(Restrictions.eq("kullaniciadi", kullaniciadi));
           cr.add(Restrictions.eq("sifre", sifre));
           // eğer var ise listeyi alıyoruz
           List<tblusers> liste = cr.list();
           // Liste boş mu değil mi ona bakıyoruz
           if(liste.size()>0)
               return true;
           else
               return false;
    }
    
}
