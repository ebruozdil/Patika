package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, select, newPassword ;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.println("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }else if(!password.equals("java123")){
            System.out.println("Şifreniz Yanlış ! ");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? E/H ");
            select= input.nextLine();
            if (select.equals("E")){
                System.out.println("Yeni Şifre : ");
                newPassword=input.nextLine();
                if(newPassword.equals(password)||password.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz." );
                }else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }else if (select.equals("H")){
                System.out.println("Şifre değiştirilmedi. Sistemden çıkış yapılıyor.");

            }else{
                System.out.println("Hatalı giriş yaptınız.Lütfen E veya H seçeneğinden birini seçiniz.");
            }
        }else{
            System.out.println("Bilgileriniz yanlış.Kullanıcı adınızı kontrol edip tekrar deneyiniz.");
        }
        input.close();
     }
}

