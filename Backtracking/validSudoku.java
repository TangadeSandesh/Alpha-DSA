public class validSudoku {

    public static boolean sudokuSolver(int sudoku[][])
    {
        int row=sudoku.length;
        int col=sudoku[0].length;

        //base case
        if(row==9 && col==9)
        {
            return true;
        }
        else if(row==9)
        {
            return false;
        }

        //Recursion
        int nextRow=row;
        int nextCol=col+1;
        if(col+1==9)
        {
            nextRow=row+1;
            nextCol=0;
        }

        if(sudoku[row][col]!=0)
        {
            return sudokuSolver(sudoku);
        }

        for(int digit=1; digit<=9; digit++)
        {
            if(isSafe(sudoku, row, col, digit))
            {
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku))
                {
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit)
    {
        //column check
        for(int i=0; i<=8; i++)
        {
            if(sudoku[i][col]==digit)
            {
                return false;
            }
        }

        //row check
        for(int j=0; j<=8; j++)
        {
            if(sudoku[row][j]==digit)
            {
                return false;
            }
        }

        // grid 
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr; i<sr+3; sr++)
        {
            for(int j=sc; j<sc;j++)
            {
                if(sudoku[row][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String args[])
    {
        int[][] sudoku=new int[9][9];
        sudokuSolver(sudoku,9, 9);

        if(sudokuSolver(sudoku, 0, 0))
        {
            System.out.println("Valid Sudoku");

        }
        else{
            System.out.println("InValid Sudoku");
        }
    }
}
