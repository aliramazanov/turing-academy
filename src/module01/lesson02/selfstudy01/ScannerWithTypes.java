package module01.lesson02.selfstudy01;

import java.util.Scanner;

public class ScannerWithTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        boolean c = sc.nextBoolean();

        sc.close();

        System.out.println("Result: " + a + ", " + b + ", " + c);
    }
}
