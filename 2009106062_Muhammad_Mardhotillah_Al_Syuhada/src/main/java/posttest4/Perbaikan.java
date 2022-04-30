package posttest4;
public class Perbaikan {
    protected String merk, tipe, jenisperbaikan,os, hargaperbaikan;
    
    public Perbaikan(String merk, String tipe, String jenisperbaikan, String hargaperbaikan){
        this.merk = merk;
        this.tipe = tipe;
        this.jenisperbaikan = jenisperbaikan;
        this.hargaperbaikan = hargaperbaikan;
    }
    
    void tambahdaftar(){
        System.out.println("\nDaftar berhasil ditambah");
    }
    
    void hapusdaftar(){
        System.out.println("Daftar berhasil dihapus");
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public String getJenisperbaikan() {
        return jenisperbaikan;
    }

    public String getHargaperbaikan() {
        return hargaperbaikan;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setJenisperbaikan(String jenisperbaikan) {
        this.jenisperbaikan = jenisperbaikan;
    }

    public void setHargaperbaikan(String hargaperbaikan) {
        this.hargaperbaikan = hargaperbaikan;
        
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs() {
        return os;
    }
    
    public void display(){
        System.out.println("Merk Macbook     : " + this.merk);
        System.out.println("Tipe Macbook     : " + this.tipe);
        System.out.println("Jenis Perbaikan  : " + this.jenisperbaikan);
        System.out.println("Harga Perbaikan  : " + this.hargaperbaikan);
    }
}
