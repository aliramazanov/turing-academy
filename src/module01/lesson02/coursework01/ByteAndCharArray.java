package module01.lesson02.coursework01;

import java.util.Arrays;

public class ByteAndCharArray {

    public static void main(String[] args) {
        byte[] arr = new byte[10];
        Byte[] byteArray = new Byte[10];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(byteArray));

        char[] chars = new char[10];
        Character[] charArray = new Character[10];
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(charArray));
    }
}
