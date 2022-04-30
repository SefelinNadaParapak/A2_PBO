package posttest2;

public class Perbaikan {
    String merklaptop, tipelaptop, jenisperbaikan;
    int hargaperbaikan;
    
    public Perbaikan(String merklaptop, String tipelaptop, String jenisperbaikan, int hargaperbaikan){
        this.merklaptop = merklaptop;
        this.tipelaptop = tipelaptop;
        this.jenisperbaikan = jenisperbaikan;
        this.hargaperbaikan = hargaperbaikan;
    }
    
    void tambahdaftar(){
        System.out.println("Daftar berhasil ditambah");
    }
    
    void hapusdaftar(){
        System.out.println("Daftar berhasil dihapus");
    }
    
}
