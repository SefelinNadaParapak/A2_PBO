/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest5;

/**
 *
 * @author Hp
 */
public abstract class Toko {
        protected int Id,Jum;
   String Barang;

    public abstract void masuk();
    public abstract void keluar();

 

   public Toko(int Id,int Jum, String Barang){
      this.Id = Id;
      this.Jum = Jum;
      this.Barang = Barang;

   }
    void display(){
        System.out.println("Id Produk     : " + this.Id);
        System.out.println("Nama Produk   : " + this.Barang);
        System.out.println("Jumlah Produk : " + this.Jum);
}


   public void setId(int Id){
      this.Id=Id;
   }
   public void setJum(int Jum){
      this.Jum=Jum;
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

   public String GetBarang(){
      return Barang;
   }
}

