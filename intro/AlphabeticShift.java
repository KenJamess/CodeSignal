package intro;
/*Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e.
replace a with b, replace b with c, etc (z would be replaced by a).

        Example

        For inputString = "crazy", the output should be solution(inputString) = "dsbaz".

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string inputString

        A non-empty string consisting of lowercase English characters.

        Guaranteed constraints:
        1 ≤ inputString.length ≤ 1000.

        [output] string

        The resulting string after replacing each of its characters.*/
public class AlphabeticShift {
    String solution(String inputString) {
        String res = "";
        for(int i = 0; i < inputString.length(); i++) {
            int c = inputString.charAt(i);
            String nextChar = String.valueOf((char) (c + 1));
            if(c == 'z') {
                nextChar = "a";
            }
            if(c == 'Z') {
                nextChar = "A";
            }
            res += nextChar;
        }

        return res;
    }
}
