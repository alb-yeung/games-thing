package discbot.game.chessgame.pieces;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.Spot;

public class Bishop implements PieceI {

    private Color color;

    private Bishop(){}

    public Bishop(Color cIn){
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