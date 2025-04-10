package Utama;

import Dosen.dosen;
import mahasiswa.Mahasiswa;
import Matakuliah.matakuliah;

public class utama {
    public static void main(String[] args) {
        dosen cahya = new dosen("Cahya", "DSN123");
        dosen budi = new dosen("Budi", "DSN124");
        
        Mahasiswa tiara = new Mahasiswa("Tiara", "MHS001");
        Mahasiswa diana = new Mahasiswa("Diana", "MHS002");
        
        matakuliah pbo = new matakuliah("PBO", "123");
        matakuliah kompar = new matakuliah("Kompar", "124");
        matakuliah metnum = new matakuliah("Metnum", "125");
        
        pbo.tambahDosen(cahya);
        pbo.tambahMahasiswa(tiara);
        pbo.tambahMahasiswa(diana);
        
        kompar.tambahDosen(budi);
        kompar.tambahMahasiswa(tiara);
        kompar.tambahMahasiswa(diana);
        
        metnum.tambahDosen(budi);
        metnum.tambahMahasiswa(tiara);
        
        tampilkanData(pbo);
        tampilkanData(kompar);
        tampilkanData(metnum);
    }
    
    public static void tampilkanData(matakuliah matakuliah) {
        System.out.println("\n=== Data Mata Kuliah ===");
        System.out.println("Nama: " + matakuliah.getNama());
        System.out.println("Kode: " + matakuliah.getKodeMK());
        
        System.out.println("\nDosen Pengampu:");
        for (dosen d : matakuliah.getPengampu()) {
            System.out.println("- " + d.getNama() + " (NIDN: " + d.getNIDN() + ")");
        }
        
        System.out.println("\nMahasiswa yang Mengambil mata kuliah:");
        for (Mahasiswa m : matakuliah.getDaftarMhs()) {
            System.out.println("- " + m.getNama() + " (NIM: " + m.getNIM() + ")");
        }
        System.out.println("========================");
    }
}