package discbot.tester.chesscommand;

import discbot.game.chessgame.Chessboard;

public class Clear{

    public static void execute(Chessboard cIn, String lineIn){
        cIn.clear();
    }
    
}