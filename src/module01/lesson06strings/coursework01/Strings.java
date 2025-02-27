package module01.lesson06strings.coursework01;

public class Strings {

    public static void main(String[] args) {
        char[] arr = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        printCharArray(arr);
        printStr();
        implementStrMethods();
    }

    public static void printCharArray(char[] chars) {
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }

    public static void printStr() {
        String strPrim = "Hello";
        String strPrimDuplicate = "Hello";
        String strRef = new String("Hello");

        System.out.println();


        System.out.println(strPrim);
        System.out.println(strRef);
        System.out.println(strPrimDuplicate);

        System.out.println(strPrim == strRef);
        System.out.println(strPrim == strPrimDuplicate);

        System.out.println(System.identityHashCode(strPrim));
        System.out.println(System.identityHashCode(strPrimDuplicate));
        System.out.println(System.identityHashCode(strRef));
    }

    public static void implementStrMethods() {
        String testStr = "Hello, World!";
        String testAscii = "Allowance";
        System.out.println();

        System.out.println(testStr.length());
        System.out.println(testStr.indexOf("H"));
        System.out.println(testAscii.indexOf(65));

        System.out.println(testStr.toLowerCase());
        System.out.println(testStr.toUpperCase());

        // Immutable
        testStr.toLowerCase();
        System.out.println(testStr);

        String testStrTwo = "     Hello, World!    ";
        System.out.println(testStrTwo.trim());

        String testStrThree = "World!";
        System.out.println(testStrThree.charAt(testStrThree.length() - 1));

        System.out.println(testStrThree.substring(1, 4));


        String word = "Test".replace("T", "R");
        System.out.println(word);

        // StringBuilder, StringBuffer
        String newString = "Hello";
        newString.concat(" World");
        System.out.println(newString);

        StringBuilder wordFromBuilder = new StringBuilder("Hello");
        wordFromBuilder.append(" World");
        System.out.println(wordFromBuilder);

        // Thread Safety
        StringBuffer newStringFromBuffer = new StringBuffer("Hello");
        newStringFromBuffer.append(" World");
        System.out.println(newStringFromBuffer);
    }
}