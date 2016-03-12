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
public class Peminjaman{
	private Barang[] b = new Barang[100];
	private String nama;
	private int tanggalPinjam;
	private int tanggalKembali;
	private String statusPeminjaman;
	private int nPinjaman=0;
	
	public Peminjaman(int tanggalPinjam, int tanggalKembali){
		this.tanggalPinjam = tanggalPinjam;
		this.tanggalKembali = tanggalKembali;
	}
	
	public void createPeminjaman(String nama, int nBarang){
		b[nPinjaman] = new Barang(nama,nPinjaman);
		nPinjaman++;
	}
	
	public void setPeminjaman(String statusPeminjaman){
		this.statusPeminjaman = statusPeminjaman;
	}
	
	public void addPinjaman(Barang b){
		this.b[nPinjaman]=b;
		nPinjaman++;
	}
	
	public int getTanggalKembali(){
		return tanggalKembali;
	}
	
	public int getStatusPinjaman(){
		return statusPeminjaman;
	}
	
	
	
}
