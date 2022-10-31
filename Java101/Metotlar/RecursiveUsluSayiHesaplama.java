package Metotlar;
import java.util.Scanner;
public class RecursiveUsluSayiHesaplama {

    static int power( int base,int exponent){
        
        if(exponent==0 || base==1){
            return 1;
        }
        return power(base,exponent-1)*base;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        System.out.println(power(base, exponent));
        scan.close();
    }
}
