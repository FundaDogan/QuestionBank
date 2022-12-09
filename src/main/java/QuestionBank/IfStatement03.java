package QuestionBank;

public class IfStatement03 {
    public static void main(String[] args) {

        /*3) Type code to print
        a) "Round up by last digit:" and print the rounded value if the last digit is greater than
        or equal to 5
        b) "Round down by last digit" and print the rounded value if the last digit is less than 5

         */

        int i = 57;
        int lastDigit= i%10;
        if (lastDigit>=5){
            System.out.println("Round up by last digit: "+(i/10+1)*10);
        }else{
            System.out.println("Round down by last digit: "+(i/10)*10);
        }


       // 4) Type code to print the name of the month when you entered the number of the month.
              // Example; For 1 output is "January", for 2 output is "February" etc.






        

    }
}
