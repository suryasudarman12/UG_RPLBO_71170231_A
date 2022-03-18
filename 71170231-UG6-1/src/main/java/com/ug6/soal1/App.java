package com.ug6.soal1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Codes CD = new Codes();

        Scanner pilihan = new Scanner(System.in);
        System.out.println("1. XM");
        System.out.println("2. SG");
        System.out.println("3. AP");
        System.out.println("4. RM");
        System.out.println("5. OP");
        System.out.println("6. VV");
        System.out.println("Your choice: ");
        String pilih = pilihan.nextLine();

        switch (pilih){
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + pilih);
        }


    }
}
