package Eski;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {
    public static void main(String[] args) {
        /* 5 elemanli Integer list olusturun.
        elemanlari birer birer ayni satira aralarina bosluk birakarak yazdirin.
         */


        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        System.out.println(ls);

        //1. yol for loop ile
        for (int i=0; i<5;i++){
            System.out.print(ls.get(i)+ " ");
        }
        System.out.println();

        //2. yol for each loop ile
        for (Integer w :ls){
            System.out.print(w+" ");
        }

        // a)for each kullanarak ls listindeki tum elemanlarin toplamini bulunuz.
        int sum =0;
        for (Integer w :ls) {
            sum= sum+w;
        }
        System.out.println();
        System.out.println(sum);

        // b) ilk iki eleman haric diger elemanlari ekrana yazdiriniz.
        // Note: substring metodu ile istedigim elemanlari yazdirabilirim.
        // ilk sayi dan baslar son sayi dahil degil.

        for (Integer w: ls.subList(2,ls.size())){
            System.out.print(w+" ");
        }
        System.out.println();

        // c) indexi 1 olan elemandan indexi 3 olan 3 dahil elemana kadar tum elemanlari yazdiriniz
        for (Integer w: ls.subList(1,4)){
            System.out.print(w+" ");
        }
        System.out.println();

        // d) ls listindeki elemanlardan tek sayi olanlari yazdirmayin.
        // 1. yol
        for (Integer w : ls){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
        System.out.println();
        //2.yol

        // NOTE: INTERVIEW DA  sorabilirler !
        // "CONTINUE"  key word u ile cozum

        for (Integer w: ls){
            if(w%2!=0){
                continue;    // :continue bunu gec siradaki elemani check et diyo.
            }
            System.out.print(w+" ");
        }
        System.out.println();

        // BREAK keywordu ile cozum
        // ls listindeki elemanlari 5 gorunceye kadar yazdirin. 5 yazilmasin

        for (Integer w: ls){  // ls listindeki elemanlari tek tek deneyecek.
            if(w==5){         // if metodu eleman 5 ise calisir ve break loop u kirar.
                break;       // eleman 5 degilse if body calismaz break aktif olmaz ve alta gecer
                             // loop devam eder ve elemani yazdirir.

            }
            System.out.print(w+" ");
        }

        /* BREAK belli sartlara bagli olarak loop u kirmak icin kullanilir.
        continue ise belli sartlara bagli olarak bazi elemanlari islem disi tutmak icicn kullanilir.
         */




    }
}
