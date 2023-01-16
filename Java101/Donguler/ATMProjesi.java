package Donguler;
import java.util.Scanner;
public class ATMProjesi {
    public static void main(String[] args) {
        String userName , password;
        Scanner input = new Scanner(System.in);
        int right = 3; //kalan hak
        int select;
        int balance = 1500;
        int price;
        while (right > 0){
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika")&& password.equals("dev123")){
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz!");
                do{
                    System.out.println("---\n1-Para yatırma\n2-Para çekme\n3-Bakiye sorgulama\n4-Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    if(select == 1){
                        System.out.print("Yatırmak istediğiniz para miktarı : ");
                        price = input.nextInt();
                        balance += price;
                    }else if(select == 2){
                        System.out.print("Çekmek istediğiniz para miktarı : ");
                        price = input.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye yetersiz.");
                        }else {
                            balance -= price;
                        }
                    }else if (select == 3){
                        System.out.println("Bakiye : " + balance);
                    }
                }while(select != 4);
                System.out.println("Çıkış yapıldı. Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                    break;
                }else{
                    System.out.println("Kalan giriş hakkınız : "+ right);
                }
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Lütfen tekrar deneyiniz.");
            }
        }
        input.close();
    }
}
