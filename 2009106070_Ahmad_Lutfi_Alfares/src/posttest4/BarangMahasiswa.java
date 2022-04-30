package posttest4;

class BarangMahasiswa extends Barang{
    private String nama_mahasiswa;
    private int nim;

    public BarangMahasiswa(String nama_mahasiswa, int nim, String nama_barang, String warna_barang, String jenis_barang, int banyak_barang, String waktu_serah, int harga) {
        super(nama_barang, warna_barang, jenis_barang, banyak_barang, waktu_serah, harga);
        this.nama_mahasiswa = nama_mahasiswa;
        this.nim = nim;
    }

    public String getNama_mahasiswa() {
        return nama_mahasiswa;
    }

    public void setNama_mahasiswa(String nama_mahasiswa) {
        this.nama_mahasiswa = nama_mahasiswa;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void hitungHarga(int jam){
        int harga_barang = (10000 * jam);
        System.out.println("Untuk 1 jam harganya " + harga_barang);
    }


}

