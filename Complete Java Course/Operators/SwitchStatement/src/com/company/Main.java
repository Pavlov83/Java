package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 3;
/*
        if(value == 1){

            System.out.println("Value was 1");

        } else if(value == 2){

            System.out.println("Value was 2");
        } else {

            System.out.println("Was not 1 or 2");
        }
*/}
//////////////////////////////////////////////////////////////////////
        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it was a" + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }
//////////////////////////////////////////////////////////////////////////////////
/*
Create a new switch statement using char instead of int
create an new char variable
create a switch statement testing for
A,B,C,D, or E
Display a message if any of these are found and then break
Add a default which displays a message "not found".
 */

     char charValue ='A';

    switch (charValue){
        case 'A':
            System.out.println('Value is A');
            break;

        case 'B':
            System.out.println('Value is B');
            break;

        case 'C':
            System.out.println('Value is C');
            break;

        case 'D':
            System.out.println('Value is B');
            break;

        case 'E':
            System.out.println('Value is C');
            break;

        default:
            System.out.println('Could not find A,B,C,D or E');
            break;


    }






    }
}
