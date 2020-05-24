package com.company;
import java.util.*;
import java.io.*;
import java.util.Scanner;


public class attack {
    protected int atk;
     Scanner input;
     int option;



    attack(){
        atk=0;
    }



    public void set_atk(){

        input = new Scanner(System.in);

        System.out.println("would you to have an attack of 15, or would you " +
                "like to play it risky and have a random attack power between 2-35?\n"+
                "1:20 \n"+
                "2:0-35 \n");

        option=input.nextInt();
        input.nextLine();

        if(option==1){
            atk=20;
        }
        else{
            Random rand=new Random();
            int num=rand.nextInt(35);
            atk=num;
            System.out.println("your attack is: "+num);
        }

    }

    public int get_atk(){
        return atk;
    }

}
