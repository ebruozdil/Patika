package Diziler.PratiklerVeOdevler;

public class MatrisTranspozunuBulma {

    public static void printMatris(int array[][]){ 
        for (int i[]: array){
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    
        int[][] matris  = {{2,3,4},{5,6,4}};
        System.out.println("Matris : ");
        printMatris(matris);
        
        int[][] transpoze = new int[matris[0].length][matris.length];

        for (int i=0; i< matris.length; i++){
            for (int j=0; j< matris[0].length; j++){
                transpoze[j][i] = matris[i][j];
            }
        }
        System.out.println("Transpoze :");
        printMatris(transpoze);
    }
}






/* public static void main(String[] args) {
    int[][] a = { { 2, 3, 4 },
            { 5, 6, 4 } };
    int[][] aT = new int[a[0].length][a.length];

    for (int row = 0; row < a.length; row++) {
        for (int col = 0; col < a[row].length; col++) {
            aT[col][row] = a[row][col];
        }
    }

    for (int i = 0; i < aT.length; i++) {
        for (int j = 0; j < aT[i].length; j++) {
            System.out.print(aT[i][j] + "   ");
        }
        System.out.println();
    }
} */