package Slaytsorulari;

public class Typecasting {
    public static void main(String[] args) {
        /* Write a program to assign a value of 100.235 to a double variable
        and then convert it to int. Print it on the console.
        */
        double d= 100.235;
        int i= (int)d;
        System.out.println(d+" "+i);

        /*Write a program to add an integer variable having value 5
        and a double variable having value 6.2. Print the sum on the console.
         */

        int i1=5;
        double d1 = 6.2;
        System.out.println(i1+d1);

        /*Create an integer variable and increase it by 1, by using three different ways,
        then type every result on the console.

         */

        int j= 3;
        System.out.println(j);
        j=j+1;
        System.out.println(j);
        j+=1;
        System.out.println(j);
        j++;
        System.out.println(j);

        /*Create an integer variable and decrease it by 1, by using three different ways,
        then type every result on the console.
        */

        int k=10;
        System.out.println(k);
        k=k-1;
        System.out.println(k);
        k-=1;
        System.out.println(k);
        k--;
        System.out.println(k);



    }
}
