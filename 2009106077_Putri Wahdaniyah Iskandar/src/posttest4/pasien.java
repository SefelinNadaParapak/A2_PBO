/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author ASUS
 */
public class pasien extends homecare {
    private String riwayatsakit;

 public pasien(String nama, String gender, String alamat, String riwayatsakit) {
        super(nama, gender, alamat);
        this.riwayatsakit = riwayatsakit;
    }
 public String getriwayatsakit() {
        return riwayatsakit;
    }

    public void setriwayatsakit(String riwayatsakit) {
        this.riwayatsakit = riwayatsakit;
    }

    public void display() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Gender        : " + this.gender);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("Mengidap Penyakit: " + this.riwayatsakit);
        this.hidup();
    }

    @Override
    public void hidup() {
        System.out.println("Pasien :" +this.nama+ "Terima Kasih");
    }

}
