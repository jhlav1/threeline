import java.util.Scanner;

public abstract class Gaming {

    // Pint the board
    public static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2] );
        System.out.println("-----" );
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-----" );
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

    }
 // Check after every move if any player 1 or player 2 wins
    public static boolean isGameOver(char[][] board) {

        if(checkWhoWin(board, 'X')) {
            printBoard(board);
            System.out.println("Player number 1 wins!!");
            return true;
        }
        if(checkWhoWin(board, 'O')) {
            printBoard(board);
            System.out.println("Player number 2 wins!!");
            return true;
        }


        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] ==' '){
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("The game is tie");
        return true;
    }
      // Method called in isGameOver
    private static boolean checkWhoWin(char[][] board, char symbol) {
        if((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol ) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol )||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol )||

                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol )||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol )||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol )||

                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol )||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][2] == symbol )){


            return true;
        }
        return false;
    }
 // player number 2 movement
    public static void player2(char[][] board, Scanner input) {
        String userInput;
        while(true) {
            System.out.println("Player number 2: Choose your position. (Position from 1 -9)");
            userInput = input.nextLine();
            if(isValidMove(board, Integer.parseInt(userInput))){
                break;

            } else
                System.out.println( "Player number 2: " + userInput + " is not available, that position is ready used!");
            //System.out.println(userInput);
        }
        placeMove(board, userInput, 'O');

        // printBoard(board);
    }
 // Check if the movements are valid
    public static boolean isValidMove(char[][] board, int position){
        switch (position){
            case 1:
                if(board[0][0] == ' ') {
                    return true;
                } else
                    return false;
            case 2:
                return board[0][1] == ' ';

            case 3:
                return board[0][2] == ' ';

            case 4:
                return board[1][0] == ' ';

            case 5:
                return board[1][1] == ' ';

            case 6:
                return board[1][2] == ' ';

            case 7:
                return board[2][0] == ' ';

            case 8:
                return board[2][1] == ' ';

            case 9:
                return board[2][2] == ' ';

            default:
                return  false;

        }
    }
    // player number 1 movement
    public static void player1(char[][] board, Scanner input) {
        String userInput;
        while(true) {
            System.out.println("Player number 1: Choose your position. (Position from 1 -9)");
            userInput = input.nextLine();
            if(isValidMove(board, Integer.parseInt(userInput))){
                break;

            } else
                System.out.println( "Player number 1 " + userInput + " is not available, that position is ready used");
            //System.out.println(userInput);
        }
        placeMove(board, userInput, 'X');

        // printBoard(board);
    }
 // Place the movements in the playing area
    public static void placeMove(char[][] board, String position, char symbol) {
        switch (position){
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println(":(");

        }
    }

}
