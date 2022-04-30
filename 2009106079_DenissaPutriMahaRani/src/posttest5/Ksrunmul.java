/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;


public class Ksrunmul extends Ksr {
    final public int tahun= 1998;
    private String naungan;
    
    public Ksrunmul(String nama,  String alamat, String asal, int tahun, String naungan) {
        super(nama, alamat, asal);
//        this.tahun = tahun;
        this.naungan = naungan;
    }
    
    Ksrunmul() {

    
}

//    public void setNama(String nama) {
//        this.nama = nama;
//    }

//    public void setAlamat(String alamat) {
//        this.alamat = alamat;
//    }
    
    public void setTahun(int tahun) {
        
    }
    
    public void setNaungan (String naungan) {
        this.naungan = naungan;
    }
   
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
        System.out.println("Jumlah KSR kota Samarinda saat ini : " + this.jumlah);
    }
    
    @Override
    public void ada() {
        System.out.println("KSR unmul tidak berada di bawah naungan PMI.");
    }
    
//    class KsrUnmul extends method {
//        public  void display() {
//        System.out.println("KSR unmul berada dibawah naungan unmul.");
//}
//}
    final public int jumlah(int jumlah){
        return jumlah;
    }
}class agenda{
    static String kegiatan(String var1, String var2) {
        return "note! " + var1 + " terdata di Samarinda dan " + var2 ;
    }
}



      