package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;
public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        double perKm=0.10,total=0, discount=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz: ");
        double km = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz(1 => Tek yön, 2 => Gidiş dönüş) : ");
        int type =input.nextInt();

        double normalTotal=km*perKm;
        System.out.println("Uçuşun toplam fiyatı: "+total);

        if (!(km < 0 || age < 0)) {
			
			if (age < 12) {
				discount = normalTotal * 0.5;
			} else if (age >= 12 && age <= 24) {
				discount = normalTotal * 0.1;
			} else if (age > 65) {
				discount = normalTotal * 0.3;
			}
	
			total = normalTotal - discount;
			
			if(type == 2) {
				discount = total * 0.2;
				total = (total - discount) * 2;
			}
			
		} else {
			System.out.println("Hatalı Veri Girdiniz ! ");
		}
		
		System.out.println("Toplam Tutar : " + total + " TL");
	
		input.close();
	}
}