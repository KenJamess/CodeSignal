package intro;
/*Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

        Given an integer, find its digit degree.

        Example

        For n = 5, the output should be
        solution(n) = 0;
        For n = 100, the output should be
        solution(n) = 1.
        1 + 0 + 0 = 1.
        For n = 91, the output should be
        solution(n) = 2.
        9 + 1 = 10 -> 1 + 0 = 1.
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] integer n

        Guaranteed constraints:
        5 ≤ n ≤ 109.

        [output] integer*/
public class DigitDegree {
    int solution(int n) {
        int t = 0;

        while (n >= 10) {
            int sum = 0;
            int temp = n;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            t++;
            n = sum;
        }

        return t;

    }
}
