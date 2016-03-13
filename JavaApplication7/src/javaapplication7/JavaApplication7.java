/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.*;
import java.text.*;
/**
 *
 * @author ac
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy, MMD dd");
        Anggota a1 = new Anggota("Maman",123,"passsword");
        Anggota a2 = new Anggota("Memen",124,"katasandi");
        Anggota a3 = new Anggota("Mumun",125,"mumun12");
        Petugas p1 = new Petugas("Mimin",234,"pass");
        
        p1.addAnggota(a1);
        p1.addAnggota(a2);
        p1.addAnggota(a3);
        
        //barang yg akan dipinjam
        Barang b1 = new Barang(10001,"Mic",10);
        Barang b2 = new Barang(10002,"Sound System",8);
        Barang b3 = new Barang(10003,"Gitar ",10);
        
        //Barang pinjam1 = new Barang(10001,5);
        
        Date d1 = new Date();
        
        p1.peminjam[0].CreatePeminjaman(9001, d1);
        p1.peminjam[0].riwayatPinjaman[0].addPinjaman(b1, 5);
        p1.peminjam[0].riwayatPinjaman[0].addPinjaman(b2, 2);
        p1.peminjam[0].riwayatPinjaman[0].removePinjaman(b1, 2);
        
        p1.peminjam[1].CreatePeminjaman(9002, d1);
        p1.peminjam[1].riwayatPinjaman[0].addPinjaman(b2,5);
        p1.peminjam[1].riwayatPinjaman[0].removePinjaman(b2,2); 
        
        p1.peminjam[2].CreatePeminjaman(9003, d1);
        p1.peminjam[2].riwayatPinjaman[0].addPinjaman(b3, 3);
        p1.peminjam[2].riwayatPinjaman[0].removePinjaman(b3, 3);
        p1.peminjam[2].KembalikanPinjaman(9003);
        
        System.out.println("Sistem Informasi Peminjaman Barang");
        System.out.println("==================================");
        System.out.println("Daftar Barang");
        System.out.println("Nama Barang : "+b1.getNamaBarang());
        System.out.println("    *Stok   : "+(b1.getnBarang()-b1.getnBarangDipinjam()));
        System.out.println("    *Status : "+b1.isStatusBarang());
        System.out.println("Nama Barang : "+b2.getNamaBarang());
        System.out.println("    *Stok   : "+(b2.getnBarang()-b2.getnBarangDipinjam()));
        System.out.println("    *Status : "+b2.isStatusBarang());
        System.out.println("Nama Barang : "+b3.getNamaBarang());
        System.out.println("    *Stok   : "+(b3.getnBarang()-b3.getnBarangDipinjam()));
        System.out.println("    *Status : "+b3.isStatusBarang());
        
        System.out.println("");
        System.out.println("Data Peminjam");
        System.out.println("============================");
        System.out.println("Peminjam 1 : "+a1.nama);
        System.out.println("    Jumlah Peminjaman : "+a3.getJumPinjaman());
        System.out.println("    Status      : "+a1.riwayatPinjaman[0].isStatusPeminjaman());
        System.out.println("    Barang yang dipinjam : ");
        for (int i = 0; i < a1.riwayatPinjaman[0].getnPinjaman(); i++) {
            System.out.println("    + Nama Barang : "+a1.riwayatPinjaman[0].b[i].getNamaBarang());
        }
        
        System.out.println("Peminjam 2 : "+a2.nama);
        System.out.println("    Jumlah Peminjaman : "+a3.getJumPinjaman());
        System.out.println("    Status      : "+a2.riwayatPinjaman[0].isStatusPeminjaman());
        System.out.println("    Barang yang dipinjam : ");
        for (int i = 0; i < a2.riwayatPinjaman[0].getnPinjaman(); i++) {
            System.out.println("    + Nama Barang : "+a2.riwayatPinjaman[0].b[i].getNamaBarang());
        }
        
        System.out.println("Peminjam 3 : "+a3.nama);
        System.out.println("    Jumlah Peminjaman : "+a3.getJumPinjaman());
        System.out.println("    Status      : "+a3.riwayatPinjaman[0].isStatusPeminjaman());
        System.out.println("    Barang yang dipinjam : ");
        for (int i = 0; i < a3.riwayatPinjaman[0].getnPinjaman(); i++) {
            System.out.println("    + Nama Barang : "+a3.riwayatPinjaman[0].b[i].getNamaBarang());
        }
    }
    
}
