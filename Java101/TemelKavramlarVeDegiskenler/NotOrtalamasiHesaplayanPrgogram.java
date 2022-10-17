package TemelKavramlarVeDegiskenler;
import java.util.Scanner;

public class NotOrtalamasiHesaplayanPrgogram {
    public static void main(String[] args){
        /*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını 
        kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.*/
    
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih =input.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya +turkce + tarih + muzik );
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız : "+ sonuc);

        /* Ödev : Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının 
        ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        Not : If ve Else kullanılmayacak... */

        String durum = sonuc>=60? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(durum);
    
    }
}
