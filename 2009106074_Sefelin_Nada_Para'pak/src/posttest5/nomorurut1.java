
package posttest5;


public class nomorurut1  extends calon { 
    private String partai;

    public nomorurut1( String namacalonkepaladaerah, String namacalonwakil, String nomorurut,String partai) {    
        super(namacalonkepaladaerah, namacalonwakil, nomorurut);
        this.partai = partai;
    }

    final public String getPartai() {
        return partai;
    }

    public void setPartai(String partai) {
        this.partai = partai;
    }
    public void display() {
        System.out.println("Namacalonkepaladaerah : " + this.namacalonkepaladaerah);
        System.out.println("Namacalonwakil        : " + this.namacalonwakil);
        System.out.println("Nomorurut             : " + this.nomorurut);
        System.out.println("Partai                : " + this.partai);
        System.out.println("Di daerah             : " +daerah);
        this.politik();
    }

    @Override
    public void politik() {
        System.out.println( this.namacalonkepaladaerah+ "harus belajar politik");
    }
    
    
}
