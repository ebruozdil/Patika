package Metotlar;

public class MetotTanim {
    static int power(int base, int exp){
        int result=1;
        for (int i=1; i<=exp; i++){
            result *= base;
        }
        return result;
    }
    static void helloWorld(){
        System.out.println("Merhaba Dünya!");
    } 
    public static void main(String[] args) {
        // f(x)= 2x+5
        // f(6)= 2*6+5 =17
        // f(x,y,z)= 3x + 2y + 5z
        // f(2,3,4)= 3*2 + 2*3 + 5*4 =26
/*      int base = 2 , exp = 3, result = 1;
        for (int i=1; i<=exp; i++){
            result *= base;
        }
        System.out.println(result);

        base=4;
        exp=2;
        result=1;
        for (int i=1; i<=exp; i++){
            result *= base;
        }
        System.out.println(result); */

        int case1 = power(2,3);
        System.out.println(case1);
        System.out.println(power(4,2));
        helloWorld();
    }
}
