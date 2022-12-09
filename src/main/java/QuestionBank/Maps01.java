package QuestionBank;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {
        // 1) There is a Map which contains product names as key and number of the products as value.
        //Type code to find the total number of products.

        HashMap<String,Integer> products = new HashMap<>();
        products.put("TV",3);
        products.put("Radio",6);
        products.put("Phone",7);
        products.put("Laptop",8);
        products.put("Earphone",9);

        int sum =0;
        Collection<Integer> values=  products.values();
        for (Integer w:values){
            sum = sum + w;
        }
        System.out.println(sum);

        // 2) There is a Map which contains product names as key and number of the products as value.
        //Type code to check if ‘Laptop’ is among the products

        if (products.containsKey("Laptop")){
            System.out.println("There is Laptop");
        }else {
            System.out.println("There is no Laptop");
        }
        //3) There is a Map which contains product names as key and number of the products as value.
        //Print the prices in ascending order.

        Object[] arr = products.values().toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 4) There is a Map which contains product names as key and number of the products as value.
        //Print the product names in alphabetical order

        Set<String> keys = products.keySet();

        TreeSet<String> keysSet = new TreeSet<>(keys);
        System.out.println(keysSet);


    }
}
