package QuestionBank;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays12 {
    public static void main(String[] args) {

        // 12) Create an integer array by getting the elements from the user then print the difference
        //between the smallest and the greatest elements on the console.

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter the number of elements");
        int numOfElements = input.nextInt();

        int arr[] = new int[numOfElements];

        for (int i =0; i<numOfElements; i++){

            System.out.println("please, enter "+ (i+1)+". element");
            int j= input.nextInt();
            arr[i]=j;
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        int greatestElement = arr[arr.length-1];
        int smallestElement = arr[0];

        System.out.println("The difference between greatest and smallest element is " + (greatestElement-smallestElement));

    }
}
