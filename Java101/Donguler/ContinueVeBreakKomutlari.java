package Donguler;

public class ContinueVeBreakKomutlari {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            if(i==3){
                continue;  //bu koşuldaki alttaki işlemi uygulamıyor, atlıyor ve 3 ü yazmıyor.
            }
            if (i==5){
                System.out.println("i değeri 5 tir.");
                break;
            }
            System.out.println(i);
        }

        int k=1;  
        while (k <= 10 ){
            k++;
            if(k%2 == 0){
                continue;        
            }
            System.out.println(k);
        }
/*1 den 10 a kadar olan sayıları birer birer arttırıyor ve 2ye bölümünden kalanı 0 olanları 
yani çift sayıları atlayıp tek sayıları yazdırmış oluyoruz*/



for (int i = 1; i <= 2; ++i) {
    for (int j = 1; j < 4; ++j) {
        if (i == 1) continue;
            System.out.print(i + j);
    }
}
for (int t = 0; t < 9; t++) {
    System.out.print("*");   
    if (t == 3)              
        break;               
}  
    }
}
