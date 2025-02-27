package module01.problemsolvingtasks.task02;

import java.util.Random;
import java.util.Scanner;

public class ShipBattle {
    public static Scanner sc = new Scanner(System.in);
    public static boolean isGameOver = false;
    public static int bound = 5;

    public static void main(String[] args) {
        welcomePlayer();
        String name = getPlayerName();

        char[][] field = createField();

        int targetRow = createTarget();
        int targetCol = createTarget();

        while (!isGameOver) {
            displayGameField(field);

            int rowIndex = getInput("row");
            int colIndex = getInput("column");

            if (field[rowIndex][colIndex] != '-') {
                System.out.println("Try another square");
                continue;
            }


            boolean isHit = (rowIndex == targetRow && colIndex == targetCol);

            if (isHit) {
                field[rowIndex][colIndex] = 'x';
                displayGameField(field);
                System.out.println(name + ", you have won!");
                isGameOver = true;
            } else {
                field[rowIndex][colIndex] = '*';
            }
        }

        sc.close();
    }

    public static void welcomePlayer() {
        System.out.println("Alright. Let the game begin!");
        System.out.println("All set...");
        System.out.println("Get ready to rumble!");
    }

    public static String getPlayerName() {
        System.out.println("Tell me your name: ");
        String playerName = sc.nextLine();
        System.out.println("Good luck, " + playerName + "!");
        return playerName;
    }

    public static char[][] createField() {
        char[][] field = new char[bound][bound];

        for (int i = 0; i < bound; i++) {
            for (int j = 0; j < bound; j++) {
                field[i][j] = '-';
            }
        }

        return field;
    }

    public static void displayGameField(char[][] field) {
        System.out.println("- 1 2 3 4 5");

        for (int i = 0; i < field.length; i++) {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static int createTarget() {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static int getInput(String type) {
        while (true) {
            System.out.print("Enter the field " + type + " (1 to 5): ");

            if (sc.hasNextInt()) {
                int input = sc.nextInt();

                if (input >= 1 && input <= bound) {
                    return input - 1;
                } else {
                    System.out.println("Please enter a number in range " + type + ": (1 to 5)");
                }
            } else {
                String invalidInput = sc.next();
                System.out.println("Please enter a number. This is not a number => " + invalidInput);
            }
        }
    }
}