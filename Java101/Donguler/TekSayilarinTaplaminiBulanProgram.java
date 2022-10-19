package Donguler;
import java.util.Scanner;

public class TekSayilarinTaplaminiBulanProgram {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner input =new Scanner(System.in);
        
        do{
            System.out.println("Sayı Giriniz : ");
            n= input.nextInt();
            if(n%2 == 1) {
                total +=n;
            }
        }while(n>0); 
        System.out.println("Toplam : "+total);
    }
}
