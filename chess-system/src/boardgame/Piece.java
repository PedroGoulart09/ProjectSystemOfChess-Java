package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece() {
	}

	public Piece(Board board) {
		this.board = board;
		// por padrão já é null mas isso é para deixar didatico
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
