package discbot.game.chessgame;

public class Chessboard{

    private Chesspiece[][] board;

    public Chessboard(){
        board = new Chesspiece[8][8];
    }

    public Chesspiece getPiece(int x, int y){
        return board[x][y];
    }
}