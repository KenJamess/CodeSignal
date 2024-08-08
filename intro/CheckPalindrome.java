package intro;

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
