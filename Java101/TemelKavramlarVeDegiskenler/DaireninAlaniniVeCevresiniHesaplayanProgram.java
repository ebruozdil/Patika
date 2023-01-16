package TemelKavramlarVeDegiskenler;
import java.util.Scanner;

public class DaireninAlaniniVeCevresiniHesaplayanProgram {
   public static void main(String[] args) {
    int r;
    double pi=3.14, alan, cevre, a, alan2;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Dairenin yarı çapını giriniz : ");
    r=input.nextInt();

    alan= pi * r * r ;
    cevre= 2*pi*r;


    //ödev kısmı
    System.out.print("Dairenin dilim açısını giriniz : ");
    a=input.nextInt();
    alan2= (pi * (r*r) * a) / 360 ;

    System.out.println("Dairenin çevresi = "+cevre);
    System.out.println("Dairenin alanı = "+alan);
    System.out.println("Dairenin merkez açısıyla bulunan dilim alanı = "+alan2);
   
    input.close();
   }
}


/*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
[Patika.dev](www.patika.dev)
 */