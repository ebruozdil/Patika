package Donguler;

import java.util.Scanner;

//kaç kere döneceğini bildiğimiz yapılarda for dönüsünü kullanıyoruz.
public class ForDongusu {
    public static void main(String[] args) {
        for (int i = 3; i<=10; i+=2){
            System.out.println(i);
        }
        System.out.println("------");
        int k=3;
        while (k <= 10) {
            System.out.println(k);
            k+=2;
        }
//negatif sayı girinceye kadar sayı isteyen program yazıcaz.
        Scanner input = new Scanner(System.in);
        int sayi;
//for döngüsüyle;

      /*   for (boolean run = true; run; ){
            System.out.println("Sayı Giriniz :");
            sayi = input.nextInt();
            if(sayi<0){
                run = false;
            }   
        }  */

//while ile;

/*      System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();
        while (sayi >0){
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();
        }   */

//do while ile;

        do{
            System.out.print("Sayı Giriniz : ");
            sayi = input.nextInt();
        }while(sayi > 0);

    }
}
