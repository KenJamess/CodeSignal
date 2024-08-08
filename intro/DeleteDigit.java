package intro;
/*Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

        Example

        For n = 152, the output should be
        solution(n) = 52;
        For n = 1001, the output should be
        solution(n) = 101.
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] integer n

        Guaranteed constraints:
        10 ≤ n ≤ 106.

        [output] integer*/
public class DeleteDigit {
    int solution(int n) {
        String s = n + "";
        int len = s.length();
        int max = 0;

        for (int i = 0; i < len; i++) {
            String t = s.substring(0, i) + s.substring(i + 1, len);
            max = Math.max(max, Integer.parseInt(t));
        }

        return max;

    }
}
