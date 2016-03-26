/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.*;
/**
 *
 * @author ac
 */
public class Peminjaman{
	Barang[] b = new Barang[100];
	private String nama;
        private int id;
	private Date tanggalPinjam;
	private boolean statusPeminjaman = true;
	private int nPinjaman;
	
	public Peminjaman(int id, Date tanggalPinjam){
            this.id = id;
            this.tanggalPinjam = tanggalPinjam;
	}

        public int getIdBarang(){
            return id;
        }

        public Date getTanggalPinjam() {
            return tanggalPinjam;
        }
        
	public void setStatusPeminjaman(boolean statusPeminjaman){
//            if (nPinjaman == 0){
//                return statusPeminjaman = true;
//            }
//            else 
//                return statusPeminjaman = false;
            this.statusPeminjaman = statusPeminjaman;
	}

    public int getId() {
        return id;
    }

    public boolean isStatusPeminjaman() {
        return statusPeminjaman;
    }

    public int getnPinjaman() {
        return nPinjaman;
    }
	
        public void addPinjaman(Barang b, int jumlahPinjam){
            b.setnBarangDipinjam(jumlahPinjam);
            b.setStatusBarang();
            this.b[nPinjaman] = b;
            this.b[nPinjaman].setJumPinjam(jumlahPinjam);
            statusPeminjaman = false;
            nPinjaman++;
        }
        
        public void removePinjaman (Barang b, int jumlahDibalikkan){
            b.setnBarangDipinjam(-(jumlahDibalikkan));
            b.setStatusBarang();
            for (int i = 0; i < nPinjaman; i++) {
                if (this.b[i].getKodeBarang()==b.getKodeBarang()) {
                    this.b[i] = b;
                    this.b[i].setJumPinjam(jumlahDibalikkan);
                    if (this.b[i].getnBarangDipinjam() == 0) {
                        this.b[i] = null;
                        nPinjaman--;
                    }
                    
                }
            }
        }
        
        public Barang getBarangbyIndex(int x){
            return b[x];
        }
        
        public Barang getBarangbyID(int kodeBarang){
            Barang temp = null;
            for (int i = 0; i < 100; i++) {
                if (b[i].getKodeBarang()== kodeBarang) {
                    temp = b[i];
                }
            }
            return temp;
        }
        
        public String toString(){
        return ("Id Barang: "+getIdBarang()+"\n"+"Tanggal Pinjam: "+getTanggalPinjam());
    }
//	public void addBarang(int kodeBarang,int jumlah){
//            Barang x = searchBarang(kodeBarang);
//            b[nPinjaman]=x;
//            b[nPinjaman].setnBarang(b[nPinjaman].getnBarang()-jumlah);
//            //nPinjaman++;
//	}
//        

//	
//        public Barang removeBarang(String nama){
//            
//        }
//	
//	public boolean getStatusPinjaman(){
//            return statusPeminjaman;
//	}
//	
//	public Barang searchBarang(int kodeBarang){
//            Barang temp = null;
//            for (int i = 0; i < 100; i++) {
//                if (b[i].getKodeBarang()==kodeBarang) {
//                    temp = b[i];
//                }
//            }
//            return temp;
//        }
//	
}
