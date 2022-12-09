package Slaytsorulari;

public class Multiarray03 {
    public static void main(String[] args) {

        // 3) Find the sum of the elements whose indexes are same in the given two multidimensional arrays
        //arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }

        int arr[][]= { {1,2}, {3,4,5}, {6} };
        int brr[][]= { {7,8,9}, {10,11}, {12} };



        for (int i =0; i<arr.length; i++){

            int minIdx= Math.min(arr[i].length,brr[i].length);
            for (int k=0; k<minIdx; k++){

                System.out.println(arr[i][k]+brr[i][k]);

            }

        }


    }
}
