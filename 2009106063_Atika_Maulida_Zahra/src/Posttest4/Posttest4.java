package Posttest4;
import java.util.ArrayList;
import java.util.Scanner;

public class Posttest4 {
    public static void main(String[] args) {
        ArrayList<Makanan> delivery = new ArrayList<Makanan>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        while (true) {
            System.out.println("\n================================");
            System.out.println("Pelayanan Delivery Makanan");
            System.out.println("================================");
            System.out.println("1. Buat Pesanan                 ");
            System.out.println("2. Membaca Pesanan              ");
            System.out.println("3. Update Pesanan               ");
            System.out.println("4. Hapus Pesanan                ");
            System.out.println("5. Setter & Getter              ");
            System.out.println("6. Inheritance & Polymorphism   ");
            System.out.println("7. Exit                         ");
            System.out.print("Masukkan pilihan menu : ");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                    System.out.print("Nama                  : ");
                    String nama = input.next();
                    System.out.print("Alamat                : ");
                    String alamat = input.next();
                    System.out.print("Restoran              : ");
                    String restoran = input.next();
                    System.out.print("Makanan Yang Dipesan  : ");
                    String pesan = input.next();
                    System.out.print("Jumlah Makanan        : ");
                    int jumlah = input.nextInt();
                    System.out.print("Total + Ongkir        : ");
                    int total = input.nextInt();
                    System.out.print("Metode Pembayaran     : ");
                    String bayar = input.next();
                    
                    System.out.print("\nMakananmu Berhasil Dipesan!!!\n");
                    delivery.add(new Makanan(nama, alamat, restoran, pesan, jumlah, total, bayar));
                    break;
                    
                case 2:
                    if(delivery.isEmpty()) {
                        System.out.println("\nTidak Ada Pesanan!!!");
                        break;
                    }
                    else {
                        for(int i=0; i<delivery.size(); i++){
                        System.out.println("\n==========================================");
                        System.out.println("        DAFTAR PESANAN  - " + (i +1));
                        System.out.println("==========================================");
                        delivery.get(i).display();
                        System.out.println("==========================================\n");
                        }
                        break;
                    }
                
                case 3:
                    System.out.print("Masukkan Nama Restoran : ");
                    String namaRestoran = input.next();
                    for (Makanan makanan : delivery) {
                        if (makanan.getRestoran().equals(namaRestoran)) {
                            System.out.print("Masukkan Nama                 : ");
                            makanan.setNama(input.next());
                            System.out.print("Masukkan Alamat               : ");
                            makanan.setAlamat(input.next());
                            System.out.print("Masukkan Restoran             : ");
                            makanan.setRestoran(input.next());
                            System.out.print("Masukkan Makanan Yang Dipesan : ");
                            makanan.setPesan(input.next());
                            System.out.print("Masukkan Jumlah Makanan       : ");
                            makanan.setJumlah(input.nextInt());
                            System.out.print("Total + Ongkir                : ");
                            makanan.setTotal(input.nextInt());
                            System.out.print("Metode Pembayaran             : ");
                            makanan.setBayar(input.next());
                            break;
                        }
                    }
                    break;
                
                case 4:
                    System.out.print("Masukkan Nama Restoran : ");
                    String NamaRestoran = input.next();
                    for (int i = 0; i < delivery.size(); i++) {
                        if (delivery.get(i).getRestoran().equals(NamaRestoran)) {
                            delivery.remove(i);
                            break;
                        }
                    }
                    System.out.println("\nPesanan Berhasil Dihapus!!!\n");
                    break;
                
                case 5:
                    Makanan Andi = new Makanan();
                    Makanan Andika = new Makanan();
                    
                    Andi.setNama("Andi");
                    Andi.setAlamat("Sempaja Selatan No.17");
                    Andi.setRestoran("Burger King");
                    Andi.setPesan("Burger");
                    Andi.setJumlah(5);
                    Andi.setTotal(120000);
                    Andi.setBayar("Cash");
                    System.out.println("=====================================");
                    Andika.setNama("Andika");
                    Andika.setAlamat("Sempaja Barat N0.7");
                    Andika.setRestoran("Ayam Gepuk Mba Wanda");
                    Andika.setPesan("Ayam Gepuk");
                    Andika.setJumlah(4);
                    Andika.setTotal(70000);
                    Andika.setBayar("OVO");

                    System.out.println(Andi.getNama());
                    System.out.println(Andi.getAlamat());
                    System.out.println(Andi.getRestoran());
                    System.out.println(Andi.getPesan());
                    System.out.println(Andi.getJumlah());
                    System.out.println(Andi.getTotal());
                    System.out.println(Andi.getBayar());
                    System.out.println("=====================================");
                    System.out.println(Andika.getNama());
                    System.out.println(Andika.getAlamat());
                    System.out.println(Andika.getRestoran());
                    System.out.println(Andika.getPesan());
                    System.out.println(Andika.getJumlah());
                    System.out.println(Andika.getTotal());
                    System.out.println(Andika.getBayar());
                    
                    System.out.println("=====================================");
                    System.out.print("Andi, ");
                    Andi.Antar();
                    System.out.print("Andika, ");
                    Andika.Tidak();
                    break;
                    
                case 6:
                    Makanan dataMakanan = new Makanan("Bila", "Gelatik", "Waroeng Steak", "Steak Daging", 1, 75000, "OVO");
                    Ayam dataAyam = new Ayam("Geprek", "Nabil", "Sempaja Ujung", "Salby", "Ayam", 2, 30000, "Cash");
                    Nasi dataNasi = new Nasi("Pecel", "Nabila", "Lempake", "Pecel Family", "Nasi", 3, 50000, "GoPay");
                    
                    System.out.println("");
                    System.out.println("=====================================");
                    System.out.print("Status Pesanan : ");
                    dataMakanan.Berhasil();
                    System.out.println("Detail Pesanan : ");
                    System.out.println("Nama                    : " + dataMakanan.nama);
                    System.out.println("Alamat                  : " + dataMakanan.alamat);
                    System.out.println("Restoran                : " + dataMakanan.restoran);
                    System.out.println("Makanan Yang Dipesan    : " + dataMakanan.pesan);
                    System.out.println("Jumlah Makanan          : " + dataMakanan.jumlah);
                    System.out.println("Total + Ongkir          : " + dataMakanan.total);
                    System.out.println("Metode Pembayaran       : " + dataMakanan.bayar);
                    System.out.println("=====================================");
                    System.out.print("Status Pesanan : ");
                    dataAyam.Berhasil();
                    System.out.println("Detail Pesanan : ");
                    System.out.println("Jenis Ayam              : " + dataAyam.jenisAyam);
                    System.out.println("Nama                    : " + dataAyam.nama);
                    System.out.println("Alamat                  : " + dataAyam.alamat);
                    System.out.println("Restoran                : " + dataAyam.restoran);
                    System.out.println("Makanan Yang Dipesan    : " + dataAyam.pesan);
                    System.out.println("Jumlah Makanan          : " + dataAyam.jumlah);
                    System.out.println("Total + Ongkir          : " + dataAyam.total);
                    System.out.println("Metode Pembayaran       : " + dataAyam.bayar);
                    System.out.println("=====================================");
                    System.out.print("Status Pesanan : ");
                    dataNasi.Berhasil();
                    System.out.println("Detail Pesanan : ");
                    System.out.println("Jenis Nasi              : " + dataNasi.jenisNasi);
                    System.out.println("Nama                    : " + dataNasi.nama);
                    System.out.println("Alamat                  : " + dataNasi.alamat);
                    System.out.println("Restoran                : " + dataNasi.restoran);
                    System.out.println("Makanan Yang Dipesan    : " + dataNasi.pesan);
                    System.out.println("Jumlah Makanan          : " + dataNasi.jumlah);
                    System.out.println("Total + Ongkir          : " + dataNasi.total);
                    System.out.println("Metode Pembayaran       : " + dataNasi.bayar);
                    System.out.println("=====================================");
                    System.out.println("Ada voucher nih untuk kamu untuk pembelian berikutnya");
                    Makanan Diskon = new Makanan();
                    System.out.println("Minimal pembelian Rp45000 kamu dapat potongan sebesar Rp"+ Diskon.diskon(15000));
                    System.out.println("Minimal pembelian Rp80000 kamu dapat potongan sebesar Rp" + Diskon.diskon(15000, 5000));
                    System.out.println("Minimal pembelian Rp150000 kamu dapat potongan sebesar Rp" + Diskon.diskon(15000, 5000, 5000));
                    break;

                case 7:
                    System.out.println("\nAnda telah keluar dari program\n");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nAnda salah pilih menu!!!");
                    break;
            }
        }
    }
}
