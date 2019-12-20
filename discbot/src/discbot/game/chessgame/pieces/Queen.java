package discbot.game.chessgame.pieces;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.Spot;

public class Queen implements PieceI {

    private Color color;

    private Queen(){}

    public Queen(Color cIn){
        color = cIn;
    }

    @Override
    public boolean canMove(Chessboard currBoard, Spot currSpot, Spot moveTo) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Color getColor() {
        return color;
    }

}