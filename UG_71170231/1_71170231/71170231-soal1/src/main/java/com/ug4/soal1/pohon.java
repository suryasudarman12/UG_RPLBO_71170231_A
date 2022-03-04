package com.ug4.soal1;

import java.time.LocalDate;


public class pohon<Buah, Musim> {
    private int daun;
    private int akar;
    private int dahan;
    private int masahidup;
    private int umur;
    private Buah buah;
    private Musim musim;
    private LocalDate tanggalMusim;

    public pohon() {
    }

    public int getDaun(){
        return daun;
    }

    private void setDaun(int newDaun){
        this.daun = newDaun;
    }



    public int getAkar(){
        return akar;
    }
    private void setAkar(int newAkar){
        this.akar = newAkar;
    }
    public int getDahan(){
        return dahan;
    }
    private void setDahan(int newDahan){
        this.dahan = newDahan;
    }
    public int getMasahidup(){
        return masahidup;
    }
    public int getUmur(){
        return umur;
    }

    public Buah getBuah() {
        return buah;
    }

    private void setBuah(Buah buah) {
        this.buah = buah;
    }

    public Musim getMusim() {
        return musim;
    }

    private void setMusim(Musim musim) {
        this.musim = musim;
    }

    public LocalDate getTanggalMusim() {
        return tanggalMusim;
    }

    private void setTanggalMusim(LocalDate tanggalMusim) {
        this.tanggalMusim = tanggalMusim;
    }
}
