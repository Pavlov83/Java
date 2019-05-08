package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        if(sc.hasNextLine()){
            String userName = sc.nextLine();
            System.out.println("Hello" + userName);
        }

        String jopName =
                JOptionPane.showInputDialog("Enter name");
        System.out.println("Hello" + jopName);

    }
}
