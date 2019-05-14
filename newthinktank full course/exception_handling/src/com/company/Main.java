package com.company;

public class Main {

    public static void main(String[] args) {
	//Exception handling is used to capture errors that could crash your program


        try{
            int badInt = 10/0;
        } catch(ArithmeticException ex){
            System.out.println("Can't divide by zero");
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
        }
          catch(Exception ex){
              System.out.println(ex.getMessage());
          }
        finally{
            System.out.println("Clean Up");
        }



    }
}
