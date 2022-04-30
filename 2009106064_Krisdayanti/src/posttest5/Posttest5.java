/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author ASUS
 */
public class Posttest5 {
    
    static InputStreamReader inpt = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inpt);
    static ArrayList<Groupband> dataGroup = new ArrayList();
    static ArrayList<Solo> dataSolo = new ArrayList();

    static void jenisBand() throws IOException {
        System.out.println("\nGroup Band:");
        System.out.println("- AESPA \t - NCT (all unit)");
        System.out.println("- Blackpink \t - Red Velvet");
        System.out.println("- BTS \t\t - Seventeen");
        System.out.println("- ENHYPEN \t - TXT");
        System.out.println("- EXO \t\t - Twice\n");
        
    }
    
    static void menu() throws IOException {
        System.out.println("\n+------------------------------------+");
        System.out.println("|     Pemesanan Merchandise KPOP     |");
        System.out.println("+------------------------------------+");
        System.out.println("|               M E N U              |");
        System.out.println("| [1] Tambah Pesanan                 |");
        System.out.println("| [2] Lihat Pesanan                  |");
        System.out.println("| [3] Update Data Pesanan            |");
        System.out.println("| [4] Hapus Pesanan                  |");
        System.out.println("| [0] Keluar                         |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Menu : ");
                    
        int pilih = Integer.parseInt(input.readLine());
        
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
        System.out.println("\n+------------------------------------+");
        System.out.println("|           Tambah Pesanan           |");
        System.out.println("+------------------------------------+");
        System.out.println("| Kategori:                          |");
        System.out.println("| [1] Group Band                     |");
        System.out.println("| [2] Solo                           |");
        System.out.println("| [9] Kembali                        |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Kategori : ");
                    
        int tipe = Integer.parseInt(input.readLine());
        
        switch(tipe){
            case 1 -> addGroup();
            case 2 -> addSolo();
            case 9 -> menu();
            default -> System.out.println("\nMenu tidak tersedia!\n"); 
        }
        
    }
    
    static void addGroup() throws IOException{
        System.out.println("\n+------------------------------------+");
        System.out.println("|           Tambah Pesanan           |");
        System.out.println("|       Group Band Merchandise       |");
        System.out.println("+------------------------------------+");
        System.out.print("\nTanggal Pemesanan (DD/MM/YY): ");
        String tanggal = input.readLine();
        System.out.print("Nama Pemesan          : ");
        String fan = input.readLine();      
        System.out.print("Alamat Pemesan        : ");    
        String alamat = input.readLine();  
        System.out.print("Email Pemesan         : ");  
        String email = input.readLine(); 
        String kategori = "Group Band";
        jenisBand();
        System.out.print("Group Band            : ");
        String nama = input.readLine();
        System.out.print("Album                 : ");
        String album = input.readLine();
        System.out.print("Jumlah Album          : ");
        int jAlbum = Integer.parseInt(input.readLine());
        System.out.print("Jumlah Lightstick     : ");
        int lightstick = Integer.parseInt(input.readLine());
        System.out.print("PC All Members        : ");
        int pc = Integer.parseInt(input.readLine());
        System.out.print("PC Bias (Nama)        : ");
        String pc_member = input.readLine();
        System.out.print("Jumlah PC Bias        : ");
        int pcBias = Integer.parseInt(input.readLine());
        
        Groupband newGroup = new Groupband(pc_member, fan, alamat, email, tanggal, pcBias, kategori, nama, album, jAlbum, lightstick, pc);
        newGroup.done(fan);
        newGroup.info();
        dataGroup.add(newGroup);
        
    }
        
    static void addSolo() throws IOException{
        System.out.println("\n+------------------------------------+");
        System.out.println("|           Tambah Pesanan           |");
        System.out.println("|          Solo Merchandise          |");
        System.out.println("+------------------------------------+");
        System.out.print("\nTanggal Pemesanan (DD/MM/YY): ");
        String tanggal = input.readLine();
        System.out.print("Nama Pemesan          : ");
        String fan = input.readLine();      
        System.out.print("Alamat Pemesan        : ");    
        String alamat = input.readLine();  
        System.out.print("Email Pemesan         : ");
        String kategori = "Soloist";
        String email = input.readLine(); 
        System.out.print("Soloist               : ");
        String nama = input.readLine();
        System.out.print("Member of             : ");
        String group = input.readLine();
        System.out.print("Solo Album            : ");
        String album = input.readLine();
        System.out.print("Jumlah Album          : ");
        int jAlbum = Integer.parseInt(input.readLine());
        System.out.print("Jumlah Lightstick     : ");
        int lightstick = Integer.parseInt(input.readLine());
        System.out.print("Jumlah Photocards     : ");
        int pc = Integer.parseInt(input.readLine());
        
        Solo newSolo = new Solo(group, fan, alamat, email, tanggal, kategori, nama, album, jAlbum, lightstick, pc);
        newSolo.done(fan);
        newSolo.info();
        dataSolo.add(newSolo);
        
    }
        
    static void showOrder()throws IOException {
        System.out.println("\n+------------------------------------+");
        System.out.println("|            Lihat Pesanan           |");
        System.out.println("+------------------------------------+");
        System.out.println("| Kategori:                          |");
        System.out.println("| [1] Group Band                     |");
        System.out.println("| [2] Solo                           |");
        System.out.println("| [9] Kembali                        |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Kategori : ");
                    
        int tipe = Integer.parseInt(input.readLine());
        
        switch(tipe){
            case 1 -> showGroup();
            case 2 -> showSolo();
            case 9 -> menu();
            default -> System.out.println("\nMenu tidak tersedia!\n"); 
        }
        
    }
    
    static void showGroup()throws IOException {
        if(dataGroup.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|            Lihat Pesanan           |");
            System.out.println("|       Group Band Merchandise       |");
            System.out.println("+------------------------------------+");
            for(int i = 0; i < dataGroup.size(); i++){
                System.out.println("\nPesanan ke-" + (i + 1));
                dataGroup.get(i).tampil();
                dataGroup.get(i).total(i);
            }
        }
        
    }
    
    static void showSolo()throws IOException {
        if(dataSolo.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|            Lihat Pesanan           |");
            System.out.println("|          Solo Merchandise          |");
            System.out.println("+------------------------------------+");
            for(int i = 0; i < dataSolo.size(); i++){
                System.out.println("\nPesanan ke-" + (i + 1));
                dataSolo.get(i).tampil();
                dataSolo.get(i).total(i);
            }
        }
        
    }
    
    static void updateOrder() throws IOException{
        System.out.println("\n+------------------------------------+");
        System.out.println("|           Update Pesanan           |");
        System.out.println("+------------------------------------+");
        System.out.println("| Kategori:                          |");
        System.out.println("| [1] Group Band                     |");
        System.out.println("| [2] Solo                           |");
        System.out.println("| [9] Kembali                        |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Kategori : ");
                    
        int tipe = Integer.parseInt(input.readLine());
        
        switch(tipe){
            case 1 -> updateGroup();
            case 2 -> updateSolo();
            case 9 -> menu();
            default -> System.out.println("\nMenu tidak tersedia!\n"); 
        }
        
    }
    
    static void updateGroup() throws IOException {
        if(dataGroup.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|           Update Pesanan           |");
            System.out.println("|       Group Band Merchandise       |");
            System.out.println("+------------------------------------+");
            System.out.print("\nInput nama pemesan : ");
            String edit = input.readLine();
            for (Groupband group : dataGroup) {
                if (group.getFan().equals(edit)) {
                    System.out.print("\nTanggal Pemesanan (DD/MM/YY): ");
                    group.setTanggal(input.readLine());
                    System.out.print("Nama Pemesan          : ");
                    group.setFan(input.readLine());
                    System.out.print("Alamat Pemesan        : ");    
                    group.setAlamat(input.readLine());
                    System.out.print("Email Pemesan         : ");  
                    group.setEmail(input.readLine());
                    jenisBand();
                    System.out.print("Group Band            : ");
                    group.setNama(input.readLine());
                    System.out.print("Album                 : ");
                    group.setAlbum(input.readLine());
                    System.out.print("Jumlah Album          : ");
                    group.setjAlbum(Integer.parseInt(input.readLine()));
                    System.out.print("Jumlah Lightstick     : ");
                    group.setLightstick(Integer.parseInt(input.readLine()));
                    System.out.print("PC All Members        : ");
                    group.setPc(Integer.parseInt(input.readLine()));
                    System.out.print("PC Bias (Nama)        : ");
                    group.setPc_member(input.readLine());
                    System.out.print("Jumlah PC Bias        : ");
                    group.setPcBias(Integer.parseInt(input.readLine()));
                    
                    System.out.println("\nData telah diperbarui.\n");
                    break;
                }
                else{
                    System.out.println("\nMaaf, data tidak ditemukan!\n");
                    updateOrder();
                }
            }
        }
        
    }
    
    static void updateSolo() throws IOException {
        if(dataSolo.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|           Update Pesanan           |");
            System.out.println("|          Solo Merchandise          |");
            System.out.println("+------------------------------------+");
            System.out.print("\nInput nama pemesan : ");
            String edit = input.readLine();
            for (Solo solo : dataSolo) {
                if (solo.getFan().equals(edit)) {
                    System.out.print("\nTanggal Pemesanan (DD/MM/YY): ");
                    solo.setTanggal(input.readLine());
                    System.out.print("Nama Pemesan      : ");
                    solo.setFan(input.readLine());
                    System.out.print("Alamat Pemesan    : ");
                    solo.setAlamat(input.readLine());
                    System.out.print("Email Pemesan     : ");
                    solo.setEmail(input.readLine());
                    System.out.print("Soloist           : ");
                    solo.setNama(input.readLine());
                    System.out.print("Member of         : ");
                    solo.setGroup(input.readLine());
                    System.out.print("Solo Album        : ");
                    solo.setAlbum(input.readLine());
                    System.out.print("Jumlah Album      : ");
                    solo.setjAlbum(Integer.parseInt(input.readLine()));
                    System.out.print("Lightstick        : ");
                    solo.setLightstick(Integer.parseInt(input.readLine()));
                    System.out.print("Photocards        : ");
                    solo.setPc(Integer.parseInt(input.readLine()));
                
                    System.out.println("\nData telah diperbarui.\n");
                    break;
                }
                else{
                    System.out.println("\nMaaf, data tidak ditemukan!\n");
                    updateOrder();
                }
            }
        }
        
    }
    
    static void deleteOrder() throws IOException{
        System.out.println("\n+------------------------------------+");
        System.out.println("|            Hapus Pesanan           |");
        System.out.println("+------------------------------------+");
        System.out.println("| Kategori:                          |");
        System.out.println("| [1] Group Band                     |");
        System.out.println("| [2] Solo                           |");
        System.out.println("| [9] Kembali                        |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Kategori : ");
                    
        int tipe = Integer.parseInt(input.readLine());
        
        switch(tipe){
            case 1 -> deleteGroup();
            case 2 -> deleteSolo();
            case 9 -> menu();
            default -> System.out.println("\nMenu tidak tersedia!\n"); 
        }
        
    }
    
    static void deleteGroup() throws IOException{
        if(dataGroup.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|            Hapus Pesanan           |");
            System.out.println("|       Group Band Merchandise       |");
            System.out.println("+------------------------------------+");
            System.out.print("\nInput nama pemesan : ");
            String fan = input.readLine();
            for (int i = 0; i < dataGroup.size(); i++) {
                if (dataGroup.get(i).getFan().equals(fan)) {
                    dataGroup.remove(i);
                    System.out.println("\nData berhasil dihapus\n");
                    break;
                }
                else{
                    System.out.println("\nMaaf, data tidak ditemukan!\n");
                    deleteGroup();
                }
            }   
        }
        
    }
    
    static void deleteSolo() throws IOException{
        if(dataSolo.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|            Hapus Pesanan           |");
            System.out.println("|          Solo Merchandise          |");
            System.out.println("+------------------------------------+");
            System.out.print("\nInput nama pemesan : ");
            String fan = input.readLine();
            for (int i = 0; i < dataSolo.size(); i++) {
                if (dataSolo.get(i).getFan().equals(fan)) {
                    dataSolo.remove(i);
                    System.out.println("\nData berhasil dihapus\n");
                    break;
                }
                else{
                    System.out.println("\nMaaf, data tidak ditemukan!\n");
                    deleteSolo();
                }
            }   
        }
        
    }
    
    static void keluar() {
        System.out.println("\nThank You. Bye~\n");
        System.exit(0);
        
    }
    
    public static void main(String[] args) throws IOException{

        while(true){
            menu();
        }
        
    }
}
