//  Ödev - Dizideki Elemanların Frekansı
//Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
package Diziler.PratiklerVeOdevler;

import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if ( i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
        int[] duplicate = new int[list.length];
        int indexndex=0;
        int count = 0;

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları ");
        
        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    count++;
                }
            }
            if(!isFind(duplicate, list[i]))
            System.out.println(list[i]+ " sayısı " +(count+1)+" kere tekrar edildi.");
            duplicate[indexndex++]= list[i];
        }
    }
}
