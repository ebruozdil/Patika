package Diziler;

public class CokBoyutluDiziler {

    public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {

        // firstMatrix.length ile ilk matrisin satır sayısını buluyoruz. örneğimizde 3 olarak gelecektir.
        // secondMatrix[0].length ile ikinci matrisin sütun sayısını buluyoruz. örneğimizde 4 olarak gelecektir.
    
        // C matrisi olacak olan matrisi tanımlıyoruz.
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];
     
         // matrislerde çarpma, toplama gibi işlemleri yapabilmek için iç içe 3 tane döngüye ihtiyaç duyarız.
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }
     
        return result;
    }
    
    
    double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
        // A matrisinin satırı ile B matrisinin sütunu çarpma işlemi.
        /*
        *   row = 3, col = 4  olarak gelecektir.
        *   i = 0 ise
        *   firstMatrix[3][0] * secondMatrix[0][4] 
        *   i = 1 ise
        *   firstMatrix[3][1] * secondMatrix[1][4] 
        *   i = 2 ise
        *   firstMatrix[3][2] * secondMatrix[2][4] 
        * şeklinde i değişerek satır ve sütun çarpılır.
        */
        double cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }
    public static void main(String[] args) {
        int[][] uzaklik = {
                { 0, 453, 939, 243, 783, 891 },
                { 453, 0, 490, 384, 620, 439 },
                { 939, 490, 0, 839, 863, 423 },
                { 243, 384, 839, 0, 544, 823 },
                { 783, 620, 863, 544, 0, 1045 },
                { 891, 439, 423, 823, 1045, 0 }
        };
        for (int i = 0; i < uzaklik.length; i++) {
            for (int j = 0; j < uzaklik.length; j++) {
                System.out.print(uzaklik[i][j] + " ");
            }
            System.out.println();
        }

        // -----------
        int[][] matrix = new int[3][4];
        int number = 1;

        for (int x = 0; x < matrix.length; x++) {
            int[] row = matrix[x];

            for (int y = 0; y < row.length; y++) {
                row[y] = number;
                number++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " "); 
         }
             System.out.println(); 
         }

         //-----------
         int[][] arr = new int[3][];
         arr[0] = new int[1];
         arr[1] = new int[2];
         arr[2] = new int[3];
         int sum = 0;
         for (int i = 0; i < 3; ++i)
             for (int j = 0; j < i + 1; ++j)
                 arr[i][j] = j + 1;
         for (int i = 0; i < 3; ++i)
             for (int j = 0; j < i + 1; ++j)
                 sum += arr[i][j];
         System.out.println(sum);
         for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " "); 
         }
             System.out.println(); 
         }










    }

}
