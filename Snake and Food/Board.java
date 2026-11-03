public class Board {
    private final int rows;
    private final int cols;

    public Board(int rows, int cols) {
        if (rows < 1 || cols < 1) {
            throw new IllegalArgumentException("row or col should be positive numbers");
        }
        this.rows = rows;
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public boolean isValidPosition(Position position) {
        return position.row() >= 0 && position.row() < rows
                && position.col() >= 0 && position.col() < cols;
    }
}