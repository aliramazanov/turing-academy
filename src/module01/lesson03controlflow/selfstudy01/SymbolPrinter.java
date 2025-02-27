package module01.lesson03controlflow.selfstudy01;

import java.util.Scanner;

public class SymbolPrinter {
    public static Scanner sc = new Scanner(System.in);
    public static int rows;
    public static int cols;
    public static char symbol;

    public static void main(String[] args) {
        getInput();
        display();
        sc.close();
    }

    public static void getInput() {
        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        cols = sc.nextInt();
        System.out.println("Enter the symbol: ");
        symbol = sc.next().charAt(0);
    }

    public static void display() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}