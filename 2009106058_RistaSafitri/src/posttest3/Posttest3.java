/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Posttest3 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner waitForKeypress = new Scanner(System.in);
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input_data = new BufferedReader(prepare);
        ArrayList<PenitipanHewan> dataPenitipan = new ArrayList<>();
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
            int pilihan = Integer.parseInt(input_data.readLine());

            switch (pilihan) {
                case 1:
                    System.out.println("    Menambahkan Data Hewan Peliharaan ");
                    for (int i = 0; i < dataPenitipan.size(); i += 1) {
                        System.out.println("Mobil ke-" + (i + 1));
                        System.out.println("Merk    : " + dataPenitipan.get(i).getNomor_telepon());
                        System.out.println("Pemilik : " + dataPenitipan.get(i).getNama_pemilik());
                        System.out.println("Plat    : " + dataPenitipan.get(i).getJenis_hewan());
                        System.out.println("CC      : " + dataPenitipan.get(i).getNama_hewan());
                        System.out.println("Pemilik : " + dataPenitipan.get(i).getJumlah_hewan());
                        System.out.println("Plat    : " + dataPenitipan.get(i).getUmur_hewan());
                        System.out.println("CC      : " + dataPenitipan.get(i).getJumlah_hari());
                        System.out.println("CC      : " + dataPenitipan.get(i).getJam());
                        System.out.println("CC      : " + dataPenitipan.get(i).getHarga());
                    }
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                    break;
                
                case 2:   
                    System.out.println("    Menambahkan Data Hewan Peliharaan ");
                    System.out.print("    Masukkan Nomor Telepon : ");
                    String nomor_telepon = input_data.readLine();
                    System.out.print("    Masukkan Nama Pemilik : ");
                    String nama_pemilik = input_data.readLine();
                    System.out.print("    Masukkan Jenis Hewan : ");
                    String jenis_hewan = input_data.readLine();
                    System.out.print("    Masukkan Nama Hewan : ");
                    String nama_hewan = input_data.readLine();
                    System.out.print("    Masukkan Jumlah Hewan : ");
                    int jumlah_hewan = Integer.parseInt(input_data.readLine());
                    System.out.print("    Masukkan Umur Hewan : ");
                    int umur_hewan = Integer.parseInt(input_data.readLine());
                    System.out.print("    Masukkan Jumlah Hari : ");
                    int jumlah_hari = Integer.parseInt(input_data.readLine());
                    System.out.print("    Masukkan Jumlah Jam : ");
                    int jam = Integer.parseInt(input_data.readLine());
                    System.out.print("    Masukkan Harga : ");
                    int harga = Integer.parseInt(input_data.readLine());
                    
                    PenitipanHewan dataBaru = new PenitipanHewan(nomor_telepon, 
                            nama_pemilik, jenis_hewan, nama_hewan, jumlah_hewan, 
                            umur_hewan, jumlah_hari, jam, harga);
                    dataPenitipan.add(dataBaru);
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                    break;
                
                case 3:
                    System.out.println("    Menghapus Data Hewan Peliharaan");
                    System.out.print("    Masukkan Nomor Telepon : ");
                    String no_telp = input_data.readLine();
                    for (int i = 0; i < dataPenitipan.size(); i++) {
                        if (dataPenitipan.get(i).getNomor_telepon().equals(no_telp)) {
                            dataPenitipan.remove(i);
                            break;
                        }
                    }
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                    break;
                        
                case 4:
                    System.out.println("    Update Data Hewan Peliharaan");
                    System.out.print("    Masukkan Nomor Telepon : ");
                    String nomor_data = input_data.readLine();
                    for (PenitipanHewan titip : dataPenitipan) {
                        if (titip.getNomor_telepon().equals(nomor_data)) {
                            System.out.print("    Masukkan Nama Pemilik : ");
                            titip.setNama_pemilik(input_data.readLine());
                            System.out.print("    Masukkan Jenis Hewan : ");
                            titip.setJenis_hewan(input_data.readLine());
                            System.out.print("    Masukkan Nama Hewan : ");
                            titip.setNama_hewan(input_data.readLine());
                            System.out.print("    Masukkan Jumlah Hewan : ");
                            titip.setJumlah_hewan(Integer.parseInt(input_data.readLine()));
                            System.out.print("    Masukkan Umur Hewan : ");
                            titip.setUmur_hewan(Integer.parseInt(input_data.readLine()));
                            System.out.print("    Masukkan Jumlah Hari : ");
                            titip.setJumlah_hari(Integer.parseInt(input_data.readLine()));
                            System.out.print("    Masukkan Jumlah Jam : ");
                            titip.setJam(Integer.parseInt(input_data.readLine()));
                            System.out.print("    Masukkan Harga : ");
                            titip.setHarga(Integer.parseInt(input_data.readLine()));
                            break;
                        }
                    }
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                    break;
                
                case 9:
                    System.out.println("        ----- THANK YOU ----- ");
                    System.exit(0);
                default:
                    System.out.println(" OOOPS PILIHAN TIDAK ADA!!!");
                    break;
            }
        }
    }
}
