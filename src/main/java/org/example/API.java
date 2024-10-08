package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;


public class API {

    public static Map<String,Object> getMapApi(String base_code,String target_code, double monto){
        try{
            // utilizamos Client
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/fe0281e136e043be265b1e8e/pair/"+base_code+"/"+target_code+"/"+monto))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> jsonResponse = mapper.readValue(response.body(), Map.class);

            return jsonResponse;
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
