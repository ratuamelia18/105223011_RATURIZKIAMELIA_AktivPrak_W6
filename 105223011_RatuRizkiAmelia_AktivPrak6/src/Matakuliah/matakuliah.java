package Matakuliah;

import Dosen.dosen;
import mahasiswa.Mahasiswa;
import java.util.ArrayList;

public class matakuliah {
    private String nama;
    private String KodeMK;
    private ArrayList<dosen> pengampu;
    private ArrayList<Mahasiswa> daftarMhs;

    public matakuliah(String nama, String KodeMK) {
        this.nama = nama;
        this.KodeMK = KodeMK;
        this.pengampu = new ArrayList<>();
        this.daftarMhs = new ArrayList<>();
    }

    public void tambahDosen(dosen dosen) {
        pengampu.add(dosen);
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMhs.add(mhs);
    }

    public String getNama() {
        return nama;
    }

    public String getKodeMK() {
        return KodeMK;
    }

    public ArrayList<dosen> getPengampu() {
        return pengampu;
    }

    public ArrayList<Mahasiswa> getDaftarMhs() {
        return daftarMhs;
    }
}