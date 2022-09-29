import java.util.Scanner;

public class KullaniciVeriAlma {public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    
    System.out.println("Adınız:");
    String adSoyad = inp.nextLine();
    
    System.out.println("Yaş:");
    int yas = inp.nextInt();
    
    System.out.println("Maaş:");
    double maas = inp.nextDouble();

    // Çıktılar
    System.out.println("Ad Soyad: " + adSoyad);
    System.out.println("Yaş : " + yas);
    System.out.println("Maaş : " + maas);
}
}
