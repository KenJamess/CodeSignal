package intro;
/*Given a string, output its longest prefix which contains only digits.

        Example

        For inputString = "123aa1", the output should be
        solution(inputString) = "123".

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string inputString

        Guaranteed constraints:
        3 ≤ inputString.length ≤ 100.

        [output] string*/
public class LongestDigitsPrefix {
    String solution(String inputString) {
        String res = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                res += inputString.charAt(i);
            }
            else{
                break;
            }
        }

        return res;

    }
}
