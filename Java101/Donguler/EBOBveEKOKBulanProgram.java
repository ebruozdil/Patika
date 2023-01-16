package Donguler;
import java.util.Scanner;
public class EBOBveEKOKBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
//ebob
        for (int i=1 ; i <= n1; i++){
            if (n1%i == 0 && n2%i==0 ){
                System.out.println(i);
                ebob = i;
            }
        }
        System.out.println("=====");
//ikinci yöntem daha az maaliyet daha iyi
        for (int k=n1; k>=1; k--){
            if (n1%k==0 && n2%k==0){
                ebob=k;
                System.out.println(n1+" ve "+n2+" sayılarının EBOB'u : "+ebob);
                break;
            }
        }

//ekok
        for (int i=1 ; i<=(n1 * n2); i++){
            if (i%n1==0 && i%n2==0){
                System.out.println(n1+" ve "+n2+" sayılarının EKOK'u "+i);
                break;
            }
        }
//formülden ekok :

        System.out.println((n1*n2) / ebob);
        input.close();
    }
}
