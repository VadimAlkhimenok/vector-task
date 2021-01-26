package searchQuery;

import org.springframework.web.client.RestTemplate;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Console console = new Console();
        System.out.print("Input searching word: ");
        String searchingWord = new Scanner(System.in).nextLine();
        console.setWord(searchingWord);
        String word = console.getWord();
        String url = console.getWorkingUrl(word);

        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject(url, Response.class);
        ArrayList<SearchData> result = Objects.requireNonNull(response).getQuery().getSearch();

        Util util = new Util();

        for (SearchData object : result) {
            object.setSnippet(util.normalizeData(object.getSnippet()));
            System.out.println(object);
        }
    }
}