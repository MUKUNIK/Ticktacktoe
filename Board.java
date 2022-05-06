package TickTackToe;

public class Board {
   Piece board[][];

   //if board[i][j]==3, they board cell is not set yet.
   private final int boardSize =3;

    Board()
   {
      this.board = new Piece[boardSize][boardSize];
      for(int i =0;i<boardSize;i++)
         for(int j = 0;j<boardSize;j++)
            board[i][j]=Piece.EMPTY;
            System.out.println("Board created");
   }

   public void getBoard()
   {
      for(int i =0;i<boardSize;i++)
         for(int j=0;j<boardSize;j++)
         {
            System.out.print(board[i][j]+"\t");
           // System.out.print(" ");
            if(j==boardSize-1)
               System.out.println("");
         }
   }

   public void makeMove(Player player, int row, int col) throws IllegalArgumentException{
       if(row<0||col<0||row>boardSize-1||col>boardSize-1)
          throw new IllegalArgumentException("Invalid move");
       else if(board[row][col]!=Piece.EMPTY)
          throw new IllegalArgumentException("location already filled");
       else
       {
          board[row][col]=player.getSymbol();;
          System.out.println("Move made by "+player.getName()+" player");
       }
   }

   public boolean checkWinStatus(int row, int col)
   {
      Piece currentPlayer= board[row][col];
      int rowWin=0;
      int colWin=0;
      int diaWin=0;
      int revdiaWin=0;
      for(int i =0;i<boardSize;i++)
      {
         if(board[row][i]==currentPlayer)
            rowWin++;
         if(board[i][col]==currentPlayer)
            colWin++;
         if(board[i][i]==currentPlayer)
            diaWin++;
         if(board[i][boardSize-1-i]==currentPlayer)
            revdiaWin++;
      }
      if(rowWin==3||colWin==3||diaWin==3||revdiaWin==3)
         return true;
      return false;
   }
}
