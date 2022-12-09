package w3source;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Write a Java program that takes a number as input and prints its multiplication
        // table upto 10.
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();

        for (int i=0; i< 11; i++){
            System.out.println(num + "x" + i+ "="+ (num*i));
        }

        //Write a Java program to compute a specified formula.
        // 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))

        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);

        printAreaOfCircle(3);
        printPerimeterOfCircle(3);

        //Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        System.out.println("enter 3 integers");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();

        System.out.println((i1+i2+i3)/3);  // double ver decimal icin


    }

    // Create a method to print the area and perimeter of a circle

    public static void printAreaOfCircle(int r){
        System.out.println("Area of circle = "+ 3.14*r*r);
    }

    public static void printPerimeterOfCircle(int r){
        System.out.println("Perimeter of circle = "+ 2*3.14*r);
    }




}
