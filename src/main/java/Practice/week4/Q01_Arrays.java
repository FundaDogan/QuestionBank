package Practice.week4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays {

    public static void main(String[] args) {

        //Ask user to enter the number of the names into the application by using an Array
        // then take the name of the elements and then print them on the console.

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter the number of the names");
        int numOfNames= input.nextInt();

        String arr[] = new String[numOfNames];

        for (int i=0; i<numOfNames; i++){

            System.out.println("please, enter "+ (i+1) + ". element");
            String name = input.nextLine();
            arr[i]= name;
        }
        System.out.println(Arrays.toString(arr));








    }

}
