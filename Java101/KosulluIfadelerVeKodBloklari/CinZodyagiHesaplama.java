package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;
<<<<<<< HEAD:Java101/KosulluIfadelerVeKodBloklari/CinZodyagiHesaplama.java
public class CinZodyagiHesaplama {
=======

public class CinZodyagıHesaplama {
>>>>>>> 5571ea73cf28164a3cbfbd6204ee3a3eb9122053:Java101/KosulluIfadelerVeKodBloklari/CinZodyagıHesaplama.java
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        int year= input.nextInt();

        int kalan=(year%12);
        
        if(kalan==0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun ");
        }else if(kalan==1){
            System.out.println("Çin Zodyağı Burcunuz : Horoz ");
        }else if(kalan==2){
            System.out.println("Çin Zodyağı Burcunuz : Köpek ");
        }else if(kalan==3){
            System.out.println("Çin Zodyağı Burcunuz : Domuz ");
        }else if(kalan==4){
            System.out.println("Çin Zodyağı Burcunuz : Fare ");
        }else if(kalan==5){
            System.out.println("Çin Zodyağı Burcunuz : Öküz ");
        }else if(kalan==6){
            System.out.println("Çin Zodyağı Burcunuz : Kaplan ");
        }else if(kalan==7){
            System.out.println("Çin Zodyağı Burcunuz : Tavşan ");
        }else if(kalan==8){
            System.out.println("Çin Zodyağı Burcunuz : Ejderha ");
        }else if(kalan==9){
            System.out.println("Çin Zodyağı Burcunuz : Yılan ");
        }else if(kalan==10){
            System.out.println("Çin Zodyağı Burcunuz : At ");
        }else if(kalan==11){
            System.out.println("Çin Zodyağı Burcunuz : Koyun ");
        }   
    }
}
