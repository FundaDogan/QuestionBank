package Slaytsorulari;

public class MultiArray02 {

    public static void main(String[] args) {

        // 2) Find the product of the last elements in the array elements of the
        //given multidimensional array { {1,2,3}, {4,5}, {6} }

        int arr[][] = { {1,2,3}, {4,5}, {6} };
        int product=1;

       for (int[] w: arr){
            product =product* w[w.length-1];
       }
        System.out.println(product);











    }


}
