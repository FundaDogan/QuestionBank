package Practice.week6;

public class Review01 {

     /*
       Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         a*(b+c+d+f)
    */

    public static void main(String[] args) {

        myMethod(7,4,5,6,2,3);

        int arr[]={1,2,3,4,2,1};
        System.out.println(symmetrical(arr));

    }

    public static void myMethod(int a, int...numbers){

        int sum =0;
        for (int w:numbers){
            sum+=w;
        }
        System.out.println(a*sum);
    }

    public static boolean symmetrical(int arr[]){
        boolean result=false;

        for (int i=0; i<arr.length;i++){
            if (arr[i]==arr[arr.length-1-i]){
                result= true;
            }else{
                result=false;
                break;
            }
        }
        return result;

    }
}
