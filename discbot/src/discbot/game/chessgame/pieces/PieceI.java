package discbot.game.chessgame.pieces;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.Spot;

public interface PieceI {
    boolean canMove(Chessboard currBoard, Spot currSpot, Spot moveTo);
    Color getColor();
}