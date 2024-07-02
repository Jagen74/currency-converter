package com.conversor.utils;

import com.conversor.models.CurBase;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConTool {

    private static final Gson gson = new Gson();

    public CurBase conversion (String cur1, String cur2, double amount) throws IOException, InterruptedException {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/4650cc27a6002910d9adcca0/pair/"+cur1+"/"+cur2);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //System.out.println(response.body());

        JsonObject json = gson.fromJson(response.body(), JsonObject.class);
        double conversionRate = json.get("conversion_rate").getAsDouble();

        return new CurBase(cur1, cur2, conversionRate);
    }
}
