package ch19;
// BoardDriver class
public class BoardDriver
{
    // start main method
    public static void main (String[] args)
    {
        boolean value = false;
// Create an object for ChessBoard class and call its chessPiece method.
        // instantiating the ChessBoard
        ChessBoard Cboard = new ChessBoard();
        for (int col = 1; (col <= Cboard.boardSize) && !value; col++)
        {
            value = Cboard.chessPiece (1, col, 1);
        }

        if(!value)
        {
            System.out.println("Configuration is not possible!");
        }
    }// end of main method
}// end of BoardDriver class