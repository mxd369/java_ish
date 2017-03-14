package ch19;
//Program
/***********************************************************
 * ChessBoard class solves the non-attacking queen problem *
 * that determines how eight queens can be positioned on   *
 * an eight-by-eight chess board so that none of them is   *
 * in the same row, column or diagonal as any other Queen  *
 ***********************************************************/
// ChessBoard class
public class ChessBoard
{
    // static variable declaration
    public static int boardSize, queens;
    private static boolean board[][];
    
    /*
    Constructors will sets the board size with similar number of Queens
    */
    public ChessBoard(int size)
    {
        // assigns size
        boardSize = queens = size;
        
        // instantiating board
        board = new boolean[boardSize + 1][boardSize + 1];
    } // end of ChessBoard parameterized constructor

// Constructor creates eight-by-eight chess board with eigth queens.

    public ChessBoard()
    {
        boardSize = queens = 8;
        board = new boolean[boardSize + 1][boardSize + 1];
    } // end of default constructor

// chessPiece method positioned the Queen in row r, column c and returns boolean

    // chessPiece method
    public static boolean chessPiece(int r, int c, int num)
    {
        boolean success = false;
        // verify whether num is queens or not
        if(num == queens)
        {
            // display the queen position
            System.out.println("Queen positioned at " + r + ", " + c);
            success = true;
        }
        else
        {
            board[r][c] = true;
            for(int row = num + 1; row < boardSize + 1 && !success; row++)
            {
                for(int column = 1; column < boardSize + 1 && !success; column++)
                {
                    if(!play(row, column) && !board[row][column])
                    {
                        success = chessPiece(row, column, num+1);
                    }
            }
        }
        
        // verify whether the success is true
        if(!success)
        {
            board[r][c] = false;
        }
        else
        {
            // display the queen position
            System.out.println("Queen positioned at " + r + ", " + c);
        }
    }
    return success;
} // end of chessPiece method

// play method returns true if it is attacked by any other Queen, and false otherwise

// play method
    private static boolean play(int r, int c)
    {
        return checkPiece(-1, -1, r, c) ||
                checkPiece(-1, 1, r, c) ||
                checkPiece(1, -1, r, c) ||
                checkPiece(1, 1, r, c ) ||
                checkPiece(0, -1, r, c) ||
                checkPiece(-1, 0, r, c) ||
                checkPiece(0, 1, r, c)  ||
                checkPiece(1, 0, r, c);
    } // end of play method
/*
checkPiece method returns true if it is attacked by any other Queen in particular direction, and false otherwise.
*/

    // checkPiece method
    private static boolean checkPiece(int x, int y, int row, int col)
    {
        if(col + x < boardSize + 1 && col + x > 0 && row + y < boardSize + 1 && row + y > 0)
        {
            if(board[row + y][col + x])
                return true;
            else
            {
                return checkPiece(x, y, row + y, col + x);
            }
        }
        else return false;
    } // end of checkPiece method
} // end of ChessBoard class