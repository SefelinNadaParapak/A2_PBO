/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    //membuat array list
    static ArrayList<Tiket_Pesawat> tiket = new ArrayList<>();
    static ArrayList<Ekonomi> tiket_ekonomi = new ArrayList<>();
    static ArrayList<Bisnis> tiket_bisnis = new ArrayList<>();
    static int tanggal, harga, index;
    static String asal, tujuan, nama, lanjut;
   
    public static void main(String[] args) throws IOException { 
        while (true){
            menu();
        }
    }
    
    static final void info(){ //final method
        System.out.println("*================================*");
        System.out.println("|            INFORMASI           |");
        System.out.println("*================================*");
        System.out.println("| ~ Pemesanan Tiket Ekonomi      |");
        System.out.println("|   Dikenakan Biaya Tambahan :   |");
        System.out.println("|   Rp 50.000                    |");
        System.out.println("| ~ Pemesanan Tiket Bisnis       |");
        System.out.println("|   Dikenakan Biaya Tambahan :   |");
        System.out.println("|   Rp 1000.000                  |");
        System.out.println("*================================*");
    }
    
    //menambah data
    static void pesan() throws IOException{
        System.out.println("*================================*");
        System.out.println("|        Pilih Kelas Tiket       |");
        System.out.println("*================================*");
        System.out.println("| 1. Ekonomi    | 2. Bisnis      |");
        System.out.println("*================================*");
        System.out.print(" Masukkan Pilihan : ");
        int pilihan =Integer.parseInt(input.readLine());
        if (pilihan == 1){
            pilihanTiket();
            int pil = Integer.parseInt(input.readLine());
                switch(pil){
                //menambahkan rute dan harga
                case 1 :
                    asal = "Samarinda";
                    tujuan = "Lombok";
                    harga = 800000;
                    break;
                case 2 :
                    asal = "Samarinda";
                    tujuan = "Denpasar";
                    harga = 1200000;
                    break;
                case 3 :
                    asal = "Samarinda";
                    tujuan = "Jakarta";
                    harga = 1000000;
                    break;
                case 4 :
                    asal = "Samarinda";
                    tujuan = "Surabaya";
                    harga = 600000;
                    break;
                case 5 :
                    asal = "Samarinda";
                    tujuan = "Manado";
                    harga = 900000;
                    break;
                default :
                    System.out.println("\n*================================*");
                    System.out.println("|         Masukkan Salah         |");
                    System.out.println("*================================*\n");
                    next();
                    menu();
                }

            //menambahkan nama pemesan
            System.out.println(" Masukkan Nama Anda             : ");
            nama = input.readLine();

            //menambahkan tanggal pemesan
            System.out.println(" Tanggal Keberangkatan (DDMMYY) : ");
            tanggal = Integer.parseInt(input.readLine());
            
            //memastikan tidak ada data kosong
            if("".equals(asal) || "".equals(tujuan) || "".equals(nama) || "".equals(tanggal) || "".equals(harga)){
                System.out.println("\n*================================*");
                System.out.println("|     Data Gagal Ditambahkan     |");
                System.out.println("*================================*");
                System.out.println("|         Lengkapi Form !!!      |");
                System.out.println("*================================*\n");
                return;
            }
            
            //membuat objek
            Ekonomi t_ekonomi = new Ekonomi(asal, tujuan, nama, harga, tanggal);
            
            //menambahkan ke arraylist
            tiket_ekonomi.add(t_ekonomi);
            
            //memanggil method
            t_ekonomi.BerhasilPesan();
            
        }else if (pilihan == 2){
            pilihanTiket();
            int pil = Integer.parseInt(input.readLine());
                switch(pil){
                //menambahkan rute dan harga
                case 1 :
                    asal = "Samarinda";
                    tujuan = "Lombok";
                    harga = 800000;
                    break;
                case 2 :
                    asal = "Samarinda";
                    tujuan = "Denpasar";
                    harga = 1200000;
                    break;
                case 3 :
                    asal = "Samarinda";
                    tujuan = "Jakarta";
                    harga = 1000000;
                    break;
                case 4 :
                    asal = "Samarinda";
                    tujuan = "Surabaya";
                    harga = 600000;
                    break;
                case 5 :
                    asal = "Samarinda";
                    tujuan = "Manado";
                    harga = 900000;
                    break;
                default :
                    System.out.println("\n*================================*");
                    System.out.println("|         Masukkan Salah         |");
                    System.out.println("*================================*\n");
                    next();
                    menu();
                }

            //menambahkan nama pemesan
            System.out.println(" Masukkan Nama Anda             : ");
            nama = input.readLine();

            //menambahkan tanggal pemesan
            System.out.println(" Tanggal Keberangkatan (DDMMYY) : ");
            tanggal = Integer.parseInt(input.readLine());
            
            //memastikan tidak ada data kosong
            if("".equals(asal) || "".equals(tujuan) || "".equals(nama) || "".equals(tanggal) || "".equals(harga)){
                System.out.println("\n*================================*");
                System.out.println("|     Data Gagal Ditambahkan     |");
                System.out.println("*================================*");
                System.out.println("|         Lengkapi Form !!!      |");
                System.out.println("*================================*\n");
                return;
            }
            
            //membuat objek
            Bisnis t_bisnis = new Bisnis(asal, tujuan, nama, harga, tanggal);
            
            //menambahkan ke arraylist
            tiket_bisnis.add(t_bisnis);
            t_bisnis.BerhasilPesan();
            
        }else{
            System.out.println("\n*================================*");
            System.out.println("|         Masukkan Salah         |");
            System.out.println("*================================*\n");
            next();
            menu();
        }
    }
        
        
    
    //menampilkan pesanan
    // tiket ekonomi
    static void tampil_ekonomi(){
        System.out.println("*================================*");
        System.out.println("|  Daftar Pesanan Tiket Ekonomi  |");
        for(int i = 0 ; i < tiket_ekonomi.size();i++){
            System.out.println("*================================*");
            System.out.println("| Nomor   : ["+(i+1)+"]");
            tiket_ekonomi.get(i).Tampil();
            tiket_ekonomi.get(i).overloading(" Ekonomi");
            tiket_ekonomi.get(i).overloading(0);
        }
        
        
    }
    
    // tiket bisnis
    static void tampil_bisnis(){
        System.out.println("*================================*");
        System.out.println("|   Daftar Pesanan Tiket Bisnis  |");
        for(int i = 0 ; i < tiket_bisnis.size();i++){
            System.out.println("*================================*");
            System.out.println("| Nomor   : ["+(i+1)+"]");
            tiket_bisnis.get(i).Tampil();
            tiket_bisnis.get(i).overloading(" Bisnis");
            tiket_bisnis.get(i).overloading(0);
        }
        
    }
    static void tampil() throws IOException{
        System.out.println("*================================*");
        System.out.println("|        Pilih Kelas Tiket       |");
        System.out.println("*================================*");
        System.out.println("| 1. Ekonomi    | 2. Bisnis      |");
        System.out.println("*================================*");
        System.out.print(" Masukkan Pilihan : ");
        int pilihan =Integer.parseInt(input.readLine());
        if (pilihan == 1){
            if (tiket_ekonomi.isEmpty() == true){
                System.out.println("\n*================================*");
                System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                System.out.println("*================================*\n");
                next();
                menu();
            }else {
                tampil_ekonomi();
            }
        } else if (pilihan == 2){
            if (tiket_bisnis.isEmpty() == true){
                System.out.println("\n*================================*");
                System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                System.out.println("*================================*\n");
                next();
                menu();
            }else {
                tampil_bisnis();
            }
        } else {
            System.out.println("\n*================================*");
            System.out.println("|         Masukkan Salah         |");
            System.out.println("*================================*\n");
            next();
            menu();
        }
    }
    
    //mengubah pesanan
    static void ubah() throws IOException{
        System.out.println("*================================*");
        System.out.println("|        Pilih Kelas Tiket       |");
        System.out.println("*================================*");
        System.out.println("| 1. Ekonomi    | 2. Bisnis      |");
        System.out.println("*================================*");
        System.out.print(" Masukkan Pilihan : ");
        int pilihan =Integer.parseInt(input.readLine());
        if (pilihan == 1){
            if (tiket_ekonomi.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                    next();
                    menu();
            }else{
                    //menentukan indeks
                    tampil_ekonomi();
                    System.out.print(" Nomor Berapa yang Ingin Diubah? : ");
                    index = Integer.parseInt(input.readLine());
                    index--;

                    pilihanTiket();
                    int pil = Integer.parseInt(input.readLine());

                    //mengubah rute dan harga
                    switch(pil){
                        case 1 :
                            asal = "Samarinda";
                            tujuan = "Lombok";
                            harga = 800000;
                            break;
                        case 2 :
                            asal = "Samarinda";
                            tujuan = "Denpasar";
                            harga = 1200000;
                            break;
                        case 3 :
                            asal = "Samarinda";
                            tujuan = "Jakarta";
                            harga = 1000000;
                            break;
                        case 4 :
                            asal = "Samarinda";
                            tujuan = "Surabaya";
                            harga = 600000;
                            break;
                        case 5 :
                            asal = "Samarinda";
                            tujuan = "Manado";
                            harga = 900000;
                            break;
                        default :
                            System.out.println("\n*================================*");
                            System.out.println("|         Masukkan Salah         |");
                            System.out.println("*================================*\n");
                            next();
                            menu();
                    }

                    //mengubah nama
                    System.out.print(" Nama Baru : ");
                    nama = input.readLine();

                    //mengubah tanggal
                    System.out.print(" Tanggal Baru (DDMMYY) : ");
                    tanggal = Integer.parseInt(input.readLine());
                    
                    
                    //memastikan tidak ada data yang kosong
                    if("".equals(asal) || "".equals(tujuan) || "".equals(nama) || "".equals(tanggal) || "".equals(harga)){
                        System.out.println("\n*================================*");
                        System.out.println("|     Data Gagal Ditambahkan     |");
                        System.out.println("*================================*");
                        System.out.println("|         Lengkapi Form !!!      |");
                        System.out.println("*================================*\n");
                        return;
                    }
                    
                    //memasukkan ke arraylist
                    tiket_ekonomi.get(index).setAsal(asal);
                    tiket_ekonomi.get(index).setTujuan(tujuan);
                    tiket_ekonomi.get(index).setNama(nama);
                    tiket_ekonomi.get(index).setTanggal(tanggal);
                    tiket_ekonomi.get(index).UbahPesanan();
                    }
            
        
        } else if(pilihan == 2){
            if (tiket_bisnis.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                    next();
                    menu();
            }else{
                    //menentukan indeks
                    tampil_bisnis();
                    System.out.print(" Nomor Berapa yang Ingin Diubah? : ");
                    index = Integer.parseInt(input.readLine());
                    index--;

                    pilihanTiket();
                    int pil = Integer.parseInt(input.readLine());

                    //mengubah rute dan harga
                    switch(pil){
                        case 1 :
                            asal = "Samarinda";
                            tujuan = "Lombok";
                            harga = 800000;
                            break;
                        case 2 :
                            asal = "Samarinda";
                            tujuan = "Denpasar";
                            harga = 1200000;
                            break;
                        case 3 :
                            asal = "Samarinda";
                            tujuan = "Jakarta";
                            harga = 1000000;
                            break;
                        case 4 :
                            asal = "Samarinda";
                            tujuan = "Surabaya";
                            harga = 600000;
                            break;
                        case 5 :
                            asal = "Samarinda";
                            tujuan = "Manado";
                            harga = 900000;
                            break;
                        default :
                            System.out.println("\n*================================*");
                            System.out.println("|         Masukkan Salah         |");
                            System.out.println("*================================*\n");
                            next();
                            menu();
                    }

                    //mengubah nama
                    System.out.print(" Nama Baru : ");
                    nama = input.readLine();

                    //mengubah tanggal
                    System.out.print(" Tanggal Baru (DDMMYY) : ");
                    tanggal = Integer.parseInt(input.readLine());
                    
                    
                    //memastikan tidak ada data yang kosong
                    if("".equals(asal) || "".equals(tujuan) || "".equals(nama) || "".equals(tanggal) || "".equals(harga)){
                        System.out.println("\n*================================*");
                        System.out.println("|     Data Gagal Ditambahkan     |");
                        System.out.println("*================================*");
                        System.out.println("|         Lengkapi Form !!!      |");
                        System.out.println("*================================*\n");
                        return;
                    }
                    
                    //memasukkan ke arraylist
                    tiket_bisnis.get(index).setAsal(asal);
                    tiket_bisnis.get(index).setTujuan(tujuan);
                    tiket_bisnis.get(index).setNama(nama);
                    tiket_bisnis.get(index).setTanggal(tanggal);
                    tiket_bisnis.get(index).UbahPesanan();
            }
            
        } else {
            System.out.println("\n*================================*");
            System.out.println("|         Masukkan Salah         |");
            System.out.println("*================================*\n");
            next();
            menu();
        }
    }
    
    //menghapus pesanan
    static void hapus() throws IOException{
        System.out.println("*================================*");
        System.out.println("|        Pilih Kelas Tiket       |");
        System.out.println("*================================*");
        System.out.println("| 1. Ekonomi    | 2. Bisnis      |");
        System.out.println("*================================*");
        System.out.print(" Masukkan Pilihan : ");
        int pilihan =Integer.parseInt(input.readLine());
        if (pilihan == 1){
            if (tiket_ekonomi.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                    menu();
            }else{
                    tampil_ekonomi();
                    System.out.print(" Nomor Berapa yang Ingin Dibatalkan? : ");
                    index = Integer.parseInt(input.readLine());
                    index--;
                    
                    //memanggil method override
                    tiket_ekonomi.get(index).BatalPesan();
                    
                    //menghapus data pada arraylist
                    tiket_ekonomi.remove(index);
                }
            
        } else if (pilihan == 2 ){
            if (tiket_bisnis.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                    next();
                    menu();
            }else{
                    tampil_bisnis();
                    System.out.print(" Nomor Berapa yang Ingin Dibatalkan? : ");
                    index = Integer.parseInt(input.readLine());
                    index--;
                                        
                    //memanggil method override
                    tiket_bisnis.get(index).BatalPesan();
                    
                    //menghapus data pada arraylist
                    tiket_bisnis.remove(index);

                    next();
                }
        }
    }
    
    //untuk melanjutkan
    static void next() throws IOException{
        System.out.println("\n*================================*");
        System.out.println("|   TEKAN ENTER UNTUK LANJUT     |");
        System.out.print("*================================*");
        lanjut = input.readLine();
    }
    
    //pilihan tiket
    static void pilihanTiket() throws IOException{
        System.out.println("\n*=============================================*");
        System.out.println("| No |   Asal   -  Tujuan   | Waktu | Harga   |");
        System.out.println("|=============================================|");
        System.out.println("|  1 | Samarinda - Lombok   |  5PM  |  800K   |");
        System.out.println("|  2 | Samarinda - Denpasar |  8PM  |  1200K  |");
        System.out.println("|  3 | Samarinda - Jakarta  |  10PM |  1000K  |");
        System.out.println("|  4 | Samarinda - Surabaya |  1AM  |  600K   |");
        System.out.println("|  5 | Samarinda - Manado   |  3AM  |  900K   |");
        System.out.println("*=============================================*");
        System.out.print(" Masukkan Pilihan [1-5] : ");
    }
    
    //menu utama
    static void menu() throws IOException{
        System.out.println("\n*================================*");
        System.out.println("|    Pemesanan Tiket Pesawat     |");
        System.out.println("*================================*");
        System.out.println("|  Menu :                        |");
        System.out.println("|  1. Pesan Tiket                |");
        System.out.println("|  2. Lihat Tiket Saya           |");
        System.out.println("|  3. Ubah Tiket Saya            |");
        System.out.println("|  4. Batalkan Tiket             |");
        System.out.println("|  5. Keluar                     |");
        System.out.println("*================================*");
        System.out.print(" Masukkan Pilihan [1-5] : ");
        int pilihan = Integer.parseInt(input.readLine());
        switch (pilihan){
            case 1 -> {
                info();
                pesan();
                next();
            }
            case 2 -> {
                if (tiket_ekonomi.isEmpty() == true && tiket_bisnis.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                }else {
                    tampil();
                    
                }
                next();
            }
            case 3 -> {
                if (tiket_ekonomi.isEmpty() == true && tiket_bisnis.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                }else{
                    ubah();
                }
                next();
                
            }
            case 4 -> {
                if (tiket_ekonomi.isEmpty() == true && tiket_bisnis.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                }else{
                    hapus();
                }
                next();
               
            }
            case 5 -> {
                System.out.println("\n*================================*");
                System.out.println("|           TERIMAKASIH          |");
                System.out.println("*================================*\n");
                System.exit(0);
            }
            default -> {
                System.out.println("\n*================================*");
                System.out.println("|         Masukkan Salah         |");
                System.out.println("*================================*\n");
                next();
            }
        }
    }
}