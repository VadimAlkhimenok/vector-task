package searchQuery;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class searchQuery {

    public static void getQuery() {
        String query = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch='Java'";

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(query).openConnection();
            connection.setConnectTimeout(200);
            connection.connect();

            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                System.out.println(br.readLine());
            } else {
                System.out.println("Error: " + connection.getResponseCode() + ", " + connection.getResponseMessage());
            }
        } catch (Throwable error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}
