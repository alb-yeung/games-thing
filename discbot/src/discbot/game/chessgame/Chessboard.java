package discbot.game.chessgame;

import discbot.game.chessgame.pieces.EmptyPiece;
import discbot.util.logger.LoggerValues;
import discbot.util.logger.MyLogger;

public class Chessboard {

    private Spot[][] board;

    /**
     * A8 B8 C8 D8 E8 F8 G8 H8          00 01 02 03 04 05 06 07
     * A7                               10
     * A6                               20
     * A5                               30
     * A4                               40
     * A3                               50
     * A2                               60
     * A1                               70
     */

    public Chessboard(){
        board = new Spot[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                board[i][j] = new Spot(i, j, new EmptyPiece());
            }
        }
    }

    public Spot getSpot(int x, int y){
        return board[x][y];
    }

    public void clear(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                board[i][j] = new Spot(i, j, new EmptyPiece());
            }
        }
        MyLogger.printMessage("Board cleared", LoggerValues.CHESS);
    }

    @Override
    public String toString(){
        // TODO
        return "";
    }

}