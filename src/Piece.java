
/*
The Class Component for the Checkers Piece
 */
public abstract class Piece {
    protected boolean isWhite;
    protected boolean isKing;
    protected int x;
    protected int y;

    public Piece(boolean white, boolean king, int x_pos, int y_pos){
        isWhite = white;
        isKing = king;
        x = x_pos;
        y = y_pos;
    }




}
