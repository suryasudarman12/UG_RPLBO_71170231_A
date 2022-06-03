package com.ug13.sakitrumah;

public class Pengunjung {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private String status;

    public Pengunjung(){
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
    }
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public String getStatus() {
        return status;
    }

    public int getUsia() {
        return usia;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
}
