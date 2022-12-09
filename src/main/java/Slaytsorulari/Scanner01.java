package Slaytsorulari;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*) Type a program which calculates the perimeter of a triangle whose
        Side lengths are entered by user. (Use byte)
        Hint 1: Perimeter of a triangle is a + b + c
        Hint 4: To get byte, use nextByte()
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the lengths of the triangle");
        byte b1 = scan.nextByte();
        byte b2 = scan.nextByte();
        byte b3 = scan.nextByte();
        System.out.println("the perimeter of the triangle is " + (b1+b2+b3));

        scan.close();








    }
}
