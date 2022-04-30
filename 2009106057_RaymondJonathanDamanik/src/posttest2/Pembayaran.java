/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author raymo
 */
public class Pembayaran {
    //Attribut
    String nama,status,notelp;
    int rekening;
    
    //Construct
    public Pembayaran(String nama, String status, String notelp, int rekening) {
        this.nama = nama;
        this.status = status;
        this.notelp = notelp;
        this.rekening = rekening;
    }
    
   void display(){
       System.out.println("Nama     : " + this.nama);
       System.out.println("Nomor Telepon     : " + this.notelp);
       System.out.println("Rekening     : " + this.rekening);
       System.out.println("Status     : " + this.status);
   }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public void setRekening(int rekening) {
        this.rekening = rekening;
    }
    
    void info_nambah(){
            System.out.println("Pembayaran Telah Ditambahkan");
    }
    
    void info_update(){
        System.out.println("Pembayaran Telah Diubah");
    }
}
