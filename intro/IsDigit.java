package intro;
/*Determine if the given character is a digit or not.

        Example

        For symbol = '0', the output should be
        solution(symbol) = true;
        For symbol = '-', the output should be
        solution(symbol) = false.
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] char symbol

        A character which is either a digit or not.

        Guaranteed constraints:
        Given symbol is from ASCII table.

        [output] boolean

        true if symbol is a digit, false otherwise.*/
public class IsDigit {
    boolean solution(char symbol) {
        return Character.isDigit(symbol);
    }
}
