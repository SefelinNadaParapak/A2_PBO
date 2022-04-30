/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author ASUS
 */
public class Groupband extends Idol{

    private String pc_member, fan, alamat, email, tanggal;
    private int pcBias;

    public Groupband(String pc_member, String fan, String alamat, String email, String tanggal, int pcBias, String nama, String gender, String album, String kategori, int jml_album, int lightstick, int pc) {
        super(nama, gender, album, kategori, jml_album, lightstick, pc);
        this.pc_member = pc_member;
        this.fan = fan;
        this.alamat = alamat;
        this.email = email;
        this.tanggal = tanggal;
        this.pcBias = pcBias;
    }

    public String getPc_member() {
        return pc_member;
    }

    public void setPc_member(String pc_member) {
        this.pc_member = pc_member;
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

    public int getPcBias() {
        return pcBias;
    }

    public void setPcBias(int pcBias) {
        this.pcBias = pcBias;
    }
    
    @Override
    public void tampil() {
        System.out.println("Tanggal Pemesanan (DD/MM/YY): " + this.tanggal);
        System.out.println("Nama Pemesan    : " + this.fan);
        System.out.println("Alamat Pemesan  : " + this.alamat);
        System.out.println("Email Pemesan   : " + this.email);
        System.out.println("Kategori        : " + this.kategori);
        System.out.println("Group Band      : " + this.nama);
        System.out.println("Gender          : " + this.gender);
        System.out.println("Album           : " + this.album + " " + this.jml_album + " pcs");
        System.out.println("Lighstick       : " + this.lightstick + " pcs");
        System.out.println("Photocards      : " + this.pc + " pcs");
        System.out.println("PC Bias         : " + this.pc_member + " " + this.pcBias + " pcs");
    }
    
    public int total(int jml_album, int lightstick, int pc, int pcBias) {
        return (jml_album + lightstick + pc + pcBias);
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
