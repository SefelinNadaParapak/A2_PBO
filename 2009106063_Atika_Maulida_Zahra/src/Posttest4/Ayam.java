package Posttest4;

class Ayam extends Makanan{
    String jenisAyam;

    public Ayam(String jenisAyam, String nama, String alamat, String restoran, String pesan, int jumlah, int total, String bayar) {
        super(nama, alamat, restoran, pesan, jumlah, total, bayar);
        this.jenisAyam = jenisAyam;
    }
    
    void Berhasil(){
        System.out.println("Pesananmu siap diantar");
    }
    
    void tampil(){
        super.Berhasil();
        this.Berhasil();
    }
}
