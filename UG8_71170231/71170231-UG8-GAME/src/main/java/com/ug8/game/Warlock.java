package com.ug8.game;

public class Warlock extends Hero implements Summoner {
    private int numOfSummon;

    public Warlock(){
        this.name = "Warlock";
        this.health = 700;
        this.demage = 80;


    }

    public void attack(){

    }

    public Golem summon(){
        return null;
    }
}
