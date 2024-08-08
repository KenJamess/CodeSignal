package intro;
/*In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it
 that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

        Example

        For

        matrix = [[true, false, false],
        [false, true, false],
        [false, false, false]]
        the output should be

        solution(matrix) = [[1, 2, 1],
        [2, 1, 1],
        [1, 1, 1]]
        Check out the image below for better understanding:



        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.array.boolean matrix

        A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine, false otherwise.

        Guaranteed constraints:
        2 ≤ matrix.length ≤ 100,
        2 ≤ matrix[0].length ≤ 100.

        [output] array.array.integer

        Rectangular matrix of the same size as matrix each cell of which contains an integer equal to the number of mines in the neighboring cells.
        Two cells are called neighboring if they share at least one corner.*/
public class Minesweeper {
    int[][] solution(boolean[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res[i][j] = 0;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == true) {
                    for(int dx = -1; dx <= 1; dx++) {
                        if ((i + dx >= 0) && (i + dx < matrix.length)) {
                            for(int dy = -1; dy <= 1; dy++) {
                                if ((j + dy >= 0) && (j + dy < matrix[i + dx].length) && (!(dx == 0 && dy == 0))) {
                                    System.out.print(matrix[i + dx][j + dy]);
                                    res[i + dx][j + dy]++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return res;
    }
}
