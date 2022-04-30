/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author Hp
 */
public abstract class Ksr {
    protected String nama, alamat, asal;
    final public int jumlah = 5;
    
    public Ksr(String nama,  String alamat, String asal) {
        this.nama = nama;
        this.alamat = alamat;
        this.asal = asal;
    }
    
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
    
    
    public String getNama(){
        return this.nama;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public String getAsal(){
        return this.asal;
    }

//    public int getJumlah(){
//        return this.jumlah;
//    }
    public void display(){
        System.out.println("Jumlah KSR di Kota samarinda saat ini : " + this.jumlah);
    }
    public abstract void ada();
    public abstract int jumlah(int jumlah);
    
    
    
}

      