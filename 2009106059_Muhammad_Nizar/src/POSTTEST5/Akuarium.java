/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST5;


/**
 *
 * @author nizar
 */
public class Akuarium extends Barang{
    private String ukuran;

    public Akuarium(String nama, int harga, int stock, String jenis, String ukuran) {
        super(nama, harga, stock, jenis);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    //method menggunakan overidding
    @Override
    public void display() {
        System.out.println("Nama Barang  : " + this.nama);
        System.out.println("Harga Barang : " + this.harga);
        System.out.println("Stock Barang : " + this.stock);
        System.out.println("Jenis Barang : " + this.jenis);
        System.out.println("Ukuran       : " + this.ukuran + "cm");
    }
    @Override
    public void nambahBarang() {
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("Dengan ukuran, " + this.ukuran + "cm");
        System.out.println("SUDAH DITAMBAH");
    }
    @Override
    public void updateBarang(){
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("Dengan ukuran, " + this.ukuran + "cm");
        System.out.println("SUDAH DIPERBARUI");
    }
    @Override
    public void hapusBarang(){
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("Dengan ukuran, " + this.ukuran + "cm");
        System.out.println("SUDAH DIHAPUS");
    }
    public void overload(double pajak){
        // final keyword
        final double total_pajak = (this.harga * this.stock) * pajak;
        int total_pajak1 = (int)total_pajak;
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("Dengan ukuran, " + this.ukuran + "cm");
        System.out.println("TOTAL PAJAKNYA adalah, Rp." + total_pajak1);
    }

}
