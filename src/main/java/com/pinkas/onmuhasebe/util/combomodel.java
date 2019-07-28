/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinkas.onmuhasebe.util;

/**
 *
 * @author vektorel
 */
public class combomodel {
    
    private String value;
    private long id;
    
    public combomodel(String value, long id){
        this.id = id;
        this.value = value;
    }
    
    @Override
    public String toString(){
        return this.value;
    }
    
    public String getValue(){
        return this.value;
    }
    
    public long getId(){
        return this.id;
    }   
    
}
