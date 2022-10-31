package Metotlar;

import java.util.Scanner;

public class RecursiveFibonacciSerisiBulanProgram {
    static int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        System.out.println( "Fibonacci değeri : f("+number+")="+fib(number));
        input.close();
    }
}

// 1 1 2 3 5 8 13 21
// f(1)=1
// f(2)= 1

// f(n)= f(n-1) + f(n-2)
// f(5)= f(4) + f(3)
// f(4)= f(3) + f(2)
// f(3)= f(2) + f(1)

