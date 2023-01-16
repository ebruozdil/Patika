package Donguler;
import java.util.Scanner;
public class BasamakRakamlarininToplaminiBulanProgram {
/*Ödev (Patika.dev)
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
Örnek : 1643 = 1 + 6 + 4 + 3 = 14 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(   "Sayı giriniz : ");
        int number = input.nextInt();
        int tempNumber = number;
        int basValue ;
        int result = 0;
        while(tempNumber !=0 ){
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber/=10;
        }
        System.out.println(number+" Basamak sayılarının toplamı ="+result);
        input.close();
    }
}
