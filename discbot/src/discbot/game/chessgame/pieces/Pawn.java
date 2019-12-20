package discbot.game.chessgame.pieces;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.Spot;
import discbot.util.logger.LoggerValues;
import discbot.util.logger.MyLogger;

public class Pawn implements PieceI {

    private boolean movedBefore;
    private Color color;

    private Pawn(){}

    public Pawn(Color cIn){
        movedBefore = false;
        color = cIn;
    }

    @Override
    public boolean canMove(Chessboard currBoard, Spot currSpot, Spot moveTo) {
        switch(color){
            case BLACK:
                if (movedBefore){
                    int currX = currSpot.getX();
                    int currY = currSpot.getY();
                    int moveToX = moveTo.getX();
                    int moveToY = moveTo.getY();
                    // Move one up
                    if (currY == moveToY && currX == moveToX - 1 && 
                            moveTo.getCurrPiece() instanceof EmptyPiece)
                        return true;
                    // Capture
                    if ((currY == moveToY - 1 || currY == moveToY + 1) && currX == moveToX - 1 && 
                            moveTo.getCurrPiece().getColor() == Color.WHITE)
                        return true;
                    return false;
                }else{
                    int currX = currSpot.getX();
                    int currY = currSpot.getY();
                    int moveToX = moveTo.getX();
                    int moveToY = moveTo.getY();
                    // Move one up
                    if (currY == moveToY && currX == moveToX - 1 && 
                            moveTo.getCurrPiece() instanceof EmptyPiece)
                        return true;
                    // Move two up
                    if (currY == moveToY && currX == moveToX - 2 && 
                            moveTo.getCurrPiece() instanceof EmptyPiece && 
                            currBoard.getSpot(moveToX - 1, moveToY).getCurrPiece() instanceof EmptyPiece)
                        return true;
                    // Capture
                    if ((currY == moveToY - 1 || currY == moveToY + 1) && currX == moveToX - 1 && 
                            moveTo.getCurrPiece().getColor() == Color.WHITE)
                        return true;
                    return false;
                }
            case WHITE:
            if (movedBefore){
                int currX = currSpot.getX();
                int currY = currSpot.getY();
                int moveToX = moveTo.getX();
                int moveToY = moveTo.getY();
                // Move one up
                if (currY == moveToY && currX == moveToX + 1 && 
                        moveTo.getCurrPiece() instanceof EmptyPiece)
                    return true;
                // Capture
                if ((currY == moveToY - 1 || currY == moveToY + 1) && currX == moveToX + 1 && 
                        moveTo.getCurrPiece().getColor() == Color.BLACK)
                    return true;
                return false;
            }else{
                int currX = currSpot.getX();
                int currY = currSpot.getY();
                int moveToX = moveTo.getX();
                int moveToY = moveTo.getY();
                // Move one up
                if (currY == moveToY && currX == moveToX + 1 && 
                        moveTo.getCurrPiece() instanceof EmptyPiece)
                    return true;
                // Move two up
                if (currY == moveToY && currX == moveToX + 2 && 
                        moveTo.getCurrPiece() instanceof EmptyPiece && 
                        currBoard.getSpot(moveToX + 1, moveToY).getCurrPiece() instanceof EmptyPiece)
                    return true;
                // Capture
                if ((currY == moveToY - 1 || currY == moveToY + 1) && currX == moveToX + 1 && 
                        moveTo.getCurrPiece().getColor() == Color.BLACK)
                    return true;
                return false;
            }
            case NONE:
                MyLogger.printMessage("Pawn " + this + " color is set to NONE and canMove() called", LoggerValues.CHESS);
        }
        return false;
    }

    @Override
    public Color getColor() {
        return color;
    }

    
    
}