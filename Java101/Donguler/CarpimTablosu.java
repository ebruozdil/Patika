package Donguler;
import java.util.Scanner;
public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("10 luk tabloda Çarpılacak sayıyı giriniz: ");
        int N = scanner.nextInt();

        for(int i=1; i<=10; i++){
            int result = N * i;
            System.out.println(N+ " x "+i+" = "+result);
        }
        scanner.close();
    }
}
