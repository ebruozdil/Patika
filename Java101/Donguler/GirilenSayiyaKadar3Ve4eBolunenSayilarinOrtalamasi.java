package Donguler;

import java.util.Scanner;

public class GirilenSayiyaKadar3Ve4eBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int k , t=0 ,total=0 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        k= input.nextInt();

        
        for (int i=1; i<=k; i++ ){
            if(i%3==0 && i%4==0 ){
                t++;
                System.out.println(i);
                total+=i;  
                
                System.out.println(t);
            }
        }
        System.out.println(k+"ya kadar olan sayılardan 3 e ve 4 e bölünen sayıların ortalaması: "+total/t);
        input.close();
    }
}
