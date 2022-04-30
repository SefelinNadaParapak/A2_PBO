/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Posttest2 {
    
    static InputStreamReader input = new InputStreamReader(System.in);
    static BufferedReader input1 = new BufferedReader(input);
    static ArrayList<Order> dataOrder = new ArrayList<>();
    
    static void dian() throws IOException{
        System.out.println("+------------------------------------+");
        System.out.println("| POSTTEST 2                         |");
        System.out.println("+------------------------------------+");
        System.out.println("| Nama    : Krisdayanti              |");
        System.out.println("| NIM     : 2009106064               |");
        System.out.println("| Kelas   : Informatika B 2020 (A2)  |");
        System.out.println("+------------------------------------+\n\n");
    }
    
    static void jenisMerch() throws IOException{
        System.out.println("\nJenis Merchandise :");
        System.out.println("- Album \t - Photobook");
        System.out.println("- Lightstick \t - Mini Banners");
        System.out.println("- Photocards \t - Cheering Slogan");
        System.out.println("- Postcards \t - Boneka");
        System.out.println("- Poster \t - Gantungan Kunci/Tas\n");
    }
    
    static void jenisBand()throws IOException{
        System.out.println("\nGrup Band :");
        System.out.println("- AESPA \t - NCT (all unit)");
        System.out.println("- Blackpink \t - Red Velvet");
        System.out.println("- BTS \t\t - Seventeen");
        System.out.println("- ENHYPEN \t - TXT");
        System.out.println("- EXO \t\t - Twice\n");
    }
    
    static void menu() throws IOException{
        System.out.println("+----------------------------+");
        System.out.println("| Pemesanan Merchandise KPOP |");
        System.out.println("+----------------------------+");
        System.out.println("|         M E N U            |");
        System.out.println("| [1] Tambah Pesanan         |");
        System.out.println("| [2] Lihat Pesanan          |");
        System.out.println("| [3] Update Data Pesanan    |");
        System.out.println("| [4] Hapus Pesanan          |");
        System.out.println("| [0] Keluar                 |");
        System.out.println("+----------------------------+");
        System.out.print("Pilih Menu : ");
                    
        int pilih = Integer.valueOf(input1.readLine());
        
        switch(pilih){
            case 1 -> addOrder();
            case 2 -> showOrder();
            case 3 -> updateOrder();
            case 4 -> deleteOrder();
            case 0 -> System.exit(0);
            default -> System.out.println("\nMenu tidak tersedia!\n"); 
        }
    }
    
    static void addOrder() throws IOException{
        System.out.println("\n       Membuat Pesanan");
        
        System.out.print("Nama Pemesan   : ");
        String nama = input1.readLine();      
        System.out.print("Alamat         : ");    
        String alamat = input1.readLine();  
        System.out.print("Email          : ");  
        String email = input1.readLine(); 
        jenisMerch();
        System.out.print("Jenis Merch    : ");
        String merch = input1.readLine();  
        jenisBand();
        System.out.print("Group Band     : ");      
        String grup = input1.readLine();       
        System.out.print("Jumlah Pesanan : ");
        int jumlah = Integer.parseInt(input1.readLine());
        
        Order dataBaru = new Order(nama, alamat, email, merch, grup, jumlah);
        dataBaru.done();
        dataBaru.suruh();
        dataOrder.add(dataBaru);
    }
    
    static void showOrder(){
        System.out.println("\n           Pesanan");
        
        if(dataOrder.isEmpty()){
        System.out.println("\n      Tidak ada pesanan!\n");
        }else{
            for(int i = 0; i < dataOrder.size(); i++){
                System.out.println("Nomor Pesanan \t : " + (i + 1));
                System.out.println("Nama Pesanan \t : " + dataOrder.get(i).nama);
                System.out.println("Alamat Pemesan \t : " + dataOrder.get(i).alamat);
                System.out.println("Email Pemesan \t : " + dataOrder.get(i).email);
                System.out.println("Merchandise \t : " + dataOrder.get(i).merch);
                System.out.println("Idol Group \t : " + dataOrder.get(i).grup);
                System.out.println("Jumlah Pesanan \t : " + dataOrder.get(i).jumlah);
                System.out.println(" ");
            }
        }
    }
    
    static void updateOrder() throws IOException{        
        System.out.println("\n        Update Pesanan");
        
        int pilih;
        
        showOrder();
  
        System.out.print("Pilih nomor pesanan : ");
        pilih = Integer.parseInt(input1.readLine());
        pilih--;
        
        System.out.print("Nama Pemesan \t : ");
        dataOrder.get(pilih).nama = input1.readLine();
        System.out.print("Alamat Pemesan \t : ");
        dataOrder.get(pilih).alamat = input1.readLine();
        System.out.print("Alamat Email \t : ");
        dataOrder.get(pilih).email = input1.readLine();
        jenisMerch();
        System.out.print("Merchandise \t : ");
        dataOrder.get(pilih).merch = input1.readLine();  
        jenisBand();
        System.out.print("Idol Group \t : ");
        dataOrder.get(pilih).grup = input1.readLine();        
        System.out.print("Jumlah Pemesan \t : ");
        dataOrder.get(pilih).jumlah = Integer.parseInt(input1.readLine());
        System.out.println(" ");
    }
    
    static void deleteOrder() throws IOException{
        System.out.println("\n          Hapus Pesanan");
        
        int pilih;
        
        showOrder();
        
        System.out.print("Pilih Nomor Pesanan : ");
        pilih = Integer.parseInt(input1.readLine());
        pilih--;
        
        dataOrder.remove(pilih);
        System.out.println("\nData berhasil dihapus\n");
    }
    
    public static void main(String[] args) throws IOException{
         
       dian();
        
        while(true){
            menu();
        }
        
    }
    
}
    
