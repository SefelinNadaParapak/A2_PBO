package posttest6;

public abstract class calon {
    protected String namacalonkepaladaerah, namacalonwakil, nomorurut; 
    protected final String daerah = "Toraja";
    
    public abstract void politik();

    public calon(String namacalonkepaladaerah, String namacalonwakil, String nomorurut) {
        this.namacalonkepaladaerah = namacalonkepaladaerah;
        this.namacalonwakil = namacalonwakil;
        this.nomorurut = nomorurut;
    }

    final public String getNamacalonkepaladaerah() {
        return namacalonkepaladaerah;
    }

    public void setNamacalonkepaladaerah(String namacalonkepaladaerah) {
        this.namacalonkepaladaerah = namacalonkepaladaerah;
    }

    public String getNamacalonwakil() {
        return namacalonwakil;
    }

    public void setNamacalonwakil(String namacalonwakil) {
        this.namacalonwakil = namacalonwakil;
    }

    public String getNomorurut() {
        return nomorurut;
    }

    public void setNomorurut(String nomorurut) {
        this.nomorurut = nomorurut;
    }
}
