package searchQuery;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;

public class JsonReader {
    public static void readData(BufferedReader json) {
        JsonElement elem = JsonParser.parseReader(json);
        JsonObject obj = elem.getAsJsonObject();

        JsonArray searchData = obj.getAsJsonObject("query").get("search").getAsJsonArray();

        for (JsonElement el : searchData) {
            System.out.println(el);
        }
    }
}
