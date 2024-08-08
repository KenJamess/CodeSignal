package intro;

public class ShapeArea {
    int solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 5;
        int firstNum = 1;
        int lastNum = 2 * (n - 1) - 1;
        int numberOfDigits = n - 1;
        return (firstNum + lastNum) * numberOfDigits  + (2 * n - 1);

    }
}
