import java.util.Scanner;

public class Game {
    public void start() {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        System.out.println("AI Minimax Tic-Tac-Toe. You are 'O', AI is 'X'.");
        board.printBoard();

        while (board.isMovesLeft() && board.evaluate() == 0) {
            System.out.println("Enter row and column (0-2) separated by a space:");
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            
            if (board.grid[r][c] != '_') {
                System.out.println("Invalid move, try again.");
                continue;
            }
            board.grid[r][c] = 'O';
            
            if (board.evaluate() != 0 || !board.isMovesLeft()) break;

            System.out.println("AI is making a move...");
            Move bestMove = AIPlayer.findBestMove(board);
            board.grid[bestMove.row][bestMove.col] = 'X';
            board.printBoard();
        }
        
        int score = board.evaluate();
        if (score == 10) System.out.println("AI Wins!");
        else if (score == -10) System.out.println("You Win!");
        else System.out.println("It's a Draw!");
        scanner.close();
    }
}