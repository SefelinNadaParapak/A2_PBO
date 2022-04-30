/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

import posttest3.*;

/**
 *
 * @author ACER
 */
class mobil {
  protected String nama_penyewa, merk_mobil;
  protected int harga, index;
    
    public mobil(String nama_penyewa, String merk_mobil, int harga){
        this.nama_penyewa = nama_penyewa;
        this.merk_mobil = merk_mobil;
        this.harga = harga;
    }
    void suksesorder() {
        System.out.println("sukses di pesan");
    }
    void cancelorder () {
        System.out.println("di batalkan");
    }
    void changeorder (){
        System.out.println("di ganti");
        
    }

    public String getNama_penyewa() {
        return nama_penyewa;
    }

    public String getMerk_mobil() {
        return merk_mobil;
    }

    public int getHarga() {
        return harga;
    }

    public int getIndex() {
        return index;
        
        
    }

    public void setNama_penyewa(String nama_penyewa) {
        this.nama_penyewa = nama_penyewa;
    }

    public void setMerk_mobil(String merk_mobil) {
        this.merk_mobil = merk_mobil;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setIndex(int index) {
        this.index = index;
    }
      public void display(){
      System.out.println("Nama              : " + this.nama_penyewa);
      System.out.println("Merk              : " + this.merk_mobil);
}
}

