package intro;

import java.util.ArrayList;
import java.util.List;

/*Given an array of strings, return another array containing all of its longest strings.

        Example

        For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
        solution(inputArray) = ["aba", "vcd", "aba"].

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.string inputArray

        A non-empty array.

        Guaranteed constraints:
        1 ≤ inputArray.length ≤ 10,
        1 ≤ inputArray[i].length ≤ 10.

        [output] array.string

        Array of the longest strings, stored in the same order as in the inputArray.*/
public class AllLongestStrings {
    String[] solution(String[] inputArray) {
        int maxLength = 0;
        List<String> longestStrings = new ArrayList<>();

        for (String str : inputArray) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                longestStrings.clear();
                longestStrings.add(str);
            } else if (str.length() == maxLength) {
                longestStrings.add(str);
            }
        }

        return longestStrings.toArray(new String[0]);

    }
}
