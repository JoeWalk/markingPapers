package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    System.out.println("What is the maximum mark for the paper?");
    int maxMark = input.nextInt();
    System.out.println("What did the student get?");
    int studentMark = input.nextInt();
    double percentage = ((maxMark / studentMark) * 100);
    System.out.println(percentage);

    if (percentage < 40) {
        System.out.println("Grade achieved is U");
    }else{
        if (percentage <= 49) {
            System.out.println("Grade achieved is E");
        }else{
            if (percentage <= 59) {
                System.out.println("Grade achieved is D");
            }else{
                if (percentage <= 69) {
                    System.out.println("Grade achieved is C");
                }else{
                    if (percentage <= 79) {
                        System.out.println("Grade achieved is B");
                        }else{
                        System.out.println("Grade achieved is A");
                    }
                }
            }
        }
    }

    }
}
