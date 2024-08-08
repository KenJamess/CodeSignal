package intro;
/*Given an array of equal-length strings, you'd like to know if it's possible to rearrange the order of the elements in
such a way that each consecutive pair of strings differ by exactly one character. Return true if it's possible, and false if not.

        Note: You're only rearranging the order of the strings, not the order of the letters within the strings!

        Example

        For inputArray = ["aba", "bbb", "bab"], the output should be
        solution(inputArray) = false.

        There are 6 possible arrangements for these strings:

        ["aba", "bbb", "bab"]
        ["aba", "bab", "bbb"]
        ["bbb", "aba", "bab"]
        ["bbb", "bab", "aba"]
        ["bab", "bbb", "aba"]
        ["bab", "aba", "bbb"]
        None of these satisfy the condition of consecutive strings differing by 1 character, so the answer is false.

        For inputArray = ["ab", "bb", "aa"], the output should be
        solution(inputArray) = true.

        It's possible to arrange these strings in a way that each consecutive pair of strings differ by 1 character
        (eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so return true.

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.string inputArray

        A non-empty array of strings of lowercase letters.

        Guaranteed constraints:
        2 ≤ inputArray.length ≤ 10,
        1 ≤ inputArray[i].length ≤ 15.

        [output] boolean

        Return true if the strings can be reordered in such a way that each neighbouring pair of strings differ by exactly one character (false otherwise).*/
public class StringsRearrangement {
    boolean solution(String[] inputArray) {

        boolean[] used = new boolean[inputArray.length];
        findSequence(inputArray, null, used, 0);
        return success;
    }

    boolean success = false; // modified by findSequence

    // recursive backtracking procedure to find admissible
    // sequence of strings in the array. String prev is the
    // previous string in the sequence, used[] keeps track
    // of which strings have been used so far, and n is the
    // current length of the sequence.
    void findSequence(String[] a, String prev, boolean[] used, int n) {
        if (n == a.length) {
            success = true;
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (!used[i] && (prev == null || differByOne(prev, a[i]))) {
                used[i] = true;
                findSequence(a, a[i], used, n+1);
                used[i] = false;
            }
        }
    }

    boolean differByOne(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
}
