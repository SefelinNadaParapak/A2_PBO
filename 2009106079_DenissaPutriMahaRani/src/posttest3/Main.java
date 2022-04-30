/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest3;

/**
 *
 * @author Hp
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//            Scanner input2 = new Scanner(System.in);
        ArrayList<Ksr> data = new ArrayList<>();
        Ksr ksrunmul = new Ksr ();
        Ksr ksrpolnes = new Ksr (); 
        Ksr ksrstiksam = new Ksr (); 
        Ksr ksrstikkes = new Ksr ();
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
                        ksrunmul.ada();
                        System.out.println(" ");
                        System.out.print("Masukkan nama KSR        : ");
                        String nama = input.next();
                        System.out.print("Masukkan asal instansi   : ");
                        String asal = input.next();
                        System.out.print("Masukkan alamat          : ");
                        String alamat = input.next();
                        System.out.print("Masukkan jumlah anggota  : ");
                        int jumlah = input.nextInt();
                        System.out.print("Masukkan tahun berdiri   : ");
                        int tahun = input.nextInt();
                        System.out.print("Dibawah naungan PMI(y/t) : ");
                        String naungan = input.next();
                        
                        data.add(new Ksr(nama, asal, alamat, jumlah, tahun, naungan));
                        break;
                        
                    case 2:
                        System.out.print(" ");
                        System.out.println("====================");
                        System.out.println("** Tampilkan data **");
                        System.out.println("====================");
                        ksrunmul.ada();
                        for (int i=0; i < data.size(); i += 1){
                            System.out.println("Data ke-" + (i + 1));
                            data.get(i).tampil();
                        }
                        break;
                        
                    case 3:
                        System.out.println("====================");
                        System.out.println("  ** Ubah data **   ");
                        System.out.println("===================="); 
                        ksrunmul.ada();
                        System.out.print("masukkan nama KSR   : ");
                        String namas = input.next();
                        for (Ksr ksr : data) {
                            if (ksr.getNama().equals(namas)) {
                                System.out.println(" ");
                                System.out.println(" ------ data baru ------ ");
                                System.out.println(" ");
                                System.out.print("Masukkan asal instansi   : ");
                                ksr.setAsal(input.next());
                                System.out.print("Masukkan alamat          : ");
                                ksr.setAlamat(input.next());
                                System.out.print("Masukkan jumlah anggota  : ");
                                ksr.setJumlah(input.nextInt());
                                System.out.print("Dibawah naungan PMI(y/t) : ");
                                ksr.setNaungan(input.next());
                                break;
                            }
                        }
                        break;
                        
                    case 4:
                        System.out.println("======================");
                        System.out.println("** Menghapus data **");
                        System.out.println("======================");
                        System.out.print("Masukkan nama KSR yang datanya ingin dihapus : ");
                        String nama2 = input.next();
                        data.clear();
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
}


    

