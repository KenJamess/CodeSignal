package intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

        Example

        For product = 12, the output should be
        solution(product) = 26;
        For product = 19, the output should be
        solution(product) = -1.
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] integer product

        Guaranteed constraints:
        0 ≤ product ≤ 600.

        [output] integer*/
public class DigitsProduct {
    int solution(int product) {
        int myNum = product;
        List<Integer> result = new ArrayList<>();

        if (product == 0) return 10;

        if (myNum >= 10) {
            for (int i = 9; i > 1; i--){
                while (myNum % i == 0){
                    result.add(i);
                    myNum = myNum / i;
                }
                if (i == 2 && result.size() == 0){
                    return -1;
                }
            }
        } else if (myNum < 10){
            return myNum;
        }

        int res = 1;
        String temp = "";
        Collections.sort(result);

        for (Integer i : result) {
            res *= i;
            temp += i + "";
        }

        if (res == product) return Integer.parseInt(temp);
        return -1;
    }
}
