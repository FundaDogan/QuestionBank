package Practice.week7;

import java.util.Scanner;

public class Q01SumOfDigitsInString {

     /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16
     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    /*
    public static void main(String[] args) {
        String str = "12587po";
        System.out.println(sumOfDIgits(str));
    }
    public static  int sumOfDIgits(String s){
        int result = 0;
        s = s.replaceAll("[^0-9]","");
        for (int i =0;i<s.length();i++){
            String p = s.substring(i,i+1);
            result = result + Integer.valueOf(p);
        }
        return result;
    }

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine();

        sumOfDigits(str);

    }

    public static void sumOfDigits(String str){

        int sum=0;

        for (int i=0; i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){

                sum += Character.getNumericValue(str.charAt(i));
                //sum = sum+ Integer.valueOf(s.substring(i,i+1));

                //sum = sum + (s.charAt(i)); ==> digitlerin ascii valuelari sum a eklenir. sum== int sorun yok
                //sum= sum+Integer.valueOf(s.charAt(i)); ==> ustteki ile ayni, IntegervalueOf icine char yazarsak ascii deger verir
            }
        }
        System.out.println(sum);



    }
}
