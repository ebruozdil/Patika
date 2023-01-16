package Donguler;
import java.util.Scanner;
public class HarmonikSeri {
//Java ile girilen sayının harmonik serisini bulan program yazacağız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();
        double result =0.0 ;
        for (double i = 1;i<=number ; i++){
            result += (1/i);
        }
        System.out.println(result);
        
        input.close();
    }
}
