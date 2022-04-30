/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST3;

/**
 *
 * @author Asus
 */
public class boneka {
    private String jenis,warna,size;
    private int stok;
    
    public boneka (String jenis, String warna, String size, int stok){
        this.jenis       = jenis;
        this.warna       = warna;
        this.size        = size;
        this.stok        = stok;
    }
    
     void display() {
        System.out.println("--- Jenis --- : " + this.jenis);
        System.out.println("--- Warna --- : " + this.warna);
        System.out.println("--- Size --- : " + this.size);
        System.out.println("--- Stok ---  : " + this.stok);
       
    }
     void tambah(){
        System.out.println(" Berhasil menambahkan!!!");
    }
    
    public void SetJenis(String jenis){
        this.jenis   = jenis;
    }
   
    public void SetStok(int stok){
        this.stok         = stok;
    }
    public void SetWarna(String warna){
        this.warna   = warna;
    }
   
    public void SetSize(String size){
        this.size         = size;
    }
    
    public String getJenis(){
        return jenis;
    }
   
    public int getStok(){
        return stok;
    }
    public String getWarna(){
        return warna;
    }
   
    public String getSize(){
        return size;
    }
    
}
