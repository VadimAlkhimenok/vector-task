package searchQuery.output;

public enum TypeOutput {
    CONSOLE(1),
    FILE(2);

    private final int number;

    TypeOutput(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "{title: " + number + "}";
    }
}
