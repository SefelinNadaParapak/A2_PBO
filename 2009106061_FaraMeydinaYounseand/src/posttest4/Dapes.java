package posttest4;

public class Dapes extends Database{
    
    private int no_peserta;

    public Dapes(int no_peserta, int nik, String nama, int umur, String gender, String bidang_umkm) {
        super(nik, nama, umur, gender, bidang_umkm);
        this.no_peserta = no_peserta;
    }
       
    @Override
    void display() {
        System.out.println("NIK         : " + this.nik);
        System.out.println("No Peserta  : " + this.no_peserta);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Umur        : " + this.umur);
        System.out.println("Gender      : " + this.gender);
        System.out.println("Bidang UMKM : " + this.bidang_umkm);
    }

    public int getNo_peserta() {
        return no_peserta;
    }

    public void setNo_peserta(int no_peserta) {
        this.no_peserta = no_peserta;
    }
    
    @Override
    void mendaftar() {
        System.out.println("Mendaftarkan diri untuk mengikuti pelatihan");
    }

    @Override
    void pelatihan() {
        System.out.println("Pelatihan dimulai oleh peserta");
    }
    
}
