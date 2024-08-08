package intro;

/*Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

        Example

        For n = 3, the output should be

        solution(n) = [[1, 2, 3],
        [8, 9, 4],
        [7, 6, 5]]
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] integer n

        Matrix size, a positive integer.

        Guaranteed constraints:
        3 ≤ n ≤ 100.

        [output] array.array.integer*/
public class SpiralNumbers {
    int[][] solution(int n) {
        int value = 1;

        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;
        int[][] spiral = new int[n][n];

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value;
                value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol - 1; i >= minCol; i--) {
                spiral[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiral[i][minCol] = value;
                value++;
            }

            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        return spiral;

    }
}
