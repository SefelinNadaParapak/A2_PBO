/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author ASUS
 */
public class perawat extends homecare{
    private String StaffId;
    
    public perawat(String nama, String StaffId,String gender, String alamat) {
        super(nama, gender, alamat);
        this.StaffId = StaffId;
    }
    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String StaffId) {
        this.StaffId = StaffId;
    }

    public void display() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Gender        : " + this.gender);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("ID Staff      : " + this.StaffId);
        this.hidup();
    }

   @Override
    public void hidup() {
        System.out.println("Perawat :" +this.nama+ "Semoga Lekas Sembuh"); 
    }

}
