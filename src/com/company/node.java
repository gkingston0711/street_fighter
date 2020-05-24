//this node will manage pre made list of characters not the battles

package com.company;

public class node {

    protected player object;
    protected node next;

    public node() {
        object = null;
        next = null;
    }

    public node(player OBJ){
        this.object=OBJ;
        next=null;

    }

    public void set_object(player one){
        this.object=one;
    }

    public player get_object(){
        return this.object;
    }

    public void set_next(node NEXT){
        next=NEXT;
    }

    public node get_next(){
        return this.next;
    }
}


