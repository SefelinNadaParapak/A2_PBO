/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static ArrayList<Pembayaran> riwayat = new ArrayList<Pembayaran>();
    public static void main(String[] args) throws IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Pembayaran> dataPembayaran = new ArrayList<>();
        while (true) {
            System.out.println("");
            System.out.println("========== Menu ==========");
            System.out.println("1. Tambah Pembayaran");
            System.out.println("2. Lihat Pembayaran");
            System.out.println("3. Mengubah Pembayaran");
            System.out.println("4. Menghapus Pembayaran");
            System.out.println("5. Keluar Program");
            System.out.println("==========================");
            System.out.println("");
            System.out.print("Pilih Menu : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu){
                case 1:
                    System.out.println("");
                    System.out.print("Menambah Pembayaran");
                    System.out.print("");
                    System.out.print("Nama Pemilik : ");
                    String nama = input.readLine();
                    System.out.print("Nomor Telepon : ");
                    String notelp = input.readLine();
                    System.out.print("Rekening : ");
                    int rekening = Integer.parseInt(input.readLine());
                    System.out.print("Status Pembayaran : ");
                    String status = input.readLine();
                    Pembayaran databaru = new Pembayaran(nama, status, notelp, rekening);
                    dataPembayaran.add(databaru);
                    System.out.println("");
                    databaru.info_nambah();
                    break;
                case 2:
                    System.out.println("");
                    for (int i = 0; i<dataPembayaran.size(); i++){
                        System.out.println("Pembayaran Ke- " + (i + 1));
                        dataPembayaran.get(i).display();
                    }
                    break;
                case 3:
                    System.out.println("");
                    for (int i = 0; i<dataPembayaran.size(); i++){
                        System.out.println("Pembayaran Ke- " + (i + 1));
                        dataPembayaran.get(i).display();
                    }
                    System.out.println("");
                    System.out.print("Masukkan Nama Pembayaran : ");
                    String nama_up = input.readLine();
                    for (Pembayaran pembayaran : dataPembayaran){
                        if (pembayaran.nama.equals(nama_up)){
                            System.out.print("Masukkan Nama : ");
                            pembayaran.setNama(input.readLine());
                            System.out.print("Masukkan Nomor Telepon : ");
                            pembayaran.setNotelp(input.readLine());
                            System.out.print("Masukkan Rekening : ");
                            pembayaran.setRekening(Integer.parseInt(input.readLine()));
                            System.out.print("Masukkan Status Pembayaran : ");
                            pembayaran.setStatus(input.readLine());
                        }
                        pembayaran.info_update();
                    }
                    break;
                case 4:
                    System.out.println("");
                    for (int i = 0; i<dataPembayaran.size(); i++){
                        System.out.println("Pembayaran Ke- " + (i + 1));
                        dataPembayaran.get(i).display();
                    }
                    System.out.println("");
                    System.out.print("Masukkan Nama Yang Ingin Dihapus : ");
                    String nama_del = input.readLine();
                    for (int i = 0; i < dataPembayaran.size(); i++){
                        if (dataPembayaran.get(i).nama.equals(nama_del)){
                            dataPembayaran.remove(i);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
        }
    }

}
