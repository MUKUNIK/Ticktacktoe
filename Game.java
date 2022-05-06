package TickTackToe;

import java.util.Scanner;

public class Game {

    public static void main(String[] args)
    {
        Board board = new Board();
int turn = 0;
Scanner sc = new Scanner((System.in));

String player1;
System.out.println("Enter Fist player name");
player1=sc.nextLine();
Player p1 = new Player(1,player1);
        String player2;
        System.out.println("Enter Second player name");
        player2=sc.nextLine();
        Player p2 = new Player(2,player2);
        System.out.println("First player Symbol" + p1.getSymbol());
        System.out.println("Second player Symbol" + p2.getSymbol());

while(true)
{
    System.out.println("Current board");
    board.getBoard();

    //Scanner sc= new Scanner(System.in);
    System.out.println("Player "+(((turn)%2==0)?p1.getName():p2.getName())+" move");
    int row =sc.nextInt();
    int col = sc.nextInt();
    try {
        board.makeMove((((turn)%2==0)?p1:p2), row-1, col-1);
        turn++;
       // board.getBoard();
        if (board.checkWinStatus(row-1, col-1)) {
            board.getBoard();
            System.out.println("Winner is " + (((turn-1)%2==0)?p1.getName():p2.getName()));
            sc.close();
            break;
        }
    }
    catch (Exception e)
    {
        System.out.println(e);
    }
}
    }
}
