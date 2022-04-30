package Posttest5;

import java.time.format.DateTimeFormatter;

// class final
public final class Jurnal extends Referensi {
    private String publikasi;
    private int isu;
    private String halaman;
    private String doi;

    public Jurnal(String judul, String penulis, int tahun, int volume, String publikasi, int isu, String halaman, String doi) {
        super(judul, penulis, tahun, volume);
        this.publikasi = publikasi;
        this.isu = isu;
        this.halaman = halaman;
        this.doi = doi;
    }

    public String getPublikasi() {
        return publikasi;
    }

    public void setPublikasi(String publikasi) {
        this.publikasi = publikasi;
    }

    public int getIsu() {
        return isu;
    }

    public void setIsu(int isu) {
        this.isu = isu;
    }

    public String getHalaman() {
        return halaman;
    }

    public void setHalaman(String halaman) {
        this.halaman = halaman;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    // overriding
    // fungsi untuk menampilkan detail item
    // memanggil fungsi tampilkandetail parent class dulu untuk menampilkan judul, penulis, tahun, dan volume
    public void tampilkanDetail() {
        int i = 0;

        System.out.println("Judul            : " + this.judul);
        System.out.print("Penulis          : ");
        while (i != this.penulis.length - 1) {
            System.out.print(this.penulis[i] + ", ");
            i++;
        }
        System.out.println(this.penulis[this.penulis.length - 1]);
        System.out.println("Tahun            : " + this.tahun);
        System.out.println("Volume           : " + this.volume);
        System.out.println("Publikasi        : " + this.publikasi);
        System.out.println("Isu              : " + this.isu);
        System.out.println("Halaman          : " + this.halaman);
        System.out.println("DOI              : " + this.doi);
        DateTimeFormatter format_tanggal = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Ditambahkan pada : " + this.tgl_ditambahkan.format(format_tanggal));
    }

    // overriding
    public String buatBibliografi() {
//        Pratiwi, N., & Pritanova, N. (2017). PENGARUH LITERASI DIGITAL TERHADAP PSIKOLOGIS ANAK DAN REMAJA. Semantik, 6(1), 11–24. https://doi.org/10.22460/semantik.v6i1.p11-24
        return super.buatBibliografi() + " " + this.getJudul() + ". " + this.publikasi + ", " + this.getVolume() + "(" + this.isu + "), " + this.halaman + ". " + this.doi;
    }
}
