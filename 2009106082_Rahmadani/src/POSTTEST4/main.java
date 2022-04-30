package POSTTEST4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
     public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Beruang> dataBeruang = new ArrayList<>();
        ArrayList<Panda> dataPanda = new ArrayList<>();
        int pilihan;
        String nama;
         
        System.out.println("=================================================================");
        System.out.println("            PROGRAM PERSEDIAAN BONEKA KARAKTER                   ");
        System.out.println("                          oleh:                                  ");
        System.out.println("                   2009106082_RAHMADANI                          ");
        System.out.println("=================================================================");
        
        while (true) {   
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----------------------------MENU-------------------------------|");
        System.out.println("|                    1. Tambah Data                             |");
        System.out.println("|                    2. Lihat Data                              |");
        System.out.println("|                    3. Edit Data                               |");
        System.out.println("|                    4. Hapus Data                              |");
        System.out.println("|                    5. Exit                                    |");
        System.out.println("-----------------------------------------------------------------");
            System.out.print("Input Menu : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1:
                    System.out.println("1. Beruang");
                    System.out.println("2. Panda");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan nama : ");
                        nama = input.readLine();
                        System.out.println("Masukan ukuran : ");
                        String ukuran = input.readLine();
                        System.out.println("Masukan warna : ");
                        String warna = input.readLine();
                        System.out.println("Masukan jenis : ");
                        String jenis = input.readLine();
                        dataBeruang.add(new Beruang(nama, ukuran, warna, jenis));
                    } else {
                        System.out.println("Masukan nama : ");
                        nama = input.readLine();
                        System.out.println("Masukan ukuran : ");
                        String ukuran = input.readLine();
                        System.out.println("Masukan warna : ");
                        String warna = input.readLine();
                        System.out.println("Masukan jenis : ");
                        String jenis = input.readLine();
                        dataPanda.add(new Panda(nama, ukuran, warna, jenis));
                    }
                    break;
                case 2:
                    System.out.println("1. Beruang");
                    System.out.println("2. Panda");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        for (int i = 0; i < dataBeruang.size(); i++) {
                            System.out.println("Beruang ke - " + (i + 1));
                            dataBeruang.get(i).display();
                        }
                    } else {
                        for (int i = 0; i < dataPanda.size(); i++) {
                            System.out.println("Panda ke - " + (i + 1));
                            dataPanda.get(i).display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("1. Beruang");
                    System.out.println("2. Panda");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan nama Beruang : ");
                        nama = input.readLine();
                        for (Beruang i : dataBeruang) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan nama baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan ukuran baru : ");
                                i.setUkuran(input.readLine());
                                System.out.println("Masukan warna baru : ");
                                i.setWarna(input.readLine());
                                System.out.println("Masukan jenis baru : ");
                                i.setJenis(input.readLine());
                            }
                        }
                    } else {
                        System.out.println("Masukan nama Panda: ");
                        nama = input.readLine();
                        for (Panda i : dataPanda) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan nama baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan ukuran baru : ");
                                i.setUkuran(input.readLine());
                                System.out.println("Masukan warna baru : ");
                                i.setWarna(input.readLine());
                                System.out.println("Masukan jenis baru : ");
                                i.setJenis(input.readLine());
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("1. Beruang");
                    System.out.println("2. Panda");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan nama beruang : ");
                        nama = input.readLine();
                        for (int i = 0; i < dataBeruang.size(); i++) {
                            if (dataBeruang.get(i).getNama().equals(nama)) {
                                dataBeruang.remove(i);
                            }
                        }
                    } else {
                        System.out.println("Masukan nama panda : ");
                        nama = input.readLine();
                        for (int i = 0; i < dataPanda.size(); i++) {
                            if (dataPanda.get(i).getNama().equals(nama)) {
                                dataPanda.remove(i);
                            }
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}
