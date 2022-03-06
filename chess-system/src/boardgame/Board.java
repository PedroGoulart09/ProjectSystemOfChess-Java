package boardgame;

public class Board {

	private Integer columns;
	private Integer rows;
	private Piece[][] pieces;

	public Board() {
	}

	public Board(Integer columns, Integer rows, Piece[][] pieces) {
		this.columns = columns;
		this.rows = rows;
		pieces = new Piece[rows][columns];
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return rows + ", " + columns + ", " + pieces;
	}

}
