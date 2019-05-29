package com.company;

public class Warrior {

    //protected can be accessed only in the class and inherited classes

   protected String name = "Warrior";

   public int health = 0;
   public int attKMax = 0;
   public int blockMax = 0;

   public Warrior() {

       this.setName(name);
       this.health = health;
       this.attKMax = attKMax;
       this.blockMax = blockMax;

   }

   public int attack(){
       //represents attack amount
       return 1 + (int)(Math.random() *(attKMax -1) +1);
   }

    public int block(){
        //represents attack amount
        return 1 + (int)(Math.random() *(blockMax -1) +1);
    }

    public Warrior(String name, int health,
                  int attKMax, int blockMax){
         this.setName(name);


   }

    public String getName(){

       return name;
   }

    public void setName(String name){
       this.name = name;
   }

}
