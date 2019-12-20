package discbot.game.chessgame.pieces;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.Spot;

public class King implements PieceI {

    private Color color;
    private boolean moved;  // For castling to implement in future

    private King(){}

    public King(Color cIn){
        color = cIn;
        moved = false;
    }

    @Override
    public boolean canMove(Chessboard currBoard, Spot currSpot, Spot moveTo) {
        // TODO Castling functionality
        // Can't move if occupied by same color piece
        if (moveTo.getCurrPiece().getColor() == color)
            return false;
        // Otherwise if surrounding same spot covered by previous check
        if (Math.abs(moveTo.getX() - currSpot.getX()) <= 1 &&
                Math.abs(moveTo.getY() - currSpot.getY()) <= 1)
            return true;
        return false;
    }

    @Override
    public Color getColor() {
        return color;
    }
    
}