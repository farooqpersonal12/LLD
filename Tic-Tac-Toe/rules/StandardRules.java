package rules;

import board.Board;
// import Symbol.Symbol;
import enums.*;

public class StandardRules extends Rules {

    @Override
    public boolean checkWin(Board board, Symbol Symbol) {
        for (int i = 0; i < Board.SIZE; i++) {
            if (board.getCell(i, 0) == Symbol && board.getCell(i, 1) == Symbol && board.getCell(i, 2) == Symbol) {
                return true;
            }

            if (board.getCell(0, i) == Symbol && board.getCell(1, i) == Symbol && board.getCell(2, i) == Symbol) {
                return true;
            }
        }

        if (board.getCell(0, 0) == Symbol && board.getCell(1, 1) == Symbol && board.getCell(2, 2) == Symbol) {
            return true;
        }

        if (board.getCell(0, 2) == Symbol && board.getCell(1, 1) == Symbol && board.getCell(2, 0) == Symbol) {
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
