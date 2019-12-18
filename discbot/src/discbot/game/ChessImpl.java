package discbot.game;

import discbot.game.chessgame.Chessboard;

public class ChessImpl implements GameI{

    private Chessboard currBoard;

    public ChessImpl(){
        currBoard = new Chessboard();
    }

    @Override
    public String draw(){
        return "";
    }

	@Override
	public void interpretInput(String inputIn) {
		// TODO Auto-generated method stub
		
	}
}