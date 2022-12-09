package Eski;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListSoru01 {
    public static void main(String[] args) {
        /*Kullanicidan tam ismini alin.
        ismin harflerini bir liste ekleyin
        harfleri alfabetik sirada buyuk harfler olarak yazin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("tam isminizi giriniz");// userdan ismini istedik
        String name = scan.nextLine().replace(" ","").toUpperCase();

        /* gelen ismi name variable inin icine atadik. ayni anda gelen ismin karakterlerini buyuk
        harfe cevirdik ve bosluk karakterini replace metodu ile kaldirdik.
        bu 3 islemi ayri ayri da yapabilirdik ama ayni satirde yaptik, bir tasla 3 kus hesabi
         */
        System.out.println(name);// ismi yazdirdik

        List<Character> harfler = new ArrayList<>();// listi olusturduk ismine harfler dedik

        // harfleri forloop ile listin icine tek tek ekledik.

        for(int i=0; i<name.length();i++){
            harfler.add(name.charAt(i));   // name stringindeki charlari harfler listine ekle
        }
        System.out.println(harfler);// list ekrana yazdirdik

        Collections.sort(harfler);// listin elemanlarini alfabetik sirada siraladik

        System.out.println(harfler);// son halini yazdirdik.

        Collections.reverse(harfler);// alfabetik siranin tersinde siraladik.

        System.out.println(harfler);
        scan.close();
    }
}
