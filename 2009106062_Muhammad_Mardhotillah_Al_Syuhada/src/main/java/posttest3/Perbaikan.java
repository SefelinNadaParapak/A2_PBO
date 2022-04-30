package posttest3;
public class Perbaikan {

    private String merklaptop;
     private String tipelaptop, jenisperbaikan;
    private int hargaperbaikan;
    
    public Perbaikan(String merklaptop, String tipelaptop, String jenisperbaikan, int hargaperbaikan){
        this.merklaptop = merklaptop;
        this.tipelaptop = tipelaptop;
        this.jenisperbaikan = jenisperbaikan;
        this.hargaperbaikan = hargaperbaikan;
    }
    
    void tambahdaftar(){
        System.out.println("\nDaftar berhasil ditambah");
    }
    
    void hapusdaftar(){
        System.out.println("Daftar berhasil dihapus");
    }

    public String getMerklaptop() {
        return merklaptop;
    }

    public String getTipelaptop() {
        return tipelaptop;
    }

    public String getJenisperbaikan() {
        return jenisperbaikan;
    }

    public int getHargaperbaikan() {
        return hargaperbaikan;
    }

    public void setMerklaptop(String merklaptop) {
        this.merklaptop = merklaptop;
    }

    public void setTipelaptop(String tipelaptop) {
        this.tipelaptop = tipelaptop;
    }

    public void setJenisperbaikan(String jenisperbaikan) {
        this.jenisperbaikan = jenisperbaikan;
    }

    public void setHargaperbaikan(int hargaperbaikan) {
        this.hargaperbaikan = hargaperbaikan;
    }
    
    
    
}
