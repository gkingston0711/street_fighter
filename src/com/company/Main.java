package com.company;
import java.util.Random;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        list object=new list();
        node NEW=new node();
        NEW.set_object()
        object.add_character()

        player king=new player();

        System.out.println("Welcome to street fighter\n");


        System.out.println("Choose from menu\n"+
               "1:Display all characters\n"+
                "2:Add your own character");



        Scanner input;
        int response;

        input=new Scanner(System.in);
        response=input.nextInt();


        switch(response) {

            case 1:
                System.out.println("$$$$$$$$$$$$$$$$$$");
                break;
            case 2:

        }

        System.out.println("what is your characters name? \n");

        //Scanner input;
        String name;

        input=new Scanner(System.in);

        name=input.nextLine();
        input.nextLine();


    king.set_name(name);
    name=king.get_name();
    System.out.println(name);

    //king.set_object();
        attack one = new attack();
        one.set_atk();

        king.set_object(one);


    }
}