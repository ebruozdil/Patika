package Diziler;

public class Arrays {
    public static void main(String[] args) {

        int[] list = new int[10];
        for (int i=0; i <list.length; i++){
            list[i]= (i+1)*10;
            System.out.println(list[i]);
        }

        int[] list2= {10,20,30,40,50,60,70,80,90};
        for (int i=0; i<list2.length; i++){
            System.out.println(list2[i]);
        }
    }
}
