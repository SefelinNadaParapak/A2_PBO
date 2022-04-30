package posttest5;

class BarangMahasiswa extends Barang{
    private String nama_mahasiswa;
    private int nim;

    public BarangMahasiswa(String nama_mahasiswa, int nim, String nama_barang, String warna_barang, String jenis_barang, int banyak_barang, String waktu_serah) {
        super(nama_barang, warna_barang, jenis_barang, banyak_barang, waktu_serah);
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
        final int harga_barang = (10000 * jam);
        System.out.println("Barang "+ nama_mahasiswa);
        System.out.println("Untuk 1 jam harganya " + harga_barang);
    }

    //Metodh Mahasiswa 
    @Override
    public final void taruhBarang() {
        System.out.println("Ini Barang Mahasiswa!");
        
    }

    @Override
    public final void ambilBarang() {
        System.out.println("Barang Mahasiswa telah dikembalikan!");
    }

}

