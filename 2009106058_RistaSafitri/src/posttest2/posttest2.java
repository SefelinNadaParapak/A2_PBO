/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class posttest2 {
    public static void main(String[] args) {
        ArrayList<Penitipan> titip = new ArrayList<Penitipan>();
        Scanner input_bil = new Scanner(System.in);
        Scanner input_data = new Scanner(System.in);
        int pilihan;
        
        Scanner waitForKeypress = new Scanner(System.in);
//        System.out.print("Tekan Enter Untuk Melanjutkan...");
//        waitForKeypress.nextLine();
        
        do {
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
            pilihan = input_bil.nextInt();
            
            switch(pilihan) {    
                case 1:
                    System.out.println("    __________________________________________");
                    System.out.println("    |           Data Hewan Peliharaan         |");
                    System.out.println("    |_________________________________________|");
                    Iterator<Penitipan>i = titip.iterator();
                    
                    for(Penitipan R : titip) {
                        System.out.println(" ");
                        System.out.println("    Nomor Telepon : " + R.nomor_telepon);
                        System.out.println("    Nama Pemilik : " + R.nama_pemilik);
                        System.out.println("    Jenis Hewan : " + R.jenis_hewan);
                        System.out.println("    Nama Hewan : " + R.nama_hewan);
                        System.out.println("    Jumlah Hewan : " + R.jumlah_hewan);
                        System.out.println("    Umur Hewan : " + R.umur_hewan);
                        System.out.println("    Jumlah Hari : " + R.jumlah_hari);
                        System.out.println("    Waktu : " + R.jam);
                        System.out.println("    Harga : " + R.harga);
                    }
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                break;
                
                    
                case 2:
                    System.out.println("    Menambahkan Data Hewan Peliharaan ");
                    System.out.print("    Masukkan Nomor Telepon : ");
                    int nomor_telepon = input_bil.nextInt();
                    System.out.print("    Masukkan Nama Pemilik : ");
                    String nama_pemilik = input_data.nextLine();
                    System.out.print("    Masukkan Jenis Hewan : ");
                    String jenis_hewan = input_data.nextLine();
                    System.out.print("    Masukkan Nama Hewan : ");
                    String nama_hewan = input_data.nextLine();
                    System.out.print("    Masukkan Jumlah Hewan : ");
                    int jumlah_hewan = input_bil.nextInt();
                    System.out.print("    Masukkan Umur Hewan : ");
                    int umur_hewan = input_bil.nextInt();
                    System.out.print("    Masukkan Jumlah Hari : ");
                    int jumlah_hari = input_bil.nextInt();
                    System.out.print("    Masukkan Jumlah Jam : ");
                    int jam = input_bil.nextInt();
                    System.out.print("    Masukkan Harga : ");
                    int harga = input_bil.nextInt();
                    
                    titip.add(new Penitipan(nomor_telepon, nama_pemilik, jenis_hewan,
                            nama_hewan, jumlah_hewan, umur_hewan, jumlah_hari, 
                            jam, harga));
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                break;
                
                case 0:
                    boolean found = false;
                        System.out.println("    Mencari Data Hewan Peliharaan ");
                        System.out.print("    Masukkan Nomor Telepon : ");
                        nomor_telepon = input_bil.nextInt();
                        i = titip.iterator();
                    while(i.hasNext()) {
                        Penitipan a = i.next();
                        if(a.nomor_telepon == nomor_telepon) {
                            System.out.println(a);
                            found = true;
                        }
                    }
                    
                    if(!found) {
                        System.out.println("    OOPS DATA TIDAK DITEMUKAN!!!");
                    }
                    
                    System.out.println("    Data Tidak Ditemukan");
                    
                break;
                
                case 3:
                    found = false;
                    System.out.println("    Menghapus Data Hewan Peliharaan");
                    System.out.print("    Masukkan Nomor Telepon : ");
                    nomor_telepon = input_bil.nextInt();
                    i = titip.iterator();
                    while(i.hasNext()) {
                        Penitipan a = i.next();
                        if(a.nomor_telepon == nomor_telepon) {
                            i.remove();
                            found = true;
                        }
                    }
                    
                    if(!found) {
                        System.out.println("    OOPS DATA TIDAK DITEMUKAN!!!");
                    }
                    
                    System.out.println("    Data Berhasil Di Hapus");
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                break;
                
                case 4:
                    found = false;
                    System.out.println("    Update Data Hewan Peliharaan");
                    System.out.print("    Masukkan Nomor Telepon : ");
                    nomor_telepon = input_bil.nextInt();
                    
                    ListIterator<Penitipan>rs = titip.listIterator();
                    while(rs.hasNext()) {
                        Penitipan a = rs.next();
                        if(a.nomor_telepon == nomor_telepon) {
                            System.out.print("    Masukkan Nomor Telepon Baru : ");
                            nomor_telepon = input_bil.nextInt();
                            System.out.print("    Masukkan Nama Pemilik Baru : ");
                            nama_pemilik = input_data.nextLine();
                            System.out.print("    Masukkan Jenis Hewan Baru : ");
                            jenis_hewan = input_data.nextLine();
                            System.out.print("    Masukkan Nama Hewan Baru : ");
                            nama_hewan = input_data.nextLine();
                            System.out.print("    Masukkan Jumlah Hewan Baru : ");
                            jumlah_hewan = input_bil.nextInt();
                            System.out.print("    Masukkan Umur Hewan Baru : ");
                            umur_hewan = input_bil.nextInt();
                            System.out.print("    Masukkan Jumlah Hari Baru : ");
                            jumlah_hari = input_bil.nextInt();
                            System.out.print("    Masukkan Jumlah Jam Baru : ");
                            jam = input_bil.nextInt();
                            System.out.print("    Masukkan Harga Baru: ");
                            harga = input_bil.nextInt();
                            
                            rs.set(new Penitipan(nomor_telepon, nama_pemilik, jenis_hewan,
                            nama_hewan, jumlah_hewan, umur_hewan, jumlah_hari, 
                            jam, harga));
                            
                            found = true;
                        }
                    }
                    
                    if(!found) {
                        System.out.println("    OOPS DATA TIDAK DITEMUKAN!!!");
                    } else {
                        System.out.println("    Data Telah Berhasil Di Update!!");
                    }
                    
                    System.out.print("\n    Tekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                break;
                
                case 9:
                    System.out.println("        ----- THANK YOU ----- ");
                    System.exit(0);
                break;
            }
        } 
        while (pilihan != 0);
    }
}
