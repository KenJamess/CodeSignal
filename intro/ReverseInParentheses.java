package intro;
/*Write a function that reverses characters in (possibly nested) parentheses in the input string.

        Input strings will always be well-formed with matching ()s.

        Example

        For inputString = "(bar)", the output should be
        solution(inputString) = "rab";
        For inputString = "foo(bar)baz", the output should be
        solution(inputString) = "foorabbaz";
        For inputString = "foo(bar)baz(blim)", the output should be
        solution(inputString) = "foorabbazmilb";
        For inputString = "foo(bar(baz))blim", the output should be
        solution(inputString) = "foobazrabblim".
        Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string inputString

        A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all parentheses in inputString form a regular bracket sequence.

        Guaranteed constraints:
        0 ≤ inputString.length ≤ 50.

        [output] string

        Return inputString, with all the characters that were in parentheses reversed.*/
public class ReverseInParentheses {
    String solution(String inputString) {
        while (true) {
            int last = inputString.indexOf(")");
            if (last == -1) break;

            int first = inputString.lastIndexOf("(");
            if(first > last) {
                String sub = inputString.substring(0, last);
                first = sub.lastIndexOf("(");
            }

            StringBuilder sb = new StringBuilder();
            sb.append(inputString.substring(first + 1, last));
            sb = sb.reverse();

            inputString = inputString.substring(0, first) + sb.toString() + inputString.substring(last + 1, inputString.length());
        }

        return inputString;
    }
}
