package searchQuery;

import com.google.gson.*;
import org.jsoup.Jsoup;

import java.util.ArrayList;

public class NewData {
    public ArrayList<WikiData> getNewData (JsonArray array) {
        ArrayList<WikiData> result = new ArrayList<>();

        for (JsonElement el : array) {
            JsonObject wikiJsonObject = el.getAsJsonObject();

            WikiData wikiData = new WikiData(
                    wikiJsonObject.get("title").getAsString(),
                    wikiJsonObject.get("pageid").getAsInt(),
                    Jsoup.parse(wikiJsonObject.get("snippet").getAsString()).text()
            );
            result.add(wikiData);
        }

        return result;
    }

    public void showNewData (ArrayList<WikiData> arrayList) {
        for (WikiData w : arrayList) {
            System.out.println(w);
        }
    }
}
