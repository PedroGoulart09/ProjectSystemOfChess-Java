package boardgame;

public class Position {

	private Integer row;
	private Integer column;

	public Position() {
		super();
	}

	public Position(Integer row, Integer colum) {
		this.row = row;
		this.column = colum;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColum() {
		return column;
	}

	public void setColum(Integer colum) {
		this.column = colum;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}

}