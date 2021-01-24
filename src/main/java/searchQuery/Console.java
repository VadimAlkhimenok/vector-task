package searchQuery;

import java.util.Scanner;

public class Console {
    private String url = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";

    public Console() {}

    public String getUrl() {
        return url;
    }

    public String getWorkingUrl () {
        return getUrl() + new Scanner(System.in).nextLine();
    }
}