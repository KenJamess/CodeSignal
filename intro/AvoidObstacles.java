package intro;

import java.util.Arrays;
import java.util.HashSet;

/*You are given an array of integers representing coordinates of obstacles situated on a straight line.

        Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

        Find the minimal length of the jump enough to avoid all the obstacles.

        Example

        For inputArray = [5, 3, 6, 7, 9], the output should be
        solution(inputArray) = 4.

        Check out the image below for better understanding:

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.integer inputArray

        Non-empty array of positive integers.

        Guaranteed constraints:
        2 ≤ inputArray.length ≤ 1000,
        1 ≤ inputArray[i] ≤ 1000.

        [output] integer

        The desired length.*/
public class AvoidObstacles {
    int solution(int[] inputArray) {
        Arrays.sort(inputArray);
        int max = inputArray[inputArray.length - 1];

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < inputArray.length; i++) {
            set.add(inputArray[i]);
        }

        for (int i = 1; i <= max; i++) {
            int j;
            for (j = i; j <= max; j += i) {
                if (set.contains(j)) {
                    break;
                }
            }

            if (j > max) return i;
        }

        return max + 1;
    }
}
