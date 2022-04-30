/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest2;

/**
 *
 * @author HP
 */
class Tiket {
    String nama, asal, tujuan;
    int tanggal;
    
    public Tiket(String nama, String asal, String tujuan, int tanggal){
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
    }
    
    void BerhasilPesan() {
        System.out.println("\n*================================*");
        System.out.println("|        Berhasil Dipesan        |");
        System.out.println("*================================*\n");
    }
    
    void BatalPesan() {
        System.out.println("\n*================================*");
        System.out.println("|       Berhasil Dibatalkan      |");
        System.out.println("*================================*\n");
    }
    
    void UbahPesanan() {
        System.out.println("\n*================================*");
        System.out.println("|       Berhasil Dibatalkan      |");
        System.out.println("*================================*\n");
    }
    
}
