/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author ACER
 */
class mobil {
    String nama_penyewa, merk_mobil, jenis_mobil;
    int harga, index;
    
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
}
