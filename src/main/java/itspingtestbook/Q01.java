package itspingtestbook;

public class Q01 {
    public static void main(String[] args) {

        String str = "Java";
        System.out.println(str.replace("", "/"));

        String str1 = "Hello World";
        System.out.println(str1.indexOf('h'));

        String text = "Max wants to go TJ-Maximum";
        System.out.println(text.replace("Max", "Carl"));

        String s = "123-Start!!!";
        System.out.println(s.replaceAll("[^Start]", "*"));
        System.out.println(s.replaceAll("\\A", "!!!"));

        String s1 = "123-Start";
        System.out.println(s1.replaceAll("\\w", ""));
        System.out.println(s1.replaceAll("\\Z", "*"));

        String str2 = "Java is easy";
        System.out.println(str2.substring(8, 8));




            int x = 0;
            while(x < 10){
                x++;
            }
            String message = x > 10 ? "Greater than" : "Less than";
            System.out.println(message+","+x);
        }








    }

