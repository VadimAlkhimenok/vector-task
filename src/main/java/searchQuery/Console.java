package searchQuery;

import java.util.Scanner;

public class Console {
    private String word;

    public Console() {}

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String inputWordForSearch() {
        return new Scanner(System.in).nextLine();
    }
}