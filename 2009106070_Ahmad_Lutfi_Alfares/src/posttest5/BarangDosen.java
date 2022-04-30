package posttest5;

class BarangDosen extends Barang{
    private String nama_dosen;
    private int nip;

    public BarangDosen(String nama_dosen, int nip, String nama_barang, String warna_barang, String jenis_barang, int banyak_barang, String waktu_serah) {
        super(nama_barang, warna_barang, jenis_barang, banyak_barang, waktu_serah);
        this.nama_dosen = nama_dosen;
        this.nip = nip;
    }

    public String getNama_dosen() {
        return nama_dosen;
    }

    public void setNama_dosen(String nama_dosen) {
        this.nama_dosen = nama_dosen;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    


    public void hitungHarga(int jam){
        final int harga_barang = (10000 * jam);
        System.out.println("Barang "+ nama_dosen);
        System.out.println("Untuk 1 jam harganya " + harga_barang);
    }

    //Metodh Dosen
    @Override
    public final void taruhBarang(){
        System.out.println("Ini Barang Dosen!");
    }

    @Override
    public final void ambilBarang() {
        System.out.println("Barang Dosen telah dikembalikan!");
        
    }

}
