/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;


public class Ksr {
    String nama, asal, alamat, naungan;
    int tahun, jumlah;
    
    public Ksr(String nama,  String asal, String alamat, int jumlah, int tahun, String naungan) {
        this.nama = nama;
        this.asal = asal;
        this.alamat = alamat;
        this.jumlah = jumlah;
        this.tahun = tahun;
        this.naungan = naungan;
    }
    
    Ksr(){
        
    }
    
    public void tampil(){
        System.out.println("Nama KSR            : " + this.nama);
        System.out.println("Asal instansi       : " + this.asal);
        System.out.println("Alamat              : " + this.alamat);
        System.out.println("Jumlah anggota      : " + this.jumlah);
        System.out.println("Tahun berdiri       : " + this.tahun);
        System.out.println("Naungan PMI (y/t)   : " + this.naungan);
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setAsal(String instansi) {
        this.asal = asal;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public void setNaungan(String naungan) {
        this.naungan = naungan;
    }
    
    public void sendiri() {
        System.out.println("tidak berada dibawah naungan PMI.");
    }

    public void bwhnaungan() {
        System.out.println("berada dibawah naungan PMI.");
    }

    
    public String getNama(){
        return this.nama;
    }
    
    public String getAsal(){
        return this.asal;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public int getJumlah(){
        return this.jumlah;
    }
    
    public int getTahun(){
        return this.tahun;
    }
    
    public String getNaungan(){
        return this.naungan;
    }
}
