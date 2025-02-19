package Posttest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    // inisialisasi ArrayList
    public static ArrayList<Referensi> itemList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String pilihan = "";
        while (!pilihan.equalsIgnoreCase("k")) {
            // menu utama
            bersihkanKonsol();
            System.out.println("MANAJER REFERENSI KARYA ILMIAH\n");
            System.out.println("[T]ambah item");
            System.out.println("[L]ihat item");
            System.out.println("[K]eluar");

            // masukan user
            pilihan = input(">> ");

            // logika menu
            switch (pilihan.toLowerCase()) {
                case "t":
                    bersihkanKonsol();
                    tambahItem();
                    break;
                case "l":
                    String pilihanLihatItem;
                    bersihkanKonsol();
                    while (true) {
                        bersihkanKonsol();
                        lihatItem();
                        System.out.println("[D]etail item");
                        System.out.println("[B]uat daftar pustaka (APA 7th edition)");
                        System.out.println("[U]bah item");
                        System.out.println("[H]apus item");
                        System.out.println("[M]enu utama");
                        pilihanLihatItem = input(">> ");
                        if (pilihanLihatItem.equalsIgnoreCase("m")) {
                            break;
                        }

                        int nomorItem = Integer.parseInt(input("Nomor item : "));
                        bersihkanKonsol();

                        switch (pilihanLihatItem.toLowerCase()) {
                            case "d" -> tampilkanDetailItem(nomorItem);
                            case "b" -> tampilkanBibliografi(nomorItem);
                            case "u" -> ubahItem(nomorItem);
                            case "h" -> hapusItem(nomorItem);
                        }
                    }
                case "k":
                    break;
                default:
                    System.out.println("Fitur belum tersedia...");
            }
        }
    }

    private static void tampilkanBibliografi(int nomorItem) throws IOException {
        int indeks = nomorItem - 1;
        String bibliografi;

        if (isBuku(indeks)) {
            Buku buku = (Buku) itemList.get(indeks);
            bibliografi = buku.buatBibliografi();
        } else {
            Jurnal jurnal = (Jurnal) itemList.get(indeks);
            bibliografi = jurnal.buatBibliografi();
        }

        System.out.println(bibliografi);
        // pause
        System.in.read();
    }

    public static void tambahItem() throws IOException {
        // pilih jenis referensi
        System.out.println("Jenis item dapat berupa [B]uku atau [J]urnal");
        String jenis = input("Jenis (B|J) : ");

        // masukkan data referensi
        // buku : Sagan, C. (2016). Kosmos (8 ed., Vol. 3). PT Gramedia.
        // jurnal : Munir, S., & Hidayatullah, A. (2021). PEMANFAATAN MADING BERMUATAN BARCODE EBOOK UNTUK. Abdimas Galuh, 3(1), 83–90. https://doi.org/10.25157/ag.v3i1.4954
        bersihkanKonsol();
        System.out.println("Masukkan metadata referensi\n");
        String judul = input("Judul     : ");
        String penulis = input("Penulis   : ");
        int tahun = Integer.parseInt(input("Tahun     : "));
        int volume = Integer.parseInt(input("Volume    : "));

        // buat objek sesuai jenis referensi dan masukkan ke list
        switch (jenis.toLowerCase()) {
            case "b" -> {
                // metadata khusus buku
                int edisi = Integer.parseInt(input("Edisi     : "));
                String penerbit = input("Penerbit  : ");

                // buat objek buku
                Buku buku = new Buku(judul, penulis, tahun, volume, edisi, penerbit);

                // masukkan ke list
                itemList.add(buku);
            }
            case "j" -> {
                // metadata khusus jurnal
                String publikasi = input("Publikasi : ");
                int isu = Integer.parseInt(input("Isu       : "));
                String halaman = input("Halaman   : ");
                String doi = input("DOI       : ");

                // buat objek jurnal
                Jurnal jurnal = new Jurnal(judul, penulis, tahun, volume, publikasi, isu, halaman, doi);

                // masukkan ke list
                itemList.add(jurnal);
            }
        }
    }

    // mencetak item ke layar
    public static void lihatItem() {
        // header
        int batasKarakter = 27;
        String formatHeader = "%-3s%-" + batasKarakter + "s%-" + batasKarakter + "s\n";
        System.out.printf(formatHeader, "NO", "JUDUL", "PENULIS");

        // konten
        String judul, penulis, judulFormatted;
        String formatKonten = "%-3d%-" + batasKarakter + "s%-" + batasKarakter + "s\n";

        // loop kedalam itemList
        for (int i = 0; i < itemList.size(); i++) {
            Referensi item = itemList.get(i);
            judul = item.getJudul();
            penulis = item.getPenulis();

            // Format judul jika panjang karakternya lebih dari batas karakter
            judulFormatted = judul.length()<batasKarakter ? judul : judul.substring(0, batasKarakter - 5) + "...";

            System.out.printf(formatKonten, i + 1, judulFormatted, penulis);
        }
        System.out.println("=".repeat(batasKarakter*2+3));
    }

    public static void ubahItem(int pilihanUbah) throws IOException {
        int pilihanItem = pilihanUbah - 1;

        System.out.println("Silahkan pilih metadata yang mau diubah");
        System.out.println("[J]udul");
        System.out.println("[P]enulis");
        System.out.println("[T]ahun");
        System.out.println("[V]olume");

        // cek nama kelas item dulu
        // lalu tampilkan pilihan khusus pada item
        if (isBuku(pilihanItem)) {
            Buku buku = (Buku) itemList.get(pilihanItem);

            System.out.println("[E]disi");
            System.out.println("Pe[n]erbit");

            String pilihanData = input(">> ");

            switch (pilihanData.toLowerCase()) {
                case "j" -> buku.setJudul(input("Edit judul : "));
                case "p" -> buku.setPenulis(input("Edit penulis : "));
                case "t" -> buku.setTahun(Integer.parseInt(input("Edit tahun : ")));
                case "v" -> buku.setVolume(Integer.parseInt(input("Edit volume : ")));
                case "e" -> buku.setEdisi(Integer.parseInt(input("Edit edisi : ")));
                case "n" -> buku.setPenerbit(input("Edit penerbit : "));
            }

            // kembalikan object yang diubah ke list
            itemList.set(pilihanItem, buku);
        } else {
            Jurnal jurnal = (Jurnal) itemList.get(pilihanItem);

            System.out.println("P[u]blikasi");
            System.out.println("[I]su");
            System.out.println("[H]alaman");
            System.out.println("[D]OI");

            String pilihanData = input(">> ");

            switch (pilihanData.toLowerCase()) {
                case "j" -> jurnal.setJudul(input("Edit judul : "));
                case "p" -> jurnal.setPenulis(input("Edit penulis : "));
                case "t" -> jurnal.setTahun(Integer.parseInt(input("Edit tahun : ")));
                case "v" -> jurnal.setVolume(Integer.parseInt(input("Edit volume : ")));
                case "u" -> jurnal.setPublikasi(input("Edit publikasi : "));
                case "i" -> jurnal.setIsu(Integer.parseInt(input("Edit isu : ")));
                case "h" -> jurnal.setHalaman(input("Edit halaman : "));
                case "d" -> jurnal.setDoi(input("Edit DOI : "));
            }

            // kembalikan object jurnal yang baru ke list
            itemList.set(pilihanItem, jurnal);
        }
    }

    public static void hapusItem(int pilihanHapus) throws IOException {
        int pilihanItem = pilihanHapus - 1;
        String yakin = input("Apakah Anda yakin (Y|N) : ");
        switch (yakin.toLowerCase()) {
            case "y":
                itemList.remove(pilihanItem);
                break;
            case "n":
                break;
            default:
                System.out.println("Isi dengan y atau n");
        }
    }

    
    public static void tampilkanDetailItem(int pilihanDetailItem) throws IOException {
        int pilihanItem = pilihanDetailItem - 1;
        if (isBuku(pilihanItem)) {
            Buku buku = (Buku) itemList.get(pilihanItem);
            System.out.println("Judul    : " + buku.getJudul());
            System.out.println("Penulis  : " + buku.getPenulis());
            System.out.println("Tahun    : " + buku.getTahun());
            System.out.println("Volume   : " + buku.getVolume());
            System.out.println("Edisi    : " + buku.getEdisi());
            System.out.println("Penerbit : " + buku.getPenerbit());
            // buku.tampilkanDetail();
        } else {
            Jurnal jurnal = (Jurnal) itemList.get(pilihanItem);
            System.out.println("Judul     : " + jurnal.getJudul());
            System.out.println("Penulis   : " + jurnal.getPenulis());
            System.out.println("Tahun     : " + jurnal.getTahun());
            System.out.println("Volume    : " + jurnal.getVolume());
            System.out.println("Publikasi : " + jurnal.getPublikasi());
            System.out.println("Isu       : " + jurnal.getIsu());
            System.out.println("Halaman   : " + jurnal.getHalaman());
            System.out.println("DOI       : " + jurnal.getDoi());
            // jurnal.tampilkanDetail();
        }

        // pause
        System.in.read();
    }

    // fungsi untuk mempermudah menggunakan input
    public static String input(String teksKeterangan) throws IOException {
        System.out.print(teksKeterangan);
        // inisialisasi input
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(inputStream);
        return input.readLine();
    }

    // fungsi untuk cek apakah objek dari kelas buku dalam arraylist
    public static boolean isBuku(int indeks) {
        String namaPackage = "Posttest3";
        return itemList.get(indeks).getClass().getName().equals(namaPackage + ".Buku");
    }

    public static void bersihkanKonsol() {
        System.out.println(System.lineSeparator().repeat(100));
    }
}
