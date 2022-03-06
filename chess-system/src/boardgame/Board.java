package boardgame;

public class Board {

	private int columns;
	private int rows;
	private Piece[][] pieces;

	public Board(int i, int j) {
	}

	public Board(int columns, int rows, Piece[][] pieces) {
		this.columns = columns;
		this.rows = rows;
		pieces = new Piece[rows][columns];
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColum()];
	}
}
