/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

public final class Pantai extends Wisata{
    private String wahana;

    public Pantai(String wahana, String Nama, String Tempat, int harga, double rating) {
        super(Nama, Tempat, harga, rating);
        this.wahana = wahana;
    }
  
    public String getWahana() {
        return wahana;
    }

    public void setWahana(String wahana) {
        this.wahana = wahana;
    }
    
    @Override
    public void display(){
        System.out.println("Nama : " + this.Nama);
        System.out.println("Tempat : " + this.Tempat);
        System.out.println("Harga : " + this.harga);
        System.out.println("Rating : " + this.rating);
        System.out.println("Wahana : " + this.wahana);
        System.out.println("Negara : " + Negara);
    }
}
