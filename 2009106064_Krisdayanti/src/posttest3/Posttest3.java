/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Posttest3 {

    static InputStreamReader input = new InputStreamReader(System.in);
    static BufferedReader input1 = new BufferedReader(input);
    static ArrayList<Order> dataOrder = new ArrayList<>();

    public static void main(String[] args) throws IOException{
         
        Fungsi.dian();
        
        while(true){
            Fungsi.menu();
        }
        
    }
    
}
