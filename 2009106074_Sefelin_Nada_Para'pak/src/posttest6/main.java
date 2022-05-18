package posttest6;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    
    public class main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        implementasi impln = new implementasi();
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<nomorurut1> datanomorurut1 = new ArrayList<>();
        ArrayList<nomorurut2> datanomorurut2 = new ArrayList<>();
        ArrayList<nomorurut3> datanomorurut3 = new ArrayList<>();
        int pilihan;
        String namacalonkepaladaerah;
         
        while (true) {   
        System.out.println("||************ MENU ************||");
        System.out.println("||1.Mengisi data      **********||");
        System.out.println("||2.Melihat data      **********||");
        System.out.println("||3.Merubah data      **********||");
        System.out.println("||4.Menghapus data    **********||");
        System.out.println("||5.Exit              **********||");
        System.out.println("||******************************||");
            System.out.print("Input Menu : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1:
                    System.out.println("1. nomorurut1");
                    System.out.println("2. nomorurut2");
                    System.out.println("3. nomorurut3");
                    System.out.print("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.print("Masukan namacalonkepaladaerah : ");
                        namacalonkepaladaerah = input.readLine();
                        System.out.print("Masukan namacalonwakil : ");
                        String namacalonwakil = input.readLine();
                        System.out.print("Masukan nomorurut : ");
                        String nomorurut = input.readLine();
                        System.out.print("Masukan partai : ");
                        String partai = input.readLine();
                        datanomorurut1.add(new nomorurut1(namacalonkepaladaerah, namacalonwakil, nomorurut, partai));
                        impln.masukkan();
                    } 
                    if (pilihan == 2) {
                        System.out.print("Masukan namacalonkepaladaerah : ");
                        namacalonkepaladaerah = input.readLine();
                        System.out.print("Masukan namacalonwakil : ");
                        String namacalonwakil = input.readLine();
                        System.out.print("Masukan nomorurut : ");
                        String nomorurut = input.readLine();
                        System.out.print("Masukan partai : ");
                        String partai = input.readLine();
                        datanomorurut2.add(new nomorurut2(namacalonkepaladaerah, namacalonwakil, nomorurut, partai));
                        impln.masukkan();
                    } if (pilihan == 3) {
                        System.out.print("Masukan namacalonkepaladaerah : ");
                        namacalonkepaladaerah = input.readLine();
                        System.out.print("Masukan namacalonwakil : ");
                        String namacalonwakil = input.readLine();
                        System.out.print("Masukan nomorurut : ");
                        String nomorurut = input.readLine();
                        System.out.print("Masukan partai : ");
                        String partai = input.readLine();
                        datanomorurut3.add(new nomorurut3(namacalonkepaladaerah, namacalonwakil, nomorurut, partai));
                        impln.masukkan();
                    } 
                    
                    break;
                case 2:
                    System.out.println("1. nomorurut1 dengan jumlah suara : "+account.jumlah_suara_norut1);
                    System.out.println("2. nomorurut2 dengan jumlah suara : "+account.jumlah_suara_norut2);
                    System.out.println("3. nomorurut3 dengan jumlah suara : "+account.jumlah_suara_norut3);
                    System.out.print("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        for (int i = 0; i < datanomorurut1.size(); i++) {
                            System.out.println("nomorurut1 ke - " + (i + 1));
                            datanomorurut1.get(i).display();
                        }
                        
                    }
                    
                    if (pilihan == 2) {
                        for (int i = 0; i < datanomorurut2.size(); i++) {
                            System.out.println("nomorurut2 ke - " + (i + 1));
                            datanomorurut2.get(i).display();
                        }
                    } 
                    if (pilihan == 3) {
                        for (int i = 0; i < datanomorurut3.size(); i++) {
                            System.out.println("nomorurut3 ke - " + (i + 1));
                            datanomorurut3.get(i).display();
                        }
                    }
                   
                    break;
                case 3:
                    System.out.println("1. nomorurut1");
                    System.out.println("2. nomorurut2");
                    System.out.println("3. nomorurut3");
                    System.out.print("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.print("Masukan nomorurut1 : ");
                        String norut = input.readLine();
                        for (nomorurut1 i : datanomorurut1) {
                            if (i.getNomorurut().equals(norut)) {
                                System.out.print("Masukan namacalonkepaladaerah baru : ");
                                i.setNamacalonkepaladaerah(input.readLine());
                                System.out.print("Masukan namacalonwakil baru : ");
                                i.setNamacalonwakil(input.readLine());
                                System.out.print("Masukan nomorurut baru : ");
                                i.setNomorurut(input.readLine());
                                System.out.print("Masukan partai baru : ");
                                i.setPartai(input.readLine());
                            }
                        }
                        impln.ubah();
                    }
                    if (pilihan == 2) {
                        System.out.println("Masukan nomorurut2 : ");
                        String norut = input.readLine();
                        for (nomorurut2 i : datanomorurut2) {
                            if (i.getNomorurut().equals(norut)) {
                                System.out.print("Masukan namacalonkepaladaerah baru : ");
                                i.setNamacalonkepaladaerah(input.readLine());
                                System.out.print("Masukan namacalonwakil baru : ");
                                i.setNamacalonwakil(input.readLine());
                                System.out.print("Masukan nomorurut baru : ");
                                i.setNomorurut(input.readLine());
                                System.out.print("Masukan partai baru : ");
                                i.setPartai(input.readLine());
                            }
                        }
                        impln.ubah();
                    } if (pilihan == 3) {
                        System.out.println("Masukan nomorurut3 : ");
                        String norut = input.readLine();
                        for (nomorurut3 i : datanomorurut3) {
                            if (i.getNomorurut().equals(norut)) {
                                System.out.print("Masukan namacalonkepaladaerah baru : ");
                                i.setNamacalonkepaladaerah(input.readLine());
                                System.out.print("Masukan namacalonwakil baru : ");
                                i.setNamacalonwakil(input.readLine());
                                System.out.print("Masukan nomorurut baru : ");
                                i.setNomorurut(input.readLine());
                                System.out.print("Masukan partai baru : ");
                                i.setPartai(input.readLine());
                            }
                        }
                        impln.ubah();
                    }
                    break;
                case 4:
                    System.out.println("1. nomorurut1");
                    System.out.println("2. nomorurut2");
                    System.out.println("3. nomorurut3");
                    System.out.print("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.print("Masukan nomorurut1 : ");
                        String norut = input.readLine();
                        for (int i = 0; i < datanomorurut1.size(); i++) {
                            if (datanomorurut1.get(i).getNomorurut().equals(norut)) {
                                datanomorurut1.remove(i);
                            }
                        }
                        impln.hapus();
                    }
                    
                    if (pilihan == 2) {
                        System.out.println("Masukan nomorurut2 : ");
                        String nourut = input.readLine();
                        for (int i = 0; i < datanomorurut2.size(); i++) {
                            if (datanomorurut2.get(i).getNomorurut().equals(nourut)) {
                                datanomorurut2.remove(i);
                            }
                        }
                        impln.hapus();
                    } if (pilihan == 3) {
                        System.out.println("Masukan nomorurut3 : ");
                        String nomrut = input.readLine();
                        for (int i = 0; i < datanomorurut3.size(); i++) {
                            if (datanomorurut3.get(i).getNomorurut().equals(nomrut)) {
                                datanomorurut3.remove(i);
                            }
                        }
                        impln.hapus();
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}

