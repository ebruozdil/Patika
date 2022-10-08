package KosulluIfadelerVeKodBloklari;

public class SwitchCaseYapisi {
    public static void main(String[] args) {
        int day =2;
        
        /*if(day==1){
            System.out.println("Bugün Pazartesi");
        }else if (day==2){
            System.out.println("Bugün Salı");
        }else if (day==3){
            System.out.println("Bugün Çarşamba");
        }else if (day==4){
            System.out.println("Bugün Perşembe");
        }else if (day==5){
            System.out.println("Bugün Cuma");
        }else if (day==6){
            System.out.println("Bugün Cumartesi");
        }else if (day==7){
            System.out.println("Bugün Pazar");
        }else{
            System.out.println("Hatalı giriş yaptınız.");
        }*/

        switch (day) {
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
                break;
        }

}}
