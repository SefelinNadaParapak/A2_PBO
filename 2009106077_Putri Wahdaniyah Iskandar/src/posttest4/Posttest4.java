/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Posttest4 {

    /**
     * @param args the command line arguments
     */
     static Scanner input = new Scanner(System.in);
     static ArrayList<pasien> datapasien = new ArrayList<>();
     static ArrayList<perawat> dataperawat = new ArrayList<>();
     static homecare homecare;
             
     public static void main(String[] args) {
     //Scanner input = new Scanner(System.in);
        int Menu;
        String nama;
        while (true){
          
          System.out.println("WELCOME TO HOME CARE");
          System.out.println("1. Create");
          System.out.println("2. Read");
          System.out.println("3. Update");
          System.out.println("4. Delete");
          System.out.println("5. Exit");
          System.out.println("==================");
       
          System.out.print("Masukan Pilihan : ");
          Menu = input.nextInt(); input.nextLine();
        switch (Menu) {
                case 1:
                    System.out.println("1. Pasien");
                    System.out.println("2. Perawat");
                    System.out.println("Masukan pilihan : ");
                    Menu = input.nextInt(); input.nextLine();
                    if (Menu == 1) {
                        System.out.println("Masukan nama : ");
                        nama = input.nextLine();
                        System.out.println("Gender : ");
                        String gender = input.nextLine();
                        System.out.println("Alamat : ");
                        String alamat = input.nextLine();
                        System.out.println("Mengidap Penyakit : ");
                        String riwayatsakit = input.nextLine();
                        datapasien.add(new pasien(nama, gender, alamat, riwayatsakit));
                    } else {
                        System.out.println("Masukan nama : ");
                        nama = input.nextLine();
                        System.out.println("ID Staff : ");
                        String StaffId = input.nextLine();
                        System.out.println("Gender : ");
                        String gender = input.nextLine();
                        System.out.println("Alamat : ");
                        String alamat = input.nextLine();
                        dataperawat.add(new perawat(nama, StaffId, gender, alamat));
                    }
                    break;
                case 2:
                    System.out.println("1. Pasien");
                    System.out.println("2. Perawat");
                    System.out.println("Masukan pilihan : ");
                    Menu = input.nextInt(); input.nextLine();
                    if (Menu == 1) {
                        for (int i = 0; i < datapasien.size(); i++) {
                            System.out.println("Pasien ke - " + (i + 1));
                            datapasien.get(i).display();
                        }
                    } else {
                        for (int i = 0; i < dataperawat.size(); i++) {
                            System.out.println("Perawat ke - " + (i + 1));
                            dataperawat.get(i).display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("1. Pasien");
                    System.out.println("2. Perawat");
                    System.out.println("Masukan pilihan : ");
                    Menu = input.nextInt(); input.nextLine();
                    if (Menu == 1) {
                        System.out.println("Nama Pasien : ");
                        nama = input.nextLine();
                        for (pasien i : datapasien) {
                            if (i.getnama().equals(nama)) {
                                System.out.println(" Nama Pasien : ");
                                i.setnama(input.nextLine());
                                System.out.println("Gender : ");
                                i.setgender(input.nextLine());
                                System.out.println("Alamat : ");
                                i.setalamat(input.nextLine());
                                System.out.println("Mengidap Penyakit : ");
                                i.setriwayatsakit(input.nextLine());
                            }
                        }
                    } else {
                        System.out.println("Nama Perawat : ");
                        nama = input.nextLine();
                        for (perawat i : dataperawat) {
                            if (i.getnama().equals(nama)) {
                                System.out.println("Nama Perawat : ");
                                i.setnama(input.nextLine());
                                System.out.println("Gender : ");
                                i.setgender(input.nextLine());
                                System.out.println("Alamat : ");
                                i.setalamat(input.nextLine());
                                System.out.println("ID Staff : ");
                                i.setStaffId(input.nextLine());
                            }
                        }
                    }
                    break;
                case 4:
                    
                    System.out.println("1. Pasien");
                    System.out.println("2. Perawat");
                    System.out.println("Masukan pilihan : ");
                    Menu = input.nextInt(); input.nextLine();
                    if (Menu == 1) {
                        System.out.println("Nama Pasien : ");
                        nama = input.nextLine();
                        for (pasien i : datapasien) {
                            if (i.getnama().equals(nama)) {
                                datapasien.remove(i);
                            }
                        }
                    } else {
                        System.out.println("Nama Perawat : ");
                        nama = input.nextLine();
                        for (perawat i : dataperawat) {
                            if (i.getnama().equals(nama)) {
                                dataperawat.remove(i);
                            }
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("NOT FOUND");
                    break;
            }
        }
    }
}
