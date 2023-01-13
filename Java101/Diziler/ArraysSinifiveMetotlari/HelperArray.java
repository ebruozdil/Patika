package Diziler.ArraysSinifiveMetotlari;

public class HelperArray {
    // listeyi ekrana bastırmak için her defasında for döngüsü kullanmak yerine bir metod yazıyoruz.
    static void print(int[] arr){
        System.out.print("\n[");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    void print(double[] arr){
        System.out.print("\n[");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    static int[] fill(int[] arr, int value){
        for(int i=0; i<arr.length;i++){
            arr[i] = value;
        }
        return arr;
    }
                            // burdaki value kullanıcının bulmamızı istediği değer.
    static int search(int[] arr, int value){
        for(int j=0; j<arr.length;j++){
            if (arr[j] == value){
                return j;
            }
        }
        return -1;        //değer -1 çıkarsa böyle bir değer yoktur.varsa indis değerini verecek.
    }

    static boolean equals(int[] l1, int[] l2){
        if(l1.length!= l2.length){
            return false;
        }
        for(int i=0; i<l1.length;i++ ){
            if(l1[i]!=l2[i]){
                return false;
            }
        }
        return true;
    }



//Biz herhangi bir metodun başına static koyarsak (main metodu içerisinde çağırılan bir metodun static olması gerekiyordu.) 
//o zaman biz static bir metoda nesne üretmeden ulaşabiliriz.
//Biz kolaylık olsun diye bu metotları tanımlayıp kullandık. Lakin java.util.Arrays kütüphanesinde zaten bir çok metod tanımlı onları kullanmak daha avantajlı bizim için.
}
