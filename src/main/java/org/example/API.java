package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;


public class API {

    public static Map<String,Object> getMapFromApi(String base_code,String target_code, double monto){
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
    public static void getMenu(){
        StringBuilder menu = new StringBuilder();

        menu.append("************************************************************").append("\n");

        menu.append("Sea Bienvenido/a al conversor de Monedas =]").append("\n\n");

        menu.append("(1) Dólar => Peso Argentino").append("\n");
        menu.append("(2) Peso Argentino => Dólar").append("\n");
        menu.append("(3) Dólar => Real Brasileño").append("\n");
        menu.append("(4) Real Brasileño => Dólar").append("\n");
        menu.append("(5) Dólar => Peso Colombiano").append("\n");
        menu.append("(6) Peso Colombiano => Dólar").append("\n");
        menu.append("(7) Dólar => Euro").append("\n");
        menu.append("(8) Euro => Dólar").append("\n");
        menu.append("(9) Dólar => Libra Esterlina").append("\n");
        menu.append("(10) Libra Esterlina => Dólar").append("\n");
        menu.append("(11) Dólar => Yen Japonés").append("\n");
        menu.append("(12) Yen Japonés => Dólar").append("\n");
        menu.append("(13) Euro => Peso Argentino").append("\n");
        menu.append("(14) Peso Argentino => Euro").append("\n");
        menu.append("(15) Euro => Real Brasileño").append("\n");
        menu.append("(16) Real Brasileño => Euro").append("\n");
        menu.append("(17) revisar el historial").append("\n");
        menu.append("(18) salir").append("\n\n");

        menu.append("Elija una opción válida: ").append("\n");

        menu.append("****************************************************************");

        System.out.println(menu);
    }
}
