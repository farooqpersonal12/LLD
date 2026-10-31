package rules;

import board.Board;
import enums.*;

public class StandardRules extends Rules {

    @Override
    public boolean checkWin(Board board, Symbol symbol) {
        for (int i = 0; i < Board.SIZE; i++) {
            if (board.getCell(i, 0) == symbol && board.getCell(i, 1) == symbol && board.getCell(i, 2) == symbol) {
                return true;
            }

            if (board.getCell(0, i) == symbol && board.getCell(1, i) == symbol && board.getCell(2, i) == symbol) {
                return true;
            }
        }

        if (board.getCell(0, 0) == symbol && board.getCell(1, 1) == symbol && board.getCell(2, 2) == symbol) {
            return true;
        }

        if (board.getCell(0, 2) == symbol && board.getCell(1, 1) == symbol && board.getCell(2, 0) == symbol) {
            return true;
        }

        return false;
    }

    @Override
    public boolean checkDraw(Board board) {
        for (int i = 0; i < Board.SIZE; i++) {
            for (int j = 0; j < Board.SIZE; j++) {
                if (board.isCellEmpty(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isValidMove(Board board, int row, int col) {
        return row >= 0 && row < Board.SIZE
                && col >= 0 && col < Board.SIZE
                && board.isCellEmpty(row, col);
    }
}
