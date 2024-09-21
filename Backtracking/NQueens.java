public class NQueens {
    static boolean isSafe(char board[][], int row, int col)
    {
        //for vertical cells
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        //for left diagonal cells
        for(int i=row-1, j=col-1; i>=0  && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        //for Right diagonal cells
        for(int i=row-1, j=col+1;i>=0  && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }

        return true;
    }
    
    static void Nqueens(char board[][],int row)
    {
        if(row==board.length)
        {
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j]='Q';
                Nqueens(board, row+1);   //function call
                board[row][j]='X';       //backtracking
            }
        }       
    }

    static void printBoard(char board[][])
    {
        System.out.println("-------Chess board---------");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int N=4;
        char board[][]=new char[N][N];

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]='X';
            }   
        }
        Nqueens(board, 0);

    }
}
