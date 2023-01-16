/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
 Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner. 
 Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner. 
 Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. 
 Ödev 
 Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz. */
package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerenProgram {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığı kaç derece? : ");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat < 25) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (heat <= 25 && heat > 15) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
        input.close();
    }
}
