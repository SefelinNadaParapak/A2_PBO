/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

public class Pelanggan extends dataPenitipan {
    private String nomor_telepon, nama_pemilik;

    // Constructor
    public Pelanggan(String nomor_telepon, String nama_pemilik, int jumlah_hari, int jam, int harga) {
        super(jumlah_hari, jam, harga);
        this.nomor_telepon = nomor_telepon;
        this.nama_pemilik = nama_pemilik;
    }

    // Setter & Getter
    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public String getNama_pemilik() {
        return nama_pemilik;
    }

    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

//    Menampilkan
    public void Tampilkan() {
        System.out.println("    Nomor Telepon       : " + this.nomor_telepon);
        System.out.println("    Nama Pemilik        : " + this.nama_pemilik);
        System.out.println("    Jumlah Hari         : " + this.jumlah_hari);
        System.out.println("    Waktu               : " + this.jam);
        System.out.println("    Harga               : " + this.harga);
    }
}
