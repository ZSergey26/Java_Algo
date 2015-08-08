package Chapter_1_Fundamentals.BasicProgModel.Solutions;

/**
 * Created by Владелец on 08.08.2015.
 */
public class Ex1_1_13 {
    public static void main(String[] args) {

        int[][] matrix = new int[4][3];

        int val = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = val;
                val++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] matrixT = transpose(matrix);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrixT[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix)
    {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for(int newRows = 0; newRows < columns; newRows++)
            for( int newColumns = 0; newColumns < rows; newColumns++)
            {
                result[newRows][newColumns] = matrix[newColumns][newRows];
            }

        return result;
    }
}
