package searchQuery;

public class App {
    public static void main(String[] args) {
        String word = InputScanner.inputSearchWord();
        SearchQuery.getQuery(word);
    }
}
