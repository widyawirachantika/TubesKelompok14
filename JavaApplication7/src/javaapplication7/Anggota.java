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
public class Anggota extends Orang{
    Peminjaman[] riwayatPinjaman = new Peminjaman[100];
    private int jumAnggota = 0;
    private int jumPinjaman =0 ;
    private String passwordAnggota;
    private date tanggal;


    public Anggota(String nama, int id, String password){
        super(nama, id);
        passwordAnggota = password;
    }

    public void CreatePeminjaman(int idPeminjaman,Date date){
        riwayatPinjaman[jumPinjaman] = new Peminjaman(idPeminjaman,date);
        riwayatPinjaman[jumPinjaman].setStatusPeminjaman(false);
    }

    public Peminjaman GetPeminjamanByIndex (int indeks){
        return riwayatPinjaman[indeks];
    }

    public Peminjaman GetPeminjamanByDate(Date tanggal){
        Peminjaman temp = null;
        for (int i = 0; i < 100; i++) {
            if (riwayatPinjaman[i].getTanggalPinjam()==tanggal) {
                temp = riwayatPinjaman[i]; 
            }
        }
        return temp;
    }

    //belum paham 
    public void KembalikanPinjaman(int idPeminjaman){
        for (int i = 0; i < 100; i++) {
            if (riwayatPinjaman[i].getIdBarang() == idPeminjaman){
                riwayatPinjaman[i].setStatusPeminjaman(true);
            }
        }
    }

    public String getJabatan(){
        return "Anggota";
    }
//
//        public String getPasswordAnggota() {
//            return passwordAnggota;
//        }
//        
//        public void createPinjaman(date tanggal){
//            p[jumPinjaman]= new Peminjaman(String nama, int tanggal);
//            jumPinjaman++;
//        }
//        
//        public Peminjaman getPeminjamanbyIndex(){
//            return p[i];
//        }
//        
//        public Peminjaman getPeminjamanbyTanggal {
//            return p[tanggal];
//        }
//
//        public void setPasswordAnggota(String passwordAnggota) {
//            this.passwordAnggota = passwordAnggota;
//        }
//	

//	
//	public void addMember(Orang member){
//		this.member[jumAnggota] = member;
//		jumAnggota++;
//	}
//	
////	public int getJumAnggota(){
////		return jumAnggota;
////	}
//	
////	public void getDaftarPinjaman(){
////		return p;		
////	}
//	
////	public void createPinjaman(String nama){
////		this.pinjam[
////	}	
	
}
