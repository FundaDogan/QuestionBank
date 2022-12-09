package QuestionBank;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        /*1) Find the middle element in an integer array
            Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
            (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
         */

        int arr[] = {12, 5, 8,9};

        Arrays.sort(arr);
        int idx=arr.length/2;

        if (arr.length%2!=0){

            System.out.println("middle element is "+ arr[idx]);

        }else{
            System.out.println("middle element is "+ (arr[idx]+arr[idx-1])/2);
        }

        //2) Find the smallest positive element and greatest negative element in an integer array
       // Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2








    }
}
