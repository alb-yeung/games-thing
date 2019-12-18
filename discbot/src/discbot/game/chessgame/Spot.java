package discbot.game.chessgame;

import discbot.game.chessgame.pieces.EmptyPiece;
import discbot.game.chessgame.pieces.PieceI;

public class Spot{
    private int x;
    private int y;
    private PieceI currPiece;

    public Spot(){
        x = 0;
        y = 0;
        currPiece = new EmptyPiece();
    }

    public Spot(int xIn, int yIn, PieceI pieceIn){
        x = xIn;
        y = yIn;
        currPiece = pieceIn;
    }

    public int getX(){
        return x;
    }

    public void setX(int xIn){
        x = xIn;
    }

    public int getY(){
        return y;
    }

    public void setY(int yIn){
        y = yIn;
    }

    public PieceI getCurrPiece(){
        return currPiece;
    }

    public void setCurrPiece(PieceI pieceIn){
        currPiece = pieceIn;
    }
}