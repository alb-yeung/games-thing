package discbot.driver;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.pieces.Color;
import discbot.game.chessgame.pieces.Knight;
import discbot.game.chessgame.pieces.Pawn;
import discbot.game.chessgame.pieces.PieceI;
import discbot.game.chessgame.pieces.Rook;
import discbot.util.logger.LoggerValues;
import discbot.util.logger.MyLogger;

public class Driver{
    public static void main(String[] args){

        MyLogger.setDebugLevel(LoggerValues.ALL);

        Chessboard board = new Chessboard();

        // Want to make driver class operate on a tester file but later project

        /**
         * PAWN TESTING
         */

        MyLogger.printLine(LoggerValues.CHESS);
        MyLogger.printMessage("Pawn testing", LoggerValues.CHESS);
        MyLogger.printLine(LoggerValues.CHESS);

        /**
         * Basic movement
         */

        MyLogger.printMessage("Basic Movement", LoggerValues.CHESS);

        PieceI pawn1 = new Pawn(Color.BLACK);
        board.getSpot(0,0).setCurrPiece(pawn1);

        MyLogger.printMessage("" + pawn1.canMove(board, board.getSpot(0, 0),board.getSpot(1, 0)), LoggerValues.CHESS);                  // true
        MyLogger.printMessage("" + pawn1.canMove(board, board.getSpot(0, 0),board.getSpot(2, 0)), LoggerValues.CHESS);                  // true

        /**
         * Capturing
         */

        MyLogger.printLine(LoggerValues.CHESS);
        MyLogger.printMessage("Capturing", LoggerValues.CHESS);

        PieceI pawn2 = new Pawn(Color.WHITE);
        board.getSpot(1,0).setCurrPiece(pawn2);

        MyLogger.printMessage("" + pawn1.canMove(board, board.getSpot(0, 0),board.getSpot(1, 0)), LoggerValues.CHESS);                  // false

        board.getSpot(1,1).setCurrPiece(pawn2);

        MyLogger.printMessage("" + pawn1.canMove(board, board.getSpot(0, 0),board.getSpot(1, 1)), LoggerValues.CHESS);                  // true

        board.clear();

        /**
         * KNIGHT TESTING
         */

        MyLogger.printLine(LoggerValues.CHESS);
        MyLogger.printMessage("Knight testing", LoggerValues.CHESS);
        MyLogger.printLine(LoggerValues.CHESS);
        
        /**
         * Basic movement
         */

        MyLogger.printMessage("Basic Movement", LoggerValues.CHESS);

        PieceI knight1 = new Knight(Color.BLACK);
        board.getSpot(3,3).setCurrPiece(knight1);

        MyLogger.printMessage("" + knight1.canMove(board, board.getSpot(3, 3), board.getSpot(1, 2)), LoggerValues.CHESS);               // true
        MyLogger.printMessage("" + knight1.canMove(board, board.getSpot(3, 3), board.getSpot(2, 2)), LoggerValues.CHESS);               // false
        MyLogger.printMessage("" + knight1.canMove(board, board.getSpot(3, 3), board.getSpot(2, 1)), LoggerValues.CHESS);               // true
        MyLogger.printMessage("" + knight1.canMove(board, board.getSpot(3, 3), board.getSpot(5, 2)), LoggerValues.CHESS);               // true 

        MyLogger.printLine(LoggerValues.CHESS);

        /**
         * Blocked by same color + capturing
         */

        MyLogger.printMessage("Blocked and capturing", LoggerValues.CHESS);

        PieceI pawn3 = new Pawn(Color.BLACK);
        board.getSpot(2,5).setCurrPiece(pawn3);
        PieceI pawn4 = new Pawn(Color.WHITE);
        board.getSpot(5,2).setCurrPiece(pawn4);

        MyLogger.printMessage("" + knight1.canMove(board, board.getSpot(3, 3), board.getSpot(2, 5)), LoggerValues.CHESS);               // false
        MyLogger.printMessage("" + knight1.canMove(board, board.getSpot(3, 3), board.getSpot(5, 2)), LoggerValues.CHESS);               // true

        board.clear();

        /**
         * ROOK TESTING
         */

        MyLogger.printLine(LoggerValues.CHESS);
        MyLogger.printMessage("Rook testing", LoggerValues.CHESS);
        MyLogger.printLine(LoggerValues.CHESS);

        /**
         * Basic movement
         */

        MyLogger.printMessage("Basic movement", LoggerValues.CHESS);

        PieceI rook1 = new Rook(Color.BLACK);
        board.getSpot(4,4).setCurrPiece(rook1);

        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(5,4)), LoggerValues.CHESS);                   // true
        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(4,7)), LoggerValues.CHESS);                   // true
        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(2,4)), LoggerValues.CHESS);                   // true
        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(4,1)), LoggerValues.CHESS);                   // true
        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(4,4)), LoggerValues.CHESS);                   // false
        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(6,6)), LoggerValues.CHESS);                   // false
        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(2,3)), LoggerValues.CHESS);                   // false

        MyLogger.printLine(LoggerValues.CHESS);

        /**
         * Blocked by piece and captures
         */

        MyLogger.printMessage("Blocked by pieces and captures", LoggerValues.CHESS);

        PieceI pawn5 = new Pawn(Color.WHITE);
        board.getSpot(4,6).setCurrPiece(pawn5);

        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(4,7)), LoggerValues.CHESS);                   // false
        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(4,6)), LoggerValues.CHESS);                   // true

        PieceI pawn6 = new Pawn(Color.BLACK);
        board.getSpot(6,4).setCurrPiece(pawn6);

        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(5,4)), LoggerValues.CHESS);                   // true
        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(6,4)), LoggerValues.CHESS);                   // false
        MyLogger.printMessage("" + rook1.canMove(board, board.getSpot(4,4), board.getSpot(7,4)), LoggerValues.CHESS);                   // false

        board.clear();

    }
}