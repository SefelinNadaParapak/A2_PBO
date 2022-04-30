/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author GEFORCE_i5
 */
final class Catlemari extends Kayu {
    private final String os;
    private boolean baik;
    private String nama;
    private String ukuran;
    private String bahan;
    private String harga;
    
    
    public Catlemari(String nama, String ukuran, String bahan, String harga, String os){
        super(nama, ukuran, bahan, harga); 
            this.os = os;
    }


    @Override
    public final void display(){
        System.out.println("Jenis Nama Barang : " + this.nama);
        System.out.println("Ukuran Barang    : " + this.ukuran);
        System.out.println("Bahan Barang : " + this.bahan);
        System.out.println("Harga Barang : " + this.harga);
        System.out.println("Stok Barang  : " + this.os);
        baik();
    }
    
    //Overload
    public void customer(){
        System.out.println (" Cat Lemari ini punya Orang");
    }
    public void customer(String nama){
        System.out.println(" Cat Lemari ini punya " +nama);
    }

    @Override
    protected void baik() {
        System.out.println("Daftar Barang Cat Lemari Telah Berhasil");
    }
}
