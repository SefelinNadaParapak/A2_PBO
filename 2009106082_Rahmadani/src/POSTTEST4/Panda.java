package POSTTEST4;

public class Panda extends Boneka {
    private String jenis ;
    
    //constructor
    public Panda(String nama, String ukuran, String warna, String jenis) {
        super(nama, ukuran, warna);
        this.jenis = jenis;
    }
    
    public String getJenis() {
        return jenis;
    }

    //getter & setter
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
