package intro;
/*An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

        Given a string, find out if it satisfies the IPv4 address naming rules.

        Example

        For inputString = "172.16.254.1", the output should be
        solution(inputString) = true;

        For inputString = "172.316.254.1", the output should be
        solution(inputString) = false.

        316 is not in range [0, 255].

        For inputString = ".254.255.0", the output should be
        solution(inputString) = false.

        There is no first number.*/
public class IsIPv4Address {
    boolean solution(String inputString) {
        if(inputString.startsWith(".") || inputString.endsWith(".")) return false;
        long countDot = inputString.chars().filter(ch -> ch == '.').count();
        String[] temp = inputString.split("\\.");

        if(temp.length <= countDot || countDot == 0 || temp.length != 4) return false;

        for(String st : temp) {
            if(st.startsWith("0") && !st.equals("0")) return false;
            try {
                if(Integer.parseInt(st) < 0 || Integer.parseInt(st) > 255) return false;
            }
            catch (Exception e) {
                return false;
            }

        }

        return true;
    }

}
