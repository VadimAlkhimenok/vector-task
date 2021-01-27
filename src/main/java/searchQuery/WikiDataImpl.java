package searchQuery;

public enum WikiDataImpl {
    CONSOLE(1),
    FILE(2),
    SERVER(3);

    private final int numberWikiData;

    WikiDataImpl(int numberWikiData) {
        this.numberWikiData = numberWikiData;
    }

    @Override
    public String toString() {
        return "{title: " + numberWikiData + "}";
    }
}
