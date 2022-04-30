/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest2;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class method {
    //membuat fungsi untuk 
    public static int GetInt(){
        Scanner input = new Scanner (System.in);
        while (true){
            try{
                return input.nextInt();
            }
            catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Input Salah Coba Lagi: ");
            }
        }
    }
    //membuat fungsi untuk menampilkan list data.
    static void list_data(ArrayList<Produk> ListProduk){
        System.out.println("===List Produk iBox===");
        System.out.println("No ID Nama\t\tUkuran\t\t\tHarga");
        for(int i=0;i<ListProduk.size();i++){
            System.out.println((i+1)+" "+ListProduk.get(i).getId()+" "+ListProduk.get(i).getNama()+"\t\t"+ListProduk.get(i).getUkuran()+"\t\t"+ListProduk.get(i).getHarga());
        }
        System.out.println("======================");
    }
}
