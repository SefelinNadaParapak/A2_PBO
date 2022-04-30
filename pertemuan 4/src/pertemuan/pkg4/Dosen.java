/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg4;

/**
 *
 * @author Asus
 */
public class Dosen {
    private String nama, nip, jenisKelamin, alamat;

    //constructor
    public Dosen(String nama, String nip, String jenisKelamin, String alamat) {
        this.nama = nama;
        this.nip = nip;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    //getter & setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
