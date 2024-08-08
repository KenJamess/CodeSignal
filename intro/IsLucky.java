package intro;
/*Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

        Given a ticket number n, determine if it's lucky or not.

        Example

        For n = 1230, the output should be
        solution(n) = true;
        For n = 239017, the output should be
        solution(n) = false.
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] integer n

        A ticket number represented as a positive integer with an even number of digits.

        Guaranteed constraints:
        10 ≤ n < 106.

        [output] boolean

        true if n is a lucky ticket number, false otherwise.*/
public class IsLucky {
    boolean solution(int n) {
        String s = n + "";
        int sumL = 0, sumR = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            sumL += Integer.parseInt(s.charAt(i) + "");
            sumR += Integer.parseInt(s.charAt(s.length() - 1 - i) + "");
        }

        return sumL == sumR;

    }
}
