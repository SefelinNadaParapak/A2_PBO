/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest3;

/**
 *
 * @author HP
 */
class Tiket {

    private String nama, asal, tujuan;
    private int tanggal;
    
    public Tiket(String asal, String tujuan, String nama, int tanggal){
        this.asal = asal;
        this.nama = nama;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    
    
    
    void BerhasilPesan() {
        System.out.println("\n*================================*");
        System.out.println("| Tiket Atas Nama : " + this.nama);
        System.out.println("| Dengan Rute     : " + this.asal + " -> " + this.tujuan);
        System.out.println("*================================*");
        System.out.println("|        Berhasil Dipesan        |");
        System.out.println("*================================*\n");
    }
    
    void BatalPesan() {
        System.out.println("\n*================================*");
        System.out.println("| Tiket Atas Nama : " + this.nama);
        System.out.println("| Dengan Rute     : " + this.asal + " -> " + this.tujuan);
        System.out.println("*================================*");
        System.out.println("|       Berhasil Dibatalkan      |");
        System.out.println("*================================*\n");
    }
    
    void UbahPesanan() {
        System.out.println("\n*================================*");
        System.out.println("| Tiket Atas Nama : " + this.nama);
        System.out.println("| Dengan Rute     : " + this.asal + " -> " + this.tujuan);
        System.out.println("*================================*");
        System.out.println("|          Berhasil Diubah       |");
        System.out.println("*================================*\n");
    }
    
}