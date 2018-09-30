package models.constants;

public final class RegEx {

    private RegEx(){}

    public final static String EMPTY_LINES = "(?m)^[ \t]*\r?\n";
    public final static String ANY_AMOUNT_OF_SPACES = " +";
    public final static String DOUBLE = "[0-9]{1,13}(\\.[0-9]*)?";
}
