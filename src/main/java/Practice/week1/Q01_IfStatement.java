package Practice.week1;

import java.util.Scanner;

public class Q01_IfStatement {
    public static void main(String[] args) {
        /*
If the score is less than 50 then you will fail
If the score is greater than 50 then you will pass,

If the score is less than 50 then you will fail otherwise you will pass.(this way is better as it is shorter)
here only one condition will be checked.

if the first part is true then the first action eill occur but
if the first condition is false then the second action eill occur,this is the logic of "if else".
 */

        Scanner input= new Scanner(System.in);
        System.out.println("please enter your score");
        int score= input.nextInt();

        if(score>0 && score<50){
            System.out.println("you failed");
        }else if(score>=50){
            System.out.println("you passed");
        }else{
            System.out.println("please enter a valid number");
        }

        input.close();
    }
}
