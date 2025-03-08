package module01.lesson04arrays.coursework01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithScanner {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");

            int n = scanner.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " integers with spaces:");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}

