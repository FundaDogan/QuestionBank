package Practice.week4;

import java.util.Arrays;

public class Q02_Arrays {
    public static void main(String[] args) {

        // Example 1: Type code to print the sum of minimum and maximum integers in an Array.

        int arr[]= {12, 56, 89, 5, 34, 92};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minValue = arr[0];
        int maxValue = arr[arr.length-1];

        System.out.println(maxValue+minValue);



        //Example 2: Type code to check if a specific element exists in an Array or not

        int arrInt[]= {250, 85, 98, 25, 88, 654, 789};

        Arrays.sort(arrInt);
        System.out.println(Arrays.toString(arrInt));

        int idx = Arrays.binarySearch(arrInt,67);
        System.out.println(idx);

        if (idx>=0){
            System.out.println("the element is exist");
        }else {
            System.out.println("the element is not exist");
        }


    }
}
