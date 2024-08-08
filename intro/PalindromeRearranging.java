package intro;

import java.util.HashMap;
import java.util.Map;

/*Given a string, find out if its characters can be rearranged to form a palindrome.

        Example

        For inputString = "aabb", the output should be
        solution(inputString) = true.

        We can rearrange "aabb" to make "abba", which is a palindrome.

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string inputString

        A string consisting of lowercase English letters.

        Guaranteed constraints:
        1 ≤ inputString.length ≤ 50.

        [output] boolean

        true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.*/
public class PalindromeRearranging {
    boolean solution(String inputString) {
        if (inputString.length() == 1) return true;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            map.put(inputString.charAt(i), map.getOrDefault(inputString.charAt(i), 0) + 1);
        }

        int count = 0;

        for(char key : map.keySet()) {
            if(map.get(key) % 2 != 0) count++;

        }
        if(count > 1 ) {
            return false;
        }

        return true;
    }

}
