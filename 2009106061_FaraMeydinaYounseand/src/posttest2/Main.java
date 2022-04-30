package posttest2;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        
        ArrayList<Dapes> dataPeserta = new ArrayList<>();
        
        Dapes dapes1 = new Dapes();
        Dapes dapes2 = new Dapes();
     
        while (true){
            System.out.println("+----------------------------+");
            System.out.println("|           M E N U          |");
            System.out.println("+----------------------------+");
            System.out.println("|   1. Memasukkan Data       |"); //create
            System.out.println("|   2. Menampilkan Data      |"); //read
            System.out.println("|   3. Mengubah Data         |"); //update
            System.out.println("|   4. Menghapus Data        |"); //delete
            System.out.println("|   5. Keluar                |");
            System.out.println("+----------------------------+");

            System.out.print  ("Masukkan pilihan : ");
            int pilih = Integer.parseInt(input.readLine());

            switch (pilih){
                case 1:
                    dapes1.mendaftar();
                    System.out.println("\n****** Menu Menambahkan ******");
                    System.out.println("Masukkan data diri ");
                    System.out.print("NIK         : ");int    nik         = Integer.parseInt(input.readLine());
                    System.out.print("Nama        : ");String nama        = input.readLine();
                    System.out.print("Gender      : ");String gender      = input.readLine();
                    System.out.print("Bidang UMKM : ");String bidang_umkm = input.readLine();
                    System.out.println("******************************\n");
                    Dapes dataBaru = new Dapes(nik, nama, gender, bidang_umkm);
                    dataPeserta.add(dataBaru);
                    break;

                case 2:
                    dapes2.pelatihan();
                    System.out.println("\n****** Menu Menampilkan ******\n");
                    System.out.println("+------------------------------+");
                    System.out.println("+       DATA PESERTA UMKM       ");
                    System.out.println("+------------------------------+");
                    
                    for (int i = 0; i < dataPeserta.size(); i++) {
                        System.out.println("Data Peserta --> " + (i + 1));
                        System.out.println("--------------------------------");
                        dataPeserta.get(i).display();
                        System.out.println("--------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("\n****** Menu Mengupdate ******\n");
                    System.out.print("Masukkan Nama peserta : ");
                    String name = input.readLine();
                    for (Dapes peserta : dataPeserta) {
                        if (peserta.nama.equals(name)) {
                            System.out.print("NIK         : ");peserta.setnik(Integer.parseInt(input.readLine()));
                            System.out.print("Nama        : ");peserta.setnama(input.readLine());
                            System.out.print("Gender      : ");peserta.setgender(input.readLine());
                            System.out.print("Bidang UMKM : ");peserta.setbidang_umkm(input.readLine());
                            break;
                        }
                    };
                    break;

                case 4:
                    System.out.println("\n****** Menu Menghapus ******\n");
                    System.out.print("Masukkan Nama peserta : ");
                    String nam = input.readLine();
                    for (int i = 0; i < dataPeserta.size(); i++) {
                        if (dataPeserta.get(i).nama.equals(nam)) {
                            dataPeserta.remove(i);
                            break;
                        }
                    }
                    break;
                    

                case 5:
                    System.out.println("== SEMOGA BERMANFAAT ==");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
    }
}