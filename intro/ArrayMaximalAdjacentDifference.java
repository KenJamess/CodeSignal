package intro;
/*Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

        Example

        For inputArray = [2, 4, 1, 0], the output should be
        solution(inputArray) = 3.

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.integer inputArray

        Guaranteed constraints:
        3 ≤ inputArray.length ≤ 10,
        -15 ≤ inputArray[i] ≤ 15.

        [output] integer

        The maximal absolute difference.*/
public class ArrayMaximalAdjacentDifference {
    int solution(int[] inputArray) {
        int max = Math.abs(inputArray[0] - inputArray[1]);
        for(int i = 1; i < inputArray.length - 1; i++) {
            int diff = Math.abs(inputArray[i] - inputArray[i + 1]);
            if (max < diff) {
                max = diff;
            }
        }

        return max;
    }
}
