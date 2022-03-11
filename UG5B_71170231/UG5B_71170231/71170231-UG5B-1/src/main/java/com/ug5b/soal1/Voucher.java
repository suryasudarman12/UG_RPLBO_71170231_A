package com.ug5b.soal1;

public class Voucher {
    private String kode = "VC";
    private long nominal;

    public void setNominal(long nominal) {
        this.nominal = nominal;
    }

    public String getKode() {
        return kode ;

    }
    public void buatVoucher(){

        if (nominal <= 0){
            kode = getKode();


        }else {
            kode = getKode()+ nominal;

        }
        String kode1 = kode.substring(0,2);
        System.out.println(kode1);
    }
}
