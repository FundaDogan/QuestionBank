package Practice.week7;

public class IntegerValueOfMethod {

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("123"));
        System.out.println(Integer.valueOf(12));
        System.out.println(Integer.valueOf('a'));
        System.out.println(Integer.valueOf('1'));
        System.out.println();

        System.out.println(Character.getNumericValue('a'));
        System.out.println(Character.getNumericValue(12));
    }
}
