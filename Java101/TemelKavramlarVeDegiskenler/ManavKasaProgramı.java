package TemelKavramlarVeDegiskenler;
import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        double kg, total, armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? : ");
        kg = scanner.nextDouble();
        total = kg * armut;

        System.out.println("Elma Kaç Kilo ? : ");
        kg = scanner.nextDouble();
        total += kg * elma;

        System.out.println("Domates Kaç Kilo ? : ");
        kg = scanner.nextDouble();
        total += kg * domates;

        System.out.println("Muz Kaç Kilo ? : ");
        kg = scanner.nextDouble();
        total += kg * muz;

        System.out.println("Patlıcan Kaç Kilo ? : ");
        kg = scanner.nextDouble();
        total += kg * patlican;

        System.out.println("Toplam Tutar : " +total+" TL" );

    }
}
