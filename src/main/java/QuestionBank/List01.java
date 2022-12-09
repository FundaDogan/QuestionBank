package QuestionBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List01 {
    public static void main(String[] args) {

        // 1) Find the sum of all list elements in an integer list

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(11);
        list.add(3);
        list.add(4);
        int sum=0;
        for (Integer w: list){
            sum = sum+w;
        }
        System.out.println(sum);

        // 2) Find the sum of all list elements before the first occurrence of 13 in an integer list

        int sum1=0;

        List<Integer> list1 = Arrays.asList(2,4,6,13,4,5);

        for(Integer w: list1){
            if (w==13){
                break;
            }
            sum1 = sum1+w;
        }
        System.out.println(sum1);

        //3) Find the multiplication of all even list elements in an integer list

        List<Integer> list2 = Arrays.asList(2,3,4,5,6,7);
        int product=1;

        for (Integer w:list2){

            if (w%2==0){
                product = product *w;
            }
        }
        System.out.println(product);






    }
}
