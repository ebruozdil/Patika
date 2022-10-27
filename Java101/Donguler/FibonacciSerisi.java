package Donguler;
import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısı kaç olsun? : ");
        int N = input.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(N+" Elemanlı Fibonacci Serisi : ");
        for (int i=1; i<=N ; i++){
            n3=n1+n2;
            System.out.print(n1+" ");
            n1=n2;
            n2=n3;
        }
    }
}
