package Donguler;

import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {
        int i = 1;
        int k;

        System.out.println("Program başladı.");
        while(i <= 5){
            System.out.println(i);
            k=1;
            while (k<=10) {
                System.out.print(k+",");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Program bitti.");   

        int left=100, right=200;
        while (++left < --right); 
        System.out.println("100 ile 200 ün ortası: "+left);
        //------------

        int password;
        boolean isPasswordSuccess=false;

        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess){
            System.out.print("Şifreyi Giriniz: ");
            password = input.nextInt();
            if (password==123){
                System.out.print("Doğru");
                isPasswordSuccess = true;
            }else{
                System.out.println("Yanlış");
            }
        }
        input.close();
    }
}
