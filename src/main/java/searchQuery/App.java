package searchQuery;

import com.google.gson.JsonArray;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String word = InputScanner.inputSearchWord();
        String query = QueryString.getStringForSearch(word);
        JsonArray data = SearchQuery.getQuery(query, "query", "search");
        ArrayList<WikiData> arrayList = NewData.getNewData(data);
        NewData.showNewData(arrayList);
    }
}
