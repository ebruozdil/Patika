package Diziler;

public class ForEachKullanimi {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4 };
        for (int i = 0; i < list.length; i++) {
            System.err.println(list[i]);
        }
        // -------------------------------------------------------
        int sum = 0;
        for (int i : list) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nsum:" + sum);

// Forech la matris yazdırma--------------------------------------------------------
        int[][] matris = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };
        for (int[] row : matris) {
            for (int colon : row) {
                System.out.print(colon + " ");
            }
            System.out.println();
        }

        // ----------------------------------
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[] { 215, 234, 218, 189, 221, 290 };

        for (int score : scores) {
            System.out.print(score + "  ");
        }
        

    }
}
