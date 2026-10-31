package rules;

import board.Board;
import enums.Symbol;
import symbol.symbol;

public abstract class Rules {
    public abstract boolean checkWin(Board board, Symbol symbol);

    public abstract boolean checkDraw(Board board);

    public abstract boolean isValidMove(Board board, int row, int col);
}
