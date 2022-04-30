/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest3;

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

 void Didata() {
        System.out.println(" Ada Di data");
    }

    void Mendata() {
        System.out.println("Bisa Mendata");
    }
   public void setId(int Id){
      this.Id=Id;
   }
   public void setJum(int Jum){
      this.Jum=Jum;
   }
   public void setharga(int harga){
      this.harga= harga;
   }
   public void setjenis(String jenis){
      this.jenis =jenis;
   }
   public void setBarang(String Barang){
      this.Barang = Barang;
   }
   public int GetId(){
      return Id;
   }
   public int GetJum(){
      return Jum;
   }
   public int Getharga(){
      return harga;
   }
   public String Getjenis(){
      return jenis;
   }
   public String GetBarang(){
      return Barang;
   }
}
  

   


