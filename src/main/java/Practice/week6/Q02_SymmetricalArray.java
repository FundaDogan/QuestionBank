package Practice.week6;

public class Q02_SymmetricalArray {

    // type a method to check if an int Array is symmetrical or not.
    // palindrome

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 2, 1};

        System.out.println("Is array symmetrical? " + symmetrical(arr));  //Is array symmetrical? true

    }

    public static boolean symmetrical(int[] arr) {

        boolean result = false;// local variable should be initialized

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arr[arr.length - 1 - i]) {
                result = true;
            } else {
                result = false;
                break;  // sebebi false yakalninca loop u kir devam edrse true ya doner result ve true basar symetric
                // olmadigi halde ==> {1,2,3,4,2,1} ornegi

            }
        }
           return result; // return type void olmayinca retur yazmak gerekiyor

    }
}
