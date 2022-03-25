package com.ug7.game;

import java.util.Scanner;

public class Karakter {
    private Player player;
    private int HP = 100;
    private int money = 5000;
    private int weapon =  0;
    private boolean isWalk = false;

    public Karakter(Player player){
        Scanner input = new Scanner(System.in);

       System.out.println("Karakter : ");
       System.out.println("1. Ninja \n 2.Penyihir");
       System.out.println("Masukan Pilihan: ");
       int pilih = input.nextInt();
    }
    public Player getPlayer(){
        return player;
    }
    public void buyWeapon(int weapon){
        Scanner in = new Scanner (System.in);
        System.out.print("Pilihan : \n 1. Pisau \n 2. Tongkat \n 3. Tongkat Sihir \n 4. Katana  \n\n Masukan pilihan :");
        weapon = in.nextInt();
        switch (weapon){
            case 1:
                Ninja myNinja = new Ninja();
                myNinja.getPlayer();

                break;
            case 2:
                Penyihir myPenyihir = new Penyihir();
                myPenyihir.getPlayer();
                break;
            case 3:
                Penyihir myPenyihir1 = new Penyihir();
                myPenyihir1.getPlayer();
                break;
            case 4:
                Ninja myNinja1 = new Ninja();
                myNinja1.getPlayer();
                break;
        }
    }
    public void ability(Karakter karakter){

    }
    public void normalAttacked(Karakter karakter){

    }
    public void walk(boolean type){

    }
}
