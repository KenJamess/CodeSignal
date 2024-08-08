package intro;
/*
Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
solution(inputString) = true;
For inputString = "abac", the output should be
solution(inputString) = false;
For inputString = "a", the output should be
solution(inputString) = true.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.
*/

public class CheckPalindrome {
    boolean solution(String inputString) {
        int len = inputString.length();
        if(len == 1) return true;

        for(int i = 0; i <= len / 2; i++) {
            if(inputString.charAt(i) != inputString.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
