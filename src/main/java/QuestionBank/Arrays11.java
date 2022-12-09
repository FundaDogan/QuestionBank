package QuestionBank;

import java.util.Arrays;

public class Arrays11 {
    public static void main(String[] args) {

        // 11) Type code to put all zeros to end in an integer array.
        //Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        int arr[]= {5, 0, 2, 0, 3};

        int brr[]= new int[5];

        int idx=0;

        for (int i =0; i<arr.length; i++){

            if (arr[i]!=0){

                brr[idx]=arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));

    }
}
