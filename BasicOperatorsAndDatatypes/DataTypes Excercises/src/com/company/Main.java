package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter person's name");
        String name = scanner.nextLine();
        System.out.println("Enter student's gpa");
        String age = scanner.nextLine();
        System.out.println("Enter student's age");
        String gpa = scanner.nextLine();




        //Operators used in Java are +,-,*,/,%

        //Ternary operators  gpa > 3.2 ? "dean's list" : ""
        boolean isFemale;

        System.out.printf("Person name is "+ name + " is " + age + " gpa is " + gpa );

    }
}
