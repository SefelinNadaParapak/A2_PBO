/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;


/**
 *
 * @author ACER
 */
public abstract class mobil {
  protected String nama_penyewa, merk_mobil;
  protected int harga, index;
  protected String bahan_bakar;
    protected String tujuan;
    protected String ukuran_mobil;
    
    public mobil(String nama_penyewa, String merk_mobil, int harga, String tujuan, String ukuran_mobil){
        this.nama_penyewa = nama_penyewa;
        this.merk_mobil = merk_mobil;
        this.harga = harga;
        this.tujuan = tujuan;
        this.ukuran_mobil = ukuran_mobil;
    }
    void suksesorder() {
        System.out.println("sukses di pesan");
    }
    void cancelorder () {
        System.out.println("di batalkan");
    }
    void changeorder (){
        System.out.println("di ganti");
        
    }

    public String getNama_penyewa() {
        return nama_penyewa;
    }

    public String getMerk_mobil() {
        return merk_mobil;
    }

    public int getHarga() {
        return harga;
        
    }

    public int getIndex() {
        return index;
        
        
        
    }

    public void setNama_penyewa(String nama_penyewa) {
        this.nama_penyewa = nama_penyewa;
    }

    public void setMerk_mobil(String merk_mobil) {
        this.merk_mobil = merk_mobil;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public void setBahan_bakar(String bahan_bakar) {
        this.bahan_bakar = bahan_bakar;
    } 
    public void getBahan_bakar(String bahan_bakar) {
        this.bahan_bakar = bahan_bakar;
    }

    public String getBahan_bakar() {
        return bahan_bakar;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getUkuran_mobil() {
        return ukuran_mobil;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void setUkuran_mobil(String ukuran_mobil) {
        this.ukuran_mobil = ukuran_mobil;
    }
    
    
    
    protected abstract void berjalan();
    
      public void display(){
      System.out.println("Nama                      : " + this.nama_penyewa);
      System.out.println("Merk                      : " + this.merk_mobil);
      System.out.println("Tujuan                    : " + this.tujuan);
      System.out.println("Ukuran                    : " + this.ukuran_mobil);
      System.out.println("Harga                     : " + this.harga);
      System.out.println("Berbahan bakar            : " + this.bahan_bakar);
      berjalan();
}
}
