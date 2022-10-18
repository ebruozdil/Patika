package Donguler;

import java.util.Scanner;

public class DoWhileDongusu {
    public static void main(String[] args) {
        int year = 2020;
        do{
	    System.out.println("Döngü çalışıyor.");
	    year++;
        } while (year < 2020);
        /*Do-while döngüsünde, döngü bloğu içindeki kod kesimi en az bir kez mutlaka işletilecektir. 
        Çünkü önce döngü bloğu işletilip sonra koşul denetlenmektedir.
        While döngüsünde ise önce koşula bakılıp sonra döngü bloğu işletildiği için, döngüye hiç girilmemesi olasıdır.*/

        Scanner input = new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do {
            System.out.print("Şifre Giriniz: ");
            pass= input.nextInt();
            if (pass == 123){
                System.out.println("Doğru");
                askPassword = false;
            }else {
                System.out.println("Yanlış");
            }
        }while (askPassword);
        //-------
        int i=1, j=1;
        while(i<3){
            do{
                System.out.print(j + ",");
                j++;
            }while(j<4);
                i++;
        }
        //----
        int age=20;
        do{
            age++;
        }while(age<20);
        System.out.println(age);
    }
}
