/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

public class dataPenitipan {
    protected int jumlah_hari, jam, harga;

    public dataPenitipan(int jumlah_hari, int jam, int harga) {
        this.jumlah_hari = jumlah_hari;
        this.jam = jam;
        this.harga = harga;
    }

//    setter & getter
    public int getJumlah_hari() {
        return jumlah_hari;
    }

    public void setJumlah_hari(int jumlah_hari) {
        this.jumlah_hari = jumlah_hari;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}

