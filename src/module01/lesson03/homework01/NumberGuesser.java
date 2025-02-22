package module01.lesson03.homework01;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, please: ");

        String name = sc.nextLine();
        System.out.println("Let the game begin " + name + "!");

        Random rand = new Random();

        int random = rand.nextInt(100) + 1;
        int input = sc.nextInt();

        if (input < 0 | input > 100) {
            System.out.println("Invalid input. It should be between 0 and 100");
        }

        while (random != input) {

            if (input > random) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Your number is too small. Please, try again.");
            }

            input = sc.nextInt();
        }

        System.out.println("Congratulations " + name + "!");
        sc.close();
    }
}
