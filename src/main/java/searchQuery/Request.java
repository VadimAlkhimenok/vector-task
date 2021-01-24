package searchQuery;

import org.springframework.web.client.RestTemplate;

public class Request {
    public Response getJsonData (String url) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Response.class);
    }
}