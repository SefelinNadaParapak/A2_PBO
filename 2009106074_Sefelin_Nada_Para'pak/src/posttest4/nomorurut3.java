
package posttest4;


public class nomorurut3  extends calon {
   
    private String partai;

    public nomorurut3(String namacalonkepaladaerah, String namacalonwakil, String nomorurut, String partai) {
        super(namacalonkepaladaerah, namacalonwakil, nomorurut);
        this.partai = partai;
    }

    public String getPartai() {
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
    }
} 

