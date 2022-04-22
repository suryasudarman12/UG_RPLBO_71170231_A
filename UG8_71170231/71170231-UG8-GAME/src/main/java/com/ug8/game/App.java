package com.ug8.game;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LoneDruid Chacter1 = new LoneDruid();
        System.out.println("Name : " +Chacter1.name);
        System.out.println("Name : " +Chacter1.health);
        System.out.println("Name : " +Chacter1.demage);

        Warlock Chacter2 = new Warlock();
        System.out.println("Name : " +Chacter1.name);
        System.out.println("Name : " +Chacter1.health);
        System.out.println("Name : " +Chacter1.demage);

        Golem Chacter3 = new GolemBuilder().createGolem();


    }
}
