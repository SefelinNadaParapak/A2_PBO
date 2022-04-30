package Posttest5;

import java.time.format.DateTimeFormatter;

public class Buku extends Referensi {
    private int edisi;
    private String penerbit;

    public Buku(String judul, String penulis, int tahun, int volume, int edisi, String penerbit) {
        super(judul, penulis, tahun, volume);
        this.edisi = edisi;
        this.penerbit = penerbit;
    }

    public int getEdisi() {
        return edisi;
    }

    public void setEdisi(int edisi) {
        this.edisi = edisi;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
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
        System.out.println("Edisi            : " + this.edisi);
        System.out.println("Penerbit         : " + this.penerbit);
        DateTimeFormatter format_tanggal = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Ditambahkan pada : " + this.tgl_ditambahkan.format(format_tanggal));
    }

    // overriding
    // final method
    public final String buatBibliografi() {
//        Sagan, C. (2016). Kosmos (8 ed., Vol. 3). PT Gramedia.
        return super.buatBibliografi() + " " + this.getJudul() + " (" + this.edisi + " ed., Vol. " + this.getVolume() + "). " + this.penerbit + ".";
    }
}
