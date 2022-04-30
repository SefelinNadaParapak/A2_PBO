/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;
import posttest3.*;
import posttest2.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 


/**
 *
 * @author GEFORCE_i5
 */
public class main {
    static ArrayList<kayu> kayu = new ArrayList<kayu>();
    static ArrayList<bahanlemari> bahanlemari = new ArrayList<>();
    static ArrayList<catlemari> catlemari = new ArrayList<>();
    private static String ukuran;
    
    public static void main(String[] args)throws Exception {
        
      while(true){
          menu();
      }
    }  
   public static void menu() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
            System.out.println("");
            System.out.println("========TOKO LEMARI MEUBEL========");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Masukkan Data Lemari");
            System.out.println("2. Lihat Data Lemari"); 
            System.out.println("3. Ubah Data Lemari");
            System.out.println("4. Hapus Data Lemari");
            System.out.println("5. EXIT");
            System.out.println("----------------------------------------------------");
            System.out.println("Pilih Yang Anda Inginkan[1-5] = ");
        int pilih = Integer.valueOf(input.readLine());
            switch (pilih){
            case 1:
                    data();
                    break;
            case 2:
                    ldaftar();
                    break;
            case 3:
                    ubah();
                    break;
            case 4:
                    hapus();
                    break;
            case 5:
                    backmenu();
                    break;
            default:
                menu(); 
            } 
        }

public static void data() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
            
            String nama;
            int harga;
            int pilihan;
            
    System.out.println("1. Bahan lemari");
    System.out.println("2. Cat Lemari");
    System.out.println("Masukan Pilihan Anda : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("Masukan Jenis Lemari : ");
        nama = input.readLine();
        System.out.println("Masukan Harga Lemari : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Merek Lemari : ");
        String merek = input.readLine();
        System.out.println("Masukan Bahan Lemari: ");
        String bahan = input.readLine();
        bahanlemari.add(new bahanlemari(merek, nama, harga, bahan ));
        } else {
        if (pilihan == 2) {
        System.out.println("Masukan Jenis Lemari : ");
        nama = input.readLine();
        System.out.println("Masukan Harga Lemari : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Merek Lemari : ");
        String ukuran = input.readLine();
        System.out.println("Masukan Jumlah Stok Lemari : ");
        String jumlah = input.readLine();
        catlemari.add(new catlemari(nama, harga, jumlah, ukuran));
        }
        

}           
}

public static void ldaftar()throws IOException{    
    InputStreamReader tambah = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(tambah);
    int pilihan;
    System.out.println("1. Bahan Lemari");
    System.out.println("2. Cat Lemari");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
                        for (int i = 0; i < bahanlemari.size(); i++) {
                            System.out.println("Bahan Lemari ke - " + (i + 1));
                            bahanlemari.get(i).display();
                        }
                    } else {
                        for (int i = 0; i < catlemari.size(); i++) {
                            System.out.println("Cat Lemari ke - " + (i + 1));
                            catlemari.get(i).display();
                        }
                    }

            }

public static void ubah()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int pilihan;
    String nama;
    int harga;
    String merek;
    String jumlah;
    String ukuran;
    ldaftar();
    System.out.println("1. Bahan Lemari");
    System.out.println("2. Cat Lemari");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    System.out.println("Ubah Data TOKO LEMARI MEUBEL");
    if (pilihan == 1) {
                        System.out.println("Masukan Jenis Lemari : ");
                        nama = input.readLine();
                        for (bahanlemari i : bahanlemari) {
                            if (i.getnama().equals(nama)) {
                                System.out.println("Masukan Jenis Lemari Baru : ");
                                i.setnama(input.readLine());
                                System.out.println("Masukan Harga Lemari baru : ");
                                i.setharga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan Bahan Lemari baru : ");
                                i.setmerek(input.readLine());
                            }
                        }
                    } else {
                        System.out.println("Masukan Nama Barang Bangunan : ");
                        nama = input.readLine();
                        for (catlemari i : catlemari) {
                            if (i.getnama().equals(nama)) {
                                System.out.println("Masukan Jenis Lemari baru : ");
                                i.setnama(input.readLine());
                                System.out.println("Masukan Harga Lemari baru : ");
                                i.setharga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan Merek Lemari baru : ");
                                i.setjumlah(input.readLine());
                                System.out.println("Masukan Jumlah Stok Lemari baru : ");
                                i.setukuran(input.readLine());
                            }
                        }
                    }
}

public static void hapus() throws IOException{
    ldaftar();
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int pilihan;
    int t;
    System.out.println("1. Bahan Lemari");
    System.out.println("2. Cat Lemari");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("Input Nomor Barang Yang Ingin Anda Hapus = ");
        t = Integer.parseInt(input.readLine());
        t--;
    
        bahanlemari.get(t).hapus();
        bahanlemari.remove(t);
    } else {
    System.out.println("Input Nomor Barang Yang Ingin Anda Hapus = ");
    t = Integer.parseInt(input.readLine());
    t--;
    
    catlemari.get(t).hapus();
    catlemari.remove(t);

    }
}

public static void backmenu() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int a;
    System.out.println("THANK YOU");
    System.out.println("Klik 1 Jika Ingin melanjutkan");
    a = Integer.parseInt(input.readLine());
    menu();
    }

} 

