package TemelKavramlarVeDegiskenler;
import java.util.Scanner;

public class DikUcgendeHipotenüsBulanProgram {
    public static void main(String[] args) {
    double kenar1 , kenar2, hipotenüs;

    Scanner input = new Scanner(System.in);
    
    System.out.println("1.Kenarı Giriniz : ");
    kenar1 = input.nextDouble();
    System.out.println("2.Kenari Giriniz : ");
    kenar2 = input.nextDouble();

    hipotenüs = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
    System.out.println("Hipotenüs = "+hipotenüs);
    }
}
