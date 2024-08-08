package intro;
/*Check if the given string is a correct time representation of the 24-hour clock.

        Example

        For time = "13:58", the output should be
        solution(time) = true;
        For time = "25:51", the output should be
        solution(time) = false;
        For time = "02:76", the output should be
        solution(time) = false.
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string time

        A string representing time in HH:MM format. It is guaranteed that the first two characters, as well as the last two characters, are digits.

        [output] boolean

        true if the given representation is correct, false otherwise.*/
public class ValidTime {
    boolean solution(String time) {
        String[] t = time.split(":");
        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);

        if (h > 23 || m > 59) return false;

        return true;
    }
}
