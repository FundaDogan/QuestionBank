package Slaytsorulari;

import java.util.Arrays;

public class MultiArray04 {

    public static void main(String[] args) {

        // 4) Find the sum of the elements in the array elements of the given multidimensional array
        //{ {1,2,3}, {4,5}, {6,7} } and return an array.
        //For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}

        int arr[][] = { {1,2,3}, {4,5}, {6,7} };

        int brr[] = new int[arr.length];

        int sum =0;

        for (int k=0; k< arr.length; k++){

            for (int i=0; i<arr[k].length; i++){

                sum= sum+arr[k][i];

            }
            brr[k]= sum;
            sum=0;
        }
        System.out.println(Arrays.toString(brr));




    }
}
