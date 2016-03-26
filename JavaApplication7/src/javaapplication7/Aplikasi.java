/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author ac
 */
public class Aplikasi {
    ArrayList<Petugas> daftarPetugas = new ArrayList<>();
    ArrayList<Anggota> daftarAnggota = new ArrayList<>();
    //private ArrayList<Orang> daftarAnggota = new ArrayList<>();
    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    private Scanner sInt;
    private Scanner sStr;
    
    
    public Aplikasi() {
        if(daftarBarang == null)
            daftarBarang = new ArrayList();
        
        if(daftarPetugas == null)
            daftarPetugas = new ArrayList();
        
        if(daftarAnggota == null)
            daftarAnggota = new ArrayList();
        
        this.addAnggota("Friendly", "Anggota1", "f1");
        this.addAnggota("Widya", "Anggota2", "w1");
        this.addPetugas("Fanny", "Petugas", "p1");
        
        Anggota a = getAnggota("Anggota1");
        a.CreatePeminjaman(1, new Date());
        
//        Peminjaman p = a.GetPeminjamanByIndex(1);
//        p.addPinjaman(new Barang(1, "Sound System", 10), 3);
//        p.addPinjaman(new Barang(2, "Lighting", 10), 2);
    }
    
    public void addAnggota(String nama, String id, String password){
        Anggota a= new Anggota(nama, id, password);
        daftarAnggota.add(a);
    }

    public Anggota getAnggota(String id){
        for (Anggota a : daftarAnggota){
            if(a.getId().equals(id)){
                return a;
            }
        }
        return null;
    }
    
    public void deleteAnggota(String id){
        for(Anggota a: daftarAnggota){
            if(a.getId().equals(id)){
                daftarAnggota.remove(a);
                break;
            }
        }
    }
    
    public void createAnggota(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Id anggota : ");
        String id = scan.nextLine();
        System.out.println("Nama anggota : ");
        String nama = scan.nextLine();
        System.out.println("Password : ");
        String password = scan.nextLine();
        addAnggota(id,nama,password);
    }
    
    public void addPetugas(String nama, String id, String passwordPetugas){
        Petugas p = new Petugas(nama, id, passwordPetugas);
        daftarPetugas.add(p);
    }

    public Petugas getPetugas(String id){
        for (Petugas p : daftarPetugas){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    
    public void deletePetugas(String id){
        for(Petugas p: daftarPetugas){
            if(p.getId().equals(id)){
                daftarPetugas.remove(p);
                break;
            }
        }
    }
    
//    void menuPetugas(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Id Petugas : ");
//        String id = scan.nextLine();
//        System.out.println("Nama Petugas : ");
//        String nama = scan.nextLine();
//        System.out.println("Password : ");
//        String password = scan.nextLine();
//        addPetugas(id,nama,password);
//    }

    
     public int inputInteger() {
          sInt = new Scanner(System.in);
        try {
            return sInt.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Input must be Integer");
        }
     }
//        try {
//            return sInt.nextInt();
//        } catch (InputMismatchException e) {
//            throw new InputMismatchException("Input must be Integer");
//        } finally {
//            sInt = new Scanner(System.in);
//        }

     
    private void addBarang(int kodeBarang, String namaBarang, int nBarang) {
        Barang b = new Barang(kodeBarang, namaBarang, nBarang);
        daftarBarang.add(b);
    }
    
    
    public void mainMenu(){
        int pil = 0;
        File fileAnggota = new File("Anggota.txt");
        File filePetugas = new File("Petugas.txt");
        do {
            try {

                System.out.println("Menu");
                System.out.println("1. Login Anggota");
                System.out.println("2. Login Petugas");
                System.out.println("3. Registrasi Anggota");
                System.out.println("0. exit");
                System.out.print("Input menu : ");
                pil = inputInteger();
                switch (pil) {
                    case 1:
                        System.out.println("Login Anggota");
                        Scanner user = new Scanner(System.in);
                        System.out.println("Masukkan id : ");
                        String idAnggota = user.nextLine();
                        getAnggota(idAnggota);
                        int pilih = 0;
                                        System.out.println("Menu Anggota");
                                        System.out.println("1. Order Barang");
                                        System.out.println("2. Show List Barang");
                                        System.out.println("3. View Detail Barang");
                                        System.out.println("0. Exit");
                                        System.out.print("Input menu : ");
                                        pilih = inputInteger();
                                        switch (pilih) {
                                            case 1:
                                                date d;
                                                System.out.println("Order Barang");
                                                Scanner input = new Scanner(System.in);
                                                System.out.println("Masukkan kode barang : ");
                                                Integer kodeBarang = input.nextInt();
                                                //  bingung disini
                                                break;  
                                            case 2:
                                                System.out.println("Show list barang");
                                                int i = 0;
                                                Anggota a = getAnggota(idAnggota);
                                                a.GetPeminjamanByIndex(i);
                                                i++;
                                                break;
                                            case 3:
                                                System.out.println("View detail barang");
                                                int x = 0;
                                                Anggota a1 = getAnggota(idAnggota);
                                                Peminjaman p = a1.GetPeminjamanByIndex(x);
                                                x++;
                                                System.out.println("ID :"+p.getId());
                                                System.out.println("Tanggal Pinjam :"+p.getTanggalPinjam());
//                                                        System.out.println("Tanggal Kembali"+p.getTanggalKembali());
//                                                            if(p.getTanggalPengembalian() != null){
//                                                                System.out.println("Tanggal Pengembalian :"+p.getTanggalPengembalian());
//                                                                p.hitungDenda(3000);
//                                                                System.out.println("Denda :"+p.getBiayaDenda());
//                                                            }
                                                        System.out.println();
                                                break;
                                        }
                                                
                        break;
                    case 2:
                        System.out.println("Login Petugas");
                        Scanner petugas = new Scanner(System.in);
                        System.out.println("Masukkan id : ");
                        String idPetugas = petugas.nextLine();
                        getPetugas(idPetugas);
                        break;
                    case 3:
                        System.out.println("Registrasi Anggota");
                        createAnggota();
                        break;
                    case 0:
                        System.out.println("Thank You");
                        break;
                    default:
                        throw new IllegalStateException("Wrong Menu Input");
                }
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            } finally {
                sInt = new Scanner(System.in);
                sStr = new Scanner(System.in);
            }
        } while (pil != 0);
    }

}
