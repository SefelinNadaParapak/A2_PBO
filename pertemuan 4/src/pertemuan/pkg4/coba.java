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
public class coba {
    private String nama, jenis, warna;

    //constructor
    public coba(String nama, String jenis, String warna) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
    }

    // getter & setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
}
