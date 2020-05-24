package com.company;

import com.sun.source.tree.NewArrayTree;

public class list {

        protected node rear;
        protected node head;

        public list(){
            rear=null;
        }
        //could have constructor with args

    public void set_rear(node R){
            rear=R;
    }
    public node get_rear(){
            return this.rear;
    }

    public void add_character(node NEW){

            if(rear==null){
                set_rear(NEW);
            }
            else
            {
                NEW.set_next(rear.get_next());
                set_rear(NEW);
            }
    }

    public void display_characters()
    {
        if(rear.get_next()==get_rear()){
            return;
        }
        else {
            System.out.println(get_rear().get_object().get_name());
        }

        }
}
