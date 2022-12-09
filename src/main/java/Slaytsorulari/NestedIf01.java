package Slaytsorulari;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*Type java code by using nested if statement,
    If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
    “Perfect even number” otherwise, the output will be “Good even number.”
     If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
    “Perfect odd number” otherwise, the output will be “Good odd number.”
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = scan.nextInt();

        if (num%2==0){
            if (num%3==0){
                System.out.println("perfect even number");
            }else{
                System.out.println("good even number");
            }

        }else{
            if (num%3==0) {
                System.out.println("perfect odd number");
            }else {
                System.out.println("good odd number");
            }
        }
        scan.close();

    }
}
