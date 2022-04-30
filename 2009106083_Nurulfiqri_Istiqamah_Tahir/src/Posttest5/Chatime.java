package Posttest5;

public abstract class Chatime {

    protected String ID;
    protected String Nama;
    protected int Regular;
    protected int Large;
    protected final int UkuranR = 500; // ml
    protected final int UkuranL = 750; // ml
    
    public abstract void Dingin();
    
    public Chatime(String ID, String Nama, int Regular, int Large){
        this.ID     = ID;
        this.Nama   = Nama;
        this.Regular= Regular;
        this.Large  = Large;
    }
    
    public String getID() {
        return ID;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getRegular() {
        return Regular;
    }

    public void setRegular(int Regular) {
        this.Regular = Regular;
    }

    public int getLarge() {
        return Large;
    }

    public void setLarge(int Large) {
        this.Large = Large;
    }
}
