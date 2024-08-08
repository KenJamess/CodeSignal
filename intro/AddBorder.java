package intro;
/*Given a rectangular matrix of characters, add a border of asterisks(*) to it.

        Example

        For

        picture = ["abc",
        "ded"]
        the output should be

        solution(picture) = ["*****",
        "*abc*",
        "*ded*",
        "*****"]
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.string picture

        A non-empty array of non-empty equal-length strings.

        Guaranteed constraints:
        1 ≤ picture.length ≤ 100,
        1 ≤ picture[i].length ≤ 100.

        [output] array.string

        The same matrix of characters, framed with a border of asterisks of width 1.*/
public class AddBorder {
    String[] solution(String[] picture) {
        int size = picture[0].length();
        String[] res = new String[picture.length + 2];
        String s = "*".repeat(size + 2);
        res[0] = s;
        res[res.length - 1] = s;
        for (int i = 0; i < picture.length; i++) {
            String p = picture[i];
            p = "*" + p + "*";
            res[i + 1] = p;
        }

        return res;

    }
}
