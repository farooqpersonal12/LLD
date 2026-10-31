package board;

import enums.Symbol;

public class Board {
    public static final int SIZE = 3;

    private Symbol[][] grid;

    public Board() {
        grid = new Symbol[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    public boolean isCellEmpty(int row, int col) {
        return isInBounds(row, col) && grid[row][col] == Symbol.EMPTY;
    }

    public void placeMark(int row, int col, Symbol mark) {
        if (isCellEmpty(row, col)) {
            grid[row][col] = mark;
        }
    }

    public Symbol getCell(int row, int col) {
        return grid[row][col];
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean isInBounds(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
    }
}
