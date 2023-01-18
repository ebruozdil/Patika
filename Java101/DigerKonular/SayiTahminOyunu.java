package DigerKonular;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
       // int number = (int)(Math.random()*100);

        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong= false;

        while (right < 5){
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if(selected <0 || selected> 99){
                System.err.println("Hatalı giriş yaptınız. Lütfen 0-100 arasında bir değer giriniz. ");
                if(isWrong){
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : "+(5-(++right)));
                }else{
                    isWrong= true;
                    System.out.println("Bir daha hatalı giriş yaparsanız hakkınızdan düşecektir.");
                }
                continue;
            }
            if(selected == number){
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı : "+ number);
                isWin = true;
                break;
            }else{
                wrong[right]=selected;
                right++;
                System.out.println("Yanlış tahmin!");
                if(selected > number){
                    System.out.println(selected+" sayısı, sayısı gizli sayıdan büyüktür. ");
                }else{
                    System.out.println(selected+" sayısı, gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakkınız : "+ (5-right));
                if((5-right)==0){
                    System.out.println("Tahmin hakkınız bitmiştir. Gizli sayı : "+number);
                }
            }
        }
        if (!isWin){
            System.out.println("Tahminleriniz : "+Arrays.toString(wrong));
        }
        input.close();
    }
}
