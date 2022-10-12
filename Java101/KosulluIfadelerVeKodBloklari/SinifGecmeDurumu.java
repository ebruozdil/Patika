/*Dersler :Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/
package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat=input.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik=input.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce=input.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya=input.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik=input.nextInt();
        if((0<=mat&&mat<=100)&&(0<=fizik&&fizik<=100)&&(0<=turkce&&turkce<=100)&&(0<=kimya&&kimya<=100)&&(0<=muzik&&muzik<=100)){
            double avarage = (mat+fizik+turkce+kimya+muzik)/5;
            if(avarage<=50){
                System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            }else{
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            }
            System.out.println("Ortalamanız : "+avarage);
        }else{
            System.out.println("Notunuzu 0'la 100 arasında girmelisiniz.");
        } 
    }
}
