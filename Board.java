public class Board {
    public char[][] grid = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }

    public boolean isMovesLeft() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i][j] == '_') return true;
        return false;
    }

    public int evaluate() {
        for (int row = 0; row < 3; row++) {
            if (grid[row][0] == grid[row][1] && grid[row][1] == grid[row][2]) {
                if (grid[row][0] == 'X') return 10;
                else if (grid[row][0] == 'O') return -10;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (grid[0][col] == grid[1][col] && grid[1][col] == grid[2][col]) {
                if (grid[0][col] == 'X') return 10;
                else if (grid[0][col] == 'O') return -10;
            }
        }
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            if (grid[0][0] == 'X') return 10;
            else if (grid[0][0] == 'O') return -10;
        }
        if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            if (grid[0][2] == 'X') return 10;
            else if (grid[0][2] == 'O') return -10;
        }
        return 0;
    }
}