/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Pantai> dataPantai = new ArrayList<>();
        ArrayList<Taman> dataTaman = new ArrayList<>();
        ArrayList<Hutan> dataHutan = new ArrayList<>();
        dataPantai.add(new Pantai("ATV","Pantai Manggar","Balikpapan",25000,4.6));
        dataTaman.add(new Taman("Melati","Merpati","Taman 5 Generasi","Balikpapan",0,4.6));
        dataHutan.add(new Hutan("Kayu Uli","Monyet","Hutan Mangrove","Balikpapan",30000,4.6));
        while(true){
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("| |    :     PUSAT INFORMASI    | |");
            System.out.println("| | No :      WISATA KALTIM     | |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("| | 1. : Tambah Tempat Wisata   | |");
            System.out.println("| | 2. : Lihat Tempat Wisata    | |");
            System.out.println("| | 3. : Ubah Tempat Wisata     | |");
            System.out.println("| | 4. : Hapus Tempat Wisata    | |");
            System.out.println("| | 5. : Keluar Program         | |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" || Pilih Menu : " );
            int menu = Integer.parseInt(input.readLine());
            switch (menu){
                case 1:
                    System.out.println("");
                    System.out.println("1. Pantai ");
                    System.out.println("2. Taman ");
                    System.out.println("3. Hutan");
                    System.out.println("");
                    System.out.print("Pilih Menu : ");
                    int pilih = Integer.parseInt(input.readLine());
                    if  (pilih == 1){
                        System.out.print("Masukkan Nama Wisata   : ");
                        String Nama = input.readLine();
                        System.out.print("Masukkan Tempat Wisata : ");
                        String Tempat = input.readLine();
                        System.out.print("Masukkan Harga Wisata  : ");
                        int Harga = Integer.parseInt(input.readLine());
                        System.out.print("Masukkan Rating Wisata : ");
                        double Rating = Double.parseDouble(input.readLine());
                        System.out.print("Masukkan Wahana Wisata : ");
                        String Wahana = input.readLine();
                        dataPantai.add(new Pantai(Wahana,Nama,Tempat,Harga,Rating));
                        System.out.println("");
                    } else if (pilih == 2){
                        System.out.print("Masukkan Nama Wisata   : ");
                        String Nama = input.readLine();
                        System.out.print("Masukkan Tempat Wisata : ");
                        String Tempat = input.readLine();
                        System.out.print("Masukkan Harga Wisata  : ");
                        int Harga = Integer.parseInt(input.readLine());
                        System.out.print("Masukkan Rating Wisata : ");
                        double Rating = Double.parseDouble(input.readLine());
                        System.out.print("Masukkan Flora Wisata : ");
                        String Flora = input.readLine();
                        System.out.print("Masukkan Fauna Wisata : ");
                        String Fauna = input.readLine();
                        dataTaman.add(new Taman(Flora,Fauna,Nama,Tempat,Harga,Rating));
                    } else if(pilih == 3){
                        System.out.print("Masukkan Nama Wisata   : ");
                        String Nama = input.readLine();
                        System.out.print("Masukkan Tempat Wisata : ");
                        String Tempat = input.readLine();
                        System.out.print("Masukkan Harga Wisata  : ");
                        int Harga = Integer.parseInt(input.readLine());
                        System.out.print("Masukkan Rating Wisata : ");
                        double Rating = Double.parseDouble(input.readLine());
                        System.out.print("Masukkan Flora Wisata : ");
                        String Flora = input.readLine();
                        System.out.print("Masukkan Fauna Wisata : ");
                        String Fauna = input.readLine();
                        dataHutan.add(new Hutan(Flora,Fauna,Nama,Tempat,Harga,Rating));
                    } else{
                        System.out.println("Menu Tidak Ada");
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("1. Pantai ");
                    System.out.println("2. Taman ");
                    System.out.println("3. Hutan");
                    System.out.println("");
                    System.out.print("Pilih Menu : ");
                    int pilih1 = Integer.parseInt(input.readLine());
                    if  (pilih1 == 1){
                        for(int i = 0; i < dataPantai.size(); i++){
                            System.out.println("");
                            System.out.println("Wisata Ke - " + (i + 1));
                            dataPantai.get(i).display();
                        }
                    } else if(pilih1 == 2){
                            for(int i = 0; i < dataPantai.size(); i++){
                                System.out.println("");
                                System.out.println("Wisata Ke - " + (i + 1));
                                dataTaman.get(i).display();
                            }
                    } else if (pilih1 == 3){
                            for(int i = 0; i < dataPantai.size(); i++){
                                System.out.println("");
                                System.out.println("Wisata Ke - " + (i + 1));
                                dataHutan.get(i).display();
                            }
                    } else {
                        System.out.println("Menu Tidak Ada");
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("1. Pantai ");
                    System.out.println("2. Taman ");
                    System.out.println("3. Hutan");
                    System.out.println("");
                    System.out.print("Pilih Menu : ");
                    int pilih2 = Integer.parseInt(input.readLine());
                    if (pilih2 == 1){
                        System.out.print("Masukkan Nama Wisata : ");
                        String nama = input.readLine();
                        for (Pantai i : dataPantai){
                            if(i.getNama().equals(nama)){
                                System.out.print("Masukkan Nama Wisata Baru : ");
                                i.setNama(input.readLine());
                                System.out.print("Masukkan Nama Tempat Baru : ");
                                i.setTempat(input.readLine());
                                System.out.print("Masukkan Nama Harga Baru  : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.print("Masukkan Nama Rating Baru : ");
                                i.setRating(Double.parseDouble(input.readLine()));
                                System.out.print("Masukkan Nama Wahana Baru : ");
                                i.setWahana(input.readLine());
                            }
                        }
                    } else if (pilih2 == 2){
                        System.out.print("Masukkan Nama Wisata : ");
                        String nama = input.readLine();
                        for (Taman i : dataTaman){
                            if(i.getNama().equals(nama)){
                                System.out.print("Masukkan Nama Wisata Baru : ");
                                i.setNama(input.readLine());
                                System.out.print("Masukkan Nama Tempat Baru : ");
                                i.setTempat(input.readLine());
                                System.out.print("Masukkan Nama Harga Baru  : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.print("Masukkan Nama Rating Baru : ");
                                i.setRating(Double.parseDouble(input.readLine()));
                                System.out.print("Masukkan Nama Flora Baru : ");
                                i.setFlora(input.readLine());
                                System.out.print("Masukkan Nama Fauna Baru : ");
                                i.setFauna(input.readLine());
                            }
                        }
                    } else if (pilih2 == 3){
                        System.out.print("Masukkan Nama Wisata : ");
                        String nama = input.readLine();
                        for (Hutan i : dataHutan){
                            if(i.getNama().equals(nama)){
                                System.out.print("Masukkan Nama Wisata Baru : ");
                                i.setNama(input.readLine());
                                System.out.print("Masukkan Nama Tempat Baru : ");
                                i.setTempat(input.readLine());
                                System.out.print("Masukkan Nama Harga Baru  : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.print("Masukkan Nama Rating Baru : ");
                                i.setRating(Double.parseDouble(input.readLine()));
                                System.out.print("Masukkan Nama Flora Baru : ");
                                i.setFlora(input.readLine());
                                System.out.print("Masukkan Nama Fauna Baru : ");
                                i.setFauna(input.readLine());
                            }
                        }
                    } else{
                        System.out.println("Menu Tidak Ada");
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("1. Pantai ");
                    System.out.println("2. Taman ");
                    System.out.println("3. Hutan");
                    System.out.println("");
                    System.out.print("Pilih Menu : ");
                    int pilih3 = Integer.parseInt(input.readLine());
                    if (pilih3 == 1){
                        System.out.print("Masukkan Nama Wisata : ");
                        String Nama = input.readLine();
                        for (int i = 0; i < dataPantai.size();i++){
                            if(dataPantai.get(i).getNama().equals(Nama)){
                                dataPantai.remove(i);
                            }
                        }
                    } else if (pilih3 == 2){
                        System.out.print("Masukkan Nama Wisata : ");
                        String Nama = input.readLine();
                        for (int i = 0; i < dataTaman.size();i++){
                            if(dataTaman.get(i).getNama().equals(Nama)){
                                dataTaman.remove(i);
                            }
                        }
                    } else if (pilih3 == 3){
                        System.out.print("Masukkan Nama Wisata : ");
                        String Nama = input.readLine();
                        for (int i = 0; i < dataHutan.size();i++){
                            if(dataHutan.get(i).getNama().equals(Nama)){
                                dataHutan.remove(i);
                            }
                        }
                    } else {
                        System.out.println("Menu Tidak Ada");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
