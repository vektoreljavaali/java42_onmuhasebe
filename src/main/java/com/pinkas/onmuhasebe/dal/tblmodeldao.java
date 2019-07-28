/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinkas.onmuhasebe.dal;

import com.pinkas.onmuhasebe.models.tblmodel;
import com.pinkas.onmuhasebe.util.NewHibernateUtil;
import com.pinkas.onmuhasebe.util.VeritabaniIsletimcisi;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 */
public class tblmodeldao extends  VeritabaniIsletimcisi<tblmodel>{
    
    public List<tblmodel> listeModel(long markaid){
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        Criteria cr = ss.createCriteria(tblmodel.class);
        cr.add(Restrictions.eq("markaid", markaid));
        return cr.list();
    }
    
}
