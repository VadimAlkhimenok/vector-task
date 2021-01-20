package searchQuery;

import com.google.gson.*;
import java.io.*;
import java.net.HttpURLConnection;

public class JsonReader {
    public static JsonObject getDataInJson(BufferedReader json) {
        JsonElement elem = JsonParser.parseReader(json);
        return elem.getAsJsonObject();
    }

    public static JsonArray searchDataInJson(JsonObject obj, String ...args) {
        return obj.getAsJsonObject(args[0]).get(args[1]).getAsJsonArray();
    }

    public static JsonArray getArrayData(HttpURLConnection connection, String ...args) throws IOException {
        BufferedReader json = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        JsonObject data = getDataInJson(json);
        return searchDataInJson(data, args[0], args[1]);
    }
}