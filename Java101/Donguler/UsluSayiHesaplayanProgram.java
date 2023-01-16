package Donguler;
import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n= input.nextInt();
        System.out.print( "Üs olacak sayı : ");
        k = input.nextInt();
        int total=1;

        // 3^4 = 3*3*3*3 
/*      int i = 1;
        while (i <= k){
            total *= n;
            i++;
        }
        System.out.println("Cevap : "+ total);    
Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.*/

        for(int i=1;  i<=k ; i++){
            total *= n;
        }
        System.out.println("Cevap : "+n+"^"+k+ "="+total);  

        input.close();
    }
}
