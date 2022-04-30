/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest5;


/**
 *
 * @author HP
 */
public abstract class Tiket_Pesawat { //Parent Class

    protected String nama, asal, tujuan;
    protected int tanggal, harga;
    
    public Tiket_Pesawat(String asal, String tujuan, String nama, int harga, int tanggal){
        this.asal = asal;
        this.nama = nama;
        this.tujuan = tujuan;
        this.harga = harga;
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }
    
    public int getHarga() {
        return harga;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    
    public abstract void BerhasilPesan();
    
    public abstract void BatalPesan();
    
    public abstract void UbahPesanan();
    
            
    // untuk overloading
    final void overloading(String kelas_tiket){ //final method
        System.out.println("| Kelas Tiket     : " + kelas_tiket);
        System.out.println("*================================*");
        
    }
    
    
    
}