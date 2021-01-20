package searchQuery;

import com.google.gson.JsonArray;
import java.net.*;

public class SearchQuery {
    public static JsonArray getQuery(String query, String ...args) {
        JsonArray data = null;
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(query).openConnection();
            connection.setConnectTimeout(250);
            connection.connect();

            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                data = JsonReader.getArrayData(connection, args[0], args[1]);
            } else {
                System.out.println("Error of connection: " + connection.getResponseCode() + ", " + connection.getResponseMessage());
            }

        } catch (Throwable error) {
            System.out.println("Error: " + error.getMessage());
        }

        return data;
    }
}