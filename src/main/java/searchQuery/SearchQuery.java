package searchQuery;

import com.google.gson.JsonArray;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SearchQuery {
    private String link = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";
    private String word;
    private JsonArray data = null;
    private HttpURLConnection connection;

    protected String query;
    protected String search;

    public SearchQuery(String query, String search) {
        this.query = query;
        this.search = search;
    }

    public SearchQuery() {}

    public String getQuery() {
        return query;
    }

    public String getSearch() {
        return search;
    }

    public HttpURLConnection getConnection() {
        return connection;
    }

    public void setConnection(HttpURLConnection connection) {
        this.connection = connection;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void inputSearchingWord () {
        System.out.print("Input searching word: ");
        setWord(new Scanner(System.in).nextLine());
    }

    public void getLinkForSearch() {
        setLink(getLink() + getWord());
    }

    public void createConnection () throws IOException {
        setConnection((HttpURLConnection) new URL(getLink()).openConnection());
        getConnection().setConnectTimeout(250);
        getConnection().connect();
    }

    public JsonArray getDataFromWiki() {
        try {
            createConnection();
            data = JsonReader.getArrayData(getConnection(), getQuery(), getSearch());
        } catch (Throwable error) {
            System.out.println("Error: " + error.getMessage());
        }

        return data;
    }
}