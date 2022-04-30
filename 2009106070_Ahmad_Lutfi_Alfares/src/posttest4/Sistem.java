package posttest4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Hp GK
 */
public class Sistem {
    // variabel global
    
    static ArrayList<BarangMahasiswa> barangMahasiswa = new ArrayList<BarangMahasiswa>();
    static ArrayList<BarangDosen> barangDosen = new ArrayList<BarangDosen>();
    // main utama
    public static void main(String[]args) throws IOException{
        // data ArrayList
        barangMahasiswa.add(new BarangMahasiswa("Jaka", 232342, "Helm", "Merah", "Padat",1, "21.09", 10000));
//        barang.get(0).nama_Penitip = "Jaka";
//        barang.get(0).nama_Barang = "Helm";
//        barang.get(0).waktu_Serah = "08.00";
//        barang.get(0).harga_Penitipan = 15000;
        barangMahasiswa.add(new BarangMahasiswa("Yaya", 21001, "Tas", "Putih", "Padat",1, "07.23", 10000));
//        barang.get(1).nama_Penitip = "Yaya";
//        barang.get(1).nama_Barang = "Tas";
//        barang.get(1).waktu_Serah = "07.23";
//        barang.get(1).harga_Penitipan = 15000;
        barangMahasiswa.add(new BarangMahasiswa("Reni", 21002,"Buku", "Orange", "Padat", 5,"09.25", 10000));
//        barang.get(2).nama_Penitip = "Reni";
//        barang.get(2).nama_Barang = "Buku";
//        barang.get(2).waktu_Serah = "09.25";
//        barang.get(2).harga_Penitipan = 15000;
        barangDosen.add(new BarangDosen("Supri", 409080, "Kunci Motor", "Hitam", "Besi", 1, "08.15", 10000));
        // menjalankan fungsi menu()
        menu();
        
    }
    public static void menu() throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("|-------------------------------------------|");
        System.out.println("|   Sistem penitipan barang Univ Mulawarman |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|1. Lihat barang titipan                    |");
        System.out.println("|2. Tambah barang titipan                   |");
        System.out.println("|3. Update barang titipan                   |");
        System.out.println("|4. Hapus barang titipan                    |");
        System.out.println("|5. Cek Harga titipan                       |");
        System.out.println("|9. Exit                                    |");
        System.out.println("|-------------------------------------------|");
        
        System.out.print("Pilih menu : ");
        int Pilihan = Integer.valueOf(pilih.readLine());
        if (Pilihan == 1){
            menuLihat();
        } 
        else if(Pilihan == 2){
            menuTambah();
        }
        else if (Pilihan == 3){
            menuUpdate();
        }
        else if (Pilihan == 4){
            menuDelete();
        }
        else if (Pilihan == 5){
            cekHarga();
        }
        else if (Pilihan == 9){
            System.exit(0);
        }
        else {
            System.out.println("Inputan salah! Coba Lagi!");
            menu();
        }
    }

    public static void menuLihat() throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("|---------------------------------------|");
        System.out.println("|           Pilih Pemilik Barang        |");
        System.out.println("|---------------------------------------|");
        System.out.println("|1. Mahasiswa                           |");
        System.out.println("|2. Dosen                               |");
        System.out.println("|---------------------------------------|");
        
        System.out.print("Pilih menu : ");
        int Pilihan = Integer.valueOf(pilih.readLine());
        switch (Pilihan){
            case 1 :
                lihatBarangMahasiswa();
                break;
            case 2 :
                lihatBarangDosen();
                break;
        }
    }
    public static void lihatBarangMahasiswa() throws IOException{
        int jumlah_barang = 0;
        
        System.out.println("|---------------------------------------|");
        System.out.println("|         Daftar Barang Mahasiswa       |");
        System.out.println("|---------------------------------------|");
        
        for (int a = 0; a < barangMahasiswa.size(); a++){
            System.out.println("Data ke-" + (a + 1));
            System.out.println("Nama Mahasiswa      : " + barangMahasiswa.get(a).getNama_mahasiswa());
            System.out.println("Nim                 : " + barangMahasiswa.get(a).getNim());
            System.out.println("Nama Barang         : " + barangMahasiswa.get(a).getNama_barang());
            System.out.println("Warna Barang        : " + barangMahasiswa.get(a).getWarna_barang());
            System.out.println("Jenis Barang        : " + barangMahasiswa.get(a).getJenis_barang());
            System.out.println("Jumlah Barang       : " + barangMahasiswa.get(a).getBanyak_barang());
            System.out.println("Waktu Terima Barang : " + barangMahasiswa.get(a).getWaktu_serah());
            System.out.println("Harga Barang        : " + barangMahasiswa.get(a).getHarga());

            jumlah_barang += barangMahasiswa.get(a).getBanyak_barang();
            
        }
        System.out.println("---------------------------------------");
        System.out.println("Total Barang yang dititip : "+ jumlah_barang);
        System.out.println("---------------------------------------");
        back();
        
    }
    public static void lihatBarangDosen() throws IOException{
        int jumlah_barang = 0;

        System.out.println("|---------------------------------------|");
        System.out.println("|           Daftar Barang Dosen         |");
        System.out.println("|---------------------------------------|");
        for (int a = 0; a < barangDosen.size(); a++){
            System.out.println("Data ke-" + (a + 1));
            System.out.println("Nama Dosen          : " + barangDosen.get(a).getNama_dosen());
            System.out.println("Nip                 : " + barangDosen.get(a).getNip());
            System.out.println("Nama Barang         : " + barangDosen.get(a).getNama_barang());
            System.out.println("Warna Barang        : " + barangDosen.get(a).getWarna_barang());
            System.out.println("Jenis Barang        : " + barangDosen.get(a).getJenis_barang());
            System.out.println("Jumlah Barang       : " + barangDosen.get(a).getBanyak_barang());
            System.out.println("Waktu Terima Barang : " + barangDosen.get(a).getWaktu_serah());
            System.out.println("Harga Barang        : " + barangDosen.get(a).getHarga());

            jumlah_barang += barangMahasiswa.get(a).getBanyak_barang();
        }
        System.out.println("---------------------------------------");
        System.out.println("Total Barang yang dititip : "+ jumlah_barang);
        System.out.println("---------------------------------------");
        back();
        
    }
    public static void menuTambah() throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("|---------------------------------------|");
        System.out.println("|           Pilih Pemilik Barang        |");
        System.out.println("|---------------------------------------|");
        System.out.println("|1. Mahasiswa                           |");
        System.out.println("|2. Dosen                               |");
        System.out.println("|---------------------------------------|");
        
        System.out.print("Pilih menu : ");
        int Pilihan = Integer.valueOf(pilih.readLine());
        switch (Pilihan){
            case 1 :
                tambahBarangMahasiswa();
                break;
            case 2 :
                tambahBarangDosen();
                break;
            default :
                System.out.println("Inputan salah!");
                break;
        }
    }
    public static void tambahBarangMahasiswa() throws IOException{
        String nama_mahasiswa, nama_barang, warna_barang, jenis_barang, waktu_serah;
        int nim, banyak_barang, harga;
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader add = new BufferedReader(input);
        System.out.println("|-------------------------------|");
        System.out.println("|   Silahkan Tambahkan Barang   |");
        System.out.println("|-------------------------------|");
        System.out.print("Masukkan nama Mahasiswa : ");
        nama_mahasiswa = add.readLine();
        System.out.print("Masukkan nim : ");
        nim = Integer.parseInt(add.readLine());
        System.out.print("Masukkan nama Barang : ");
        nama_barang = add.readLine();
        System.out.print("Input Warna Barang : ");
        warna_barang = add.readLine();
        System.out.print("Input Jenis Barang : ");
        jenis_barang = add.readLine();
        System.out.print("Input Banyak Barang");
        banyak_barang = Integer.parseInt(add.readLine());
        System.out.print("Masukkan jam Serah : ");
        waktu_serah = add.readLine();
        System.out.print("Masukkan Harga : ");
        harga = Integer.parseInt(add.readLine());
        System.out.println("");
        System.out.println("Success!");
        
        
        
        // add ke ArrarList
        BarangMahasiswa databaru = new BarangMahasiswa(nama_mahasiswa, nim, nama_barang, warna_barang, jenis_barang, banyak_barang, waktu_serah, harga);
//        databaru.nama_Penitip = nama_Penitip;
//        databaru.nama_Barang = nama_Barang;
//        databaru.waktu_Serah = waktu_Serah;
//        databaru.harga_Penitipan = harga_Penitipan;
        databaru.taruhBarang();
        barangMahasiswa.add(databaru);
        
        back();
    }
    public static void tambahBarangDosen() throws IOException{
        String nama_dosen, nama_barang, warna_barang, jenis_barang, waktu_serah;
        int nip, banyak_barang, harga;
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader add = new BufferedReader(input);
        System.out.println("|-------------------------------|");
        System.out.println("|   Silahkan Tambahkan Barang   |");
        System.out.println("|------------------------------|");
        System.out.print("Masukkan nama Dosen : ");
        nama_dosen = add.readLine();
        System.out.print("Masukkan nip : ");
        nip = Integer.parseInt(add.readLine());
        System.out.print("Masukkan nama Barang : ");
        nama_barang = add.readLine();
        System.out.print("Input Warna Barang : ");
        warna_barang = add.readLine();
        System.out.print("Input Jenis Barang : ");
        jenis_barang = add.readLine();
        System.out.print("Input Banyak Barang");
        banyak_barang = Integer.parseInt(add.readLine());
        System.out.print("Masukkan jam Serah : ");
        waktu_serah = add.readLine();
        System.out.print("Masukkan Harga : ");
        harga = Integer.parseInt(add.readLine());
        System.out.println("");
        System.out.println("Success!");
        
        
        
        // add ke ArrarList
        BarangDosen databaru = new BarangDosen(nama_dosen, nip, nama_barang, warna_barang, jenis_barang, banyak_barang, waktu_serah, harga);
//        databaru.nama_Penitip = nama_Penitip;
//        databaru.nama_Barang = nama_Barang;
//        databaru.waktu_Serah = waktu_Serah;
//        databaru.harga_Penitipan = harga_Penitipan;
        databaru.taruhBarang();
        barangDosen.add(databaru);
        back();
    }

    public static void menuUpdate() throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("|---------------------------------------|");
        System.out.println("|           Pilih Pemilik Barang        |");
        System.out.println("|---------------------------------------|");
        System.out.println("|1. Mahasiswa                           |");
        System.out.println("|2. Dosen                               |");
        System.out.println("|---------------------------------------|");
        
        System.out.print("Pilih menu : ");
        int Pilihan = Integer.valueOf(pilih.readLine());
        switch (Pilihan){
            case 1 :
                updateBarangMahasiswa();
                break;
            case 2 :
                updateBarangDosen();
                break;
        }
    }
    public static void updateBarangMahasiswa() throws IOException{
        String nama_mahasiswa, nama_barang, warna_barang, jenis_barang, waktu_serah;
        int nim, banyak_barang, harga;
        
        System.out.println("|---------------------------|");
        System.out.println("|   Update Barang Titipan   |");
        System.out.println("|---------------------------|");
        for (int a = 0; a < barangMahasiswa.size(); a++){
            System.out.println("Data ke-" + (a + 1));
            System.out.println("Nama Mahasiswa      : " + barangMahasiswa.get(a).getNama_mahasiswa());
            System.out.println("Nim                 : " + barangMahasiswa.get(a).getNim());
            System.out.println("Nama Barang         : " + barangMahasiswa.get(a).getNama_barang());
            System.out.println("Warna Barang        : " + barangMahasiswa.get(a).getWarna_barang());
            System.out.println("Jenis Barang        : " + barangMahasiswa.get(a).getJenis_barang());
            System.out.println("Jumlah Barang       : " + barangMahasiswa.get(a).getBanyak_barang());
            System.out.println("Waktu Terima Barang : " + barangMahasiswa.get(a).getWaktu_serah());
        }
        
        InputStreamReader lama = new InputStreamReader(System.in);
        BufferedReader baru = new BufferedReader(lama);
        System.out.print("Pilih data yang ingin diubah :");
        int nomor;
        nomor = Integer.parseInt(baru.readLine()); nomor--;
        
        System.out.print("Perbarui nama Pemilik : ");
        barangMahasiswa.get(nomor).setNama_mahasiswa(baru.readLine());
        System.out.print("Perbarui Nim : ");
        barangMahasiswa.get(nomor).setNim(Integer.parseInt(baru.readLine()));
        System.out.print("Perbarui nama Barang : ");
        barangMahasiswa.get(nomor).setNama_barang(baru.readLine());
        System.out.print("Perbarui warna Barang : ");   
        barangMahasiswa.get(nomor).setWarna_barang(baru.readLine());
        System.out.print("Perbarui jenis Barang : ");
        barangMahasiswa.get(nomor).setJenis_barang(baru.readLine());
        System.out.print("Perbarui banyak Barang : ");
        barangMahasiswa.get(nomor).setBanyak_barang(Integer.parseInt(baru.readLine()));
        System.out.print("Perbarui jam Terima : ");
        barangMahasiswa.get(nomor).setWaktu_serah(baru.readLine());
        System.out.print("Perbarui harga : ");
        barangMahasiswa.get(nomor).setHarga(Integer.parseInt(baru.readLine()));
        
        
        
        

//        System.out.print("Perbarui nama Pemilik : ");
//        nama_penitip = baru.readLine();
//        System.out.print("Perbarui nama Barang : ");
//        nama_barang = baru.readLine();
//        System.out.print("Perbarui warna Barang : ");
//        warna_barang = baru.readLine();
//        System.out.print("Perbarui jenis Barang : ");
//        jenis_barang = baru.readLine();
//        System.out.print("Perbarui banyak Barang : ");
//        banyak_barang = Integer.parseInt(baru.readLine());
//        System.out.print("Perbarui jam Terima : ");
//        waktu_serah = baru.readLine();
//        System.out.print("Perbarui Harga : ");
//        harga_penitipan = Integer.parseInt(baru.readLine());
        
        
        
        System.out.println("\n Success!");
        back();
    }
    public static void updateBarangDosen() throws IOException{
        String nama_dosen, nama_barang, warna_barang, jenis_barang, waktu_serah;
        int nip, banyak_barang, harga;
        
        System.out.println("|---------------------------|");
        System.out.println("|   Update Barang Titipan   |");
        System.out.println("|---------------------------|");
        for (int a = 0; a < barangDosen.size(); a++){
            System.out.println("Data ke-" + (a + 1));
            System.out.println("Nama Mahasiswa      : " + barangDosen.get(a).getNama_dosen());
            System.out.println("Nip                 : " + barangDosen.get(a).getNip());
            System.out.println("Nama Barang         : " + barangDosen.get(a).getNama_barang());
            System.out.println("Warna Barang        : " + barangDosen.get(a).getWarna_barang());
            System.out.println("Jenis Barang        : " + barangDosen.get(a).getJenis_barang());
            System.out.println("Jumlah Barang       : " + barangDosen.get(a).getBanyak_barang());
            System.out.println("Waktu Terima Barang : " + barangDosen.get(a).getWaktu_serah());
        }
        
        InputStreamReader lama = new InputStreamReader(System.in);
        BufferedReader baru = new BufferedReader(lama);
        System.out.print("Pilih data yang ingin diubah :");
        int nomor;
        nomor = Integer.parseInt(baru.readLine()); nomor--;
        
        System.out.print("Perbarui nama Pemilik : ");
        barangDosen.get(nomor).setNama_dosen(baru.readLine());
        System.out.print("Perbarui Nip : ");
        barangDosen.get(nomor).setNip(Integer.parseInt(baru.readLine()));
        System.out.print("Perbarui nama Barang : ");
        barangDosen.get(nomor).setNama_barang(baru.readLine());
        System.out.print("Perbarui warna Barang : ");   
        barangDosen.get(nomor).setWarna_barang(baru.readLine());
        System.out.print("Perbarui jenis Barang : ");
        barangDosen.get(nomor).setJenis_barang(baru.readLine());
        System.out.print("Perbarui banyak Barang : ");
        barangDosen.get(nomor).setBanyak_barang(Integer.parseInt(baru.readLine()));
        System.out.print("Perbarui jam Terima : ");
        barangDosen.get(nomor).setWaktu_serah(baru.readLine());
        System.out.print("Perbarui Harga Barang : ");
        barangDosen.get(nomor).setHarga(Integer.parseInt(baru.readLine()));

//        System.out.print("Perbarui nama Pemilik : ");
//        nama_penitip = baru.readLine();
//        System.out.print("Perbarui nama Barang : ");
//        nama_barang = baru.readLine();
//        System.out.print("Perbarui warna Barang : ");
//        warna_barang = baru.readLine();
//        System.out.print("Perbarui jenis Barang : ");
//        jenis_barang = baru.readLine();
//        System.out.print("Perbarui banyak Barang : ");
//        banyak_barang = Integer.parseInt(baru.readLine());
//        System.out.print("Perbarui jam Terima : ");
//        waktu_serah = baru.readLine();
//        System.out.print("Perbarui Harga : ");
//        harga_penitipan = Integer.parseInt(baru.readLine());

        System.out.println("\n Success!");
        back();
    }

    public static void menuDelete() throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("|---------------------------------------|");
        System.out.println("|           Pilih Pemilik Barang        |");
        System.out.println("|---------------------------------------|");
        System.out.println("|1. Mahasiswa                           |");
        System.out.println("|2. Dosen                               |");
        System.out.println("|---------------------------------------|");
        
        System.out.print("Pilih menu : ");
        int Pilihan = Integer.valueOf(pilih.readLine());
        switch (Pilihan){
            case 1 :
                deleteBarangMahasiswa();
                break;
            case 2 :
                deleteteBarangDosen();
                break;
        }
    }
    
    public static void deleteBarangMahasiswa() throws IOException{
        int isi;
        System.out.println("Barang yang tersedia");
        for (int a = 0; a < barangMahasiswa.size(); a++){
            System.out.println("Data ke-"+ (a + 1));
            System.out.println("Nama Pemilik        : " + barangMahasiswa.get(a).getNama_mahasiswa());
            System.out.println("Nim                 : " + barangMahasiswa.get(a).getNim());
            System.out.println("Nama Barang         : " + barangMahasiswa.get(a).getNama_barang());
            System.out.println("Warna Barang        : " + barangMahasiswa.get(a).getWarna_barang());
            System.out.println("Jenis Barang        : " + barangMahasiswa.get(a).getJenis_barang());
            System.out.println("Jumlah Barang       : " + barangMahasiswa.get(a).getBanyak_barang());
            System.out.println("Waktu Terima Barang : " + barangMahasiswa.get(a).getWaktu_serah());
        }
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader hapus = new BufferedReader(input);
        System.out.print("Pilih data yang telah diambil : ");
        isi = Integer.parseInt(hapus.readLine());isi--;
        
        barangMahasiswa.get(isi).ambilBarang();
        barangMahasiswa.remove(isi);
        back();
    }

    public static void deleteteBarangDosen() throws IOException{
        int isi;
        System.out.println("Barang yang tersedia");
        for (int a = 0; a < barangDosen.size(); a++){
            System.out.println("Data ke-"+ (a + 1));
            System.out.println("Nama Pemilik        : " + barangDosen.get(a).getNama_dosen());
            System.out.println("Nip                 : " + barangDosen.get(a).getNip());
            System.out.println("Nama Barang         : " + barangDosen.get(a).getNama_barang());
            System.out.println("Warna Barang        : " + barangDosen.get(a).getWarna_barang());
            System.out.println("Jenis Barang        : " + barangDosen.get(a).getJenis_barang());
            System.out.println("Jumlah Barang       : " + barangDosen.get(a).getBanyak_barang());
            System.out.println("Waktu Terima Barang : " + barangDosen.get(a).getWaktu_serah());
            System.out.println("Harga Barang        : " + barangDosen.get(a).getHarga());
        }
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader hapus = new BufferedReader(input);
        System.out.print("Pilih data yang telah diambil : ");
        isi = Integer.parseInt(hapus.readLine());isi--;
        
        barangDosen.get(isi).ambilBarang();
        barangDosen.remove(isi);
        back();
    }

    public static void cekHarga() throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("|---------------------------------------|");
        System.out.println("|           Pilih Pemilik Barang        |");
        System.out.println("|---------------------------------------|");
        System.out.println("|1. Mahasiswa                           |");
        System.out.println("|2. Dosen                               |");
        System.out.println("|---------------------------------------|");
        
        System.out.print("Pilih menu : ");
        int Pilihan = Integer.valueOf(pilih.readLine());
        switch (Pilihan){
            case 1 :
                cekHargaMahasiswa();
                break;
            case 2 :
                cekHargaDosen();
                break;
            default :
                System.out.println("Inputan Salah!"); 
                break;
        }
    }


    public static void cekHargaMahasiswa() throws IOException{
        int inputan;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("----- Lihat Harga perjam -----");
        System.out.println("[1] 1 Jam");
        System.out.println("[2] 2 Jam");
        System.out.println("[3] 3 Jam");
        System.out.print("Pilih : ");

        inputan= Integer.valueOf(pilih.readLine());
        for (int a = 0; a < barangMahasiswa.size(); a++){
            System.out.println("Data ke-"+ (a + 1));
            if (inputan == 1){
                barangMahasiswa.get(a).hitungHarga(1);
            }
            else if(inputan == 2){
                barangMahasiswa.get(a).hitungHarga(2);
            }
            else if(inputan == 3){
                barangMahasiswa.get(a).hitungHarga(3);
            }
        }
        back();
    }

    public static void cekHargaDosen() throws IOException{
        int inputan;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("----- Lihat Harga perjam -----");
        System.out.println("[1] 1 Jam");
        System.out.println("[2] 2 Jam");
        System.out.println("[3] 3 Jam");
        System.out.print("Pilih : ");

        inputan= Integer.valueOf(pilih.readLine());
        for (int a = 0; a < barangDosen.size(); a++){
            System.out.println("Data ke-"+ (a + 1));
            if (inputan == 1){
                barangDosen.get(a).hitungHarga(1);
            }
            else if(inputan == 2){
                barangDosen.get(a).hitungHarga(2);
            }
            else if(inputan == 3){
                barangDosen.get(a).hitungHarga(3);
            }
        }
        back();
    }

    public static void clear() throws IOException{
        for (int i = 0; i < 10; i++){
            System.out.println("\n\n\n\n\n\n");
        }
    }

    public static void back()throws IOException{
        System.out.println("Kembali lagi ke menu?");
        System.out.println("(y/n)((1 = ya) atau (2 = keluar))"); 
        System.out.print("pilihan anda : ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        
        int Pilih = Integer.parseInt(pilih.readLine());
        if (Pilih == 1){
            clear();
            menu();
        }
        else{
            System.exit(0);
        }
    }
    
}

