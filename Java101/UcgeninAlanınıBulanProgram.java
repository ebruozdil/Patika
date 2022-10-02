import java.util.Scanner;
public class UcgeninAlanınıBulanProgram {
    public static void main(String[] args) {
        double a,b,c,u,alan,cevre;

        Scanner input = new Scanner(System.in);

        System.out.println("1.Kenarı Giriniz : ");
        a = input.nextDouble();
        System.out.println("2.Kenari Giriniz : ");
        b = input.nextDouble();
        System.out.println("3.Kenarı Giriniz : ");
        c = input.nextDouble();
    
        u=(a+b+c)/2;
        cevre = 2*(u);
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı = "+alan);
    }
    
}