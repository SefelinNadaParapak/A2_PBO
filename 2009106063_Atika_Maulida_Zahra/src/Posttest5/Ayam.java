package Posttest5;

public final class Ayam extends Makanan{
    protected final String jenisAyam;

    public Ayam(String jenisAyam, String nama, String alamat, String restoran, String pesan, int jumlah, int total, String bayar) {
        super(nama, alamat, restoran, pesan, jumlah, total, bayar);
        this.jenisAyam = jenisAyam;
    }
    
    final void Berhasil(){
        System.out.println("Pesananmu siap diantar");
    }
    
//    void tampil(){
//        super.Berhasil();
//        this.Berhasil();
//    }
}
