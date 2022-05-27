package com.ug12.aplikasistockbit;

import java.util.ArrayList;

public class Stockbit extends Investor {
    private ArrayList<Investor> arrinvestor = new ArrayList<Investor>();
    private Investor investor;

    Stockbit(){
        super();

    }

    public void login(String username, String password){

        if(username.equals(arrinvestor) && password.equals(arrinvestor) ) {
            System.out.println("Login berhasil");
        } else
            System.out.println("Username/Password Anda Salah !!!");
        }

    public void orderBeli(Saham saham, int lot){
      

    }
    public void orderJual(Saham saham, int lot){

    }
    public void printPortfolio(){

    }
    public void register(Investor investor){
        arrinvestor.add(investor);
        System.out.println(arrinvestor);
    }


}
