package com.ug4.soal1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input;
        input = new Scanner(System.in);
        pohon Obj1 = new pohon();
        musim Obj2 = new musim();
        musim Obj3 = new musim();
        musim Obj4 = new musim();



       System.out.println("Daun"+Obj1.getDaun());
       System.out.println("Dahan"+Obj1.getDahan());
        System.out.println("Akar"+Obj1.getAkar());

        System.out.println("Masukan Musim");
        String nama = input.nextLine();

    Obj2.setNama("Kemarau");
    Obj3.setNama("Penghujan");
    Obj4.setNama("Dingin");
    System.out.println(Obj2.getNama());
        System.out.println(Obj3.getNama());
        System.out.println(Obj4.getNama());
    }
}
