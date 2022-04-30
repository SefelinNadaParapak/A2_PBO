/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Bonekaa {
    static Scanner inputint = new Scanner(System.in);
    static Scanner inputstr = new Scanner(System.in);
    static ArrayList  stok_boneka = new ArrayList<>();
    static ArrayList  jenis_boneka = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("=================================================================");
        System.out.println("            PROGRAM PERSEDIAAN BONEKA KARAKTER                   ");
        System.out.println("                          oleh:                                  ");
        System.out.println("                   2009106082_RAHMADANI                          ");
        System.out.println("=================================================================");
        awal();
    }
        
     static void awal(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----Sistem Pendataan Persediaan Boneka Karakter Toko Kuning-----");
        System.out.println("|                    1. Tambah Stok Boneka                      |");
        System.out.println("|                    2. Lihat Stok Boneka                       |");
        System.out.println("|                    3. Hapus Stok Boneka                       |");
        System.out.println("|                    4. Edit Stok Boneka                        |");
        System.out.println("|                    5. Exit                                    |");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("| Pilih Menu  : |");
        String menu = inputstr.nextLine();
        if (menu.equals("1")){
            tambah_stok_boneka();
            backToMenu();
        }else if (menu.equals("2")){
            lihat_stok_boneka();
            backToMenu();
        }else if (menu.equals("3")){
            hapus_stok_boneka();

            
        }else if (menu.equals("4")){
            edit_stok_boneka();
            backToMenu();
        }else if (menu.equals("5")){
//            keluar();
            
        }else{
            System.out.println("Inputan salah. Coba lagi!!");
            backToMenu();
        }
    }
    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        inputstr.nextLine();
        awal();
}   
    static void tambah_stok_boneka(){
        
        System.out.print("Ingin berapa boneka : ");
        int banyak_stok_boneka = inputint.nextInt();
        for(int h = 0; h < banyak_stok_boneka; h++){
            System.out.print("Masukkan Stok Boneka   : ");
            String nama_boneka = inputstr.nextLine();
            stok_boneka.add(nama_boneka);
            
            System.out.print("Masukkan jenis boneka : ");
            String pny = inputstr.nextLine();
            jenis_boneka.add(pny);  
        }  
    }
    static void lihat_stok_boneka(){
        for(int y = 0; y<stok_boneka.size(); y++){
            System.out.println("Boneka Ke-"+ (y+1));
            System.out.println("stok boneka : "+stok_boneka.get(y));
            System.out.println("jenis boneka : "+jenis_boneka.get(y));
            
        }
    }
    static void edit_stok_boneka(){
        lihat_stok_boneka();
        System.out.print("Ingin ubah stok boneka ke-");
        int edit = inputint.nextInt();
        System.out.print("Masukkan Stok"
                + " boneka: ");
        String edit_stok_boneka = inputstr.nextLine();
        
        System.out.print("Masukkan Jenis boneka: ");
        String edit_pny = inputstr.nextLine();
        
        stok_boneka.set((edit-1), edit_stok_boneka);
        jenis_boneka.set((edit-1), edit_pny);
        
    }
    static void hapus_stok_boneka(){
        lihat_stok_boneka();
        System.out.print("Boneka ke-");
        int hapus = inputint.nextInt();
//        System.out.println("Anda yakin ingin menghapus stok boneka? (y/n)");
//        String hapus_g_y = inputstr.nextLine();
//        if (hapus_g_y == "y"){
           
            stok_boneka.remove(hapus-1);
            jenis_boneka.remove(hapus-1);
            System.out.println("Data telah terhapus....");
            backToMenu();
//        else{
           
    }
}

