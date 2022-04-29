package com.ug9.mobilelegend;

public class Hero extends Character{
    private int healthBonus;
    private int level;
    private int healthMax ;
    private int lifeSteal;

    public Hero(String name, int damage, int health){
        this.name = name;
        this.damage = damage;
        this.health = health;

        this.healthMax=health;

    }

    public void setHealthMax(int health) {
        this.healthMax = 100;
    }

    public void setLifeSteal(int health) {
        this.lifeSteal = 50;
    }

    @Override
    public void attack(Character enemy) {
        if (health == 0){
            System.out.println("lawan gugur");
        } 

        attackInformation();
    }

    public void addDemage( int damage){

    }


    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
    }

    public int getLevel() {
        this.level = 1;
        return level;
    }
}
