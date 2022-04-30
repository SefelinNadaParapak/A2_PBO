/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author ACER
 */
class mobil {
  private String nama_penyewa, merk_mobil, jenis_mobil;
  private int harga, index;
    
    public mobil(String nama_penyewa, String merk_mobil, String jenis_mobil, int harga){
        this.nama_penyewa = nama_penyewa;
        this.merk_mobil = merk_mobil;
        this.jenis_mobil = jenis_mobil;
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

    public String getJenis_mobil() {
        return jenis_mobil;
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

    public void setJenis_mobil(String jenis_mobil) {
        this.jenis_mobil = jenis_mobil;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

