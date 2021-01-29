package searchQuery.common;

public enum OutputTypes {
    CONSOLE(1),
    FILE(2);

    private final int number;

    OutputTypes(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "{title: " + number + "}";
    }
}