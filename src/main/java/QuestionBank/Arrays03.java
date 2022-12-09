package QuestionBank;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays03 {
    public static void main(String[] args) {

        /*  3) Find the elements whose length is the smallest in a String array
            Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

         */

       String arr[]= {"Kemal","Jonathan","Mark","Angie","Veli"};
       Arrays.sort(arr,Comparator.comparingInt(String::length));

       int minLength = arr[0].length();

       String shortestWords = "";

       for (String w: arr){

           if (w.length()==minLength){
              shortestWords= shortestWords+ w+" ";
           }

       }
        System.out.println(shortestWords);
// Birden fazla kisa eleman oldugu icin bos string olusturup icine ekledik





    }
}
