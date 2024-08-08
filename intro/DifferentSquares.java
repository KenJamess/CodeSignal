package intro;

import java.util.HashSet;
import java.util.Set;

/*Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

        Example

        For

        matrix = [[1, 2, 1],
        [2, 2, 2],
        [2, 2, 2],
        [1, 2, 3],
        [2, 2, 1]]
        the output should be
        solution(matrix) = 6.

        Here are all 6 different 2 × 2 squares:

        1 2
        2 2
        2 1
        2 2
        2 2
        2 2
        2 2
        1 2
        2 2
        2 3
        2 3
        2 1
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.array.integer matrix

        Guaranteed constraints:
        1 ≤ matrix.length ≤ 100,
        1 ≤ matrix[i].length ≤ 100,
        0 ≤ matrix[i][j] ≤ 9.

        [output] integer

        The number of different 2 × 2 squares in matrix.*/
public class DifferentSquares {
    int solution(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        if(n == 1 || m == 1) return 0;
        if(n == 2 && m == 2) return 1;

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                String s = "";
                s += matrix[i][j] + "" + matrix[i][j+1] + "" + matrix[i+1][j] + "" + matrix[i+1][j+1];
                set.add(s);
            }
        }

        return set.size();
    }
}
