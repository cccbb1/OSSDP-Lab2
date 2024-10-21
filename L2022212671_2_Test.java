import org.example.Solution19;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class L2022212671_2_Test {
    @Test
    public void testGameOfLife() {
        Solution19 solution = new Solution19();
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        solution.gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                assertEquals(expected[i][j], board[i][j]);
            }
        }
    }
}



