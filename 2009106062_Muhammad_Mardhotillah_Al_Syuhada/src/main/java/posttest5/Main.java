package posttest5;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;  


public class Main {
    public static void main(String[] args)throws NumberFormatException, IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Laptop> dataLaptop = new ArrayList<>();
        ArrayList<Macbook> dataMacbook = new ArrayList<>();
        String merk;
        int index;
        int pilihan;
      while(true){
        System.out.println("==============================================");
        System.out.println("============ HOMELAPTOP SERVICE ==============");
        System.out.println("======= JASA SERVICE LAPTOP DAN MACBOOK ======");
        System.out.println("==============================================");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Tambah Daftar Perbaikan");
        System.out.println("2. Lihat Daftar Perbaikan"); 
        System.out.println("3. Ubah Daftar Perbaikan");
        System.out.println("4. Hapus Daftar Perbaikan");
        System.out.println("5. EXIT");
        System.out.println("----------------------------------------------------");
        System.out.println("Pilih[1-5] = ");
        int h = Integer.valueOf(input.readLine());
        switch (h){
        case 1:
            System.out.println("[Tambah daftar]");
            System.out.println("1. Laptop");
            System.out.println("2. Macbook");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                System.out.println("Masukan merk : ");
                merk = input.readLine();
                System.out.println("Masukan tipe : ");
                String tipe = input.readLine();
                System.out.println("Masukan jenis perbaikan : ");
                String jenisperbaikan = input.readLine();
                System.out.println("Masukan harga perbaikan : ");
                String hargaperbaikan = input.readLine();
                System.out.println("Masukan sistem operasi : ");
                String os = input.readLine();
                dataLaptop.add(new Laptop(merk, tipe, jenisperbaikan, hargaperbaikan, os));
            } else if (pilihan ==2) {
                System.out.println("Masukan merk : ");
                merk = input.readLine();
                System.out.println("Masukan tipe : ");
                String tipe = input.readLine();
                System.out.println("Masukan jenis perbaikan : ");
                String jenisperbaikan = input.readLine();
                System.out.println("Masukan harga perbaikan : ");
                String hargaperbaikan = input.readLine();
                System.out.println("Masukan sistem operasi : ");
                String os = input.readLine();
                dataMacbook.add(new Macbook(merk, tipe, jenisperbaikan, hargaperbaikan, os));
                    }
                    break;

                
        case 2:
            System.out.println("[Lihat daftar]");
            System.out.println("1. Laptop");
            System.out.println("2. Macbook");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                for (int i = 0; i < dataLaptop.size(); i++) {
                System.out.println("-----------------------------------------------------");
                System.out.println("List Laptop ke - " + (i + 1));
                dataLaptop.get(i).display();
                System.out.println("-----------------------------------------------------");
                        }
            } else {
                for (int i = 0; i < dataMacbook.size(); i++) {
                System.out.println("-----------------------------------------------------");
                System.out.println("List Macbook ke - " + (i + 1));
                dataMacbook.get(i).display();
                System.out.println("-----------------------------------------------------");
                        }
                    }
                    break;
                
        case 3:
            System.out.println("[Edit daftar]");
            System.out.println("1. Laptop");
            System.out.println("2. Macbook");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                System.out.println("Masukan merk laptop : ");
           merk = input.readLine();
            for (Laptop i : dataLaptop) {
            if (i.getMerk().equals(merk)) {
                System.out.println("Masukan merk baru : ");
                i.setMerk(input.readLine());
                System.out.println("Masukan tipe baru : ");
                i.setTipe(input.readLine());
                System.out.println("Masukan jenis perbaikan baru : ");
                i.setJenisperbaikan(input.readLine());
                System.out.println("Masukan harga perbaikan baru : ");
                i.setHargaperbaikan(input.readLine());
                System.out.println("Masukan sistem operasi baru : ");
                i.setOs(input.readLine());
        }
    }
            } else {
                System.out.println("Masukan merk macbook : ");
           merk = input.readLine();
            for (Macbook i : dataMacbook) {
                if (i.getMerk().equals(merk)) {
                    System.out.println("Masukan merk baru : ");
                    i.setMerk(input.readLine());
                    System.out.println("Masukan tipe baru : ");
                    i.setTipe(input.readLine());
                    System.out.println("Masukan jenis perbaikan baru : ");
                    i.setJenisperbaikan(input.readLine());
                    System.out.println("Masukan harga perbaikan baru : ");
                    i.setHargaperbaikan(input.readLine());
                    System.out.println("Masukan sistem operasi baru : ");
                    i.setOs(input.readLine());
            }
        }
    }
            break;
                
        case 4:
            System.out.println("[Hapus daftar]");
            System.out.println("1. Laptop");
            System.out.println("2. Macbook");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {            
                System.out.println("Hapus daftar laptop yang ke berapa = ");
                index = Integer.parseInt(input.readLine());
                index--;
                dataLaptop.get(index).hapusdaftar();
                dataLaptop.remove(index);
            } else {                
                System.out.println("Hapus daftar macbook yang ke berapa = ");
                index = Integer.parseInt(input.readLine());
                index--;
                dataMacbook.get(index).hapusdaftar();
                dataMacbook.remove(index);
        }
                break;
        case 5:
            System.out.println("Homelaptop Service Keluar");
            System.exit(0);
        default:
            System.out.println("Pilihan salah");
            break; 
            } 
        }
   }
}
 

