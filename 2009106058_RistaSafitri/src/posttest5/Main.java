/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input_data = new BufferedReader(prepare);
        Scanner waitForKeypress = new Scanner(System.in);
        ArrayList<DataHewan> hewan= new ArrayList<>();
        ArrayList<DataPelanggan> pelanggan = new ArrayList<>();
        int pilihan;
        String nama;
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
                        for (int i = 0; i < pelanggan.size(); i++) {
                            System.out.println("    Pelanggan ke- " + (i + 1));
                            pelanggan.get(i).Tampilkan();
                        }
                    } else {
                        for (int i = 0; i < hewan.size(); i++) {
                            System.out.println("    Hewan ke- " + (i + 1));
                            hewan.get(i).Tampilkan();
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
                        System.out.print("    Masukkan Nomor Telepon    : ");
                        String nomor_telepon = input_data.readLine();
                        System.out.print("    Masukkan Nama Pemilik     : ");
                        nama = input_data.readLine();
                        System.out.print("    Masukkan Jenis Kelamin    : ");
                        String jenisKelamin = input_data.readLine();
                        System.out.print("    Masukan Umur Pelangan     : ");
                        String umur = input_data.readLine();
                        System.out.print("    Masukkan Alamat Pelanggan : ");
                        String Alamat = input_data.readLine();
                        pelanggan.add(new DataPelanggan(nama, nomor_telepon, jenisKelamin, umur, Alamat));
                    } else {
                        System.out.print("    Masukkan Jenis Hewan          : ");
                        String jenis_hewan = input_data.readLine();
                        System.out.print("    Masukkan Nama Hewan           : ");
                        nama = input_data.readLine();
                        System.out.print("    Masukan Umur Hewan            : ");
                        String umur = input_data.readLine();
                        System.out.print("    Masukan Jenis Kelamin Hewan   : ");
                        String jenisKelamin = input_data.readLine();
                        hewan.add(new DataHewan(nama, jenisKelamin, umur, jenis_hewan));
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
                        nama = input_data.readLine();
                        for (DataPelanggan titip : pelanggan) {
                            if (titip.getNama().equals(nama)) {
                                pelanggan.remove(titip);
                            }
                        }
                    } else {
                        System.out.print("    Masukkan Nama Hewan         : ");
                        nama = input_data.readLine();
                        for (DataHewan titip : hewan) {
                            if (titip.getNama().equals(nama)) {
                                hewan.remove(titip);
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
                        nama = input_data.readLine();
                        for (DataPelanggan titip : pelanggan) {
                            if (titip.getNama().equals(nama)) {
                                System.out.print("    Masukkan Nama Baru                : ");
                                titip.setNama(input_data.readLine());
                                System.out.print("    Masukkan Nomor Telepon Baru       : ");
                                titip.setNomor_telepon(input_data.readLine());
                                System.out.print("    Masukkan Jenis Kelamin Baru       : ");
                                titip.setJenisKelamin(input_data.readLine());
                                System.out.print("    Masukan Umur Pelangan Baru        : ");
                                titip.setUmur(input_data.readLine());
                                System.out.print("    Masukkan Alamat Pelanggan Baru    : ");
                                titip.setAlamat(input_data.readLine());
                            }
                        }
                    } else {
                        System.out.print("    Masukkan Nama Hewan         : ");
                        nama = input_data.readLine();
                        for (DataHewan titip : hewan) {
                            if (titip.getNama().equals(nama)) {
                                System.out.print("    Masukkan Nama Hewan Baru       : ");
                                titip.setNama(input_data.readLine());
                                System.out.print("    Masukkan Jenis Hewan Baru      : ");
                                titip.setJenis_hewan(input_data.readLine());
                                System.out.print("    Masukan Umur Hewan Baru        : ");
                                titip.setUmur(input_data.readLine());
                                System.out.print("    Masukkan Jenis Kelamin Hewan   : ");
                                titip.setJenisKelamin(input_data.readLine());
                            }
                        }
                    }
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}