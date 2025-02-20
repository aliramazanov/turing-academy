package main.java.module01.lesson03.coursework01;

public class ArrayIndexValuePrinter {

    public static void main(String[] args) {
        printArrayElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    public static void printArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            System.out.println("Index: " + i + " Value: " + value);
        }
    }
}
