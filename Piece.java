package TickTackToe;

public enum Piece {

    CIRCLE ("O"),
    CROSS ("X"),
    EMPTY ("-");

    private String symbol;

    private Piece(String symbol) {
        // TODO Auto-generated constructor stub
        this.symbol = symbol;
    }

    public String toString() {
        return this.symbol;
    }

}
