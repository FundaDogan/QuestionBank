package Practice.week7;

import java.util.Arrays;
import java.util.Scanner;

public class S01 {
    // Create a method that joins the given Strings
// input => "Please", "join", "the", "given", "words"
// output => "Please join the given words"

    public static void main(String[] args) {
        join();
    }

    public static void join(){

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter the number of Strings you want to enter");
        int numOfStrings = input.nextInt();

        String arr[] = new String[numOfStrings];

        for (int i=0; i< arr.length; i++){
            System.out.println("please, enter "+ (i+1)+". String");
            String str = input.next();
            arr[i] = str;
        }

        System.out.println(Arrays.toString(arr));
    }




}
