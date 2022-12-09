package Slaytsorulari;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {

        /*Type java code by using using ternary.
Take values of length and width of a rectangle from user and check if it is square or not.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the length of the rectangle");
        int length= scan.nextInt();
        System.out.println("please enter the width of the rectangle");
        int width = scan.nextInt();

       String result = (length>0 && width>0) ? (length==width ? "square" : "rectangular") :
                                                "please enter valid values";
        System.out.println(result);

        if (length>0 && width>0) {
            if(length==width){
                System.out.println("square");
            }else {
                System.out.println("rectangular");
            }

        }else {
            System.out.println("please enter invalid data");
        }

        scan.close();




    }
}
