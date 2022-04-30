
package ulang1;

public class wanita extends Masyarakat {
    private String Nama;

    public wanita(String Nama, String nama, String alamat, String laporan) {
        super(nama, alamat, laporan);
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
   
//Override
public void display() {
        System.out.println("nama    : " + this.Nama);
        System.out.println("alamat  : " + this.alamat);
        System.out.println("laporan : " + this.laporan);
        System.out.println("Pada Daerah : " +daerah);
        this.Negara();
    }
public void Negara(){
    System.out.println(this.Nama+"memiliki keluhan di daerah tersebut");
}
}

