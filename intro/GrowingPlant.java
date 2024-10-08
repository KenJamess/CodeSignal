package intro;
/*Caring for a plant can be hard work, but since you tend to it regularly, you have a plant that grows consistently.
Each day, its height increases by a fixed amount represented by the integer upSpeed. But due to lack of sunlight,
the plant decreases in height every night, by an amount represented by downSpeed.

        Since you grew the plant from a seed, it started at height 0 initially. Given an integer desiredHeight,
        your task is to find how many days it'll take for the plant to reach this height.

        Example

        For upSpeed = 100, downSpeed = 10, and desiredHeight = 910, the output should be
        solution(upSpeed, downSpeed, desiredHeight) = 10.

        #	Day	Night
        1	100	90
        2	190	180
        3	280	270
        4	370	360
        5	460	450
        6	550	540
        7	640	630
        8	730	720
        9	820	810
        10	910	900
        The plant first reaches a height of 910 on day 10.

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] integer upSpeed

        A positive integer representing the daily growth of the plant.

        Guaranteed constraints:
        3 ≤ upSpeed ≤ 100.

        [input] integer downSpeed

        A positive integer representing the nightly decline of the plant.

        Guaranteed constraints:
        2 ≤ downSpeed < upSpeed.

        [input] integer desiredHeight

        A positive integer representing the goal height.

        Guaranteed constraints:
        4 ≤ desiredHeight ≤ 1000.

        [output] integer

        The number of days that it will take for the plant to reach / pass desiredHeight.*/
public class GrowingPlant {
    int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int times = 0;
        int diff = upSpeed - downSpeed;
        int sum = 0;
        while (true) {
            times++;
            sum += upSpeed;
            if (sum >= desiredHeight) break;
            else {
                sum -= downSpeed;
            }
        }

        return times;
    }
}
