import java.util.Scanner;

public class TicTacToe {

    Scanner scanner = new Scanner(System.in);

    private static char[][] board = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
    };
    private static char currentPlayer = 'X';

    public void twoPlayerTicTacToe(){
        boolean gameOver = false;

        while (!gameOver){
            printBoard();
            System.out.println("Player " + currentPlayer + ",enter your move [row(1-3) and column(1-3)]:");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (isValidMove(row,col)){
                board[row][col] = currentPlayer;
                if (checkWin()){
                    printBoard();
                    System.out.println(currentPlayer + " wins");
                    gameOver = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("Tie");
                    gameOver = true;
                }
                else {
                    changePlayer();
                }
            }
            else {
                System.out.println("Move not Valid, try again");
            }
        }
        scanner.close();
    }

    private static void printBoard(){
        System.out.println("~~~~~~~~~~~");

        for (int i = 0; i < 3; i++){
            System.out.print("|");
            for (int j = 0; j <3; j++){
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("~~~~~~~~~~~");
        }
    }

    private static boolean isValidMove(int row, int col){
        boolean checkRow = row >= 0 && row < 3;
        boolean checkCol = col >= 0 && col < 3;
        boolean checkBoard = board[row][col] == ' ';

        return checkRow && checkCol && checkBoard;
    }

    private static boolean checkWin(){
        for (int i = 0; i < 3; i++){
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true; // Check rows
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true; // Check columns
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true; // Check diagonal (top-left to bottom-right)
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true; // Check diagonal (top-right to bottom-left)
        }
        return false;
    }

    private static boolean isBoardFull(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    private static void changePlayer(){
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        }
        else {
            currentPlayer = 'X';
        }
    }
}
