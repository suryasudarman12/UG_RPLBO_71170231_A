package com.ug13.sakitrumah;

public class Jadwal {
    private Pengunjung pengunjung;
    private  Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private Boolean statusDaftar = false;
    private Boolean statusScreening = false;

    public Pengunjung getPengunjung(){
        return pengunjung;
    }
    public Pemeriksa getPemeriksa(){
        return pemeriksa;
    }
    public Perawat getPerawat(){
        return perawat;
    }
    public Pendaftaran getPendaftaran(){
        return pendaftaran;
    }

    public void setPemeriksa(Pemeriksa pemeriksa){
        this.pemeriksa = pemeriksa;
    }

    public void setPerawat(Perawat perawat) {
        this.perawat = perawat;
    }

    public void setStatusDaftar(Boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public void setStatusScreening(Boolean statusScreening) {
        this.statusScreening = statusScreening;
    }

    public void setPengunjung(Pengunjung pengunjung) {
        this.pengunjung = pengunjung;
    }

    public boolean isStatusScreening() {
        return statusScreening;
    }
}
