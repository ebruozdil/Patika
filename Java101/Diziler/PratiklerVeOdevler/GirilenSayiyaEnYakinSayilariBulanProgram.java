package Diziler.PratiklerVeOdevler;

import java.util.Arrays;
import java.util.Scanner;

public class GirilenSayiyaEnYakinSayilariBulanProgram {
    public static void main(String[] args) {

        int[] list={15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi : "+Arrays.toString(list));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı : " );
        int number= scanner.nextInt();
        scanner.close();

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        int infumum = min;          //(infumum = en büyük alt sınır )
        int supremum = max;             //(supremum = en küçük üst sınır )
        
        for (int i : list) {
            if (i < number) {
                infumum = (number - infumum < number - i) ? infumum : i;
            } else if (i > number) {
                supremum = (supremum - number < i - number) ? supremum : i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+infumum);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+supremum);
    }
}
