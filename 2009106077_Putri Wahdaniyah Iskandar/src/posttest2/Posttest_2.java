/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest_2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.ArrayList;
// import posttest_2 HomeCare;

public class Posttest_2  {
     /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static ArrayList<HomeCare> homeCare = new ArrayList<HomeCare>();
    static HomeCare homeCares;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Menu;
        do{
          System.out.println("*");
          System.out.println("WELCOME TO HOME CARE");
          System.out.println("*");
          System.out.println("1. Tambah Data Pasien");
          System.out.println("2. Tampilkan Data Pasien");
          System.out.println("3. Edit Data Pasien");
          System.out.println("4. Delete Data");
       
          System.out.print("Masukan Pilihan : ");
          Menu = input.nextInt(); input.nextLine();
        if(Menu > 0) {
                menu_HomeCare(Menu);
            }
        } while(Menu != 0);
        
        System.out.println("\nProgram selesai.");
        System.exit(0);
    }
    
    
    public static void menu_HomeCare(int Menu) {
        switch(Menu) {
            case 1:
                create_data();
                break;
            case 2:
                read_data();
                continue_input();
                break;
            case 3:
                update_data();
                break;
            case 4:
                delete_data();
                break;
            default:
                System.out.println("TIDAK ADA PILIHAN");
                continue_input();
        }
    }
    
    public static void create_data() {
    
        System.out.println("Buat Data Pasien");
        System.out.print("NAMA: ");
        String nama = input.nextLine();
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Mengidap Penyakit : ");
        String gender = input.nextLine();
        System.out.print("Jenis Kelamin :");
        String riwayatsakit = input.nextLine();
        System.out.print(" ");
        
        homeCares = new HomeCare(nama, alamat, gender, riwayatsakit);
        homeCare.add(homeCares);
    }
    
    private static void read_data() {
        System.out.println("\n    Daftar Data Pasien  ");
        System.out.println("*");
        System.out.println("No  Nama \talamat \tgender \triwayatsakit");

        for (HomeCare data: homeCare){
            System.out.println(data.getnama() + " \t " + data.getalamat() + "\t  "+ data.getgender() + "\t  " + data.getriwayatsakit());
        }
        System.out.println();
    }
    
    private static void update_data() {
        read_data();
        System.out.println("Mengubah Data");

        System.out.print("Masukkan Nama Pasien : ");
        String nama = input.nextLine();
        boolean ubah = false;
        
        for (HomeCare data : homeCare) {
            if(data.getnama() == nama) {
                System.out.print("Nama  : ");
                String name = input.nextLine();
                System.out.print("Alamat :");
                String alamat = input.nextLine();
                System.out.print("Jenis Kelamin :");
                String gender = input.nextLine();
                System.out.print("Riwayat Sakit  : ");
                String riwayatsakit = input.nextLine();
                
                data.setnama(name);
                data.setalamat(alamat);
                data.setgender(gender);
                data.setriwayatsakit(riwayatsakit);

                ubah = true;
                break;
            }
        }

        if(ubah == false) {
            System.out.println("\n Data Pasien Tidak di temukan.");
            continue_input();
        } else {
            System.out.println("\nData Pasien berhasil diubah.");
            continue_input();
        }
    }

    private static void delete_data() {
        read_data();
        System.out.println(" Menghapus Data Pasien   ");
        System.out.print("Masukkan Nama Pasien : ");
        String nama = input.nextLine();
        boolean Delete = false;
        
        for (HomeCare data : homeCare){
            if(data.getnama() == nama) {
                homeCare.remove(data);
                Delete = true;
                break;
            }
        }

        if(Delete == false) {
            System.out.println("Data Tidak Ada.");
            continue_input();
        } else {
            System.out.println("Data  Berhasil Dihapus.");
            continue_input();
        }
    }


    public static void continue_input() {
        System.out.print("Klik Space Untuk Kembali Ke Menu.");
        input.nextLine();
    }
}