package QuestionBank;

import java.util.Scanner;

public class Loop06 {

    public static void main(String[] args) {

        /*  6) Type code to draw the following image by using a for loop.
            A
            A A
            A A A
            A A A A
        */

        for (int i=1; i<5; i++){

            for (int k=1; k<=i; k++){
                System.out.print("A ");
            }
            System.out.println();
        }

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter the number of rows");
        int numOfRows = input.nextInt();

        for (int j=1; j<=numOfRows; j++){

            for (int m=1; m<=j; m++){
                System.out.print("A ");
            }
            System.out.println();
        }

       // 8) Type code to print odd integers from 20 to 3 in the same line with a space between two
        //consecutive ones.

        for (int l=20; l>2; l--){
            if (l%2!=0){
                System.out.print(l+" ");
            }
        }







    }
}
