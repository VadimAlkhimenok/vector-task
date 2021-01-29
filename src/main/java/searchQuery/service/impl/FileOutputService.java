package searchQuery.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import searchQuery.models.Result;
import searchQuery.service.OutputService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOutputService implements OutputService {
    @Override
    public void showResult(List<Result> results) throws IOException {
        System.out.println("Wrote data from wiki in a file");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jo = gson.toJson(results);

        FileWriter fw = new FileWriter( "src/main/java/searchQuery/json/wikiData.json" );
        fw.write(jo);
        fw.close();
    }
}
