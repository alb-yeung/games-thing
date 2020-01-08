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
        if (moveTo.getX() < currSpot.getX()){
            int currY = currSpot.getY();
            for (int currX = moveTo.getX() + 1; currX < currSpot.getX(); currX++){
                if (!(currBoard.getSpot(currX, currY).getCurrPiece() instanceof EmptyPiece))
                    return false;
            }
            return true;
        }
        if (currSpot.getX() < moveTo.getX()){
            int currY = currSpot.getY();
            for (int currX = currSpot.getX() + 1; currX < moveTo.getX(); currX++){
                if (!(currBoard.getSpot(currX, currY).getCurrPiece() instanceof EmptyPiece))
                    return false;
            }
            return true;
        }
        if (moveTo.getY() < currSpot.getY()){
            int currX = currSpot.getX();
            for (int currY = moveTo.getY() + 1; currY < currSpot.getY(); currY++){
                if (!(currBoard.getSpot(currX, currY).getCurrPiece() instanceof EmptyPiece))
                    return false;
            }
            return true;
        }
        if (currSpot.getY() < moveTo.getY()){
            int currX = currSpot.getX();
            for (int currY = currSpot.getY() + 1; currY < moveTo.getY(); currY++){
                if (!(currBoard.getSpot(currX, currY).getCurrPiece() instanceof EmptyPiece))
                    return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public Color getColor() {
        return color;
    }
    
}