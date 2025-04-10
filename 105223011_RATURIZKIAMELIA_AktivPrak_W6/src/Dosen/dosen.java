package Dosen;

//a
public class dosen {
    private String nama;
    private String NIDN;
//b
    public dosen(String nama, String NIDN) {
        this.nama = nama;
        this.NIDN = NIDN;
    }
//c
    public String getNama() {
        return nama;
    }

    public String getNIDN() {
        return NIDN;
    }
}