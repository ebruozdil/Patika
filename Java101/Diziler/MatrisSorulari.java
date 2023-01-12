package Diziler;

import java.util.Scanner;

public class MatrisSorulari {
    public static void main(String[] args) {

        // Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının
        // girdiği bir algoritma yazınız.

        int[][] matrix = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        // -----------
        // İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random
        // sayılar üreterek matrise atama yapınız.
        int[][] matris = new int[3][4];
        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) {
                matris[row][column] = (int) (Math.random() * 100);
            }
        }

        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) {
                System.out.print(matris[row][column] + " ");
            }
            System.out.println();
        }
        // ---------------------------------------------------------------------------

        int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
