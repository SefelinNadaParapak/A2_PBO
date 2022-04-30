package POSTTEST4;

public class Boneka {
    protected String nama, ukuran, warna;

    //constructor
    public Boneka(String nama, String ukuran, String warna) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.warna = warna;
    }

    //getter & setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
} 
