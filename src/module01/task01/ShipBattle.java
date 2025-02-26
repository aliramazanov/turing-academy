package module01.task01;

import java.util.Scanner;

public class ShipBattle {
    public static Scanner sc = new Scanner(System.in);
    public static boolean isGameOver = false;

    public static void main(String[] args) {
        welcomePlayer();
        String name = getPlayerName();

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
        short size = 5;
        char[][] field = new char[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                field[row][col] = '-';
            }
        }

        return field;
    }
}