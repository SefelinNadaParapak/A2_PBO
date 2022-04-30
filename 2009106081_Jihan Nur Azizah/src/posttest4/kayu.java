/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;
import posttest3.*;
import posttest2.*;
/**
 *
 * @author GEFORCE_i5
 */
public class kayu {
    String nama;
    int harga;
    
    public kayu(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    void display(){
      System.out.println("Nama           : " + this.nama);
      System.out.println("Harga          : " + this.harga);
    }
    void data(){
        System.out.println("Data Toko Lemari Meubel berhasil ditambah");
    }
    void ubah(){
          System.out.println("Data Toko Lemari Meubel berhasil diubah");
    }

    void hapus(){
        System.out.println("Data Toko Lemari Meubel berhasil dihapus");
    }    
}

