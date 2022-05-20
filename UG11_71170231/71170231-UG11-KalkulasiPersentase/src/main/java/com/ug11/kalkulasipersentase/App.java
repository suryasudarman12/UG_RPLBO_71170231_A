package com.ug11.kalkulasipersentase;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        float persentase1 = 4.25F;
        float persentase2 = 1.25F;
        float total = persentase1 + persentase2;


        String tampil = String.format("Saham #BRI naik sebanyak %f disusul dengan saham #BCA yang naik sebanyak %f",persentase1,persentase2);
        String tampil2 = String.format("Rincian Perhitungan : %f  + %f ",persentase1,persentase2 );

        System.out.println(tampil);
        System.out.println(tampil2);
        System.out.println("Niali total : "+total+"%");

    }
}
