package searchQuery;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SearchQuery {
    public static void getQuery(String word) {
        String query = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=" + word;

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(query).openConnection();
            connection.setConnectTimeout(250);
            connection.connect();

            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                BufferedReader json = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                JsonReader.readData(json);
            } else {
                System.out.println("Error of connection: " + connection.getResponseCode() + ", " + connection.getResponseMessage());
            }

        } catch (Throwable error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}