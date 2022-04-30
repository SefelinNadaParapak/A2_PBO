package posttest2;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;  


public class Main {
    static ArrayList<Perbaikan> perbaikan = new ArrayList<Perbaikan>();
    
    public static void main(String[] args)throws Exception {
        
      while(true){
          home();
      }
    }

   public static void home() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
        System.out.println("========HOMELAPTOP SERVICE========");
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
                tambahdaftar();
                break;
        case 2:
                lihatdaftar();
                break;
        case 3:
                ubahdaftar();
                break;
        case 4:
                hapusdaftar();
                break;
        case 5:
                System.out.println("Homelaptop Service Keluar");
                System.exit(0);
                break;
        default:
                System.out.println("Pilihan salah");
            home(); 
        } 
    }

public static void tambahdaftar() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
            
            String merklaptop;
            String tipelaptop;
            String jenisperbaikan;
            int hargaperbaikan;
            
//tambah data

    System.out.println("Masukkan merk laptop: ");
    merklaptop = input.readLine();
    System.out.println("Masukkan tipe laptop: ");
    tipelaptop = input.readLine();
    System.out.println("Masukkan jenis perbaikan: ");
    jenisperbaikan = input.readLine();
    System.out.println("Masukkan harga perbaikan: ");
    hargaperbaikan = Integer.parseInt(input.readLine());
    
    if("".equals(merklaptop) || "".equals(tipelaptop) || "".equals(jenisperbaikan) || "".equals(hargaperbaikan)){
        System.out.println("Data gagal ditambah");
        return;
    }
    
// tambah data ke array list

Perbaikan buatdaftarbaru = new Perbaikan (merklaptop, tipelaptop, jenisperbaikan, hargaperbaikan);
        buatdaftarbaru.merklaptop = merklaptop;
        buatdaftarbaru.tipelaptop = tipelaptop;
        buatdaftarbaru.jenisperbaikan = jenisperbaikan;
        buatdaftarbaru.hargaperbaikan = hargaperbaikan;
        perbaikan.add(buatdaftarbaru);
        buatdaftarbaru.tambahdaftar();
}

public static void lihatdaftar()throws IOException{
            for(int i = 0 ; i < perbaikan.size();i++){
                System.out.println(i+1);
                System.out.println("Merk Laptop    : " + perbaikan.get(i).merklaptop);
                System.out.println("Tipe Laptop    : " + perbaikan.get(i).tipelaptop);
                System.out.println("Jenis Perbaikan: " + perbaikan.get(i).jenisperbaikan);
                System.out.println("Harga Perbaikan: " + perbaikan.get(i).hargaperbaikan);
            }
}

public static void ubahdaftar()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    lihatdaftar();
    System.out.println("Ubah Daftar Perbaikan");
    String merklaptop;
    String tipelaptop;
    String jenisperbaikan;
    int hargaperbaikan;
    int index;
    System.out.println("Pilih daftar yang ingin di ubah");
    index = Integer.parseInt(input.readLine());
    index--;
    
    System.out.println("Masukkan merk Laptop: ");
    merklaptop = input.readLine();
    System.out.println("Masukkan tipe laptop: ");
    tipelaptop = input.readLine();
    System.out.println("Masukkan jenis perbaikan: ");
    jenisperbaikan = input.readLine();
    System.out.println("Masukkan harga perbaikan: ");
    hargaperbaikan = Integer.parseInt(input.readLine());
    
    perbaikan.get(index).merklaptop = merklaptop;
    perbaikan.get(index).tipelaptop = tipelaptop;
    perbaikan.get(index).jenisperbaikan = jenisperbaikan;
    perbaikan.get(index).hargaperbaikan = hargaperbaikan;
}

public static void hapusdaftar() throws IOException{
    lihatdaftar();
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int index;
    System.out.println("Hapus daftar yang ke berapa = ");
    index = Integer.parseInt(input.readLine());
    index--;
    
    perbaikan.get(index).hapusdaftar();
    perbaikan.remove(index);
    }
}
