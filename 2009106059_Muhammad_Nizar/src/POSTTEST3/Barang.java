/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST3;

/**
 *
 * @author nizar
 */
public class Barang {
    private String nama, jenis;
    private int harga, stock;

    public Barang(String nama, int harga, int stock, String jenis) {
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
        this.jenis = jenis;
    }
//    void display() {
//        System.out.println("Nama Barang  : " + this.nama);
//        System.out.println("Harga Barang : " + this.harga);
//        System.out.println("Stock Barang : " + this.stock);
//        System.out.println("Jenis Barang : " + this.jenis);
//    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getHarga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }
    
    void nambahBarang() {
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("SUDAH DITAMBAH");
    }
    void updateBarang(){
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("SUDAH DIPERBARUI");
    }
    void hapusBarang(){
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("SUDAH DIHAPUS");
    }
}
