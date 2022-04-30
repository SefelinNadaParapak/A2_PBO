/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest4;


import java.util.ArrayList;
import java.util.Scanner;
import posttest4.Ksrpoltekkes;
import posttest4.Ksrunmul;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//            Scanner input2 = new Scanner(System.in);
        ArrayList<Ksr> data = new ArrayList<>();
        ArrayList<Ksrunmul> dataKsrunmul = new ArrayList<>();
        ArrayList<Ksrpoltekkes> dataKsrpoltekkes = new ArrayList<>();
//        Ksr Ksrunmul = new Ksr();
        Ksrunmul ksrunmulNew = new Ksrunmul();
        Ksrpoltekkes ksrpoltekkesNew = new Ksrpoltekkes();
//       
        
            int pilihMenu=0;
            do{
                System.out.println("=========================================");
                System.out.println("   SISTEM PENDATAAN KSR KOTA SAMARINDA   ");
                System.out.println("=========================================");
                System.out.println("Menu :");
                System.out.println("1. Tambahkan Data");
                System.out.println("2. Tampilkan Data");
                System.out.println("3. Ubah Data");
                System.out.println("4. Hapus Data");
//                System.out.println("5. Info tambahan KSR Kota Samarinda ");
                System.out.println("5. keluar");
                System.out.println("=========================================");
                System.out.print("Pilih >> ");
                pilihMenu = input.nextInt();
                switch (pilihMenu){
                    case 1:
                        System.out.println("====================");
                        System.out.println("** Tambahkan data **");
                        System.out.println("====================");
//                        KSRunmulnew.ada();
                        System.out.println("1. KSR unmul");
                        System.out.println("2. KSR poltekkes");
                        System.out.println("====================");
                        System.out.print("pilih >>  ");
                        int pilih = input.nextInt();
                        if (pilih == 1){
                            System.out.println(" ");
                            System.out.println("====================");
                            System.out.println("**     KSR Unmul  **");
                            System.out.println("====================");
                            System.out.print("Masukkan nama ketua      : ");
                            String nama = input.next();
                            System.out.print("Masukkan alamat          : ");
                            String alamat = input.next();
                            System.out.print("Masukkan asal instansi   : ");
                            String asal = input.next();
                            System.out.print("Masukkan tahun berdiri   : ");
                            int tahun = input.nextInt();
                            System.out.print("Dibawah naungan PMI(y/t) : ");
                            String naungan = input.next();
                            
                            dataKsrunmul.add(new Ksrunmul(nama, alamat, asal, tahun, naungan));
                        }else{
                            System.out.println(" ");
//                            System.out.println( kegiatan("KSR Poltekkes") );
                            System.out.println("====================");
                            System.out.println("**  KSR Poltekkes **");
                            System.out.println("====================");
                            System.out.print("Masukkan nama ketua      : ");
                            String nama = input.next();
                            System.out.print("Masukkan alamat          : ");
                            String alamat = input.next();
                            System.out.print("Masukkan asal instansi   : ");
                            String asal = input.next();
                            System.out.print("Masukkan jumlah anggota  : ");
                            int jumlah = input.nextInt();
                            
                            dataKsrpoltekkes.add(new Ksrpoltekkes(nama, alamat, asal, jumlah));
                        }
                        break;
                    case 2:
                        System.out.print(" ");
                        System.out.println("====================");
                        System.out.println("** Tampilkan data **");
                        System.out.println("====================");
//                        Ksrunmul.ada();
                        System.out.println("1. KSR unmul");
                        System.out.println("2. KSR poltekkes");
                        System.out.println("====================");
                        System.out.print(" pilih >>  ");
                        int pilih2 = input.nextInt();
                        if(pilih2 == 1){
                            System.out.println("====================");
                            System.out.println("**     KSR Unmul  **");
                            System.out.println("====================");
                            for (int i=0; i < dataKsrunmul.size(); i += 1){
                                System.out.println("Data ke-" + (i + 1));
                                dataKsrunmul.get(i).tampil();
                            }
                            ksrunmulNew.ada();
                            System.out.println( kegiatan("KSR unmul","merupakan ukm di Unmul") );
                        }else{
                            System.out.println("====================");
                            System.out.println("**  KSR Poltekkes **");
                            System.out.println("====================");
                            for (int i=0; i < dataKsrpoltekkes.size(); i += 1){
                                System.out.println("Data ke-" + (i + 1));
                                dataKsrpoltekkes.get(i).tampil();
                            }
                           ksrpoltekkesNew.ada();
                           System.out.println( kegiatan("KSRPoltekkes") );
                        }   
                        break;
                        
                    case 3:
                        System.out.println("====================");
                        System.out.println("  ** Ubah data **   ");
                        System.out.println("===================="); 
                        System.out.println("1. KSR unmul");
                        System.out.println("2. KSR poltekkes");
                        System.out.println("====================");
                        System.out.print("pilih >>  ");
                        int pilih3 = input.nextInt();
                        if(pilih3 == 1){
                            System.out.println("====================");
                            System.out.println("**     KSR Unmul  **");
                            System.out.println("====================");
                            System.out.print("masukkan nama ketua   : ");
                            String namas = input.next();
                            for (Ksrunmul ksr : dataKsrunmul) {
                                if (ksr.getNama().equals(namas)) {
                                    System.out.println(" ");
                                    System.out.println(" ------ data baru ------ ");
                                    System.out.println(" ");
                                    System.out.print("Masukkan alamat          : ");
                                    ksr.setAlamat(input.next());
                                    System.out.print("Masukkan asal instansi   : ");
                                    ksr.setAsal(input.next());
                                    System.out.print("Masukkan tahun berdiri   : ");
                                    ksr.setTahun(input.nextInt());
                                    System.out.print("Dibawah naungan PMI(y/t) : ");
                                    ksr.setNaungan(input.next());
                                }
                            }
                        }else{
                            System.out.println("=====================");
                            System.out.println("**  KSR Poltekkes  **");
                            System.out.println("=====================");
                            System.out.print("masukkan nama ketua   : ");
                            String namas = input.next();
                            for (Ksrpoltekkes ksr : dataKsrpoltekkes) {
                                if (ksr.getNama().equals(namas)) {
                                    System.out.println(" ");
                                    System.out.println(" ------ data baru ------ ");
                                    System.out.println(" ");
                                    System.out.print("Masukkan alamat          : ");
                                    ksr.setAlamat(input.next());
                                    System.out.print("Masukkan asal instansi   : ");
                                    ksr.setAsal(input.next());
                                    System.out.print("Masukkan Jumlah anggota   : ");
                                    ksr.setJumlah(input.nextInt());
                                }
                            }
                        }
                        break;
                        
                    case 4:
                        System.out.println("======================");
                        System.out.println("** Menghapus data **  ");
                        System.out.println("======================");
                        System.out.println("1. KSRunmul");
                        System.out.println("2. KSR poltekkes");
                        System.out.println("======================");
                        System.out.print(" pilih >>  ");
                        int pilih4 = input.nextInt();
                        if (pilih4 == 1){
                            System.out.print("Masukkan nama ketua KSR yang datanya ingin dihapus : ");
                            String nama2 = input.next();
                            dataKsrunmul.clear();
                        }else{
                            System.out.print("Masukkan nama ketua KSR yang datanya ingin dihapus : ");
                            String nama2 = input.next();
                            dataKsrpoltekkes.clear();
                        }
                        break;
                                             
                    case 5:
                        System.out.println(" ");
                        System.out.println("** Terimakasih telah menggunakan program :) **");
                        System.out.println(" ");
                        break;
                        
                    default:
                        System.out.println("");
                        System.out.println("*** Maaf pilihan tidak tersedia ***");
                        System.out.println("");
                    break;

                }
            }
            while (pilihMenu != 5);
        
    
    }
    static String kegiatan(String var1, String var2) {
        return "note! " + var1 + " terdata di Samarinda dan " + var2 ;
    }
    
    static String kegiatan(String var1) {
        return var1 + " terdata di Samarinda" ;
    }


}
            
            