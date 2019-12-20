package discbot.game.chessgame.pieces;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.Spot;

public class Knight implements PieceI {

    private Color color;

    private Knight(){}

    public Knight(Color cIn){
        color = cIn;
    }

    @Override
    public boolean canMove(Chessboard currBoard, Spot currSpot, Spot moveTo) {
        if (moveTo.getCurrPiece().getColor() == color)
            return false;
        if ((Math.abs(moveTo.getX() - currSpot.getX()) == 2) && (Math.abs(moveTo.getY() - currSpot.getY()) == 1) ||
                (Math.abs(moveTo.getX() - currSpot.getX()) == 1 && (Math.abs(moveTo.getY() - currSpot.getY()) == 2)))
            return true;
        return false;
    }

    @Override
    public Color getColor() {
        return color;
    }
    
}