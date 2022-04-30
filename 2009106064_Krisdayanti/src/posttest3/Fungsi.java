/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

import java.io.IOException;
import static posttest3.Posttest3.dataOrder;
import static posttest3.Posttest3.input1;

/**
 *
 * @author ASUS
 */
public class Fungsi {
    
    static void dian() throws IOException {
        System.out.println("+------------------------------------+");
        System.out.println("| POSTTEST 3                         |");
        System.out.println("+------------------------------------+");
        System.out.println("| Nama    : Krisdayanti              |");
        System.out.println("| NIM     : 2009106064               |");
        System.out.println("| Kelas   : Informatika B 2020 (A2)  |");
        System.out.println("+------------------------------------+\n\n");
    }
    
    static void jenisMerch() throws IOException {
        System.out.println("\nJenis Merchandise :");
        System.out.println("- Album \t - Photobook");
        System.out.println("- Lightstick \t - Mini Banners");
        System.out.println("- Photocards \t - Cheering Slogan");
        System.out.println("- Postcards \t - Boneka");
        System.out.println("- Poster \t - Gantungan Kunci/Tas\n");
    }
    
    static void jenisBand() throws IOException {
        System.out.println("\nGrup Band :");
        System.out.println("- AESPA \t - NCT (all unit)");
        System.out.println("- Blackpink \t - Red Velvet");
        System.out.println("- BTS \t\t - Seventeen");
        System.out.println("- ENHYPEN \t - TXT");
        System.out.println("- EXO \t\t - Twice\n");
    }
    
    static void menu() throws IOException {
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
                    
        int pilih = Integer.parseInt(input1.readLine());
        
        switch(pilih){
            case 1 -> addOrder();
            case 2 -> showOrder();
            case 3 -> updateOrder();
            case 4 -> deleteOrder();
            case 0 -> keluar();
            default -> System.out.println("\nMenu tidak tersedia!\n"); 
        }
    }
    
    static void addOrder() throws IOException{
        System.out.println("\n       Membuat Pesanan");
        
        System.out.print("\nTanggal Pemesanan (DD/MM/YY): ");
        String tanggal = input1.readLine();
        System.out.print("Nama Pemesan \t : ");
        String nama = input1.readLine();      
        System.out.print("Alamat Pemesan \t : ");    
        String alamat = input1.readLine();  
        System.out.print("Email Pemesan \t : ");  
        String email = input1.readLine(); 
        jenisMerch();
        System.out.print("Jenis Merch \t : ");
        String merch = input1.readLine();  
        jenisBand();
        System.out.print("Group Band \t : ");      
        String grup = input1.readLine();       
        System.out.print("Jumlah Pesanan \t : ");
        int jumlah = Integer.parseInt(input1.readLine());
        
        Order dataBaru = new Order(tanggal, nama, alamat, email, merch, grup, jumlah);
        dataBaru.done();
        dataBaru.suruh();
        dataOrder.add(dataBaru);
    }
    
    static void showOrder(){
        System.out.println("\n           Pesanan");
        
        if(dataOrder.isEmpty()){
            System.out.println("\n      Tidak ada pesanan!\n");
        }
        else{
            for(int i = 0; i < dataOrder.size(); i += 1){
                System.out.println("\nPesanan ke-" + (i + 1));
//                System.out.println("Tanggal Pemesanan (DD/MM/YY): " + dataOrder.get(i).getTanggal());
//                System.out.println("Nama Pemesan \t : " + dataOrder.get(i).getNama());
//                System.out.println("Alamat Pemesan \t : " + dataOrder.get(i).getAlamat());
//                System.out.println("Email Pemesan \t : " + dataOrder.get(i).getEmail());
//                System.out.println("Merchandise \t : " + dataOrder.get(i).getMerch());
//                System.out.println("Idol Group \t : " + dataOrder.get(i).getGrup());
//                System.out.println("Jumlah Pesanan \t : " + dataOrder.get(i).getJumlah());
//                System.out.println(" ");
                dataOrder.get(i).display();
            }
        }
    }
    
    
    static void updateOrder() throws IOException{        
        System.out.println("\n        Update Pesanan");
        
        int pilih;
        
        System.out.print("\nInput nama pemesan : ");
        String edit = input1.readLine();
        for (Order order : dataOrder) {
            if (order.getNama().equals(edit)) {
                System.out.print("\nTanggal Pemesanan (DD/MM/YY): ");
                order.setTanggal(input1.readLine());
                System.out.print("Nama Pemesan \t : ");
                order.setNama(input1.readLine());
                System.out.print("Alamat Pemesan \t : ");
                order.setAlamat(input1.readLine());
                System.out.print("Email Pemesan \t : ");
                order.setEmail(input1.readLine());
                System.out.print("Merchandise \t : ");
                order.setMerch(input1.readLine());
                System.out.print("Idol Group \t : ");
                order.setGrup(input1.readLine());
                System.out.print("Jumlah Pesanan \t : ");
                order.setJumlah(Integer.parseInt(input1.readLine()));
                
                System.out.println("\nData telah diperbarui.\n");
                break;
            }
            else{
                System.out.println("\nMaaf, data tidak ada!\n");
                
                updateOrder();
            }
        }
    }
    
    static void deleteOrder() throws IOException{
        System.out.println("\n          Hapus Pesanan");
        
        int pilih;
        
        System.out.print("\nInput nama pemesan : ");
        String nama = input1.readLine();
        for (int i = 0; i < dataOrder.size(); i++) {
            if (dataOrder.get(i).getNama().equals(nama)) {
                dataOrder.remove(i);
                System.out.println("\nData berhasil dihapus\n");
                break;
            }
            else{
                System.out.println("\nMaaf, data tidak ada!\n");
                
                deleteOrder();
            }
        }   
    }
    
    static void keluar() {
        System.out.println("\nThank You. Bye~\n");
        System.exit(0);
    }
    
}
