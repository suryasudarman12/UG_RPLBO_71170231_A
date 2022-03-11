package com.ug5b.soal1;

public class SmartCard {
    private String nama;
    private long saldo = 0;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo ;
    }

    public long getSaldo() {
        return saldo;
    }
    public void topUp(Voucher vch){
        vch.setNominal(100000);
        saldo = saldo + 100000;
        System.out.println("Kode Voucher: " + vch.getKode() + "|| Top up sukses!");
    }
}
