package Donguler;
import java.util.Scanner;
public class GirdilerdenMaxMinBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int N = input.nextInt();
        int i=1, minNumber=0, maxNumber=0, a=N;

        while (N>0){
            System.out.print(i+". Sayıyı giriniz: ");
            int number= input.nextInt();

            if(N==a){
                maxNumber=number;
                minNumber=number;
            }else{
                if (number > maxNumber){
                    maxNumber=number;
                }else if (number < minNumber){
                    minNumber= number;
                }
            }

            i++;
            N--;
        }
        System.out.println("En büyük sayı: "+maxNumber);
        System.out.println("En küçük sayı: "+minNumber);
    }
}
