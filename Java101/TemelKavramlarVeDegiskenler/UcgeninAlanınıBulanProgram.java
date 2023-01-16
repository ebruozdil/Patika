package TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class UcgeninAlanınıBulanProgram {
    public static void main(String[] args) {
        double a,b,c,u,alan;

        Scanner input = new Scanner(System.in);

        System.out.println("1.Kenarı Giriniz : ");
        a = input.nextDouble();
        System.out.println("2.Kenari Giriniz : ");
        b = input.nextDouble();
        System.out.println("3.Kenarı Giriniz : ");
        c = input.nextDouble();
    
        u=(a+b+c)/2;
        //cevre = 2*(u);
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı = "+alan);
    
        input.close();
    }
}
/*Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
(www.patika.dev)[patika ödevi]
 */