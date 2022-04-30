/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest3;

/**
 *
 * @author VITARACOM
 */
public class kayu {
     String nama;
    int harga;
    
    public kayu(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
    
    void inputdata(){
        System.out.println("Data Toko Lemari Meubel berhasil ditambah");
    }
    void ubahdata(){
        System.out.println("Data Toko Lemari Meubel berhasil diubah");
    }
    void hapusdata(){
        System.out.println("Data Toko Lemari Meubel berhasil dihapus");
    }    
}