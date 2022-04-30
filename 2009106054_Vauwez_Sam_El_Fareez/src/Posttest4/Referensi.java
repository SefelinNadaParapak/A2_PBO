package Posttest4;

import java.util.ArrayList;

public class Referensi {
    private String judul;
    private String[] penulis;
    private int tahun;
    private int volume;

    public Referensi(String judul, String penulis, int tahun, int volume) {
        this.judul = judul;
        this.penulis = parsePenulis(penulis);
        this.tahun = tahun;
        this.volume = volume;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String[] getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = parsePenulis(penulis);
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

    // parse penulis yang lebih dari satu
    public String[] parsePenulis(String penulisParameter) {
        String[] paraPenulis = penulisParameter.split(",");
        for (int i = 0; i < paraPenulis.length; i++) {
            paraPenulis[i] = paraPenulis[i].trim();
        }
        return paraPenulis;
    }
    public void tampilkanDetail() {
        int i = 0;

        System.out.println("Judul     : " + this.judul);
        System.out.print("Penulis   : ");
        while (i != this.penulis.length - 1) {
            System.out.print(this.penulis[i] + ", ");
            i++;
        }
        System.out.println(this.penulis[this.penulis.length - 1]);
        System.out.println("Tahun     : " + this.tahun);
        System.out.println("Volume    : " + this.volume);
    }

    public String bibliografiPenulisDanTahun(String[] arrayPenulis) {
        ArrayList<String[]> penulisParsed = new ArrayList<>();
        StringBuilder penulisanPenulis;
        StringBuilder penulisanParaPenulis = new StringBuilder();

        // 1. dari array penulis, pisahkan setiap kata nama pada setiap elemen
        // arrayPenulis -> [Carl Stephen Sagan, Elizabeth Kolbert]
        for (String penulis : arrayPenulis) {
            String[] namaPenulisTerpisah = penulis.split(" ");
            penulisParsed.add(namaPenulisTerpisah);
        }
        // 2. dari setiap array elemen cetak dengan format "NamaBelakang, NamaDepan."
        // penulisParsed -> [[Carl, Stephen, Sagan], [Elizabeth, Kolbert]]
        // namaPenulisTerpisah -> [Carl, Stephen, Sagan]
        for (String[] namaPenulisTerpisah : penulisParsed) {
            // penulisanPenulis -> "Sagan"
            penulisanPenulis = new StringBuilder(namaPenulisTerpisah[namaPenulisTerpisah.length - 1]);
            // penulisanPenulis -> "Sagan, "
            penulisanPenulis.append(", ");
            // for akan mengindeks -> 0:Carl, 1:Stephen
            for (int i = 0; i < namaPenulisTerpisah.length - 1; i++) {
                // penulisanPenulis -> "Sagan, C. S. "
                // jika sudah elemen terakhir tambahkan titik tanpa spasi
                // penulisanPenulis -> "Sagan, C. S."
                if (i == namaPenulisTerpisah.length - 2) {
                    penulisanPenulis.append(namaPenulisTerpisah[i].charAt(0)).append(".");
                } else {
                    penulisanPenulis.append(namaPenulisTerpisah[i].charAt(0)).append(". ");
                }
            }
            // penulisanPenulis -> "Sagan, C. S, "
            penulisanPenulis.append(",");

            // tambahkan penulisanPenulis saat ini ke penulisan penulis gabungan
            penulisanParaPenulis.append(" ").append(penulisanPenulis);
        }

        return penulisanParaPenulis + " (" + this.tahun + ").";
    }

    // overloading
    // jika penulis hanya satu
    // cara penggunaan : bibliografiPenulisDanTahun(this.penulis[0])
    public String bibliografiPenulisDanTahun(String penulis) {
        String[] namaPenulisPerKata = penulis.split(" ", 2);

        if (namaPenulisPerKata.length > 1) {
            // mendapatkan akhiran nama penulis
            String namaKeluarga = namaPenulisPerKata[1];
            String namaDepan = namaPenulisPerKata[0];
            // Sagan, C. (2016).
            return namaKeluarga + ", " + namaDepan.charAt(0) + ". (" + this.tahun + ").";
        } else
            return namaPenulisPerKata[0] + ". (" + this.tahun + ").";
    }

    public String buatBibliografi() {
        if (this.penulis.length > 1) {
            return bibliografiPenulisDanTahun(this.penulis);
        } else {
            return bibliografiPenulisDanTahun(this.penulis[0]);
        }
    }
}
