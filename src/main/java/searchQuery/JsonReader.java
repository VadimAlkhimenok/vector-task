package searchQuery;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.jsoup.Jsoup;

import javax.swing.text.html.HTML;
import java.io.BufferedReader;
import java.util.ArrayList;

public class JsonReader {
    public static void readData(BufferedReader json) {
        ArrayList<WikiData> result = new ArrayList<>();

        JsonElement elem = JsonParser.parseReader(json);
        JsonObject obj = elem.getAsJsonObject();

        JsonArray searchData = obj.getAsJsonObject("query").get("search").getAsJsonArray();

        for (JsonElement el : searchData) {
            JsonObject wikiJsonObject = el.getAsJsonObject();

            String title = wikiJsonObject.get("title").getAsString();
            String snippet = Jsoup.parse(wikiJsonObject.get("snippet").getAsString()).text();

            int pageid = wikiJsonObject.get("pageid").getAsInt();

            WikiData wikiData = new WikiData(title, pageid, snippet);
            result.add(wikiData);
        }

        for (WikiData w : result) {
            System.out.println(w);
        }
    }
}
