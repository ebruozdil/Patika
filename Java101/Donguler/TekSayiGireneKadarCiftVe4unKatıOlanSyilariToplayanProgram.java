package Donguler;
import java.util.Scanner;

public class TekSayiGireneKadarCiftVe4unKatıOlanSyilariToplayanProgram {
    public static void main(String[] args) {
        int n,total=0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Bir Sayı Giriniz: ");
            n= input.nextInt();

            if(n%2==0 && n%4==0 ){
                total+=n;
            }
        }while(n%2==0);
        System.out.println(total);

        input.close();
    }
}
/*Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden 
ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz. */