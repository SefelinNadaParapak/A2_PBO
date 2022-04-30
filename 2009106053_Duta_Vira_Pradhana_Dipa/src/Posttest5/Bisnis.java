/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest5;


/**
 *
 * @author HP
 */
final class Bisnis extends Tiket_Pesawat{ // final class
    private String fasilitas;
    

    public Bisnis(String asal, String tujuan, String nama, int harga, int tanggal) {
        super(asal, tujuan, nama, harga, tanggal);
        this.fasilitas = "\n| -Meals on Board Premium\n| -Free WiFi\n| -Bagasi 30Kg\n| -Seat Premium";
        
    }
    
        @Override
    public void BerhasilPesan() {
        System.out.println("\n*================================*");
        System.out.println("| Tiket Atas Nama : " + this.nama);
        System.out.println("| Kelas Tiket     : Bisnis ");
        System.out.println("| Dengan Rute     : \n| \t" + this.asal + " -> " + this.tujuan);
        System.out.println("*================================*");
        System.out.println("|        Berhasil Dipesan        |");
        System.out.println("*================================*\n");
    }
    
    @Override
    public void BatalPesan() {
        System.out.println("\n*================================*");
        System.out.println("| Tiket Atas Nama : " + this.nama);
        System.out.println("| Kelas Tiket     : Bisnis ");
        System.out.println("| Dengan Rute     : \n| \t" + this.asal + " -> " + this.tujuan);
        System.out.println("*================================*");
        System.out.println("|       Berhasil Dibatalkan      |");
        System.out.println("*================================*\n");
    }
    
    @Override
    public void UbahPesanan() {
        System.out.println("\n*================================*");
        System.out.println("| Tiket Atas Nama : " + this.nama);
        System.out.println("| Kelas Tiket     : Bisnis ");
        System.out.println("| Dengan Rute     : \n| \t" + this.asal + " -> " + this.tujuan);
        System.out.println("*================================*");
        System.out.println("|       Berhasil Ditetapkan      |");
        System.out.println("*================================*\n");
    }
    
    final void Tampil(){ //final method
        System.out.println("*================================*");
        System.out.println("| Nama    : "+ this.nama);
        System.out.println("| Asal    : "+ this.asal);
        System.out.println("| Tujuan  : "+ this.tujuan);
        System.out.println("| Harga   : "+ this.harga + " Rupiah");
        System.out.println("| Tanggal : "+ this.tanggal);
        System.out.println("*================================*");
    }
    
    public void overloading(int total_harga){
        final int biaya_tambahB = 1000000; //final atribut variabel
        System.out.println("| Fasilitas Yang Didapat : " + this.fasilitas);
        total_harga = this.harga + biaya_tambahB;
        System.out.println("|\n| Biaya Tambahan : \n| \t\t" + biaya_tambahB + " Rupiah ");
        System.out.println("| Total Biaya    : \n| \t\t" + total_harga + " Rupiah");
        System.out.println("*================================*\n");
        
    }
    
}
