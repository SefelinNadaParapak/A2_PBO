/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;


public class Ksrpoltekkes extends Ksr{
    private int jumlahAnggota;
    final public String naungan = "dibawah naungan PMI";
    
    
    public Ksrpoltekkes(String nama, String alamat, String asal, int jumlahAnggota){
        super(nama,alamat,asal);
        this.jumlahAnggota = jumlahAnggota;
    }
    
    Ksrpoltekkes (){
    
}
     
    public void setJumlah(int jumlahAnggota){
        this.jumlahAnggota = jumlahAnggota;
    }
    
    
    public int getjumlah(){
        return this.jumlahAnggota;
    }
    
    public void setNaungan(String naungan) {
        
    }
    
    public String getnaungan(){
        return this.naungan;
    }
    
    public void tampil(){
        System.out.println("Nama ketua KSR  : " + this.nama);
        System.out.println("Alamat          : " + this.alamat);
        System.out.println("Asal            : " + this.asal);
        System.out.println("Jumlah anggota  : " + this.jumlahAnggota);
        System.out.println("Status          : " + this.naungan);
        System.out.println("Jumlah KSR kota Samarinda saat ini : " + this.jumlah);
    }
    
    @Override
    public void ada() {
        System.out.println("KSR poltekkes berasal dari politeknik kesehatan Kaltim.");
    }
    
    final public int jumlah(int jumlah){
        return jumlah;
    }
    
} class agenda{
    static String kegiatan(String var1){
        return var1 + " terdata di Samarinda" ;
    }
}
       
        
 

