package QuestionBank;

import java.util.Arrays;

public class Arrays08 {
    public static void main(String[] args) {

        // 8) Type code to find array elements whose first and last characters are same

        String arr[]={"Ali", "Ayse", "ege","emine"};

        for (String w: arr){

            if (w.charAt(0)==w.charAt(w.length()-1)){
                System.out.print(w+ " ");
            }

        }

        System.out.println();

        // 9) Type code to find if a given element exists in a given array or not

        char brr[] = {'a','b','c','d','e'};
        Arrays.sort(brr);

        int i = Arrays.binarySearch(brr,'a');
        System.out.println(i);
        if (i>=0){
            System.out.println("The element is exist");
        }else{
            System.out.println("The element is not exist");
        }

        int j = Arrays.binarySearch(brr,'f');
        System.out.println(j);
    }
}
