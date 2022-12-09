package Slaytsorulari;

public class WhileLoop01 {
    public static void main(String[] args) {

        //1) Type java code by using while loop,
        //Write a program to print numbers from 1 to 5.
        int i=1;
        while (i<=5){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        // 2) Type java code by using while loop.
        //Write a program that types first 30 consecutive odd integers.

        int i1=1;
        int count=1;
        while (count<=30){
            if(i1%2!=0){
                System.out.print(i1+" ");
                count++;
            }
            i1++;
        }

        System.out.println();










    }
}
