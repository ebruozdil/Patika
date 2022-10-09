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

        double avarage = (mat+fizik+turkce+kimya+muzik)/5;
        if(avarage<=50){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        }else{
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız : "+avarage);
    }
    
}
