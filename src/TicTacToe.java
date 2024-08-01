import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col]=' ';
            }
        }
        Scanner sc=new Scanner(System.in);
        char Player='X';
        int count=0;
        boolean GameOver=false;
        while(!GameOver){
            if(count==9) {
                System.out.println("It is a Draw");
                break;
            }
            printBoard(board);
            System.out.println("Enter Player: "+Player);
            int row=0, col=0;
            int position=sc.nextInt();
            switch(position){
                case 1 ->{
                    row=0;
                    col=0;
                }
                case 2 ->{
                    row=0;
                    col=1;
                }
                case 3 ->{
                    row=0;
                    col=2;
                }
                case 4 ->{
                    row=1;
                    col=0;
                }
                case 5 ->{
                    row=1;
                    col=1;
                }
                case 6 ->{
                    row=1;
                    col=2;
                }
                case 7 ->{
                    row=2;
                    col=0;
                }
                case 8 ->{
                    row=2;
                    col=1;
                }
                case 9 ->{
                    row=2;
                    col=2;
                }
            }
            if(board[row][col]==' '){
                board[row][col]=Player;
                count++;
                GameOver=hasWon(board,Player);
                if(GameOver) {
                    System.out.println("Player won: " + Player);
                }
                else{
                    Player=Player=='X'?'O':'X';
                }
            }
            else {
                System.out.println("Invalid Move");
            }

        }
    }
    public static void printBoard(char [][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }

    public static boolean hasWon(char [][] board, char choice){
        for (int row = 0; row < board.length; row++) {
            if(board[row][0]==choice&&board[row][1]==choice&&board[row][2]==choice) {
                return true;
            }
        }
        for (int col = 0; col < board.length; col++) {
            if(board[0][col]==choice&&board[1][col]==choice&&board[2][col]==choice) {
                return true;
            }
        }
        if(board[0][0]==choice && board[1][1]==choice && board[2][2]==choice) {
            return true;
        }
        if(board[0][2]==choice && board[1][1]==choice && board[2][0]==choice) {
            return true;
        }
        return false;
    }
}
