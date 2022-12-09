package QuestionBank;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        /*  2) Find the smallest positive element and greatest negative element in an integer array
             Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

         */

        int arr[]= {-12, 18, -5, 23, -2};

        Arrays.sort(arr);   // -12, -5, -2, 18, 23

        for (int i=0; i<arr.length; i++){

            if (arr[i]<0 && arr[i+1]>0){
                System.out.println("max negative is "+arr[i]);
                System.out.println("min pozitive is "+arr[i+1]);
            }
        }



    }
}
