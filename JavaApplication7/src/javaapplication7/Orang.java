/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author ac
 */
public abstract class Orang {
    String nama;
    String id;
    String jabatan;

    public Orang(String nama, String id){
            this.nama = nama;
            this.id = id;
    }

    public String getNama(){
            return nama;
    }

    public String getId(){
            return id;
    }

    public abstract String toString();
    public abstract String getJabatan();
}
