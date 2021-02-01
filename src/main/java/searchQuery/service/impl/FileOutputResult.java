package searchQuery.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import searchQuery.models.Result;
import searchQuery.storage.Storage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOutputResult extends Storage {
    @Override
    public void showResult(List<Result> results) throws IOException {
        System.out.println("Wrote data from wiki in a file");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jo = gson.toJson(results);

        FileWriter fw = new FileWriter( "src/main/resources/json/wikiData.json" );
        fw.write(jo);
        fw.close();
    }
}
