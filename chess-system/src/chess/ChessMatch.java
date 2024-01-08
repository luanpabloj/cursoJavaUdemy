package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces(){
		ChessPiece[][] aux = new ChessPiece[board.getRows()][board.getColums()];
		
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColums(); j++){
				aux[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return aux;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 4));
	}
}
