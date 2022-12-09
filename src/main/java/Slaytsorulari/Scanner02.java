package Slaytsorulari;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*Type a program which converts the mile to kilometer. Mile value will be
        entered by user. (Use double)
        Hint 1: km = mile x 1.6
        Hint 2: To get double, use nextDouble()
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the value as mile");
        double valueMile = scan.nextDouble();
        double valueKm = valueMile*1.6;

        System.out.println(valueKm);

        scan.close();

    }
}
