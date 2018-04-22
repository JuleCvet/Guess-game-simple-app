package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int random = (int) (Math.random() * 10);
        int answer = 0;
        boolean next = true;
        int counter = 1;
        do {
            while ((next) && (counter <= 5)) {
                System.out.println("Choose the random number between 0 - 10");
                int guessNumber = sc.nextInt();
                sc.nextLine();

                if (guessNumber < random) {
                    System.out.println("You have picked too low number!!!");
                    counter++;
                } else if (guessNumber > random) {
                    System.out.println("You have picked too high number!!!");
                    counter++;
                } else {
                    System.out.println("Congratulations!!! You have picked the right number!!!");
                    next = false;
                }
            }
            System.out.println("If you want to play again please choose 1.");
            answer=sc.nextInt();
            sc.nextLine();
            if (answer==1){
                next= true;
                counter = 0;
                random = (int) (Math.random() * 10);
            }

        } while (answer == 1);



    }
}

