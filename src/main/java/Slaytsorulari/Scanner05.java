package Slaytsorulari;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        /*Type a program like;
        Ask user to enter two integer values, the first will be greater than the second.
                The remainder when you divide the first by the second will be the width,
                and the sum of the two numbers will be the length of a rectangle.
                Then calculate the area and the perimeter of the rectangle, and print them
        on the console.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 2 integer values which the first is greater than second");
        int f= scan.nextInt();
        int s= scan.nextInt();

        int width= f%s;
        int length = f+s;
        int area = width*length;
        int perimeter = 2*(width+length);
        System.out.println("area is "+ area);
        System.out.println("perimeter is "+ perimeter);

        scan.close();


        String str4 = "2"+"5" ;
        System.out.println(str4);

        String str5 = 2 + 3 +"4";
        System.out.println(str5);

        String str6 ="2" + (5 + 1) ;
        System.out.println(str6);



    }
}
