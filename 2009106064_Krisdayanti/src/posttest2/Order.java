/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author ASUS
 */
public class Order {
    
    String nama, alamat, email, merch, grup;
    int jumlah;

    public Order(String nama, String alamat, String email, String merch, String grup, int jumlah) {
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.merch = merch;
        this.grup = grup;
        this.jumlah = jumlah;
    }

    void done(){
        System.out.println("\nPesanan telah dicatat.\n");
    }
    
    void suruh(){
        System.out.println("Pastikan tidak ada kesalahan dalam mencatat data pemesanan!\nHarap dicek secara berkala demi kepuasan pelanggan.\n");
    }
    
}
