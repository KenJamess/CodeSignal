package intro;
/*Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

        Example

        For text = "Ready, steady, go!", the output should be
        solution(text) = "steady".

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string text

        Guaranteed constraints:
        4 ≤ text.length ≤ 50.

        [output] string

        The longest word from text. It's guaranteed that there is a unique output.*/
public class LongestWord {
    String solution(String text) {
        String res = "";
        String word = "";
        int max = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isAlphabetic(c)) {
                System.out.println(word);
                if (max < word.length()) {
                    res = word;
                    max = word.length();
                }
                word = "";
            }

            else {
                word += c + "";
            }
        }

        if (word.length() > max) return word;

        return res;
    }
}
