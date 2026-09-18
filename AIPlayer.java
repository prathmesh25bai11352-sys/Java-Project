public class AIPlayer {
    public static int minimax(Board board, int depth, boolean isMax) {
        int score = board.evaluate();
        if (score == 10 || score == -10) return score;
        if (!board.isMovesLeft()) return 0;

        if (isMax) {
            int best = -1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board.grid[i][j] == '_') {
                        board.grid[i][j] = 'X';
                        best = Math.max(best, minimax(board, depth + 1, !isMax));
                        board.grid[i][j] = '_';
                    }
                }
            }
            return best;
        } else {
            int best = 1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board.grid[i][j] == '_') {
                        board.grid[i][j] = 'O';
                        best = Math.min(best, minimax(board, depth + 1, !isMax));
                        board.grid[i][j] = '_';
                    }
                }
            }
            return best;
        }
    }

    public static Move findBestMove(Board board) {
        int bestVal = -1000;
        Move bestMove = new Move(-1, -1);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.grid[i][j] == '_') {
                    board.grid[i][j] = 'X';
                    int moveVal = minimax(board, 0, false);
                    board.grid[i][j] = '_';
                    if (moveVal > bestVal) {
                        bestMove.row = i;
                        bestMove.col = j;
                        bestVal = moveVal;
                    }
                }
            }
        }
        return bestMove;
    }
}