package intro;

public class AdjacentElementsProduct {
    int solution(int[] inputArray) {
        int max = inputArray[0] * inputArray[1];

        for (int i = 1; i < inputArray.length - 1; i++) {
            int val = inputArray[i] * inputArray[i + 1];
            if(val > max) {
                max = val;
            }
        }

        return max;
    }
}
