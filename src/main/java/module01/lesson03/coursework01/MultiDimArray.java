package main.java.module01.lesson03.coursework01;

public class MultiDimArray {

    public static void main(String[] args) {

        int[][][] arr = {
                {{1, 2, 3}},
                {{4, 5, 6}},
                {{7, 8, 9}}
        };

        System.out.println(arr[1][0][1]);
    }
}
