package discbot.tester.chesscommand;

import java.util.Arrays;

import discbot.game.chessgame.Chessboard;
import discbot.util.logger.LoggerValues;
import discbot.util.logger.MyLogger;

public class Print {

    public static void execute(Chessboard cIn, String lineIn){
        String[] split = lineIn.split(" ");
        String[] splitMessage = Arrays.copyOfRange(split, 1, split.length);
        String message = String.join(" ", splitMessage);
        MyLogger.printMessage(message, LoggerValues.CHESS);
    }

}