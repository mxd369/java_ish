import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Represents an immutable Sudoku puzzle of arbitrary size N,
 * where N is a perfect square.
 */
public interface Sudoku {
// TODO: write specs for these methods
//    public static Sudoku allBlanks() { ... }
//    public Sudoku solution();
//    public Sudoku easier(int numBlanksToFill);
//    public Sudoku harder(int numNumberToErase);
//    public int size();
//    public boolean isBlank(int row, int column);
//    public int get(int row, int column) throws BlankException;
//    public Sudoku withNumber(int row, int column, int number);
//    public Sudoku withBlank(int row, int column);
//    public String toString();
}


class ConcreteSudoku1 implements Sudoku {
    // Abstraction function:
    //     cells[i][j] is the number in the puzzle at row i and column j,
    //        where the puzzle cell is blank if cells[i][j]=0
    // Rep invariant:
    //     cells.length == cells[i].length for all 0 <= i < cells.length
    //       (cells is an NxN array for some N which is a perfect square)
    //     cells.length must be a perfect square
    //     cells[i][j] must be in [0...N] for all 0 <= i,j < cells.length
    //     each row, column, and block in the array cannot repeat any number from 1...N, i.e.:
    //          for each i, the row cells[i] contains each number in 1..N at most once
    //          for each j, the column cells[*][j] contains each number in 1..N at most once
    //          each sqrt(N)xsqrt(N)-cell block contains each number in 1...N at most once
    //
    //   don't need to explicitly say this in 6.005:
    //     cells != null
    //     cells[i] != null for all i
    //     cells[i][j] != null for all i,j (but Java forbids this anyway)
    private int[][] cells;
    
    static void print() {
        System.out.println("ConcreteSudoku1");
    }
    
    public void checkRep() {
        final int N = cells.length;
        final int BLOCK_SIZE = (int)Math.sqrt(N);
        
        assert BLOCK_SIZE*BLOCK_SIZE == N;
        for (int[] row : cells) {
            assert row.length == N;
            Set<Integer> numbers = new HashSet<>();
            for (int value : row) {
                assert value >= 0 && value <= N;
                assert numbers.add(value); 
                assert !numbers.contains(value);
                numbers.add(value);
            }
        }
//        for (int i = 0; i < N; ++i) {
//            assert cells[i].length == N;
//        }
    }
}

//second implementation of concrete sudoku
class ConcreteSudoku2 implements Sudoku {
    // Abstraction function:
    //    cells is the rows of the puzzle from top to bottom
    //    cells[i] = 0 means blank
    //    cells[i] = -1 is an end-of-row marker
    //    cells[i] in 1..N is a number in the cell
    //
    //    each N entries of cells is a row of the puzzle
    //     cells[k] represents the puzzle square at row k/N and column k%N
    //
    //    each N entries of cells is a column of the puzzle, from left to right
    //     cells[k] represents the puzzle square at row k%N and column k/N
    
    // Rep invariant:
    //    cells.length = N^2 for some N>=0  (assuming second or third AF above)
    //    cells[i] is in 0...N
    //    row/column/block no repeated numbers constraint
    private int[] cells;
    public void print() {
        ConcreteSudoku1.print();
    }

}

//third implementation of concrete sudoku
class ConcreteSudoku3 implements Sudoku {

    // TODO: rep invariant & abstraction function
    private List<List<Optional<Integer>>> values;

}

//fourth implementation of concrete sudoku
class ConcreteSudoku4 implements Sudoku {

    // TODO: rep invariant & abstraction function
    private String values;
}