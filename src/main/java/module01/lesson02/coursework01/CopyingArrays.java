package main.java.module01.lesson02.coursework01;
import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrTwo = Arrays.copyOf(arr, arr.length);
        int [] arrThree = Arrays.copyOfRange(arr, 0, 3);

        System.out.println(Arrays.toString(arrTwo));
        System.out.println(Arrays.toString(arrThree));
    }
}
