package intro;
/*Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

        Example

        For st = "abcdc", the output should be
        solution(st) = "abcdcba".

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string st

        A string consisting of lowercase English letters.

        Guaranteed constraints:
        3 ≤ st.length ≤ 10.

        [output] string*/
public class BuildPalindrome {
    String solution(String st) {
        StringBuilder sb = new StringBuilder();
        sb.append(st);
        if (st.equals(sb.reverse().toString())) return st;


        String temp = st.charAt(0) + "";
        String res = st;
        for (int i = 1; i < st.length(); i++) {

            StringBuilder sBuilder = new StringBuilder();
            sBuilder.append(temp);
            res = st + sBuilder.reverse().toString();

            StringBuilder sBuilder1 = new StringBuilder();
            sBuilder1.append(res);
            if (res.equals(sBuilder1.reverse().toString())) break;
            else {
                temp += st.charAt(i) + "";
            }

        }

        return res;

    }
}
