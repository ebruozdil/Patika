package Donguler;
import java.util.Scanner;
public class YildizlarlaTersUcgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        int n= input.nextInt();

        for(int i=1; i<=n;i++){
            for(int k=1; k<=i;k++){
                System.out.print(" ");
            }
            for(int m=1; m<=(2*(n-i)-1) ;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}