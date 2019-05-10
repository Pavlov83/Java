package com.company;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Main {




        //function which calls itself is called recursive function

            static int factorial(int num) {

                if(num == 1){
                    return 1;
                } else{
                    int result = num * factorial(num-1);
                    return result;

                }


            }

    public static void main(String[] args) {
        System.out.println("Fact4" + factorial(4));

    }


        }
