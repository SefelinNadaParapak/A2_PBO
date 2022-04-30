/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author ASUS
 */
public class Idol {
    
    protected  String nama, gender, album, kategori;
    protected int jml_album, lightstick, pc;

    public Idol(String nama, String gender, String album, String kategori, int jml_album, int lightstick, int pc) {
        this.nama = nama;
        this.gender = gender;
        this.album = album;
        this.kategori = kategori;
        this.jml_album = jml_album;
        this.lightstick = lightstick;
        this.pc = pc;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getJml_album() {
        return jml_album;
    }

    public void setJml_album(int jml_album) {
        this.jml_album = jml_album;
    }

    public int getLightstick() {
        return lightstick;
    }

    public void setLightstick(int lightstick) {
        this.lightstick = lightstick;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }
    
    public void tampil() {
        System.out.println("Kategoroi       : " + this.kategori);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Gender          : " + this.gender);
        System.out.println("Album           : " + this.album + " (" + this.jml_album + " pcs");
        System.out.println("Lighstick       : " + this.lightstick);
        System.out.println("Photocards      : " + this.pc);
    }
    
    void done() {
        System.out.println("\nPesanan telah dicatat.");
    }
    
    void info() {
        System.out.println("\nPastikan tidak ada kesalahan dalam mencatat data pemesanan demi kepuasan pelanggan.\nHarap dicek secara berkala.\n");
    }
    
}
