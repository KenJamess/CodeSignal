package intro;
/*
Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by 
taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. 
You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
*/
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
