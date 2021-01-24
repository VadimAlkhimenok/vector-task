package searchQuery;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.print("Input searching word: ");
        Console console = new Console();
        String url = console.getWorkingUrl();

        Request request = new Request();
        Response response = request.getJsonData(url);
        ArrayList<SearchData> result = response.getQuery().getSearch();

        for (SearchData object : result) {
            System.out.println(object);
        }
    }
}