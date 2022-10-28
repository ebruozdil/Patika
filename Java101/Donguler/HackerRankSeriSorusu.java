package Donguler;

import java.util.Scanner;

public class HackerRankSeriSorusu {
    public static void main(String[] args) {
        /*
        SERİ:
        (a + (2^0)*b),(a + (2^0)*b + (2^1)*b), ... , (a + (2^0)*b + (2^1)*b + ... + (2^(n-1))*b)
        */
        Scanner input = new Scanner(System.in);
       // System.out.print("Sorgu sayısını giriniz (q) : ");
        int q = input.nextInt();
        for (int i=1; i<=q;i++){
           // System.out.print("a,b,n değerleri girin : ");
            int a= input.nextInt();
            int b= input.nextInt();
            int n= input.nextInt();
            int total=a;
            for (int j=0; j<n; j++){
                total +=(Math.pow(2,j)*b);
                System.out.print(total+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
