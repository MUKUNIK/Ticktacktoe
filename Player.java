package TickTackToe;

public class Player {

   private String name;
    private Piece symbol;

    Player(int playerno, String name)
    {
        this.name=name;
        this.symbol=(playerno == 1)?Piece.CIRCLE:Piece.CROSS;
    }

    public Piece getSymbol() {
        return this.symbol;
    }

    public String getName(){
        return this.name;
    }
}
