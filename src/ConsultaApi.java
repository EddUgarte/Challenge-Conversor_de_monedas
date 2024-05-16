import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

public void buscaMoneda(String monedaBase, String monedaObjetivo, Double cantidad) {
    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/162bae4d6a9c1aba40f334ef/pair/"+monedaBase+"/"+monedaObjetivo+"/"+cantidad);

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    try {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        //System.out.println(json);

        Moneda miMoneda = gson.fromJson(json, Moneda.class);
        System.out.println(miMoneda);

    } catch (IOException e) {
        System.out.println("Ocurrió un error: ");
        System.out.println(e.getMessage());
    } catch (IllegalArgumentException | InterruptedException e) {
        System.out.println("Error en la URI, verifique la dirección");
    }

    }
}
