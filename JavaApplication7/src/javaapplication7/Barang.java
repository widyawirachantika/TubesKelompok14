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
public class Barang{
    private String namaBarang;
    private int kodeBarang;
    private boolean statusBarang =true;
    private int nBarang;
    private int nBarangDipinjam;
    
    private int jumPinjam;
    //private int nBarangDibalikkan;

    public Barang(int kodeBarang, String namaBarang, int nBarang){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.nBarang = nBarang;
    }
    
    public Barang(int kodeBarang, int nBarangDipinjam) {
        this.kodeBarang = kodeBarang;
        this.nBarangDipinjam = nBarangDipinjam;
    }
    
    
    
    public String getNamaBarang(){
        return namaBarang;
    }

    public int getKodeBarang(){
        return kodeBarang;
    }

    public void setnBarang(int nBarang) {
        this.nBarang = nBarang;
    }

    public int getnBarang() {
        return nBarang;
    }

    public boolean isStatusBarang() {
        return statusBarang;
    }

    public void setStatusBarang() {
        if (nBarang == nBarangDipinjam){
            statusBarang = false;
        }
        else statusBarang = true;
    }

    public int getnBarangDipinjam() {
        return nBarangDipinjam;
    }

    public void setnBarangDipinjam(int nBarangDipinjam) {
        this.nBarangDipinjam = this.nBarangDipinjam + nBarangDipinjam;
    }

    public String toString(){
        return ("Kode Barang: "+getNamaBarang()+"\n"+"Jumlah Barang"+ getnBarang());
    }
    
//    public int getnBarangDibalikkan() {
//        return nBarangDibalikkan;
//    }

//    public void setnBarangDibalikkan(int nBarangDibalikkan) {
//        this.nBarangDibalikkan = nBarangDibalikkan;
//    }

    public int getJumPinjam() {
        return jumPinjam;
    }

    public void setJumPinjam(int jumPinjam) {
        this.jumPinjam = this.jumPinjam + jumPinjam;
    }
    
    
        
}
