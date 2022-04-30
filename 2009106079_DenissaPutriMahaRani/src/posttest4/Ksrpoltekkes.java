/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;


public class Ksrpoltekkes extends Ksr{
    private int jumlah;
    
    public Ksrpoltekkes(String nama, String alamat, String asal, int jumlah){
        super(nama,alamat,asal);
        this.jumlah = jumlah;
    }
    
    Ksrpoltekkes (){
    
}
     
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public int getjumlah(){
        return this.jumlah;
    }
    
    public void tampil(){
        System.out.println("Nama ketua KSR  : " + this.nama);
        System.out.println("Alamat          : " + this.alamat);
        System.out.println("Asal            : " + this.asal);
        System.out.println("Jumlah anggota  : " + this.jumlah);
    }
    
    public void ada() {
        System.out.println("KSR poltekkes berada di bawah naungan PMI.");
    }
    
} class agenda{
    static String kegiatan(String var1){
        return var1 + " terdata di Samarinda" ;
    }
}
       
        
 

