package posttest2;

public class Dapes {
    int nik;
    String nama, gender, bidang_umkm;

    public Dapes(int nik, String nama, String gender, String bidang_umkm) {
        this.nik = nik;
        this.nama = nama;
        this.gender = gender;
        this.bidang_umkm = bidang_umkm;
    }

    Dapes() {
        
    }

    void display() {
        System.out.println("NIK         : " + this.nik);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Gender      : " + this.gender);
        System.out.println("Bidang UMKM : " + this.bidang_umkm);
    }

    public void setnik(int nik) {
        this.nik = nik;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public void setbidang_umkm(String bidang_umkm) {
        this.bidang_umkm = bidang_umkm;
    }


    void mendaftar() {
        System.out.println("Mendaftarkan diri untuk pelatihan");
    }

    void pelatihan() {
        System.out.println("Pelatihan dimulai");
    }
}