/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POSTTEST4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author nizar
 */
public class Main {

   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static ArrayList<Ikan> dataIkan = new ArrayList<Ikan>();
   static ArrayList<MakanIkan> dataMakanIkan = new ArrayList<MakanIkan>();
   static ArrayList<Akuarium> dataAkuarium = new ArrayList<Akuarium>();
   static String inputan;
   static int inputind;
    
    public static void main(String[] args)throws IOException {
        
        while (true) {
            menu();
        }
    }
    public static void menu()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("||========== MENU ==========||");
        System.out.println("||1.Mengisi barang      ====||");
        System.out.println("||2.Melihat barang      ====||");
        System.out.println("||3.Merubah barang      ====||");
        System.out.println("||4.Menghapus barang    ====||");
        System.out.println("||5.Hitung Pajak Barang ====||");
        System.out.println("||6.Keluar              ====||");
        System.out.println("||==========================||");
        String inputan_m;
        System.out.print("Masukan Menu :");
        inputan_m = br.readLine();
        if(inputan_m.equals("1")){
            createBarang();
        } else if (inputan_m.equals("2")){
            readBarang();
        } else if (inputan_m.equals("3")){
            updateBarang();
        } else if (inputan_m.equals("4")){
            deleteBarang();
        } else if (inputan_m.equals("5")){
            hitung_pajak();
        } else if (inputan_m.equals("6")){
            System.exit(1);
        } else {
            System.out.println("SALAH PILIH MENU");
        }    
    }
    public static void readBarang()throws IOException{
        System.out.println("||========== Read Data ==========||");
        System.out.println("||1. Data Ikan         ==========||");
        System.out.println("||2. Data Makanan Ikan ==========||");
        System.out.println("||3. Data Akuarium     ==========||");
        System.out.println("||===============================||");
        System.out.print("Masukan Pilihan :");
        inputan = br.readLine();
        if (inputan.equals("1")){
            for (int i = 0; i < dataIkan.size(); i++){
               System.out.println("barang ke-" + (i + 1));
               dataIkan.get(i).display();
                System.out.println(" ");
            }
        } else if (inputan.equals("2")){
            for (int i = 0; i < dataMakanIkan.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataMakanIkan.get(i).display();
                System.out.println(" ");
            }
        } else if (inputan.equals("3")) {
            for (int i = 0; i < dataAkuarium.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataAkuarium.get(i).display();
                System.out.println(" ");
            }
        } else {
            System.out.println("Data HANYA 3");
        }
        
    }
    public static void createBarang()throws IOException{
        System.out.println("||========== Create Data ==========||");
        System.out.println("||1. Data Ikan         ============||");
        System.out.println("||2. Data Makanan Ikan ============||");
        System.out.println("||3. Data Akuarium     ============||");
        System.out.println("||=================================||");
        System.out.print("Masukan Pilihan :");
        inputan = br.readLine();
        if (inputan.equals("1")){
            System.out.print("Masukan nama ikan : ");
            String nama = br.readLine();
            System.out.print("Masukan harga ikan : ");
            int harga = Integer.parseInt(br.readLine());
            System.out.print("Masukan stock ikan : ");
            int stock = Integer.parseInt(br.readLine());
            System.out.print("Masukan Jenis barang : ");
            String jenis = br.readLine();
            System.out.print("Masukan Motif ikan : ");
            String motif = br.readLine();
            Ikan dataTerbaru = new Ikan(nama, harga, stock, jenis, motif);
            dataIkan.add(dataTerbaru);
            dataTerbaru.nambahBarang();
            
        } else if (inputan.equals("2")){
            System.out.print("Masukan nama Makanan Ikan : ");
            String nama = br.readLine();
            System.out.print("Masukan harga Makanan Ikan : ");
            int harga = Integer.parseInt(br.readLine());
            System.out.print("Masukan stock Makanan Ikan : ");
            int stock = Integer.parseInt(br.readLine());
            System.out.print("Masukan Jenis barang : ");
            String jenis = br.readLine();
            System.out.print("Masukan berat Makanan Ikan : ");
            int berat = Integer.parseInt(br.readLine());
            MakanIkan dataTerbaru = new MakanIkan(nama, harga, stock, jenis, berat);
            dataMakanIkan.add(dataTerbaru);
            dataTerbaru.nambahBarang();
        } else if (inputan.equals("3")){
            System.out.print("Masukan nama Akuarium : ");
            String nama = br.readLine();
            System.out.print("Masukan harga Akuarium : ");
            int harga = Integer.parseInt(br.readLine());
            System.out.print("Masukan stock Akuarium : ");
            int stock = Integer.parseInt(br.readLine());
            System.out.print("Masukan Jenis barang : ");
            String jenis = br.readLine();
            System.out.print("Masukan ukuran Akuarium : ");
            String ukuran = br.readLine();
            Akuarium dataTerbaru = new Akuarium(nama, harga, stock, jenis, ukuran);
            dataAkuarium.add(dataTerbaru);
            dataTerbaru.nambahBarang();
        } else {
            System.out.println("Data HANYA 3");
        }

    }
    public static void updateBarang()throws IOException {
        System.out.println("||========== Update Data ==========||");
        System.out.println("||1. Data Ikan         ============||");
        System.out.println("||2. Data Makanan Ikan ============||");
        System.out.println("||3. Data Akuarium     ============||");
        System.out.println("||=================================||");
        System.out.print("Masukan Pilihan :");
        inputan = br.readLine();
        if (inputan.equals("1")){
            for (int i = 0; i < dataIkan.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataIkan.get(i).display();
                System.out.println(" ");
            }
            System.out.print("Masukan barang ke-");
            inputind = Integer.parseInt(br.readLine());
            int indexe = inputind-1;
            System.out.print("Masukan nama ikan : ");
            String nama = br.readLine();
            dataIkan.get(indexe).setNama(nama);
            System.out.print("Masukan harga ikan : ");
            int harga = Integer.parseInt(br.readLine());
            dataIkan.get(indexe).setHarga(harga);
            System.out.print("Masukan stock ikan : ");
            int stock = Integer.parseInt(br.readLine());
            dataIkan.get(indexe).setStock(stock);
            System.out.print("Masukan Jenis barang : ");
            String jenis = br.readLine();
            dataIkan.get(indexe).setJenis(jenis);
            System.out.print("Masukan Motif ikan : ");
            String motif = br.readLine();
            dataIkan.get(indexe).setMotif(motif);
            dataIkan.get(indexe).updateBarang();
            
        } else if (inputan.equals("2")){
            for (int i = 0; i < dataMakanIkan.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataMakanIkan.get(i).display();
                System.out.println(" ");
            }
            System.out.print("Masukan barang ke-");
            inputind = Integer.parseInt(br.readLine());
            int indexe = inputind-1;
            System.out.print("Masukan nama Makanan Ikan : ");
            String nama = br.readLine();
            dataMakanIkan.get(indexe).setNama(nama);
            System.out.print("Masukan harga Makanan Ikan : ");
            int harga = Integer.parseInt(br.readLine());
            dataMakanIkan.get(indexe).setHarga(harga);
            System.out.print("Masukan stock Makanan Ikan : ");
            int stock = Integer.parseInt(br.readLine());
            dataMakanIkan.get(indexe).setStock(stock);
            System.out.print("Masukan Jenis barang : ");
            String jenis = br.readLine();
            dataMakanIkan.get(indexe).setJenis(jenis);
            System.out.print("Masukan berat Makanan Ikan : ");
            int berat = Integer.parseInt(br.readLine());
            dataMakanIkan.get(indexe).setBerat(berat);
            dataMakanIkan.get(indexe).updateBarang();
        } else if (inputan.equals("3")){
            for (int i = 0; i < dataAkuarium.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataAkuarium.get(i).display();
                System.out.println(" ");
            }
            System.out.print("Masukan barang ke-");
            inputind = Integer.parseInt(br.readLine());
            int indexe = inputind-1;
            System.out.print("Masukan nama Akuarium : ");
            String nama = br.readLine();
            dataAkuarium.get(indexe).setNama(nama);
            System.out.print("Masukan harga Akuarium : ");
            int harga = Integer.parseInt(br.readLine());
            dataAkuarium.get(indexe).setHarga(harga);
            System.out.print("Masukan stock Akuarium : ");
            int stock = Integer.parseInt(br.readLine());
            dataAkuarium.get(indexe).setStock(stock);
            System.out.print("Masukan Jenis barang : ");
            String jenis = br.readLine();
            dataAkuarium.get(indexe).setJenis(jenis);
            System.out.print("Masukan ukuran Akuarium : ");
            String ukuran = br.readLine();
            dataAkuarium.get(indexe).setUkuran(ukuran);
            dataAkuarium.get(indexe).updateBarang();
        } else {
            System.out.println("Data HANYA 3");
        }

    }
    public static void deleteBarang()throws IOException {
        System.out.println("||========== Delete Data ==========||");
        System.out.println("||1. Data Ikan           ==========||");
        System.out.println("||2. Data Makanan Ikan   ==========||");
        System.out.println("||3. Data Akuarium       ==========||");
        System.out.println("||=================================||");
        System.out.print("Masukan Pilihan :");
        inputan = br.readLine();
        if (inputan.equals("1")){
            for (int i = 0; i < dataIkan.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataIkan.get(i).display();
                System.out.println(" ");
            }
            System.out.println("Barang yang ingin di hapus");
            System.out.print("Masukan barang ke-");
            int inputd = Integer.parseInt(br.readLine());
            int indexd = inputd-1;
            if (dataIkan.size() > indexd){
                dataIkan.get(indexd).hapusBarang();
                dataIkan.remove(indexd);
            }
            
        } else if (inputan.equals("2")){
            for (int i = 0; i < dataMakanIkan.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataMakanIkan.get(i).display();
                System.out.println(" ");
            }
            
            System.out.println("Barang yang ingin di hapus");
            System.out.print("Masukan barang ke-");
            int inputd = Integer.parseInt(br.readLine());
            int indexd = inputd-1;
            if (dataMakanIkan.size() > indexd){
                dataMakanIkan.get(indexd).hapusBarang();
                dataMakanIkan.remove(indexd);
            }
        } else if (inputan.equals("3")) {
            for (int i = 0; i < dataAkuarium.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataAkuarium.get(i).display();
                System.out.println(" ");
            }
            System.out.println("Barang yang ingin di hapus");
            System.out.print("Masukan barang ke-");
            int inputd = Integer.parseInt(br.readLine());
            int indexd = inputd-1;
            if (dataAkuarium.size() > indexd){
                dataAkuarium.get(indexd).hapusBarang();
                dataAkuarium.remove(indexd);
            }
        } else {
            System.out.println("Data HANYA 3");
        }

    }
    public static void hitung_pajak()throws IOException{
        System.out.println("||========== Hitung pajak ==========||");
        System.out.println("||1. Data Ikan           ===========||");
        System.out.println("||2. Data Makanan Ikan   ===========||");
        System.out.println("||3. Data Akuarium       ===========||");
        System.out.println("||==================================||");
        System.out.print("Masukan Pilihan :");
        inputan = br.readLine();
        if (inputan.equals("1")){
            for (int i = 0; i < dataIkan.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataIkan.get(i).display();
                System.out.println(" ");
            }
            System.out.println("Barang yang ingin di hitung pajaknya");
            System.out.print("Masukan barang ke-");
            int inputd = Integer.parseInt(br.readLine());
            int indexd = inputd-1;
            if (dataIkan.size() > indexd){
                dataIkan.get(indexd).overload(0.11);
            }
            
        } else if (inputan.equals("2")){
            for (int i = 0; i < dataMakanIkan.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataMakanIkan.get(i).display();
                System.out.println(" ");
            }
            
            System.out.println("Barang yang ingin di hitung pajaknya");
            System.out.print("Masukan barang ke-");
            int inputd = Integer.parseInt(br.readLine());
            int indexd = inputd-1;
            if (dataMakanIkan.size() > indexd){
                dataMakanIkan.get(indexd).overload(0.11);
            }
        } else if (inputan.equals("3")) {
            for (int i = 0; i < dataAkuarium.size(); i++){
                System.out.println("barang ke-" + (i + 1));
               dataAkuarium.get(i).display();
                System.out.println(" ");
            }
            System.out.println("Barang yang ingin di hitung pajaknya");
            System.out.print("Masukan barang ke-");
            int inputd = Integer.parseInt(br.readLine());
            int indexd = inputd-1;
            if (dataAkuarium.size() > indexd){
                dataAkuarium.get(indexd).overload(0.11);
            }
        } else {
            System.out.println("Data HANYA 3");
        }
    }
 
}
