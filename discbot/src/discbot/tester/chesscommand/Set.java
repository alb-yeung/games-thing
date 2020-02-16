package discbot.tester.chesscommand;

import discbot.game.chessgame.Chessboard;
import discbot.game.chessgame.Spot;
import discbot.game.chessgame.pieces.Color;
import discbot.game.chessgame.pieces.PieceI;

public class Set {

    public static void execute(Chessboard cIn, String lineIn){
        String[] splitLine = lineIn.split(" ");
        Spot spot = cIn.getSpot(Integer.parseInt(splitLine[3]), Integer.parseInt(splitLine[4]));
        PieceI piece;
        Color color;
        String pieceText = splitLine[1].toUpperCase();
        String colorText = splitLine[2].toUpperCase();
        // Switch for color
        switch(colorText){
            case "WHITE":
                color = Color.WHITE;
                break;
            case "BLACK":
                color = Color.BLACK;
                break;
            default:
                System.err.println("DEFAULTED IN SET");
        }
        // TODO: Switch for piece
    }

}