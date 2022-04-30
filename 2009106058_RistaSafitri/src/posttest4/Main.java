/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input_data = new BufferedReader(prepare);
        Scanner waitForKeypress = new Scanner(System.in);
        ArrayList<Hewan> dataHewan = new ArrayList<>();
        ArrayList<Pelanggan> dataPelanggan = new ArrayList<>();
        int pilihan;
        String nama_pemilik;
        String nama_hewan;
        while (true) {
            System.out.println("    ___________________________________________");
            System.out.println("    | Selamat Datang di Penitipan Hewan Ceria |");
            System.out.println("    |============= PILIHAN MENU ==============|");
            System.out.println("    | 1. Menampilkan Data                     |");
            System.out.println("    | 2. Menambahkan Data                     |");
            System.out.println("    | 3. Menghapus Data                       |");
            System.out.println("    | 4. Mengupdate Data                      |");
            System.out.println("    | 9. Exit                                 |");
            System.out.println("    |_________________________________________|");
            
            System.out.print("    Masukkan Pilihan Menu : ");
            int menu = Integer.parseInt(input_data.readLine());
            switch (menu) {
                case 1:
                    System.out.println("    __________________________________");
                    System.out.println("    |   Menampilkan Data Penitipan   |");
                    System.out.println("    |   1. Data Pelanggan            |");
                    System.out.println("    |   2. Data Hewan                |");
                    System.out.println("    |________________________________|");
                    System.out.print("    Masukan Pilihan : ");
                    pilihan = Integer.parseInt(input_data.readLine());
                    if (pilihan == 1) {
                        for (int i = 0; i < dataPelanggan.size(); i++) {
                            System.out.println("    Pelanggan ke- " + (i + 1));
                            dataPelanggan.get(i).Tampilkan();
                        }
                    } else {
                        for (int i = 0; i < dataHewan.size(); i++) {
                            System.out.println("    Hewan ke- " + (i + 1));
                            dataHewan.get(i).Tampilkan();
                        }
                    }
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                    break;
                case 2:
                    System.out.println("    __________________________________");
                    System.out.println("    |   Menambahkan Data Penitipan   |");
                    System.out.println("    |   1. Data Pelanggan            |");
                    System.out.println("    |   2. Data Hewan                |");
                    System.out.println("    |________________________________|");
                    System.out.print("    Masukan Pilihan : ");
                    pilihan = Integer.parseInt(input_data.readLine());
                    if (pilihan == 1) {
                        System.out.print("    Masukkan Nomor Telepon : ");
                        String nomor_telepon = input_data.readLine();
                        System.out.print("    Masukkan Nama Pemilik  : ");
                        nama_pemilik = input_data.readLine();
                        System.out.print("    Masukkan Jumlah Hari   : ");
                        int jumlah_hari = Integer.parseInt(input_data.readLine());
                        System.out.print("    Masukan Jumlah Jam     : ");
                        int jam = Integer.parseInt(input_data.readLine());
                        System.out.print("    Masukkan Harga         : ");
                        int harga = Integer.parseInt(input_data.readLine());
                        dataPelanggan.add(new Pelanggan(nomor_telepon, nama_pemilik, 
                                jumlah_hari, jam, harga));
                    } else {
                        System.out.print("    Masukkan Jenis Hewan  : ");
                        String jenis_hewan = input_data.readLine();
                        System.out.print("    Masukkan Nama Hewan   : ");
                        nama_hewan = input_data.readLine();
                        System.out.print("    Masukkan Jumlah Hewan : ");
                        int jumlah_hewan = Integer.parseInt(input_data.readLine());
                        System.out.print("    Masukan Umur Hewan    : ");
                        int umur_hewan = Integer.parseInt(input_data.readLine());
                        System.out.print("    Masukkan Jumlah Hari  : ");
                        int jumlah_hari = Integer.parseInt(input_data.readLine());
                        System.out.print("    Masukan Jumlah Jam    : ");
                        int jam = Integer.parseInt(input_data.readLine());
                        System.out.print("    Masukkan Harga        : ");
                        int harga = Integer.parseInt(input_data.readLine());
                        dataHewan.add(new Hewan(jenis_hewan, nama_hewan, jumlah_hewan,
                                umur_hewan, jumlah_hari, jam, harga));
                    }
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                    break;
                case 3:
                    System.out.println("    ____________________________");
                    System.out.println("    |   Hapus Data Penitipan   |");
                    System.out.println("    |   1. Data Pelanggan      |");
                    System.out.println("    |   2. Data Hewan          |");
                    System.out.println("    |__________________________|");
                    System.out.print("    Masukan Pilihan : ");
                    pilihan = Integer.parseInt(input_data.readLine());
                    if (pilihan == 1) {
                        System.out.print("    Masukkan Nama Pelanggan     : ");
                        nama_pemilik = input_data.readLine();
                        for (Pelanggan titip : dataPelanggan) {
                            if (titip.getNama_pemilik().equals(nama_pemilik)) {
                                dataPelanggan.remove(titip);
                            }
                        }
                    } else {
                        System.out.print("    Masukkan Nama Hewan         : ");
                        nama_hewan = input_data.readLine();
                        for (Hewan titip : dataHewan) {
                            if (titip.getNama_hewan().equals(nama_hewan)) {
                                dataHewan.remove(titip);
                            }
                        }
                    }
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                    break;
                case 4:
                    System.out.println("    _________________________________");
                    System.out.println("    |   Memperbarui Data Penitipan   |");
                    System.out.println("    |   1. Data Pelanggan            |");
                    System.out.println("    |   2. Data Hewan                |");
                    System.out.println("    |________________________________|");
                    System.out.print("    Masukan Pilihan : ");
                    pilihan = Integer.parseInt(input_data.readLine());
                    if (pilihan == 1) {
                        System.out.print("    Masukkan Nama Pelanggan     : ");
                        nama_pemilik = input_data.readLine();
                        for (Pelanggan titip : dataPelanggan) {
                            if (titip.getNama_pemilik().equals(nama_pemilik)) {
                                System.out.print("    Masukkan Nama Baru          : ");
                                titip.setNama_pemilik(input_data.readLine());
                                System.out.print("    Masukkan Nomor Telepon Baru : ");
                                titip.setNomor_telepon(input_data.readLine());
                                System.out.print("    Masukkan Jumlah Hari Baru   : ");
                                titip.setJumlah_hari(Integer.parseInt(input_data.readLine()));
                                System.out.print("    Masukan Jumlah Jam Baru     : ");
                                titip.setJam(Integer.parseInt(input_data.readLine()));
                                System.out.print("    Masukkan Harga Baru         :");
                                titip.setJam(Integer.parseInt(input_data.readLine()));
                            }
                        }
                    } else {
                        System.out.print("    Masukkan Nama Hewan         : ");
                        nama_hewan = input_data.readLine();
                        for (Hewan titip : dataHewan) {
                            if (titip.getNama_hewan().equals(nama_hewan)) {
                                System.out.print("    Masukkan Nama Hewan Baru    : ");
                                titip.setNama_hewan(input_data.readLine());
                                System.out.print("    Masukkan Jenis Hewan Baru   : ");
                                titip.setJenis_hewan(input_data.readLine());
                                System.out.print("    Masukkan Jumlah Hewan Baru  : ");
                                titip.setJumlah_hewan(Integer.parseInt(input_data.readLine()));
                                System.out.print("    Masukan Umur Hewan Baru     : ");
                                titip.setUmur_hewan(Integer.parseInt(input_data.readLine()));
                                System.out.print("    Masukkan Jumlah Hari Baru   : ");
                                titip.setJumlah_hari(Integer.parseInt(input_data.readLine()));
                                System.out.print("    Masukan Jumlah Jam Baru     : ");
                                titip.setJam(Integer.parseInt(input_data.readLine()));
                                System.out.print("    Masukkan Harga Baru         :");
                                titip.setJam(Integer.parseInt(input_data.readLine()));
                            }
                        }
                    }
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                    break;
                case 9:
                    System.out.println("        ----- THANK YOU ----- ");
                    System.exit(0);
                default:
                    System.out.println("    OOOPS PILIHAN TIDAK ADA!!!");
                    break;
            }
        }
    }
}
