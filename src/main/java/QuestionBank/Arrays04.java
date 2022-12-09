package QuestionBank;

public class Arrays04 {
    public static void main(String[] args) {

        // 4) Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
        //Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM

        String arr[] ={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali"};

        String empty = "";

        for (String w: arr){

            if (w.endsWith("n") || w.endsWith("k")){
                empty=empty + w.substring(0,1);
            }
        }
        System.out.println(empty);

    }
}
