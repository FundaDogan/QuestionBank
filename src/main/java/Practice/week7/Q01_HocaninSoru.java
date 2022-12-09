package Practice.week7;

import java.util.Scanner;

public class Q01_HocaninSoru {

    /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16
     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine();

        sumOfDigits("J4\\/4 1$ 34$¥");

    }

    public static void sumOfDigits(String str){

        try{
            int sum =0;

            for (int i=0; i<str.length();i++){

                if (Character.isDigit(str.charAt(i))){
                    sum+= Integer.valueOf(""+ str.charAt(i));
                }
            }
            System.out.println(sum);
        }catch (Exception e){
            System.out.println("there has been an issue while summing up");
        }

    }
}
