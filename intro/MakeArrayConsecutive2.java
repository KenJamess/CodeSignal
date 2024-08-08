package intro;

public class MakeArrayConsecutive2 {
    /*Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
    each statue having an non-negative integer size. Since he likes to make things perfect,
    he wants to arrange them from smallest to largest so that each statue will be bigger than
    the previous one exactly by 1. He may need some additional statues to be able to accomplish that.
    Help him figure out the minimum number of additional statues needed.
    Example

    For statues = [6, 2, 3, 8], the output should be
    solution(statues) = 3.

    Ratiorg needs statues of sizes 4, 5 and 7.*/
    int solution(int[] statues) {
        int min = statues[0], max = statues[0];

        for (int i = 1; i < statues.length; i++) {
            if (min > statues[i]) {
                min = statues[i];
            }
            if (max < statues[i]) {
                max = statues[i];
            }
        }

        return max - min - statues.length + 1;
    }

}
