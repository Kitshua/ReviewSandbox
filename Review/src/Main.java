import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Enter 1 to test print array and double array");
        System.out.println("Enter 2 to play two player TicTacToe");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            System.out.print("Enter a line of text: ");
            line = reader.readLine();

            if (line.equals("1")){
                MyArrays newArrayObj = new MyArrays();
                newArrayObj.printArrayList();
                System.out.println();
                newArrayObj.printDoubleArray();
            }
            if (line.equals("2")){
                TicTacToe newGame = new TicTacToe();
                newGame.twoPlayerTicTacToe();
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}