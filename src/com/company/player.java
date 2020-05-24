package com.company;

public class player extends H_D{
    protected String name;
    protected attack object;

    public player(){
        super();
        name=null;
        object=null;
    }

    public player(String N,int H,int D,attack one){
        super(H,D);
        name=N;
        object=one;
    }

    public void set_name(String N){
        name=N;
    }

    public String get_name(){
        return name;
    }

    public attack get_object(){
        return object;
    }
    
    public void set_object(attack one){
        this.object=one;
    }

    public int get_attack(){
        return object.get_atk();
    }

    public void set_attack(attack one){
        this.object=one;
    }

    }
