package Posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    
    static ArrayList<MilkTea> dataMilktea     = new ArrayList<>();
    static ArrayList<TeaPresso> dataTeapresso = new ArrayList<>();
    static ArrayList<Smoothies> dataSmoothies = new ArrayList<>();
    static ArrayList<TeaRRIFIC> dataTearrific = new ArrayList<>();
        
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int pilihan;
       
        //Author
        System.out.println("Nama    : Nurulfiqri Istiqamah Tahir");
        System.out.println("Nim     : 2009106083"); 
        System.out.println("Kelas   : Informatika B 2020"
        ); 
        
        while (true) {
            awal:
            System.out.println("\n=============================================");
            System.out.println("|                   Menu                    |");
            System.out.println("=============================================");
            System.out.println("| 1. Input data                             |");
            System.out.println("| 2. Tampilkan data                         |");
            System.out.println("| 3. Edit data                              |");
            System.out.println("| 4. Hapus data                             |");
            System.out.println("| 0. Exit                                   |");
            System.out.println("=============================================");
            System.out.print("| Masukkan pilihan (0-4): ");
            int menu = Integer.parseInt(input.readLine());
            System.out.println("=============================================\n");

            switch (menu) {
                case 1:
                    System.out.println("=============================================");
                    System.out.println("|                Input Data                 |");
                    System.out.println("=============================================");
                    System.out.println("| 1. MilkTea                                |");
                    System.out.println("| 2. TeaPresso                              |");
                    System.out.println("| 3. Smoothies                              |");
                    System.out.println("| 4. TeaRRIFIC                              |");
                    System.out.println("=============================================");
                    System.out.print("Masukan pilihan (1-4) : ");
                    pilihan = Integer.parseInt(input.readLine());
                    System.out.println("=============================================");
                    if (pilihan == 1) {
                        BuatMilkTea();
                        break;
                    } 
                    if (pilihan == 2) {
                        BuatTeaPresso();
                        break;
                    } 
                    if (pilihan == 3) {
                        BuatSmoothies();
                        break;
                    } 
                    if (pilihan == 4) {
                        BuatTeaRRIFIC();
                        break;
                    }
                    else {
                        System.out.println(" Pilihan 0-4 !!!");
                    }
                    break;
                case 2:
                    System.out.println("=============================================");
                    System.out.println("|                Semua Menu                 |");
                    System.out.println("=============================================");
                    System.out.println("| 1. MilkTea                                |");
                    System.out.println("| 2. TeaPresso                              |");
                    System.out.println("| 3. Smoothies                              |");
                    System.out.println("| 4. TeaRRIFIC                              |");
                    System.out.println("=============================================");
                    System.out.print("Masukan pilihan (1-4) : ");
                    pilihan = Integer.parseInt(input.readLine());
                    System.out.println("=============================================");
                    
                    if (pilihan == 1) {
                        TampilMilkTea();
                        break;
                    } 
                    if (pilihan == 2) {
                        TampilTeaPresso();
                        break;
                    } 
                    if (pilihan == 3) {
                        TampilSmoothies();
                        break;
                    } 
                    if (pilihan == 4) {
                        TampilTeaRRIFIC();
                        break;
                    } 
                    else {
                        System.out.println(" Pilihan 1-4 !!!");
                    }
                    break;
                case 3:
                    System.out.println("=============================================");
                    System.out.println("|                 Edit Data                 |");
                    System.out.println("=============================================");
                    System.out.println("| 1. MilkTea                                |");
                    System.out.println("| 2. TeaPresso                              |");
                    System.out.println("| 3. Smoothies                              |");
                    System.out.println("| 4. TeaRRIFIC                              |");
                    System.out.println("=============================================");
                    System.out.print("Masukan pilihan (1-4) : ");
                    pilihan = Integer.parseInt(input.readLine());
                    System.out.println("=============================================");
                    
                    if (pilihan == 1) {
                        TampilMilkTea();
                        EditMilkTea();
                        break;
                    } 
                    if (pilihan == 2) {
                        TampilTeaPresso();
                        EditTeaPresso();
                        break;
                    } 
                    if (pilihan == 3) {
                        TampilSmoothies();
                        EditSmoothies();
                        break;
                    } 
                    if (pilihan == 4) {
                        TampilTeaRRIFIC();
                        EditTeaRRIFIC();
                        break;
                    }
                    else {
                        System.out.println(" Pilihan 1-4 !!!");
                    }
                    break;
                case 4:
                    System.out.println("=============================================");
                    System.out.println("|                Hapus Data                 |");
                    System.out.println("=============================================");
                    System.out.println("| 1. MilkTea                                |");
                    System.out.println("| 2. TeaPresso                              |");
                    System.out.println("| 3. Smoothies                              |");
                    System.out.println("| 4. TeaRRIFIC                              |");
                    System.out.println("=============================================");
                    System.out.print("Masukan pilihan (1-4) : ");
                    pilihan = Integer.parseInt(input.readLine());
                    System.out.println("=============================================");
                    
                    if (pilihan == 1) {
                        TampilMilkTea();
                        HapusMilkTea();
                        break;
                    } 
                    if (pilihan == 2) {
                        TampilTeaPresso();
                        HapusTeaPresso();
                        break;
                    } 
                    if (pilihan == 3) {
                        TampilSmoothies();
                        HapusSmoothies();
                        break;
                    } 
                    if (pilihan == 4) {
                        TampilTeaRRIFIC();
                        HapusTeaRRIFIC();
                        break;
                    } 
                    else {
                        System.out.println(" Pilihan 1-4 !!!");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println(" Pilihan 0-4 !!!");
                    break;
            }
        }
    }
    
    public static void BuatMilkTea()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=============================================");
        System.out.println("|              Input MilkTea                |");
        System.out.println("=============================================");
        System.out.print("| ID menu     : ");
        String ID    = input.readLine();
        System.out.print("| Seri menu   : ");
        String Seri   = input.readLine();
        System.out.print("| Nama menu   : ");
        String Nama   = input.readLine();
        System.out.print("| Regular     : ");
        int Regular      = Integer.parseInt(input.readLine());
        System.out.print("| Large       : ");
        int Large      = Integer.parseInt(input.readLine());
        System.out.println("=============================================");
                        
        dataMilktea.add(new MilkTea(ID, Seri, Nama, Regular, Large));
    }
    public static void BuatTeaPresso()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=============================================");
        System.out.println("|              Input TePresso               |");
        System.out.println("=============================================");
        System.out.print("| ID menu     : ");
        String ID    = input.readLine();
        System.out.print("| Seri menu   : ");
        String Seri   = input.readLine();
        System.out.print("| Nama menu   : ");
        String Nama   = input.readLine();
        System.out.print("| Regular     : ");
        int Regular      = Integer.parseInt(input.readLine());
        System.out.print("| Large       : ");
        int Large      = Integer.parseInt(input.readLine());
        System.out.println("=============================================");
                        
        dataTeapresso.add(new TeaPresso(ID, Seri, Nama, Regular, Large));
    }
    public static void BuatSmoothies()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=============================================");
        System.out.println("|             Input Smoothies               |");
        System.out.println("=============================================");
        System.out.print("| ID menu     : ");
        String ID    = input.readLine();
        System.out.print("| Seri menu   : ");
        String Seri   = input.readLine();
        System.out.print("| Nama menu   : ");
        String Nama   = input.readLine();
        System.out.print("| Regular     : ");
        int Regular      = Integer.parseInt(input.readLine());
        System.out.print("| Large       : ");
        int Large      = Integer.parseInt(input.readLine());
        System.out.println("=============================================");
                        
        dataSmoothies.add(new Smoothies(ID, Seri, Nama, Regular, Large));
    }
    public static void BuatTeaRRIFIC()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=============================================");
        System.out.println("|             Input TeaRRIFIC               |");
        System.out.println("=============================================");
        System.out.print("| ID menu     : ");
        String ID    = input.readLine();
        System.out.print("| Seri menu   : ");
        String Seri   = input.readLine();
        System.out.print("| Nama menu   : ");
        String Nama   = input.readLine();
        System.out.print("| Regular     : ");
        int Regular      = Integer.parseInt(input.readLine());
        System.out.print("| Large       : ");
        int Large      = Integer.parseInt(input.readLine());
        System.out.println("=============================================");
                        
        dataTearrific.add(new TeaRRIFIC(ID, Seri, Nama, Regular, Large));
    }
  public static void TampilMilkTea()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|            Semua Menu MilkTea             |");
        System.out.println("=============================================");
        for (int i = 0; i < dataMilktea.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataMilktea.get(i).tampil();
        }
    }
    public static void TampilTeaPresso()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|           Semua Menu TeaPresso            |");
        System.out.println("=============================================");
        for (int i = 0; i < dataTeapresso.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataTeapresso.get(i).tampil();
        }
    }
    public static void TampilSmoothies()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|           Semua Menu Smoothies            |");
        System.out.println("=============================================");
        for (int i = 0; i < dataSmoothies.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataSmoothies.get(i).tampil();
        }
    }
    public static void TampilTeaRRIFIC()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|            Semua Menu TeaRRIFIC             |");
        System.out.println("=============================================");
        for (int i = 0; i < dataTearrific.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataTearrific.get(i).tampil();
        }
    }
    
    public static void EditMilkTea()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n=============================================");
        System.out.println("|               Update MilkTea              |");
        System.out.println("=============================================");
        System.out.print("Masukan ID menu : ");
        String id = input.readLine();
        System.out.println("=============================================");    
        for (MilkTea i : dataMilktea) {
            if (i.getID().equals(id)) {
                System.out.print("| ID menu     : ");
                i.setID(input.readLine());
                System.out.print("| Seri menu   : ");
                i.setSeri(input.readLine());
                System.out.print("| Nama menu   : ");
                i.setNama(input.readLine());
                System.out.print("| Regular     : ");
                i.setRegular(Integer.parseInt(input.readLine()));
                System.out.print("| Large       : ");
                i.setLarge(Integer.parseInt(input.readLine()));
                System.out.println("=============================================");
            }
        }
    }
    public static void EditTeaPresso()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n=============================================");
        System.out.println("|              Update TeaPresso             |");
        System.out.println("=============================================");
        System.out.print("Masukan ID menu : ");
        String id = input.readLine();
        System.out.println("=============================================");    
        for (TeaPresso i : dataTeapresso) {
            if (i.getID().equals(id)) {
                System.out.print("| ID menu     : ");
                i.setID(input.readLine());
                System.out.print("| Seri menu   : ");
                i.setSeri(input.readLine());
                System.out.print("| Nama menu   : ");
                i.setNama(input.readLine());
                System.out.print("| Regular     : ");
                i.setRegular(Integer.parseInt(input.readLine()));
                System.out.print("| Large       : ");
                i.setLarge(Integer.parseInt(input.readLine()));
                System.out.println("=============================================");
            }
        }
    }
    public static void EditSmoothies()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n=============================================");
        System.out.println("|               Update Smoothies              |");
        System.out.println("=============================================");
        System.out.print("Masukan ID menu : ");    
        String id = input.readLine();
        System.out.println("=============================================");
        for (Smoothies i : dataSmoothies) {
            if (i.getID().equals(id)) {
                System.out.print("| ID menu     : ");
                i.setID(input.readLine());
                System.out.print("| Seri menu   : ");
                i.setSeri(input.readLine());
                System.out.print("| Nama menu   : ");
                i.setNama(input.readLine());
                System.out.print("| Regular     : ");
                i.setRegular(Integer.parseInt(input.readLine()));
                System.out.print("| Large       : ");
                i.setLarge(Integer.parseInt(input.readLine()));
                System.out.println("=============================================");
            }
        }
    }
    public static void EditTeaRRIFIC()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n=============================================");
        System.out.println("|               Update TeaRRIFIC              |");
        System.out.println("=============================================");
        System.out.print("Masukan ID menu : ");    
        String id = input.readLine();
        System.out.println("=============================================");    
        for (TeaRRIFIC i : dataTearrific) {
            if (i.getID().equals(id)) {
                System.out.print("| ID menu     : ");
                i.setID(input.readLine());
                System.out.print("| Seri menu   : ");
                i.setSeri(input.readLine());
                System.out.print("| Nama menu   : ");
                i.setNama(input.readLine());
                System.out.print("| Regular     : ");
                i.setRegular(Integer.parseInt(input.readLine()));
                System.out.print("| Large       : ");
                i.setLarge(Integer.parseInt(input.readLine()));
                System.out.println("=============================================");
            }
        }
    }
    
    public static void HapusMilkTea()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n=============================================");
        System.out.println("|              Delete MilkTea               |");
        System.out.println("=============================================");
        System.out.print("| Masukan ID menu: ");
        String id = input.readLine();
        System.out.println("=============================================");
        for (int i = 0; i < dataMilktea.size(); i++) {
            if (dataMilktea.get(i).getID().equals(id)){
            dataMilktea.remove(i);
            }
        }
    }
    public static void HapusTeaPresso()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n=============================================");
        System.out.println("|              Delete TeaPresso               |");
        System.out.println("=============================================");
        System.out.print("| Masukan ID menu: ");
        String id = input.readLine();
        System.out.println("=============================================");
        for (int i = 0; i < dataTeapresso.size(); i++) {
            if (dataTeapresso.get(i).getID().equals(id)){
            dataTeapresso.remove(i);
            }
        }
    }
    public static void HapusSmoothies()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n=============================================");
        System.out.println("|              Delete Smoothies               |");
        System.out.println("=============================================");
        System.out.print("| Masukan ID menu: ");
        String id = input.readLine();
        System.out.println("=============================================");
        for (int i = 0; i < dataSmoothies.size(); i++) {
            if (dataSmoothies.get(i).getID().equals(id)){
            dataSmoothies.remove(i);
            }
        }
    }
    public static void HapusTeaRRIFIC()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n=============================================");
        System.out.println("|              Delete TeaRRIFIC               |");
        System.out.println("=============================================");
        System.out.print("| Masukan ID menu: ");
        String id = input.readLine();
        System.out.println("=============================================");
        for (int i = 0; i < dataTearrific.size(); i++) {
            if (dataTearrific.get(i).getID().equals(id)){
            dataTearrific.remove(i);
            }
        }
    }
}