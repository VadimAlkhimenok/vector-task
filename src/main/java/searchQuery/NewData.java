package searchQuery;

import com.google.gson.*;
import org.jsoup.Jsoup;

import java.util.ArrayList;

public class NewData {
    public static ArrayList<WikiData> getNewData (JsonArray array) {
        ArrayList<WikiData> result = new ArrayList<>();

        for (JsonElement el : array) {
            JsonObject wikiJsonObject = el.getAsJsonObject();

            String title = wikiJsonObject.get("title").getAsString();
            String snippet = Jsoup.parse(wikiJsonObject.get("snippet").getAsString()).text();
            int pageid = wikiJsonObject.get("pageid").getAsInt();

            WikiData wikiData = new WikiData(title, pageid, snippet);
            result.add(wikiData);
        }

        return result;
    }

    public static void showNewData (ArrayList<WikiData> arrayList) {
        for (WikiData w : arrayList) {
            System.out.println(w);
        }
    }
}
