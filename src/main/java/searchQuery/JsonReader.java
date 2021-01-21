package searchQuery;

import com.google.gson.*;
import java.io.*;
import java.net.HttpURLConnection;

public class JsonReader {
    public static JsonArray getArrayData(HttpURLConnection connection, String ...args) throws IOException {
        BufferedReader json = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        return JsonParser
                .parseReader(json)
                .getAsJsonObject()
                .getAsJsonObject(args[0])
                .get(args[1])
                .getAsJsonArray();
    }
}