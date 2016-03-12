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
        p1.peminjam[0].KembalikanPinjaman(9001);
        System.out.println(p1.peminjam[0].riwayatPinjaman[0].isStatusPeminjaman());
        
        
    }
    
}
