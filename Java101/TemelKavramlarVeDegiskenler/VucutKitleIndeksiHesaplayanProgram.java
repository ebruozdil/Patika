package TemelKavramlarVeDegiskenler;
import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy= input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo= input.nextDouble();

        //Vücut Kitle İndeksi Hesaplama Formülü : Kilo (kg) / Boy(m) * Boy(m)

        indeks = kilo / (boy * boy) ;
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

        input.close();
    }
}
