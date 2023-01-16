package Donguler;

import java.util.Scanner;

public class GirilenSayidanKücük2ninKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n = input.nextInt();

        for (int i=1; i<=n; i*=2){
            System.out.println(i);
        }
        input.close();
    }
}
/*Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
