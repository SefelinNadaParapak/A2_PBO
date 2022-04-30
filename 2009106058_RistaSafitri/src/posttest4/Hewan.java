/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

public class Hewan extends dataPenitipan {
    protected String jenis_hewan, nama_hewan;
    protected int jumlah_hewan, umur_hewan;

    public Hewan(String jenis_hewan, String nama_hewan, 
            int jumlah_hewan, int umur_hewan, int jumlah_hari, int jam, int harga) {
        super(jumlah_hari, jam, harga);
        this.jenis_hewan = jenis_hewan;
        this.nama_hewan = nama_hewan;
        this.jumlah_hewan = jumlah_hewan;
        this.umur_hewan = umur_hewan;
    }

//    setter & getter
    public String getJenis_hewan() {
        return jenis_hewan;
    }

    public void setJenis_hewan(String jenis_hewan) {
        this.jenis_hewan = jenis_hewan;
    }

    public String getNama_hewan() {
        return nama_hewan;
    }

    public void setNama_hewan(String nama_hewan) {
        this.nama_hewan = nama_hewan;
    }

    public int getJumlah_hewan() {
        return jumlah_hewan;
    }

    public void setJumlah_hewan(int jumlah_hewan) {
        this.jumlah_hewan = jumlah_hewan;
    }

    public int getUmur_hewan() {
        return umur_hewan;
    }

    public void setUmur_hewan(int umur_hewan) {
        this.umur_hewan = umur_hewan;
    }
    
//  Menampilkan
    public void Tampilkan() {
        System.out.println("    Jenis Hewan     : " + this.jenis_hewan);
        System.out.println("    Nama Hewan      : " + this.nama_hewan);
        System.out.println("    Jumlah Hewan    : " + this.jumlah_hewan);
        System.out.println("    Umur Hewan      : " + this.umur_hewan);
    }
}
