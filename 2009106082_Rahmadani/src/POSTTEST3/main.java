package POSTTEST3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<boneka> databoneka = new ArrayList<>();
        
        System.out.println("=================================================================");
        System.out.println("            PROGRAM PERSEDIAAN BONEKA KARAKTER                   ");
        System.out.println("                          oleh:                                  ");
        System.out.println("                   2009106082_RAHMADANI                          ");
        System.out.println("=================================================================");
               
        while (true) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----Sistem Pendataan Persediaan Boneka Karakter Toko Kuning-----");
        System.out.println("|                    1. Tambah Boneka                           |");
        System.out.println("|                    2. Lihat Boneka                            |");
        System.out.println("|                    3. Edit Boneka                             |");
        System.out.println("|                    4. Hapus Boneka                            |");
        System.out.println("|                    5. Exit                                    |");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("| Pilih Menu  : ");
            int menu = Integer.parseInt(input.readLine());
            
            switch (menu) {
                case 1:
                    System.out.println("-----------------TAMBAH------------------------------");
                    System.out.print("--- Jenis --- : ");
                    String jenis = input.readLine();
                    System.out.print("--- Warna --- : ");
                    String warna = input.readLine();
                    System.out.print("--- Size ---  : ");
                    String size = input.readLine();
                    System.out.print("--- Stok ---  : ");
                    int stok = Integer.parseInt(input.readLine());
                    System.out.println("-----------------------------------------------------");
                    
                    boneka dataBaru = new boneka(jenis, warna, size, stok);
                    databoneka.add(dataBaru);
                    
                    for (boneka boneka : databoneka) {
                     boneka.tambah();
                     }
                    
                    break;
                    
                case 2:
                    System.out.println("---------------------LIHAT---------------------------");
                    for (int i = 0; i < databoneka.size(); i += 1) {
                        System.out.println("| Boneka ke-" + (i + 1));
                        System.out.println("-------------------------------------------------");
                        databoneka.get(i).display();
                    }
                
                    break;
                case 3:
                    
                    System.out.println("-------------------EDIT-------------------------");
                    System.out.print("| Masukkan Jenis boneka ==== ");
                    String Jenis = input.readLine();
                    System.out.println("------------------------------------------------");
                    for (boneka boneka : databoneka) {
                        if (boneka.getJenis().equals(Jenis)) {
                            System.out.print("--- Jenis --- : ");
                            boneka.SetJenis(input.readLine());
                            System.out.print("--- Warna --- : ");
                            boneka.SetWarna(input.readLine());
                            System.out.print("--- Size ---  : ");
                            boneka.SetSize(input.readLine());
                            System.out.print("--- Stok ---  : ");
                            boneka.SetStok(Integer.parseInt(input.readLine()));
                            System.out.println("------------------------------------------");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("---------------------HAPUS------------------------");
                    System.out.print("| Masukan jenis boneka  : ");
                    String jns = input.readLine();
                    System.out.println("--------------------------------------------------");
                    for (int i = 0; i < databoneka.size(); i++) {
                        if (databoneka.get(i).getJenis().equals(jns)) {
                            databoneka.remove(i);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}