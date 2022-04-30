/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author ASUS
 */
public class Solo extends Idol{
    private String group, fan, alamat, email, tanggal;

    public Solo(String group, String fan, String alamat, String email, String tanggal, String nama, String gender, String album, String kategori, int jml_album, int lightstick, int pc) {
        super(nama, gender, album, kategori, jml_album, lightstick, pc);
        this.group = group;
        this.fan = fan;
        this.alamat = alamat;
        this.email = email;
        this.tanggal = tanggal;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    @Override
    public void tampil() {
        System.out.println("Tanggal Pemesanan (DD/MM/YY): " + this.tanggal);
        System.out.println("Nama Pemesan    : " + this.fan);
        System.out.println("Alamat Pemesan  : " + this.alamat);
        System.out.println("Email Pemesan   : " + this.email);
        System.out.println("Kategori        : " + this.kategori);
        System.out.println("Soloist         : " + this.nama + " of " + this.group);
        System.out.println("Gender          : " + this.gender);
        System.out.println("Solo Album      : " + this.album + " " + this.jml_album + " pcs");
        System.out.println("Lighstick       : " + this.lightstick + " pcs");
        System.out.println("Photocards      : " + this.pc + " pcs");
        
    }
    
    public int total(int jml_album, int lightstick, int pc) {
        return (jml_album + lightstick + pc);
    }
    
    @Override
    void done() {
        System.out.println("\nPesanan telah dicatat.");
    }
    
    @Override
    void info() {
        System.out.println("Pastikan tidak ada kesalahan dalam mencatat data pemesanan.\nHarap dicek secara berkala.\n");
    }
}
