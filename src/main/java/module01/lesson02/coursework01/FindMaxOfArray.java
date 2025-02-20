package main.java.module01.lesson02.coursework01;

import java.util.Scanner;

public class FindMaxOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        arr[0] = scanner.nextInt();
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}