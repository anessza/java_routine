package hu.nive.ujratervezes.java_routine.countchars;

public enum Code {

ZERO('0'), ONE('1'), X('x');

    private final char c;
    Code(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }
}
