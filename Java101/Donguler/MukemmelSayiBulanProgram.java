/* Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) 
toplamı kendisine eşit olan sayıya mükemmel sayı denir.*/
package Donguler;
import java.util.Scanner;
public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n= input.nextInt();
        int total=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                total+=i;
            }
        }
        if(total==n){
            System.out.println(n+" Mükemmel sayıdır");
            
        }else{
            System.out.println(n+" Mükemmel sayı değildir.");
        }
    }
}
