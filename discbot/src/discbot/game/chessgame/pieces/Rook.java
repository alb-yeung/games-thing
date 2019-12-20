package discbot.game.chessgame.pieces;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.Spot;

public class Rook implements PieceI {

    private Color color;
    private boolean moved = false; // For castling functionality in the future

    private Rook(){}

    public Rook(Color cIn){
        color = cIn;
    }

    @Override
    public boolean canMove(Chessboard currBoard, Spot currSpot, Spot moveTo) {
        // TODO castling functionality
        if (moveTo.getCurrPiece().getColor() == color)
            return false;
        if ((moveTo.getX() != currSpot.getX()) &&
                (moveTo.getY() != currSpot.getY()))
            return false;
        if (moveTo.getX() != currSpot.getX()){
            // TODO check if free
        }else{

        }
        return false;
    }

    @Override
    public Color getColor() {
        return color;
    }
    
}