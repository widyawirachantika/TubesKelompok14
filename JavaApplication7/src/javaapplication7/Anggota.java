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
public class Anggota extends Orang{
	private Peminjaman[] riwayatPeminjaman = new Peminjaman[100];
	private Orang[] member = new Orang[100];
	private int jumAnggota = 0;
        private String usernameAnggota;
        private String passwordAnggota;
        
	public Anggota(String nama, String id,String username, String password){
		super(nama, id);
                usernameAnggota = username;
                passwordAnggota = password;
	}

        public String getUsernameAnggota() {    
            return usernameAnggota;
        }

        public void setUsernameAnggota(String usernameAnggota) {
            this.usernameAnggota = usernameAnggota;
        }

        public String getPasswordAnggota() {
            return passwordAnggota;
        }

        public void setPasswordAnggota(String passwordAnggota) {
            this.passwordAnggota = passwordAnggota;
        }
	
	public String getJabatan(){
		return "Jabatan : Anggota";
	}
	
	public void addMember(Orang member){
		this.member[jumAnggota] = member;
		jumAnggota++;
	}
	
//	public int getJumAnggota(){
//		return jumAnggota;
//	}
	
	public void getDaftarPinjaman(){
		return riwayatPeminjaman[];		
	}
	
	public void createPinjaman(String nama){
//		this.pinjam[
	}	
	
}
