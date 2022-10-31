package Metotlar;

public class RecursiveMetotlar {
    static int f(int n){
        int result = 0;
        for (int i=1 ; i <= n ; i++){
            result += i;
        }
        return result;
    }

    static int r(int n){
        if(n==1){
            return 1;
        }
        return r(n-1)+n; 
    }


    static int basamaklarToplami(int sayi){
        if (sayi == 0){
            return 0;
        }else
           return sayi % 10 + basamaklarToplami(sayi / 10);
    }

    static int as(int i) {
        if (i < 2) return 1;
        else return (i * as(i - 1));
    }

    public static void main(String[] args) {
        System.out.println(f(6));
        System.out.println(r(6));
        System.out.println("Basamak toplami: "+basamaklarToplami(45612));
        System.out.println(as(3));
        recursiveMethod(4);
    }
    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }

}

/*
  f(1) = 1;
  f(2) = f(1) + 2;      f(2)=1+2
  f(3) = f(2) + 3;      f(3)=1+2+3
  f(4) = f(3) + 4;      f(4)=1+2+3+4
  ..........
  ..........
  f(n) = f(n-1) + n;

 */