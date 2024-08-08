package intro;
/*Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

        The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically
        and one square horizontally away from it. The complete move therefore looks like the letter L.
        Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.



        Example

        For cell = "a1", the output should be
        solution(cell) = 2.



        For cell = "c2", the output should be
        solution(cell) = 6.



        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string cell

        String consisting of 2 letters - coordinates of the knight on an 8 × 8 chessboard in chess notation.

        Guaranteed constraints:
        cell.length = 2,
        'a' ≤ cell[0] ≤ 'h',
        1 ≤ cell[1] ≤ 8.

        [output] integer*/
public class ChessKnight {
    int solution(String cell) {
        int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

        int count = 0;
        int c1 = cell.charAt(0);
        int c2 = Integer.parseInt(String.valueOf(cell.charAt(1)));

        // Check if each possible move is valid or not
        for (int i = 0; i < 8; i++) {

            // Position of knight after move
            int x = c1 + X[i];
            int y = c2 + Y[i];

            // count valid moves
            if (x >= 'a' && x <= 'h' && y >= 1 && y <= 8)
                count++;
        }

        return count;
    }
}
