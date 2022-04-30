package Posttest4;

public class TeaRRIFIC extends Chatime{
    private String Seri;
    
    public TeaRRIFIC(String ID, String Seri, String Nama, int Regular, int Large){
        super(ID, Nama, Regular, Large);
        this.Seri   = Seri;
    }

    public String getSeri() {
        return Seri;
    }

    public void setSeri(String Seri) {
        this.Seri = Seri;
    }
    
    public void tampil() {
        System.out.println("| ID menu       : " + this.ID);
        System.out.println("| Seri menu     : " + this.Seri);
        System.out.println("| Nama menu     : " + this.Nama);
        System.out.println("| Regular       : " + this.Regular);
        System.out.println("| Large         : " + this.Large);
        System.out.println("=============================================");
    }
}
