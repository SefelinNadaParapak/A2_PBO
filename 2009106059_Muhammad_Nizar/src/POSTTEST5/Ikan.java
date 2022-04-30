/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST5;

/**
 *
 * @author nizar
 */
public class Ikan extends Barang{
    private String motif;

    public Ikan(String nama, int harga, int stock, String jenis, String motif) {
        super(nama, harga, stock, jenis);
        this.motif = motif;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
    //method menggunakan overidding
    @Override
    public void display() {
        System.out.println("Nama Barang  : " + this.nama);
        System.out.println("Harga Barang : " + this.harga);
        System.out.println("Stock Barang : " + this.stock);
        System.out.println("Jenis Barang : " + this.jenis);
        System.out.println("Motif Barang : " + this.motif);
    }
    
    @Override
    public void nambahBarang() {
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("dengan bermotif " + this.motif);
        System.out.println("SUDAH DITAMBAH");
    }
    @Override
    public void updateBarang(){
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("dengan bermotif " + this.motif);
        System.out.println("SUDAH DIPERBARUI");
    }
    @Override
    public void hapusBarang(){
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("dengan bermotif " + this.motif);
        System.out.println("SUDAH DIHAPUS");
    }
    
    public void overload(double pajak){
        final double total_pajak = (this.harga * this.stock) * pajak;
        int total_pajak1 = (int)total_pajak;
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("dengan bermotif " + this.motif);
        System.out.println("TOTAL PAJAKNYA adalah , Rp." + total_pajak1);
    }

}
