/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST4;

/**
 *
 * @author nizar
 */
public class MakanIkan extends Barang{
    private int berat;

    public MakanIkan(String nama, int harga, int stock, String jenis, int berat) {
        super(nama, harga, stock, jenis);
        this.berat = berat;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }
    //method menggunakan overidding
    @Override
    public void display() {
        System.out.println("Nama Barang  : " + this.nama);
        System.out.println("Harga Barang : " + this.harga);
        System.out.println("Stock Barang : " + this.stock);
        System.out.println("Jenis Barang : " + this.jenis);
        System.out.println("Berat barang: " + this.berat + "gr");
    }
    @Override
    public void nambahBarang() {
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("dengan berat ," + this.berat + "gr");
        System.out.println("SUDAH DITAMBAH");
    }


    @Override
    public void updateBarang(){
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("dengan berat ," + this.berat + "gr");
        System.out.println("SUDAH DIPERBARUI");
    }

    /**
     *
     */
    @Override
    public void hapusBarang(){
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("dengan berat ," + this.berat + "gr");;
        System.out.println("SUDAH DIHAPUS");
    }
    
    public void overload(double pajak){
        double total_pajak = (this.harga * this.stock) * pajak;
        int total_pajak1 = (int)total_pajak;
        System.out.println("Barang ini," + this.nama);
        System.out.println("dengan harga satuan , Rp." + this.harga);
        System.out.println("Jumlah stock sebanyak " + this.stock);
        System.out.println("Jenis barangnya yaitu " + this.jenis);
        System.out.println("dengan berat ," + this.berat + "gr");
        System.out.println("TOTAL PAJAKNYA adalah : " + total_pajak1);
    }


}
