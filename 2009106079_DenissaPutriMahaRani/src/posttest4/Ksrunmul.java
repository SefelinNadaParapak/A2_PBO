/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;


public class Ksrunmul extends Ksr {
    private int tahun;
    private String naungan;
    
    public Ksrunmul(String nama,  String alamat, String asal, int tahun, String naungan) {
        super(nama, alamat, asal);
        this.tahun = tahun;
        this.naungan = naungan;
    }
    
    Ksrunmul() {

    
}

//    public Ksrunmul(String nama, String alamat, String asal, int tahun, String naungan) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//    
//    
//    public void setAlamat(String alamat) {
//        this.alamat = alamat;
//    }
    
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public void setNaungan (String naungan) {
        this.naungan = naungan;
    }
   
//
//    public void tdkada() {
//        System.out.println("KSR tidak terdaftar di kota Samarinda.");
//    }

//    public String getNama(){
//        return this.nama;
//    }
//    
//    public String getAsal(){
//        return this.asal;
//    }
    
//    public String getAlamat(){
//        return this.alamat;
//    }
    
    public int gettahun(){
        return this.tahun;
    }
    
    public String getnaungan(){
        return this.naungan;
    }
    
    public void tampil(){
        System.out.println("Nama ketua KSR      : " + this.nama);
        System.out.println("Alamat              : " + this.alamat);
        System.out.println("Asal                : " + this.asal);
        System.out.println("Tahun berdiri       : " + this.tahun);
        System.out.println("Naungan PMI (y/t)   : " + this.naungan);
    }
    
     public void ada() {
        System.out.println("KSR unmul tidak berada di bawah naungan PMI.");
    }
     
}class agenda{
    static String kegiatan(String var1, String var2) {
        return "note! " + var1 + " terdata di Samarinda dan " + var2 ;
    }
}



      