package Diziler.PratiklerVeOdevler;

import java.util.Arrays;
import java.util.Scanner;
//Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        int[] list = new int[n];
        
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i=0; i<list.length; i++){
            System.out.print((i+1)+". Elemanı : ");
            list[i]= input.nextInt();
        }

        int max;
        for (int i=0; i<list.length;i++){
            for(int j=i; j< list.length; j++){
                if(list[i]>list[j]){
                    max = list[i];
                    list[i]=list[j];
                    list[j] = max;
                }
            }
        }
        System.out.print("Sıralama : ");
        System.out.println(Arrays.toString(list));

        input.close();
    }
}
