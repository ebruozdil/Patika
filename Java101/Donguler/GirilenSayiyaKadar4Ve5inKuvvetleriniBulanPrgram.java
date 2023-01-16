package Donguler;

import java.util.Scanner;

public class GirilenSayiyaKadar4Ve5inKuvvetleriniBulanPrgram {
    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n= input.nextInt();

        System.out.println("4'ün kuvvetleri: ");
        for (int i=1; i<=n ; i*=4){
                System.out.println(i);
        }

        System.out.println("5'in kuvvetleri: ");
        for (int i=1; i<=n ; i*=5){
            System.out.println(i);
        }
        input.close();
    }
}
/*Ödev  Patika.dev
Java döngüler ile girilen sayıya kadar 
olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz. */