package POSTTEST5;

public class Beruang extends Boneka {
    private String jenis ;

    public Beruang(String nama, String ukuran, String warna, String jenis) {
        super(nama, ukuran, warna);
        this.jenis = jenis;
    }

    final public String getJenis() {
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
        
        System.out.println("\n\nUkuran Boneka : ");
        System.out.println("Ukuran S      : " + ukuranS);
        System.out.println("Ukuran M      : " + ukuranM);
        System.out.println("Ukuran L      : " + ukuranL);
        System.out.println("Ukuran XL     : " + ukuranXL);
        this.empuk();
    }
    
    @Override
    public void empuk() {
        System.out.println(this.nama+ " boneka yang empuk, halus dan lembut");
    }
}