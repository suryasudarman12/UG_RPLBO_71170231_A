package com.ug11.channelsahamukdw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Channel {
    private String email;
    private String namaDepan;
    private String namaBelakang;
    private int totalTag;

    public Channel(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Depa :");
        namaDepan = input.nextLine();
        System.out.println("Nama Belakang :");
        namaBelakang = input.nextLine();

    }

    public boolean login(String email){
        Pattern p = Pattern.compile("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public void bagikanIde(String ide){

    }

    public void printInfo(){
        System.out.println("Nama Depan: "+namaDepan.toUpperCase());
        System.out.println("Nama Depan: "+namaBelakang.toUpperCase());
        System.out.println("email :"+email);
        System.out.println("Total Tag :"+totalTag);
    }
}
