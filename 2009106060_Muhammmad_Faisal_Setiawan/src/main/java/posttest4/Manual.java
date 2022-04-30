/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;


public class Manual extends mobil {
    protected String ukuran_mobil;
    protected String tujuan;
    
public Manual(String nama_penyewa,String merk_mobil,int harga, String ukuran_mobil, String tujuan){
    super(nama_penyewa, merk_mobil, harga);
    this.ukuran_mobil = ukuran_mobil;
    this.tujuan = tujuan;
    
}

    public String getUkuran_mobil() {
        return ukuran_mobil;
    }

    public void setUkuran_mobil(String ukuran_mobil) {
        this.ukuran_mobil = ukuran_mobil;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
     @Override
  public void display(){
      System.out.println("Nama              : " + this.nama_penyewa);
      System.out.println("Merk              : " + this.merk_mobil);
      System.out.println("Tujuan            : " + this.tujuan);
      System.out.println("Ukuran            : " + this.ukuran_mobil);
      System.out.println("Harga             : " + this.harga);
}
  public void penyewa(){
      System.out.println("Mobil sedang disewa oleh");
  }
  public void penyewa(String pelanggan){
      System.out.println("Mobil sedang disewa oleh   : "+pelanggan);

}
}