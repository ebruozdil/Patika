package Diziler.PratiklerVeOdevler;

public class DizidekiMaxVeMinDeğerleriniBulanProgram {
    public static void main(String[] args) {
        int[] list= {56, 34, 1, 8, 101, -2, -33};
        // min=list[0] , min < list[i] ? min= list[i] : ''
        // max=list[0] , max > list[i] ? max= list[i] : ''

        int min = list[0];
        int max = list[0];

        for(int i:list) {
            if(i < min){
                min=i;
            }
            if(i > max){
                max= i;
            }
        }

        System.out.println("Minimum değer: "+min);
        System.out.println("Maksimum değer: "+max);

    }
}
