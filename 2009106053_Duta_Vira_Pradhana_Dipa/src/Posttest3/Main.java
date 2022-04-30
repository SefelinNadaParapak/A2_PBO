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
 * @author HP
 */
public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    //membuat array list
    static ArrayList<Tiket> tiket = new ArrayList<>();
    static int tanggal, index;
    static String asal, tujuan, nama, lanjut;
    public static void main(String[] args) throws IOException { 
        while (true){
            menu();
        }
    }
    
    //menambah data
    static void pesan() throws IOException{
        
        //menambah rute asal
        System.out.print(" Masukkan Rute Asal   : ");
        asal = input.readLine();
        
        //menambah rute tujuan
        System.out.print(" Masukkan Rute Tujuan : ");
        tujuan = input.readLine();
        
        //menambahkan nama pemesan
        System.out.print(" Masukkan Nama Anda   : ");
        nama = input.readLine();
        
        //menambahkan tanggal pemesan
        System.out.print(" Tanggal Keberangkatan (DDMMYY) : ");
        tanggal = Integer.parseInt(input.readLine());
        
        if("".equals(asal) || "".equals(tujuan) || "".equals(nama) || "".equals(tanggal)){
            System.out.println("\n*================================*");
            System.out.println("|     Data Gagal Ditambahkan     |");
            System.out.println("*================================*");
            System.out.println("|         Lengkapi Form !!!      |");
            System.out.println("*================================*\n");
            return;
        }
        
        // memasukkan data
        Tiket datamasuk = new Tiket(asal, tujuan, nama, tanggal);
//        datamasuk.nama = nama;
//        datamasuk.asal = asal;
//        datamasuk.tujuan = tujuan;
//        datamasuk.tanggal = tanggal;
        tiket.add(datamasuk);
        datamasuk.BerhasilPesan();
    }
    
    //menampilkan pesanan
    static void tampil(){
        System.out.println("*================================*");
        System.out.println("|     Daftar Pesanan Tiket       |");
        for(int i = 0 ; i < tiket.size();i++){
            System.out.println("*================================*");
            System.out.println(" Nomor   : ["+(i+1)+"]");
            System.out.println(" Nama    : "+ tiket.get(i).getNama());
            System.out.println(" Asal    : "+ tiket.get(i).getAsal());
            System.out.println(" Tujuan  : "+ tiket.get(i).getTujuan());
            System.out.println(" Tanggal : "+ tiket.get(i).getTanggal());
            System.out.println("*================================*");
        }
    }
    
    //mengubah pesanan
    static void ubah() throws IOException{
        //menentukan indeks
        System.out.print(" Nomor Berapa yang Ingin Diubah? : ");
        index = Integer.parseInt(input.readLine());
        index--;
        
        //mengubah nama
        System.out.print(" Nama Baru : ");
        nama = input.readLine();
        
        //mengubah rute asal
        System.out.print(" Masukkan Rute Asal    : ");
        asal = input.readLine();
        
        //mengubah rute tujuan
        System.out.print(" Masukkan Rute Tujuan  : ");
        tujuan = input.readLine();
        
        //mengubah tanggal
        System.out.print(" Tanggal Baru (DDMMYY) : ");
        tanggal = Integer.parseInt(input.readLine());
        
        if("".equals(asal) || "".equals(tujuan) || "".equals(nama) || "".equals(tanggal)){
            System.out.println("\n*================================*");
            System.out.println("|     Data Gagal Ditambahkan     |");
            System.out.println("*================================*");
            System.out.println("|         Lengkapi Form !!!      |");
            System.out.println("*================================*\n");
            return;
        }
        
        tiket.get(index).setAsal(asal);
        tiket.get(index).setTujuan(tujuan);
        tiket.get(index).setNama(nama);
        tiket.get(index).setTanggal(tanggal);
        
        tiket.get(index).UbahPesanan();
        
    }
    
    //menghapus pesanan
    static void hapus() throws IOException{
        System.out.print(" Nomor Berapa yang Ingin Dihapus? : ");
        index = Integer.parseInt(input.readLine());
        index--;
        
        tiket.get(index).BatalPesan();
        tiket.remove(index);
    }
    
    //untuk melanjutkan
    static void next() throws IOException{
        System.out.println("\n*================================*");
        System.out.println("|   TEKAN ENTER UNTUK LANJUT     |");
        System.out.print("*================================*");
        lanjut = input.readLine();
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
                pesan();
                next();
                tampil();
            }
            case 2 -> {
                if (tiket.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                }else {
                    tampil();
                }
                next();
            }
            case 3 -> {
                if (tiket.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                }else{
                    tampil();
                    ubah();
                    next();
                    tampil();
                }
                next();
                
            }
            case 4 -> {
                if (tiket.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                }else{
                    tampil();
                    hapus();
                    next();
                    tampil();
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