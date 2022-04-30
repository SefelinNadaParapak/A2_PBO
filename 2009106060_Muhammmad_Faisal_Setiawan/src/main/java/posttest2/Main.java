/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author ACER
 */
//import
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<mobil> Mobil = new ArrayList<>();
    static int harga, index;
    static String nama_penyewa, merk_mobil, jenis_mobil;
    public static void main(String[] args) throws IOException { 
        while(true){
             menu();
    }
    }
      static void order() throws IOException{
         //merk
         System.out.println(" Silahkan masukan merk mobil yang inging disewa: ");
         merk_mobil = input.readLine();
         //nama
         System.out.println("Nama anda :");
         nama_penyewa = input.readLine();
         //jenis
          System.out.println("Jenis mobil apa :");
          jenis_mobil = input.readLine();
         //harga
          System.out.println("Harga :");
          harga = Integer.parseInt(input.readLine());
         
          if("".equals(merk_mobil) | "".equals(nama_penyewa) | "".equals(jenis_mobil) | "".equals(harga)){
                System.out.println("tidak berhasil");
                return;
         }
        // masukan data
        mobil disewa = new mobil (merk_mobil, nama_penyewa, jenis_mobil, harga);
        disewa.merk_mobil = merk_mobil;
        disewa.nama_penyewa = nama_penyewa;
        disewa.jenis_mobil = jenis_mobil;
        disewa.harga = harga;
        
        Mobil.add(disewa);
      }
     //menampilkan pesanan
    static void lihat() throws IOException{
        for(int i = 0 ; i < Mobil.size();i++){
            System.out.println("*================================*");
            System.out.println(" Nomor   : ["+(i+1)+"]");
            System.out.println(" Nama    : "+ Mobil.get(i).nama_penyewa);
            System.out.println(" Merk    : "+ Mobil.get(i).merk_mobil);    
            System.out.println(" Jenis   : "+ Mobil.get(i).jenis_mobil);
            System.out.println(" Harga   : "+ Mobil.get(i).harga);
            System.out.println("*================================*");
        }
    }
    
    static void ubah() throws IOException{
        //menentukan indeks
        System.out.println(" Indeks Berapa yang Ingin Diubah? : ");
        index = Integer.parseInt(input.readLine());
        index --;
        //mengganti nama
        System.out.println(" Nama Baru : ");
        nama_penyewa = input.readLine();
        //mengganti merk
        System.out.println("Merk baru");
        merk_mobil = input.readLine();
        //mengganti jenis
        System.out.println("Jenis baru");
        jenis_mobil = input.readLine();
        //mengganti harga
        System.out.println("Harga Baru");
        harga = Integer.parseInt(input.readLine());
        
        Mobil.get(index).nama_penyewa = nama_penyewa;
        Mobil.get(index).merk_mobil = merk_mobil;
        Mobil.get(index).jenis_mobil = jenis_mobil;
        Mobil.get(index).harga = harga;
        
        Mobil.get(index).changeorder();
         }
    
        //menghapus pesanan
    static void delete() throws IOException{
        System.out.println(" Indeks Berapa yang Ingin Dihapus? : ");
        index = Integer.parseInt(input.readLine());
        index--;
        
        Mobil.get(index).cancelorder();
        Mobil.remove(index);
    }

       //menu utama
    static void menu() throws IOException{
        
        System.out.println("|    CV Faisal Transportation     |");
        System.out.println("|  Menu :                        |");
        System.out.println("|  1. Sewa                        |");
        System.out.println("|  2. Lihat daftar sewa           |");
        System.out.println("|  3. Ganti pesanan               |");
        System.out.println("|  4. Hapus data                 |");
        System.out.println("|  5. Keluar                     |");
        System.out.println(" Masukkan Pilihan [1-5] : ");
        int pilihan = Integer.parseInt(input.readLine());
        switch (pilihan){
            case 1 -> {
                order();
                System.out.println("|     Berhasil Ditambahkan       |");
                lihat();
         
                menu();
            }
            case 2 -> {
                if (Mobil.isEmpty() == true){
                    System.out.println("|   kosong                  |");
                }else {
                    lihat();
                }
                
            }
            case 3 -> {
                if (Mobil.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|              kosong        |");
                    System.out.println("*================================*\n");
                }else{
                    lihat();
                    ubah();
                    System.out.println("\n*================================*");
                    System.out.println("|       Berhasil Diubah          |");
                    System.out.println("*================================*\n");
                    lihat();
                      
                }
            }
            case 4 -> {
                if (Mobil.isEmpty() == true){
                    System.out.println("|  kosong                         |");
                }else{
                    lihat();
                    delete();
                    System.out.println("|       Berhasil Dibatalkan      |");
                    lihat();
                      
                }
            }
            case 5 -> {
                System.out.println("|         Thank You        |");
            }
            default -> {
                System.out.println("|         Masukkan Salah         |");
                      
            }
        }
}
}
    
