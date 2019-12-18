package discbot.driver;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.pieces.Color;
import discbot.game.chessgame.pieces.Pawn;
import discbot.game.chessgame.pieces.PieceI;
import discbot.util.logger.LoggerValues;
import discbot.util.logger.MyLogger;

public class Driver{
    public static void main(String[] args){

        MyLogger.setDebugLevel(LoggerValues.ALL);

        Chessboard board = new Chessboard();

        PieceI pawn1 = new Pawn(Color.BLACK);
        board.getSpot(0,0).setCurrPiece(pawn1);

        MyLogger.printMessage("" + pawn1.canMove(board, board.getSpot(0, 0),board.getSpot(1, 0)), LoggerValues.CHESS);

        PieceI pawn2 = new Pawn(Color.WHITE);
        board.getSpot(1,0).setCurrPiece(pawn2);

        MyLogger.printMessage("" + pawn1.canMove(board, board.getSpot(0, 0),board.getSpot(1, 0)), LoggerValues.CHESS);
    }
}