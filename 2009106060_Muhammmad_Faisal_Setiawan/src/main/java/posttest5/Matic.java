/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;


final class Matic extends mobil {
    private final String bahan_bakar;
    private boolean berjalan;
    
public Matic(String nama_penyewa,String merk_mobil,int harga, String ukuran_mobil, String tujuan, String bahan_bakar){
    super(nama_penyewa, merk_mobil, harga, tujuan, ukuran_mobil);
    this.bahan_bakar = bahan_bakar;
    
   
            }


     @Override
  public final void display(){
      System.out.println("Nama                     : " + this.nama_penyewa);
      System.out.println("Merk                     : " + this.merk_mobil);
      System.out.println("Tujuan                   : " + this.tujuan);
      System.out.println("Ukuran                   : " + this.ukuran_mobil);
      System.out.println("Harga                    : " + this.harga);
      System.out.println("Berbahan bakar           : " + this.bahan_bakar);
      berjalan();
}
  public void penyewa(){
      System.out.println("Mobil sedang disewa oleh");
  }
  public void penyewa(String pelanggan){
      System.out.println("Mobil sedang disewa oleh   : "+pelanggan);

}
  
    @Override
  protected void  berjalan(){
      System.out.println("Mobil yang sedang berjalan");
}
    }
        
