/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest2;

/**
 *
 * @author Hp
 */
public class Toko {
 int Id,Jum,harga;
   String jenis,Barang;


   public Toko(int Id,int Jum, String jenis, String Barang, int harga){
      this.Id = Id;
      this.Jum = Jum;
      this.jenis = jenis;
      this.Barang = Barang;
      this.harga = harga;
   }
    void display(){
        System.out.println("Id Barang     : " + this.Id);
        System.out.println("Jenis Barang  : " + this.jenis);
        System.out.println("Nama Barang   : " + this.Barang);
        System.out.println("Jumlah Barang : " + this.Jum);
        System.out.println("Harga Barang  : " + this.harga);
}
    int setId(){
      return Id;
   }
   public int setjumlah(){
      return Jum;
   }
   public int setHarga(){
      return harga;
   }
   public String setJenis(){
      return jenis;
   }
   public String setBarang(){
      return Barang;
   }

 void Didata() {
        System.out.println(" Ada Di data");
    }

    void Mendata() {
        System.out.println("Bisa Mendata");
    }

    }
  

   

