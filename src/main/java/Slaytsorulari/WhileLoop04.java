package Slaytsorulari;

import java.util.Scanner;

public class WhileLoop04 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("please, enter a positive integer");
        int num= scan.nextInt();

        int product=1;
        int i=num;
        while (i>0){
            product=product*i;
            i--;
        }
        System.out.println("the factorial of "+ num+"="+product);

        scan.close();

    }

}
