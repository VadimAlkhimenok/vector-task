package searchQuery;

import com.google.gson.JsonArray;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        SearchQuery searchQuery = new SearchQuery("query", "search");
        searchQuery.inputSearchingWord();
        searchQuery.getLinkForSearch();
        JsonArray data = searchQuery.getDataFromWiki();

        NewData newData = new NewData();
        ArrayList<WikiData> arrayList = newData.getNewData(data);
        newData.showNewData(arrayList);
    }
}