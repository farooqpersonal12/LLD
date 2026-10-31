package enums;

public enum Symbol {
    X('X'), O('O'), EMPTY('-');

    private final char mark;

    Symbol(char mark) {
        this.mark = mark;
    }

    public char getMark() {
        return mark;
    }
}
