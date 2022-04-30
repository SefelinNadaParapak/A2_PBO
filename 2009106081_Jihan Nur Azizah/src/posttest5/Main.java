/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author GEFORCE_i5
 */
public class Main {
     private static String nama;
    public static void main(String[] args)throws NumberFormatException, IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Catlemari> Catlemari = new ArrayList<>();
        ArrayList<Bahanlemari> Bahanlemari = new ArrayList<>();
        String nama;
        int index;
        int pilihan;
      while(true){
        System.out.println("==============================================");
        System.out.println("============ TOKO LEMARI ==============");
        System.out.println("============    MEUBEL    =============");
        System.out.println("==============================================");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Masukkan Data Lemari");
            System.out.println("2. Lihat Data Lemari"); 
            System.out.println("3. Ubah Data Lemari");
            System.out.println("4. Hapus Data Lemari");
            System.out.println("5. EXIT");
        System.out.println("----------------------------------------------------");
        System.out.println("Pilih[1-5] = ");
        int h = Integer.valueOf(input.readLine());
        switch (h){
        case 1:
            System.out.println("[Menambahkan Data]");
            System.out.println("1. Cat Lemari");
            System.out.println("2. Bahan Lemari");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                System.out.println("Masukan Jenis Barang Cat Lemari : ");
                nama = input.readLine();
                System.out.println("Masukan Ukuran Barang Cat Lemari : ");
                String ukuran = input.readLine();
                System.out.println("Masukan Bahan Barang Cat Lemari  : ");
                String bahan = input.readLine();
                System.out.println("Masukan Harga Barang Cat Lemari : ");
                String harga = input.readLine();
                System.out.println("Masukan Jumlah Stok Baru Barang Lemari : ");
                String os = input.readLine();
                Catlemari.add(new Catlemari(nama, ukuran, bahan, harga, os));
            } else if (pilihan ==2) {
                System.out.println("Masukan Jenis Barang Bahan Lemari : ");
                nama = input.readLine();
                System.out.println("Masukan Ukuran Barang Bahan Lemari : ");
                String ukuran = input.readLine();
                System.out.println("Masukan Bahan Barang Bahan Lemari : ");
                String bahan = input.readLine();
                System.out.println("Masukan Harga Barang Bahan Lemari : ");
                String harga = input.readLine();
                System.out.println("Masukan Jumlah Stok Baru Barang Lemari : ");
                String os = input.readLine();
                Catlemari.add(new Catlemari(nama, ukuran, bahan, harga ,os));
                    }
                    break;

                
        case 2:
            System.out.println("[Melihat daftar]");
            System.out.println("1. Cat Lemari");
            System.out.println("2. Bahan Lemari");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                for (int i = 0; i < Catlemari.size(); i++) {
                System.out.println("-----------------------------------------------------");
                System.out.println("Data Barang Cat Lemari ke - " + (i + 1));
                Catlemari.get(i).display();
                System.out.println("-----------------------------------------------------");
                        }
            } else {
                for (int i = 0; i < Bahanlemari.size(); i++) {
                System.out.println("-----------------------------------------------------");
                System.out.println("Data Barang Bahan Lemari ke - " + (i + 1));
                Bahanlemari.get(i).display();
                System.out.println("-----------------------------------------------------");
                        }
                    }
                    break;
                
        case 3:
            System.out.println("[Mengedit daftar]");
            System.out.println("1. Cat Lemari");
            System.out.println("2. Bahan Lemari");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                System.out.println("Masukan Nama Barang Yang Ingin Di Edit  : ");
           nama = input.readLine();
            for (Catlemari i :Catlemari) {
            if (i.getnama().equals(nama)) {
                System.out.println("Masukan Jenis Barang Lemari Baru : ");
                i.setnama(input.readLine());
                System.out.println("Masukan Ukuran Barang Lemari Baru : ");
                i.setukuran(input.readLine());
                System.out.println("Masukan Bahan Barang Lemari Baru : ");
                i.setbahan(input.readLine());
                System.out.println("Masukan Harga Barang Lemari Baru : ");
                i.setharga(input.readLine());
                System.out.println("Masukan Jumlah Stok Lemari Baru : ");
                i.setOs(input.readLine());
        }
    }
            } else {
                System.out.println("Masukan Nama Barang Yang Ingin Di Edit : ");
           nama = input.readLine();
            for (Bahanlemari i : Bahanlemari) {
                if (i.getnama().equals(nama)) {
                    System.out.println("Masukan Jenis Barang Lemari baru : ");
                    i.setnama(input.readLine());
                    System.out.println("Masukan Ukuran Barang Lemari baru : ");
                    i.setukuran(input.readLine());
                    System.out.println("Masukan Bahan Barang Lemari baru : ");
                    i.setbahan(input.readLine());
                    System.out.println("Masukan Harga Barang Lemari baru : ");
                    i.setharga(input.readLine());
                    System.out.println("Masukan Jumlah Stok Barang Lemari Baru : ");
                    i.setOs(input.readLine());
            }
        }
    }
            break;
                
        case 4:
            System.out.println("[Hapus daftar]");
            System.out.println("1. Cat Lemari");
            System.out.println("2. Bahan Lemari");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {            
                System.out.println("Hapus Data Barang Cat Lemari yang Ke berapa = ");
                index = Integer.parseInt(input.readLine());
                index--;
                Catlemari.get(index).hapusdaftar();
                Catlemari.remove(index);
            } else {                
                System.out.println("Hapus Data Barang Bahan Lemari yang ke berapa = ");
                index = Integer.parseInt(input.readLine());
                index--;
                Bahanlemari.get(index).hapusdaftar();
                Bahanlemari.remove(index);
        }
                break;
        case 5:
            System.out.println("Exit");
            System.exit(0);
        default:
            System.out.println("Pilihan salah");
            break; 
            } 
        }
   }
}

