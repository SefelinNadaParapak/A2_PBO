package Posttest4;

class Nasi extends Makanan{
    String jenisNasi;

    public Nasi(String jenisNasi, String nama, String alamat, String restoran, String pesan, int jumlah, int total, String bayar) {
        super(nama, alamat, restoran, pesan, jumlah, total, bayar);
        this.jenisNasi = jenisNasi;
    }
    
    void Berhasil(){
        System.out.println("Makananmu otw nih");
    }
    
    void Tampil(){
        super.Berhasil();
        this.Berhasil();
    }
}
