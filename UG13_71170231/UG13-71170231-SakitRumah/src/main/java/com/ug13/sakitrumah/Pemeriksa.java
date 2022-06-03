package com.ug13.sakitrumah;

public class Pemeriksa  {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Jadwal jadwal){
        if (jadwal.isStatusScreening()){
           System.out.println("==========PROSES PEMERIKSAAN DOKTER==========");
            pengunjung.setLevelPenyakit((pengunjung.getLevelPenyakit() - 1));
        }

    }

    public void cekStatus(Pengunjung pengunjung){
        if (pengunjung.getLevelPenyakit() < 0){
            System.out.println("==========PASIEN TELAH SEMBUH==========");
        } else {
            System.out.println("==========PASIEN ANDA MASIH SAKIT==========");
        }

    }
}
