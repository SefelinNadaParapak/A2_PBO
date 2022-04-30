package Posttest3;

public class Referensi {
    private String judul;
    private String penulis;
    private int tahun;
    private int volume;

    public Referensi(String judul, String penulis, int tahun, int volume) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.volume = volume;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void tampilkanDetail() {
        System.out.println("Judul     : " + this.judul);
        System.out.println("Penulis   : " + this.penulis);
        System.out.println("Tahun     : " + this.tahun);
        System.out.println("Volume    : " + this.volume);
    }

    public String bibliografiPenulisDanTahun() {
        // pisahkan string nama penulis berdasarkan spasi pertama
        // sehingga cuma ada dua elemen array string: nama depan dan namabelakang
        String[] penulis = this.penulis.split(" ", 2);

        if (penulis.length > 1) {
            // mendapatkan akhiran nama penulis
            String namaKeluarga = penulis[1];
            String namaDepan = penulis[0];
            // Sagan, C. (2016).
            return namaKeluarga + ", " + namaDepan.charAt(0) + ". (" + this.tahun + ").";
        } else
            return penulis[0] + ". (" + this.tahun + ").";
    }
}
