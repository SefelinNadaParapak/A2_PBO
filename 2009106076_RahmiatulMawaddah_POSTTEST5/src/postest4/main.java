/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import postest4.Toko;
import postest4.barang;
import postest4.produk;

/**
 *
 * @author Hp
 */
public class main {

    private static boolean found;
    public static void main(String[] args) {
      List<barang> brg = new ArrayList<barang>();
      List<produk> prd = new ArrayList<produk>();
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      int pilih;
      do{
         System.out.println("+------------------------------------------+");
         System.out.println("|--------Daftar Menu Toko Muslimah --------|");
         System.out.println("+------------------------------------------+");
         System.out.println("|      1. Tambah Data Barang atau Produk   |");
         System.out.println("|      2. Lihat Data Barang atau Produk    |");
         System.out.println("|      3. Hapus Data Barang atau Produk    |");
         System.out.println("|      4. Update Data Barang atau Produk   |");
         System.out.println("|      5. Keluar                           |");
         System.out.println("|------------------------------------------|");
         System.out.print("Pilihan Menu Toko : ");
         pilih = s.nextInt();
         System.out.print("\n");

         switch(pilih){
            case 1:
               int p;
               System.out.println("+-------------------------------------------------------+");
               System.out.println("|-----------   TAMBAH DATA PRODUK ATAU BARANG   --------|");
               System.out.println("+-------------------------------------------------------+");
               System.out.println("                1. Tambah Data Produk                   |"); 
               System.out.println("                2. Tambah Data Barang                   |");
               System.out.println("--------------------------------------------------------|");
               System.out.println("Pilih :");
               p = s.nextInt();
                if (p==1){
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|-----------     TAMBAH DATA PRODUK TOKO        ------------|");
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("Masukkan ID Produk          : "); int no = s.nextInt();
               System.out.println("Masukkan Jumlah Produk      : "); int jum = s.nextInt();
               System.out.println("Masukkan Nama Produk        : "); String Barang = s1.nextLine();
               System.out.println("Masukkan harga Produk       : "); int harga = s.nextInt();
               System.out.println("-----------------------------------------------------------");
                prd.add(new produk(no,jum,Barang,harga));
               } else{
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|-----------     TAMBAH DATA BARANG TOKO        ------------|");
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("Masukkan ID Barang          : "); int no = s.nextInt();
               System.out.println("Masukkan Jumlah Barang      : "); int jum = s.nextInt();
               System.out.println("Masukkan Nama Barang        : "); String Barang = s1.nextLine();
               System.out.println("Masukkan Merek Barang       : "); String Jenis = s1.nextLine();
               System.out.println("Masukkan harga Barang       : "); int harga = s.nextInt();
               System.out.println("-----------------------------------------------------------");
                brg.add(new barang(no,jum,Jenis,Barang,harga));
}

               
            break;

            case 2:
               
               System.out.println("+-------------------------------------------------------+");
               System.out.println("|-----------   LIHAT DATA PRODUK ATAU BARANG    --------|");
               System.out.println("+-------------------------------------------------------+");
               System.out.println("                1. Lihat Data Barang                    |"); 
               System.out.println("                2. Lihat Data produk                    |");
               System.out.println("--------------------------------------------------------|");
               System.out.println("Pilih :");
               p = s.nextInt();

               
               if (p==1){
               Iterator<barang> i = brg.iterator();
               for (barang M : brg) {
               System.out.println("+----------------------------------------------+");
               System.out.println("|---------      Barang Yang Tersedia   --------|");
               System.out.println("+----------------------------------------------+");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJum());
                   System.out.println("\tbarang     : " + M.GetBarang());
                   System.out.println("\tMerek      : " + M.Getjenis());
                   System.out.println("\tHarga      : " + M.Getharga());
               System.out.println("+----------------------------------------------+");
               }
            }else{
               Iterator<produk> i = prd.iterator();
               for (produk M : prd) {
               System.out.println("+----------------------------------------------+");
               System.out.println("|---------      Produk Yang Tersedia   --------|");
               System.out.println("+----------------------------------------------+");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJum());
                   System.out.println("\tMerek      : " + M.GetBarang());
                   System.out.println("\tHarga      : " + M.Getharga());
               System.out.println("+----------------------------------------------+");
               }
}
               System.out.println("+----------------------------------------------------------+");
            break;

            

            case 3:
               System.out.println("+-------------------------------------------------------+");
               System.out.println("|-----------   HAPUS DATA PRODUK ATAU BARANG    --------|");
               System.out.println("+-------------------------------------------------------+");
               System.out.println("                1. Hapus Data Barang    :               |"); 
               System.out.println("                2. Hapus Data Produk    :               |");
               System.out.println("--------------------------------------------------------|");
               System.out.println("Pilih :");
               p = s.nextInt();
               if (p==1){
               Iterator<barang> i = brg.iterator();
               for (barang M : brg) {
               System.out.println("+----------------------------------------------+");
               System.out.println("|---------      Barang Yang Tersedia   --------|");
               System.out.println("+----------------------------------------------+");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJum());
                   System.out.println("\tbarang     : " + M.GetBarang());
                   System.out.println("\tMerek      : " + M.Getjenis());
                   System.out.println("\tHarga      : " + M.Getharga());
               System.out.println("+----------------------------------------------+");
               }

                boolean found = false;
                    System.out.println("----------------------------------------------");
                    System.out.println("------ Masukkan ID data ingin dihapus ------- :");
                    System.out.println("----------------------------------------------");
               int Id = s.nextInt();
                i = brg.iterator();
               while(i.hasNext()){
                  barang e = i.next();
                  if(e.GetId() == Id)  {
                     i.remove();
                     found = true;
                  }
               }
               if(!found){
                  System.out.println("+----------------------------------------------------+");
                  System.out.println("|               Data tidak ditemukan                 |");
                  System.out.println("+----------------------------------------------------+");
               }else{
                  System.out.println("+----------------------------------------------------+");
                  System.out.println("|              Data berhasil dihapus...!             |");
                  System.out.println("+----------------------------------------------------+");
               }
            }else{
               Iterator<produk> i = prd.iterator();
               for (produk M : prd) {
               System.out.println("+----------------------------------------------+");
               System.out.println("|---------      Produk Yang Tersedia   --------|");
               System.out.println("+----------------------------------------------+");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJum());
                   System.out.println("\tMerek      : " + M.GetBarang());
                   System.out.println("\tHarga      : " + M.Getharga());
               System.out.println("+----------------------------------------------+");
               }

                boolean found = false;
                    System.out.println("----------------------------------------------");
                    System.out.println("------ Masukkan ID data ingin dihapus ------- :");
                    System.out.println("----------------------------------------------");
               int Id = s.nextInt();
                i = prd.iterator();
               while(i.hasNext()){
                  produk e = i.next();
                  if(e.GetId() == Id)  {
                     i.remove();
                     found = true;
                  }
               }

               
               if(!found){
                  System.out.println("+----------------------------------------------------+");
                  System.out.println("|               Data tidak ditemukan                 |");
                  System.out.println("+----------------------------------------------------+");
               }else{
                  System.out.println("+----------------------------------------------------+");
                  System.out.println("|              Data berhasil dihapus...!             |");
                  System.out.println("+----------------------------------------------------+");
               }
        }
            break;
            
         case 4:
               System.out.println("+-------------------------------------------------------+");
               System.out.println("|-----------   UBAH DATA PRODUK ATAU BARANG     --------|");
               System.out.println("+-------------------------------------------------------+");
               System.out.println("                1. Ubah Data Barang                     |"); 
               System.out.println("                2. Ubah Data Produk                     |");
               System.out.println("--------------------------------------------------------|");
               System.out.println("Pilih :");
               p = s.nextInt();
               if (p==1){
               Iterator<barang> i = brg.iterator();
               for (barang M : brg) {
               System.out.println("+----------------------------------------------+");
               System.out.println("|---------      Barang Yang Tersedia   --------|");
               System.out.println("+----------------------------------------------+");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJum());
                   System.out.println("\tbarang     : " + M.GetBarang());
                   System.out.println("\tMerek      : " + M.Getjenis());
                   System.out.println("\tHarga      : " + M.Getharga());
               System.out.println("+----------------------------------------------+");
               }
               boolean found = false;
               found = false;

               System.out.println("+--------------------------------------------------------+");
               System.out.println("|          Masukkan ID data yang ingin di Update :       |");
               System.out.println("+--------------------------------------------------------+");
               int Id = s.nextInt();
               
               ListIterator<barang>li = brg.listIterator();
               while(li.hasNext()){
                  barang e = li.next();
                  if(e.GetId() == Id)  {
                     System.out.println("+------------------------------------------------------------+");
                     System.out.println("         Masukkan ID data Barang yang ingin diupdate :       |");
                     System.out.println("+------------------------------------------------------------+");
                     System.out.println("Masukkan Nama Barang Baru    : ");String Barang = s1.nextLine();
                     System.out.println("Masukkan Merek Baru          : ");String Jenis = s1.nextLine();
                     System.out.println("Masukkan Jumlah Baru         : ");int jum = s1.nextInt();
                     System.out.println("Masukkan Harga Baru          : ");int harga = s.nextInt();
                     System.out.println("+-----------------------------------------------------------+");                     
                     li.set(new barang(Id,jum,Barang,Jenis,harga));
                     found = true;
                  }
               }
               if(!found){
                  System.out.println("+----------------------------------------------------+");
                  System.out.println("|              Data tidak ditemukan                  |");
                  System.out.println("+----------------------------------------------------+");
               }else{
                  System.out.println("+----------------------------------------------------+");
                  System.out.println("|              Data berhasil di Update...!!!         |");
                  System.out.println("+----------------------------------------------------+");
               }
              }else{
               Iterator<produk> i = prd.iterator();
               for (produk M : prd) {
               System.out.println("+----------------------------------------------+");
               System.out.println("|---------      Produk Yang Tersedia   --------|");
               System.out.println("+----------------------------------------------+");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJum());
                   System.out.println("\tMerk     : " + M.GetBarang());
                   System.out.println("\tHarga      : " + M.Getharga());
               System.out.println("+----------------------------------------------+");
               }
               boolean found = false;
               found = false;

               System.out.println("+--------------------------------------------------------+");
               System.out.println("|          Masukkan ID data yang ingin di Update :       |");
               System.out.println("+--------------------------------------------------------+");
               int Id = s.nextInt();
               
               ListIterator<produk>li = prd.listIterator();
               while(li.hasNext()){
                  produk e = li.next();
                  if(e.GetId() == Id)  {
                     System.out.println("+------------------------------------------------------------+");
                     System.out.println("         Masukkan ID data Produk yang ingin diupdate :       |");
                     System.out.println("+------------------------------------------------------------+");
                     System.out.println("Masukkan Nama Produk Baru    : ");String Barang = s1.nextLine();
                     System.out.println("Masukkan Jumlah Produk Baru  : ");int jum = s1.nextInt();
                     System.out.println("Masukkan Harga Produk Baru   : ");int harga = s.nextInt();
                     System.out.println("+-----------------------------------------------------------+");                     
                     li.set(new produk(Id,jum,Barang,harga));
                     found = true;
                  }
               }
}
               if(!found){
                  System.out.println("+----------------------------------------------------+");
                  System.out.println("|              Data tidak ditemukan                  |");
                  System.out.println("+----------------------------------------------------+");
               }else{
                  System.out.println("+----------------------------------------------------+");
                  System.out.println("|              Data berhasil di Update...!!!         |");
                  System.out.println("+----------------------------------------------------+");
               }
               
            break;
            
           

            default:
              System.out.println("+--------------------------------------------------------------+");
              System.out.println("                  Program Selesai Terima Kasih!!!              |");
              System.out.println("+--------------------------------------------------------------+");
              System.out.println("+---------------------------------------------------------------+");
              System.out.println("|-------          Data Toko Perlengkapan Muslimah     ----------|");
              System.out.println("+---------------------------------------------------------------+");
            break;
        }
      }while(pilih!=5);
        
    }     
}
