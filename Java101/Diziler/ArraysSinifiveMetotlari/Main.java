package Diziler.ArraysSinifiveMetotlari;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,78,9,10};
        int[] list2 ={5, 67, 8, 98, 2 ,12};
        double[] list3 ={1.2,2.1,3.0,4.5};
        HelperArray helper = new HelperArray();
        helper.print(list3);
 //     helper.print(list);
//      helper.print(list2);              static bir metoda nesne üretmeden ulaşabiliriz.
        list2=HelperArray.fill(list2, 11);
        HelperArray.print(list2);


        System.out.println(Arrays.toString(list));
        Arrays.fill(list,10);                  //tüm listeye 10 değerini atadık.
        Arrays.fill(list, 2,5,7);     //index 2 den 5 e 7 değerini atadık.
        System.out.println(Arrays.toString(list));

//Arrays.sort() sıralama metodu--------------

        int[] list4={6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(list4);
        System.out.println(Arrays.toString(list4));

//Arrays.binarySearch() dizideki bir elemanın indis değerini bulur. Bu metodu kullanabilmek için dizinin sıralı olması gerekir.

        System.out.println(HelperArray.search(list4, 21));
        //binarySearch bütün elemanları gezmeden ortanca elemandan yola çıkarak yarıya indire indire buluyor.
        System.out.println(Arrays.binarySearch(list4, 21));

//Arrays.copyOf() ve Arrays.copyOfRange() metodları

        int[] copyList= Arrays.copyOf(list4, 4);
        System.out.println(Arrays.toString(copyList));
        int[] copyList2= Arrays.copyOf(list4,list.length);
        System.out.println(Arrays.toString(copyList2));
        int[] copyList3= Arrays.copyOfRange(list4,2,5);
        System.out.println(Arrays.toString(copyList3));

//Arrays.equals() metotu Java'da iki dizinin eşitliğini kontrol etmek için kullanılır

        int[] list5 = {1, 2, 3};
        int[] list6 = {1, 2, 3};
        int[] list7 = {1, 2, 10};

        System.out.println(Arrays.equals(list5, list6)); // true
        System.out.println(Arrays.equals(list6, list7)); // false

        System.out.println(HelperArray.equals(list6, list7));
    }
}
