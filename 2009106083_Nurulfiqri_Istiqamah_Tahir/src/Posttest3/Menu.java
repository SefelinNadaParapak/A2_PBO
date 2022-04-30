package Posttest3;

public class Menu {
    private String ID;
    private String Seri;
    private String Nama;
    private int Regular;
    private int Large;
    
    public Menu (String ID, String Seri, String Nama, int Regular, int Large){
        this.ID         = ID;
        this.Seri       = Seri;
        this.Nama       = Nama;
        this.Regular    = Regular;
        this.Large      = Large;
    }
    
    void tampil() {
        System.out.println("| ID menu       : " + this.ID);
        System.out.println("| Seri menu     : " + this.Seri);
        System.out.println("| Nama menu     : " + this.Nama);
        System.out.println("| Regular       : " + this.Regular);
        System.out.println("| Large         : " + this.Large);
        System.out.println("=============================================");
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setSeri(String Seri) {
        this.Seri = Seri;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public void setRegular(int Regular) {
        this.Regular = Regular;
    }
    public void setLarge(int Large) {
        this.Large = Large;
    }
    
    public String getID() {
        return ID;
    }
    public String getSeri() {
        return Seri;
    }
    public String getNama() {
        return Nama;
    }
    public int getRegular() {
        return Regular;
    }
    public int getLarge() {
        return Large;
    }
    
    void input(){
        System.out.println(" Berhasil menambahkan!!!");
    }
    
    void edit(){
        System.out.println(" Berhasil mengupdate!!!");
    }
    
    void delete(){
        System.out.println(" Berhasil menghapus!!!");
    }
}

