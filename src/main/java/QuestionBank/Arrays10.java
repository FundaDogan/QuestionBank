package QuestionBank;

public class Arrays10 {

    public static void main(String[] args) {

        // 10) Type code to find sum of the number of characters of array elements

        String arr[] = {"Funda","Gonca"};

        int sum=0;
        for (String w: arr){
            sum = sum+w.length();
        }
        System.out.println(sum);

        char brr[]={'a','b','c'};
        int i = brr.length;
        System.out.println(i);


        double crr[]={1.2, 2.3, 3.45};

        int sum1=0;
        for (double u: crr){
            sum1= sum1 + String.valueOf(u).length();
        }
        System.out.println(sum1);


    }
}
