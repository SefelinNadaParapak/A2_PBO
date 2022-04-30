package posttest4;






/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp GK
 */
class Barang {
    //karakteristik benda
    protected String warna_barang, nama_barang, jenis_barang, waktu_serah;
    protected int banyak_barang, harga;
    
    
    //untuk inputan data penitip
    
    
    public Barang(String nama_barang, String warna_barang, String jenis_barang, int banyak_barang, String waktu_serah, int harga){
        this.nama_barang        = nama_barang;
        this.warna_barang       = warna_barang;
        this.jenis_barang       = jenis_barang;
        this.banyak_barang      = banyak_barang;
        this.waktu_serah        = waktu_serah;
        this.harga              = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getWarna_barang() {
        return warna_barang;
    }

    public void setWarna_barang(String warna_barang) {
        this.warna_barang = warna_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getJenis_barang() {
        return jenis_barang;
    }

    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    public String getWaktu_serah() {
        return waktu_serah;
    }

    public void setWaktu_serah(String waktu_serah) {
        this.waktu_serah = waktu_serah;
    }

    public int getBanyak_barang() {
        return banyak_barang;
    }

    public void setBanyak_barang(int banyak_barang) {
        this.banyak_barang = banyak_barang;
    }

    //metodh
    void taruhBarang(){
        System.out.println("Barang diletakkan ke tempat aman");
    }
    void ambilBarang(){
        System.out.println("Barang telah dikembalikan ke penitip");
    }
}
