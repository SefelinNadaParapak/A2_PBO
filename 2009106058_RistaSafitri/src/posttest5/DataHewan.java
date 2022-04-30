/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

public class DataHewan extends DataPenitipan {
    private String jenis_hewan;

    public DataHewan(String nama, String jenisKelamin, String umur, String jenis_hewan) {
        super(nama, jenisKelamin, umur);
        this.jenis_hewan = jenis_hewan;
//        this.jenis_hewan = "Kucing Anggora";
    }

    final public String getJenis_hewan() {
        return jenis_hewan;
    }
    public void setJenis_hewan(String jenis_hewan) {
        this.jenis_hewan = jenis_hewan;
    }

    public void Tampilkan() {
        System.out.println("    Nama Hewan      : " + this.nama);
        System.out.println("    Jenis Hewan     : " + this.jenis_hewan);
        System.out.println("    Jenis Kelamin   : " + this.jenisKelamin);
        System.out.println("    Umur Hewan      : " + this.umur);
        this.Minum();
    }

    @Override
    public void Minum() {
        System.out.println("    Hewan : "+this.nama+ " Minum Air Mentah di Mangkok");
    }
}
