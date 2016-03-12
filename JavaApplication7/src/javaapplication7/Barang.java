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
	private int nBarang=0;
	
	public Barang(String namaBarang, int nBarang){
            this.namaBarang = namaBarang;
            this.nBarang = nBarang;
	}
	
	public Barang(int kodeBarang){
            this.kodeBarang = kodeBarang;
	}
		
	//public void setStatusBarang(boolean statusBarang){
	//	if (statusBarang == true){
	//		return ("Barang dapat dipinjam");
	//	}else {
	//		return ("Barang tidak tersedia");
	//	}
	//}
	
	public String getNamaBarang(){
            return namaBarang;
	}
	
	public int getKodeBarang(){
            return kodeBarang;
	}
	
	public String getStatusBarang(){
            return statusBarang;
	}
}
