package com.ug13.sakitrumah;

import java.util.Scanner;

public class Pendaftaran {
    private String nama;


    public Pendaftaran(String nama) {
        this.nama = nama;
    }

    public void mengtaurJadwal(Pengunjung pengunjung,Pemeriksa pemeriksa,Jadwal jadwal){
        System.out.println("==========PROSES PENGATURAN JADWAL BERHASIL==========");
    }
    public Pengunjung registrasi() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanAngka = new Scanner(System.in);
        Jadwal jadwal = new Jadwal();


        System.out.print("Masukkan nama anda : ");
        String name = scanner.nextLine();
        Pengunjung pengunjung = null;
        pengunjung.setNama(nama);

        System.out.print("Masukkan usia anda : ");
        int age = scanAngka.nextInt();
        pengunjung.setUsia(usia);

        scanner.reset();
        System.out.print("Masukkan alamat anda : ");
        String address = scanner.nextLine();
        pengunjung.setAlamat(alamat);

        System.out.print("Masukkan penyakit anda : ");
        String sick = scanner.nextLine();
        pengunjung.setPenyakit(penyakit);

        pengunjung = new Pengunjung();
        pengunjung.setLevelPenyakit(3);
        jadwal.setPengunjung(pengunjung);

        return pengunjung;
    }

}
