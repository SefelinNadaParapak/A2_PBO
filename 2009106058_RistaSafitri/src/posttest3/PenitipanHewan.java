/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;


public class PenitipanHewan {
    private int harga;
    private int jumlah_hewan;
    private int jumlah_hari;
    private int jam;
    private int umur_hewan;
    private String nomor_telepon;
    private String nama_hewan;
    private String nama_pemilik;
    private String jenis_hewan;

    public PenitipanHewan(String nomor_telepon, String nama_pemilik, String jenis_hewan,
        String nama_hewan, int jumlah_hewan, int umur_hewan, int jumlah_hari, 
        int jam, int harga) {
        
        this.harga = harga;
        this.jumlah_hewan = jumlah_hewan;
        this.jumlah_hari = jumlah_hari;
        this.jam = jam;
        this.nomor_telepon = nomor_telepon;
        this.umur_hewan = umur_hewan;
        this.nama_hewan = nama_hewan;
        this.nama_pemilik = nama_pemilik;
        this.jenis_hewan = jenis_hewan;
    }

    //    Menampilkan
    void Tampilkan() {
        System.out.println("    Nomor Telepon       : " + this.nomor_telepon);
        System.out.println("    Nama Pemilik        : " + this.nama_pemilik);
        System.out.println("    Jenis Hewan         : " + this.jenis_hewan);
        System.out.println("    Nama Hewan          : " + this.nama_hewan);
        System.out.println("    Jumlah Hewan        : " + this.jumlah_hewan);
        System.out.println("    Umur Hewan          : " + this.umur_hewan);
        System.out.println("    Jumlah Hari         : " + this.jumlah_hari);
        System.out.println("    Waktu               : " + this.jam);
        System.out.println("    Harga               : " + this.harga);
    }    
    

//    void berjalan() {
//        System.out.println("sedang berjalan");
//    }
//
//    void stop() {
//        System.out.println("bisa berhenti");
//    }


//    getter dan setter
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah_hewan() {
        return jumlah_hewan;
    }

    public void setJumlah_hewan(int jumlah_hewan) {
        this.jumlah_hewan = jumlah_hewan;
    }

    public int getJumlah_hari() {
        return jumlah_hari;
    }

    public void setJumlah_hari(int jumlah_hari) {
        this.jumlah_hari = jumlah_hari;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public int getUmur_hewan() {
        return umur_hewan;
    }

    public void setUmur_hewan(int umur_hewan) {
        this.umur_hewan = umur_hewan;
    }

    public String getNama_hewan() {
        return nama_hewan;
    }

    public void setNama_hewan(String nama_hewan) {
        this.nama_hewan = nama_hewan;
    }

    public String getNama_pemilik() {
        return nama_pemilik;
    }

    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    public String getJenis_hewan() {
        return jenis_hewan;
    }

    public void setJenis_hewan(String jenis_hewan) {
        this.jenis_hewan = jenis_hewan;
    }
    
    
}
