import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("******* Three In Line *******");
            System.out.println("The  available positions in the game");
            char[][] board1 = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};

            Gaming.printBoard(board1);

            System.out.println("This game is ready to start");

            char[][] board = {{' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}};

            Gaming.printBoard(board);

            while (true) {
                Gaming.player1(board, input);
                if (Gaming.isGameOver(board)) {
                    // will check when it is finished
                    break;
                }
                Gaming.printBoard(board); // added to view the board between the 2 moves

                Gaming.player2(board, input);
                if (Gaming.isGameOver(board)) {
                    // will check when it is finished
                    break;
                }

                Gaming.printBoard(board);
            }
        }
      // End While true
    }
}