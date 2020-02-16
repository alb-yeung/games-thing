package discbot.game.chessgame.pieces;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.Spot;
import discbot.util.logger.LoggerValues;
import discbot.util.logger.MyLogger;

public class Bishop implements PieceI {

    private Color color;

    private Bishop(){}

    public Bishop(Color cIn){
        color = cIn;
    }

    private enum Movement{
        UPRIGHT,
        UPLEFT,
        DOWNRIGHT,
        DOWNLEFT,
        DEFAULT;
    }

    @Override
    public boolean canMove(Chessboard currBoard, Spot currSpot, Spot moveTo) {
        // TODO Auto-generated method stub
        if (moveTo.getCurrPiece().getColor() == color)
            return false;
        if (Math.abs(moveTo.getX() - currSpot.getX()) != Math.abs(moveTo.getY() - currSpot.getY()))
            return false;

        Movement direction = Movement.DEFAULT;

        if (moveTo.getX() > currSpot.getX() && moveTo.getY() < currSpot.getY())
            direction = Movement.UPRIGHT;
        if (moveTo.getX() < currSpot.getX() && moveTo.getY() < currSpot.getY())
            direction = Movement.UPLEFT;
        if (moveTo.getX() > currSpot.getX() && moveTo.getY() > currSpot.getY())
            direction = Movement.DOWNRIGHT;
        if (moveTo.getX() < currSpot.getX() && moveTo.getY() > currSpot.getY())
            direction = Movement.DOWNLEFT;

        switch(direction){
            case UPRIGHT:
                // x +
                // y -
            case UPLEFT:
                // x -
                // y -
            case DOWNRIGHT:
                // x +
                // y +
            case DOWNLEFT:
                // x -
                // y +
            case DEFAULT:
                MyLogger.printMessage("Bishop " + this + " direction set to DEFAULT", LoggerValues.CHESS);
        }

        return false;
    }

    @Override
    public Color getColor() {
        return color;
    }
    
}