/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

public class DataPelanggan extends DataPenitipan {
    private String nomor_telepon, Alamat;

    // Constructor
    public DataPelanggan(String nama, String nomor_telepon, String jenisKelamin, String umur, String Alamat) {
        super(nama, jenisKelamin, umur);
        this.nomor_telepon = nomor_telepon;
        this.Alamat = Alamat;
    }

    // Setter & Getter
    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }
    
    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void Tampilkan() {
        System.out.println("    Nama Pelanggan      : " + this.nama);
        System.out.println("    Jenis Kelamin       : " + this.jenisKelamin);
        System.out.println("    Umur Pelanggan      : " + this.umur);
        System.out.println("    Alamat              : " + this.Alamat);
        System.out.println("    Nomor Telepon       : " + this.nomor_telepon);
        this.Minum();
    }

    @Override
    public void Minum() {
        System.out.println("    Pelanggan : "+this.nama+ " Minum Air Mineral di Botol dengan Sedotan");
    }
}