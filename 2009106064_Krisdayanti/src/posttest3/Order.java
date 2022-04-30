/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

import static posttest3.Posttest3.dataOrder;

/**
 *
 * @author ASUS
 */
public class Order {
    
    private String tanggal, nama, alamat, email, merch, grup;
    private int jumlah;

    public Order(String tanggal, String nama, String alamat, String email, String merch, String grup, int jumlah) {
        this.tanggal = tanggal;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.merch = merch;
        this.grup = grup;
        this.jumlah = jumlah;
    }
    
    void display() {
        System.out.println("Tanggal Pemesanan (DD/MM/YY): " + this.tanggal);
        System.out.println("Nama Pemesan \t : " + this.nama);
        System.out.println("Alamat Pemesan \t : " + this.alamat);
        System.out.println("Email Pemesan \t : " + this.email);
        System.out.println("Merchandise \t : " + this.merch);
        System.out.println("Idol Group \t : " + this.grup);
        System.out.println("Jumlah Pesanan \t : " + this.jumlah);
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMerch() {
        return merch;
    }

    public void setMerch(String merch) {
        this.merch = merch;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    void done() {
        System.out.println("\nPesanan telah dicatat.");
    }
    
    void suruh() {
        System.out.println("Pastikan tidak ada kesalahan dalam mencatat data pemesanan demi kepuasan pelanggan.\nHarap dicek secara berkala.\n");
    }
    
}
