package Metotlar;

import java.util.Scanner;

public class RecursiveDeseneGoreDesenOlusturma {
    static void f(int n){
        System.out.print(n+" ");
        if(n>0){
            f(n-5);
            System.out.print(n+" ");
        }       
        }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int n=input.nextInt();
        f(n);
        input.close();
    }
}
/* Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki 
kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 
5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde 
sayının son değerini ekrana yazdırın.*/