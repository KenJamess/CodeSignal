package intro;
/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The largest product of adjacent elements.
*/
public class AdjacentElementsProduct {
    int solution(int[] inputArray) {
        int max = inputArray[0] * inputArray[1];

        for (int i = 1; i < inputArray.length - 1; i++) {
            int val = inputArray[i] * inputArray[i + 1];
            if(val > max) {
                max = val;
            }
        }

        return max;
    }
}
