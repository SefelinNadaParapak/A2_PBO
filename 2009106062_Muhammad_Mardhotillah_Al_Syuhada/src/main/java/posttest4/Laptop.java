package posttest4;

public class Laptop extends Perbaikan {
    private String os;
    
    public Laptop(String merk, String tipe, String jenisperbaikan, String hargaperbaikan, String os){
        super(merk, tipe, jenisperbaikan, hargaperbaikan); 
            this.os = os;
    }

    @Override
    public void display(){
        
        System.out.println("Merk Laptop     : " + this.merk);
        System.out.println("Tipe Laptop     : " + this.tipe);
        System.out.println("Jenis Perbaikan : " + this.jenisperbaikan);
        System.out.println("Harga Perbaikan : " + this.hargaperbaikan);
        System.out.println("Sistem Operasi  : " + this.os);
    }
    
    //Overload
    public void customer(){
        System.out.println("Laptop ini punya orang");
    }
    public void customer(String nama){
        System.out.println("Laptop ini punya " +nama);
    }
}
