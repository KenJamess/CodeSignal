package intro;
/*Check if all digits of the given integer are even.

        Example

        For n = 248622, the output should be
        solution(n) = true;
        For n = 642386, the output should be
        solution(n) = false.
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] integer n

        Guaranteed constraints:
        1 ≤ n ≤ 109.

        [output] boolean

        true if all digits of n are even, false otherwise.*/
public class EvenDigitsOnly {
    boolean solution(int n) {
        while(n > 0) {
            if(n % 2 != 0) return false;
            n = n / 10;
        }

        return true;
    }
}
