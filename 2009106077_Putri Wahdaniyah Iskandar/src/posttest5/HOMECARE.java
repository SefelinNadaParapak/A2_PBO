/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author ASUS
 */
public  abstract class HOMECARE {

    protected String nama, gender, alamat; 
    
    public abstract void hidup();
    
    public HOMECARE(String nama, String gender, String alamat) {
        this.nama = nama;
        this.gender = gender;
        this.alamat = alamat;
    }

    public final String getnama() {
        return nama;
    }

    public final void setnama(String nama) {
        this.nama = nama;
    }

    public final String getgender() {
        return gender;
    }

    public final void setgender(String gender) {
        this.gender = gender;
    }

    public final String getalamat() {
        return alamat;
    }

    public final void setalamat(String alamat) {
        this.alamat = alamat;
    }
}   
