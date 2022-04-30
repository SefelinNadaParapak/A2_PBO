/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author raymo
 */
public final class Hutan extends Wisata{
    private String flora,fauna;

    public Hutan(String flora, String fauna, String Nama, String Tempat, int harga, double rating) {
        super(Nama, Tempat, harga, rating);
        this.flora = flora;
        this.fauna = fauna;
    }

    public String getFlora() {
        return flora;
    }

    public String getFauna() {
        return fauna;
    }

    public void setFlora(String flora) {
        this.flora = flora;
    }

    public void setFauna(String fauna) {
        this.fauna = fauna;
    }
    
    
    @Override
    public void display(){
        System.out.println("Nama : " + this.Nama);
        System.out.println("Tempat : " + this.Tempat);
        System.out.println("Harga : " + this.harga);
        System.out.println("Rating : " + this.rating);
        System.out.println("Flora : " + this.flora);
        System.out.println("Fauna : " + this.fauna);
        System.out.println("Negara : " + Negara);
    }
}
