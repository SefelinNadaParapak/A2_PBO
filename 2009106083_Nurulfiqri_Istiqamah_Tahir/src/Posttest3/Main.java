package Posttest3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Menu> Menu = new ArrayList<Menu>();
    
    public static void main(String[] args)throws IOException {
        //Author
        System.out.println("Nama    : Nurulfiqri Istiqamah Tahir");
        System.out.println("Nim     : 2009106083"); 
        System.out.println("Kelas   : Informatika B 2020"); 
        
        while (true) {
            menu();
        }
    }
    
    public static void menu()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
        int pilih = Integer.parseInt(br.readLine());
        System.out.println("=============================================\n");
        
        switch(pilih){
            case 1:
                Buat();
                break;
            case 2:
                Tampilkan();
                break;
            case 3:
                Edit();
                break;
            case 4:
                Hapus();
                break;
            case 0:
                System.exit(1);
            default:
                System.out.println(" Pilihan 0-4 !!!");
        }
    }
    public static void Buat()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=============================================");
        System.out.println("|                Input Data                 |");
        System.out.println("=============================================");
        System.out.print("| ID menu     : ");
        String ID    = br.readLine();
        System.out.print("| Seri menu   : ");
        String Seri   = br.readLine();
        System.out.print("| Nama menu   : ");
        String Nama   = br.readLine();
        System.out.print("| Regular     : ");
        int Regular      = Integer.parseInt(br.readLine());
        System.out.print("| Large       : ");
        int Large      = Integer.parseInt(br.readLine());
        System.out.println("=============================================");
        
        Menu membuatmenu    = new Menu(ID, Seri, Nama, Regular, Large);
        Menu.add(membuatmenu);
        
        for (Menu menu : Menu) {
            menu.input();
        }
    }
    public static void Tampilkan()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|                Semua Menu                 |");
        System.out.println("=============================================");
        for (int i = 0; i < Menu.size(); i++){
            System.out.println("| Menu ke-" + (i + 1));
            System.out.println("---------------------------------------------");
            Menu.get(i).tampil();
        }
    }
    public static void Edit()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Tampilkan();
        
        System.out.println("\n=============================================");
        System.out.println("|                  Update                   |");
        System.out.println("=============================================");
        System.out.print("| Masukkan ID menu: ");
        String id = br.readLine();
        System.out.println("=============================================");
        
        for (Menu menu : Menu) {
            if (menu.getID().equals(id)) {
                System.out.print("| ID menu     : ");
                menu.setID(br.readLine());
                System.out.print("| Seri menu   : ");
                menu.setSeri(br.readLine());
                System.out.print("| Nama menu   : ");
                menu.setNama(br.readLine());
                System.out.print("| Regular     : ");
                menu.setRegular(Integer.parseInt(br.readLine()));
                System.out.print("| Large       : ");
                menu.setLarge(Integer.parseInt(br.readLine()));
                System.out.println("=============================================");
                break;
            }
        }
        for (Menu menu : Menu) {
            menu.edit();
        }
        Tampilkan();
    }
    public static void Hapus()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Tampilkan();
        
        System.out.println("\n=============================================");
        System.out.println("|                  Delete                   |");
        System.out.println("=============================================");
        System.out.print("| Masukan ID menu: ");
        String id = br.readLine();
        System.out.println("=============================================");
        
        for (int i = 0; i < Menu.size(); i++) {
            if (Menu.get(i).getID().equals(id)) {
                Menu.remove(i);
                break;
            }
        }
        
        for (Menu menu : Menu) {
            menu.delete();
        }
        
        Tampilkan();
    }
}
