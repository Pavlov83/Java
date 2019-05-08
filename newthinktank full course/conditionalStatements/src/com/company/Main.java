package com.company;

public class Main {

    public static void main(String[] args) {

        //Relational operators : == != > < >= <=
        //Logical operators : ! && ||
        int age = 12;
        if((age >= 5) &&(age <= 6)){
            System.out.println("Go to kindergarden");

        } else if(age > 7 && age < 13){
            System.out.println("Go to primary school");
        } else if(age > 13 && age < 18){
            System.out.println("Go to secondary school");
        }else{
            System.out.println("Stay Home");
        }

        System.out.println("true || false" + (true || false));
        System.out.println("!true" + (!true));

        boolean canVote = (age >= 18) ? true : false;
        System.out.println("Can vote: " + canVote);

        String lang = "France";
        switch (lang){
            case "Chile":
            case "Cuba":
                System.out.println("Hola");
                break;
            case "France ":
                System.out.println("Bonjour");
            case "Japan":
                System.out.println("Konnichiwa");
                break;
            default:
                System.out.println("Hello");
        }

    }
}
