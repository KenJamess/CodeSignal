package intro;

import java.util.HashMap;
import java.util.Map;

/*Given two strings, find the number of common characters between them.

        Example

        For s1 = "aabcc" and s2 = "adcaa", the output should be
        solution(s1, s2) = 3.

        Strings have 3 common characters - 2 "a"s and 1 "c".

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string s1

        A string consisting of lowercase English letters.

        Guaranteed constraints:
        1 ≤ s1.length < 15.

        [input] string s2

        A string consisting of lowercase English letters.

        Guaranteed constraints:
        1 ≤ s2.length < 15.

        [output] integer*/
public class CommonCharacterCount {
    int solution(String s1, String s2) {
        //HashMap char as a key and occurrence as a value
        HashMap <Character, Integer> charCount = new HashMap<>();
        for (int i = s1.length() - 1; i >= 0; i--)
        {
            if(charCount.containsKey(s1.charAt(i)))
            {
                int count = charCount.get(s1.charAt(i));
                charCount.put(s1.charAt(i), ++count);
            }
            else
            {
                charCount.put(s1.charAt(i),1);
            }
        }

        HashMap <Character, Integer> charCount2 = new HashMap<>();
        for (int i = s2.length() - 1; i >= 0; i--)
        {
            if(charCount2.containsKey(s2.charAt(i)))
            {
                int count = charCount2.get(s2.charAt(i));
                charCount2.put(s2.charAt(i), ++count);
            }
            else
            {
                charCount2.put(s2.charAt(i),1);
            }
        }

        int count = 0;

        // Iterating HashMap through for loop
        for (Map.Entry<Character, Integer> set :
                charCount.entrySet()) {

            if (charCount2.containsKey(set.getKey())) {
                count += set.getValue() > charCount2.get(set.getKey()) ? charCount2.get(set.getKey()) : set.getValue();
            }
        }

        return count;
    }
}
