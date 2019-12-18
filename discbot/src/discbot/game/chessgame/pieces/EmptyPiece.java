package discbot.game.chessgame.pieces;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.Spot;

public class EmptyPiece implements PieceI {

    @Override
    public boolean canMove(Chessboard currBoard, Spot currSpot, Spot moveTo) {
        return false;
    }
    
    @Override
    public Color getColor() {
        return Color.NONE;
    }

}