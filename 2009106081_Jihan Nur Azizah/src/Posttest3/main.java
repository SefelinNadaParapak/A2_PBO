/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author VITARACOM
 */
public class main {
    static ArrayList<kayu> kayu = new ArrayList<kayu>();
    
    public static void main(String[] args)throws Exception {
        
      while(true){
          menu();
      }
    }  
   public static void menu() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
            System.out.println("");
            System.out.println("*****TOKO LEMARI MEUBEL*****");
            System.out.println("***************************************************");
            System.out.println("1. Masukkan Data Lemari");
            System.out.println("2. Lihat Data Lemari"); 
            System.out.println("3. Ubah Data Lemari");
            System.out.println("4. Hapus Data Lemari");
            System.out.println("5. EXIT");
            System.out.println("***************************************************");
            System.out.println("Pilih angka 1-5 = ");
        int pilih = Integer.valueOf(input.readLine());
            switch (pilih){
            case 1:
                    inputdata();
                    break;
            case 2:
                    lihat();
                    break;
            case 3:
                    ubahdata();
                    break;
            case 4:
                    hapusdata();
                    break;
            case 5:
                    backmenu();
                    break;
            default:
                menu(); 
            } 
        }

public static void inputdata() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
            
            String nama;
            int harga;
            
    System.out.println("Masukkan Jenis Lemari : ");
    nama = input.readLine();
    System.out.println("Masukkan harga Lemari : ");
    harga = Integer.parseInt(input.readLine());
    
    if("".equals(nama) || "".equals(harga)){
        System.out.println("Data gagal ditambah");
        return;
    }
        kayu Abaru = new kayu (nama, harga);
        Abaru.nama = nama;
        Abaru.harga = harga;
        kayu.add(Abaru);
        Abaru.inputdata();
}           

public static void lihat()throws IOException{
            for(int i = 0 ; i < kayu.size();i++){
                System.out.println(i+1);
                System.out.println("Jenis Lemari     : " + kayu.get(i).nama);
                System.out.println("Harga Lemari     : " + kayu.get(i).harga);
            }
}

public static void ubahdata()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    lihat();
    System.out.println("Ganti Data Lemari Meubel");
    String nama;
    int harga;
    int index;
    System.out.println("Masukkan angka data Lemari yang ingin di ubah");
    index = Integer.parseInt(input.readLine());
    index--;
    
    System.out.println("Masukkan Jenis Lemari : ");
    nama = input.readLine();
    System.out.println("Masukkan harga Lemari : ");
    harga = Integer.parseInt(input.readLine());
    
    kayu.get(index).nama = nama;
    kayu.get(index).harga = harga;
}

public static void hapusdata() throws IOException{
    lihat();
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int t;
    System.out.println("input Yang ingin Anda Hapus = ");
    t = Integer.parseInt(input.readLine());
    t--;
    
    kayu.get(t).hapusdata();
    kayu.remove(t);
    }

public static void backmenu() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int a;
    System.out.println("Terimakasih");
    System.out.println("Tekan 1 Dan Tekan ENTER untuk Next");
    a = Integer.parseInt(input.readLine());
    menu();
    }

} 