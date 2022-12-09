package Practice.week7;

import java.util.Arrays;
import java.util.Scanner;

public class S02 {
    /*
     * create a method accepts a name as parameter
     * and prints the name as a char array
     *
     * (do not use toCharArray() method)
     *
     * Input : John
     * Output : [J, o, h, n]
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please, enter a String");
        String s = input.nextLine();
        System.out.println(Arrays.toString(myMethod(s)));
        getNameAsAChar("John");

    }

    public static String[] myMethod(String s) {
        String arr[] = s.split("");
        return arr;
    }

    // 2.way
    public static void getNameAsAChar(String name) {
        char c[] = new char[name.length()];
        int idx = 0;
        for (int i = 0; i < name.length(); i++) {
            c[idx] = name.charAt(i);
            idx++;
        }
        System.out.println(Arrays.toString(c));

    }
}