package searchQuery.output;

import searchQuery.models.ResultData;

import java.io.IOException;
import java.util.List;

public interface OutputResult {
    void showResult(List<ResultData> result) throws IOException;
    List<ResultData> convertTextInObj(List<ResultData> resultData);
}
