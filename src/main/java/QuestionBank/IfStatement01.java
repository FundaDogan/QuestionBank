package QuestionBank;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        /*1) Type code to print
        a) "Winter" for December, January, February
        b) "Spring" for March, April, May
        c) "Summer" for June, July, August
        d) "Fall" for September, October, November
        e) "Invalid month name" for all the others
         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a month name");
        String month = input.next();

        if(month.equalsIgnoreCase("december") ||
           month.equalsIgnoreCase("january") ||
           month.equalsIgnoreCase("february")){
            System.out.println("winter");
        }else if(month.equalsIgnoreCase("march") ||
                 month.equalsIgnoreCase("april") ||
                 month.equalsIgnoreCase("may")){
            System.out.println("spring");
        }else if(month.equalsIgnoreCase("june") ||
                 month.equalsIgnoreCase("july") ||
                 month.equalsIgnoreCase("august")){
            System.out.println("summer");
        }else if(month.equalsIgnoreCase("september") ||
                 month.equalsIgnoreCase("october") ||
                 month.equalsIgnoreCase("november")){
            System.out.println("fall");
        }else{
            System.out.println("invalid");
        }
        input.close();
    }

}
