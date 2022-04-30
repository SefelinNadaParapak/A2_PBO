package POSTTEST5;

public abstract class Boneka {
    protected String nama, ukuran, warna;
    protected final int ukuranS = 25; //cm
    protected final int ukuranM = 30; //cm
    protected final int ukuranL = 60; //cm
    protected final int ukuranXL = 80; //cm
    
    // abstract method
    public abstract void empuk();

    public Boneka(String nama, String ukuran, String warna) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.warna = warna;
    }

    final public String getNama() {
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
