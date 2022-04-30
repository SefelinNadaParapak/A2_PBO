/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author Hp
 */
public class Ksr {
    protected String nama, alamat, asal;
    
    public Ksr(String nama,  String alamat, String asal) {
        this.nama = nama;
        this.alamat = alamat;
        this.asal = asal;
    }
    
//    public void tampil(){
//        System.out.println("Nama KSR            : " + this.nama);
//        System.out.println("Asal instansi       : " + this.asal);
//        System.out.println("Alamat              : " + this.alamat);
//        System.out.println("Jumlah anggota      : " + this.jumlah);
//        System.out.println("Naungan PMI (y/t)   : " + this.naungan);
//    }
    
    Ksr() {

    
}
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setAsal(String asal) {
        this.asal = asal;
    }
    

//    public void ada() {
//        System.out.println("Data KSR yang berada di kota Samarinda.");
//    }
//
//    public void tdkada() {
//        System.out.println("KSR tidak terdaftar di kota Samarinda.");
//    }

    
    public String getNama(){
        return this.nama;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public String getAsal(){
        return this.asal;
    }

}

      