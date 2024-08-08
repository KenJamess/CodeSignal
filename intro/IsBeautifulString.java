package intro;

import java.util.Map;
import java.util.TreeMap;

/*A string is said to be beautiful if each letter in the string appears at most as many times as the previous letter in the alphabet within the string;
ie: b occurs no more times than a; c occurs no more times than b; etc. Note that letter a has no previous letter.

        Given a string, check whether it is beautiful.

        Example

        For inputString = "bbbaacdafe", the output should be solution(inputString) = true.

        This string contains 3 as, 3 bs, 1 c, 1 d, 1 e, and 1 f (and 0 of every other letter), so since there aren't any letters
        that appear more frequently than the previous letter, this string qualifies as beautiful.

        For inputString = "aabbb", the output should be solution(inputString) = false.

        Since there are more bs than as, this string is not beautiful.

        For inputString = "bbc", the output should be solution(inputString) = false.

        Although there are more bs than cs, this string is not beautiful because there are no as, so therefore there are more bs than as.

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string inputString

        A string of lowercase English letters.

        Guaranteed constraints:
        3 ≤ inputString.length ≤ 50.

        [output] boolean

        Return true if the string is beautiful, false otherwise.*/
public class IsBeautifulString {
    boolean solution(String inputString) {

        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 97; i <= 122; i++) {
            map.put((char) i, map.getOrDefault((char) i, 0));
        }
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.firstEntry().getValue();

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {

            if(entry.getValue() > count) return false;
            else count = entry.getValue();

            if(inputString.indexOf(entry.getKey()) != -1 )
                System.out.println(entry.getKey() + "---" +  entry.getValue());
        }

        return true;

    }
}
