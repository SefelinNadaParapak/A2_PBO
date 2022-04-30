package POSTTEST4;

public class Beruang extends Boneka {
    private String jenis ;
    
    //constructor
    public Beruang(String nama, String ukuran, String warna, String jenis) {
        super(nama, ukuran, warna);
        this.jenis = jenis;
    }
    
     //getter & setter
    public String getJenis() {
        return jenis;
    }
    
    public void setJenis(String jenis) {    
        this.jenis = jenis;
    }

    public void display() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Ukuran        : " + this.ukuran);
        System.out.println("Warna         : " + this.warna);
        System.out.println("Jenis         : " + this.jenis);
    }
}
