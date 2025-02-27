package module01.lesson03controlflow.selfstudy01;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
