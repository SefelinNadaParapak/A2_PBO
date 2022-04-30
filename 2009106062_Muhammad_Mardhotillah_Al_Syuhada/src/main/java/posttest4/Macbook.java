package posttest4;

public class Macbook extends Perbaikan {
    private String os;
    
    public Macbook(String merk, String tipe, String jenisperbaikan, String hargaperbaikan, String os){
        super(merk, tipe, jenisperbaikan, hargaperbaikan);   
                this.os = os;
    }
    
    @Override
    public void display(){
        
        System.out.println("Merk Macbook     : " + this.merk);
        System.out.println("Tipe Macbook     : " + this.tipe);
        System.out.println("Jenis Perbaikan  : " + this.jenisperbaikan);
        System.out.println("Harga Perbaikan  : " + this.hargaperbaikan);
        System.out.println("Sistem Operasi   : " + this.os);
    }
    
    //Overload
    public void customer(){
        System.out.println("Macbook ini punya orang");
    }
    public void customer(String nama){
        System.out.println("Macbook ini punya " +nama);
    }
}

