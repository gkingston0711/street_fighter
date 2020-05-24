package com.company;


public class H_D {
    protected int health;
    protected int defense;

   public H_D(){
        health=0;
        defense=0;
    }

   public H_D(int H,int D){
        health=H;
        defense=D;
    }

    public void set_health(int H){
        health=H;
    }

    public void set_defense(int D){
        defense=D;
    }

    public int get_health(){
        return health;
    }

    public int get_defense(){
        return defense;
    }
}
