package com.ug8.game;

public abstract class Character {
    protected int demage;
    protected String name;
    protected int health;

    public Character(){
        this.name = this.name;
        this.demage = this.demage;
        this.health = this.health;

    }

    public void attacked(int demage){

    }

    public void showChacterInfo(){

    }
    public boolean isDie() {
        if (health <= 0){
            return true;
        }else
            return false;
    }
}
