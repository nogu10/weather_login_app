package com.example.weatherapp.service;

import org.springframework.stereotype.Service;
import java.net.http.*;
import java.net.URI;

@Service
public class WeatherService {
    private final String API_KEY = "YOUR_API_KEY";

    public String getWeather(String city) {
        try {
            String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + API_KEY + "&units=metric";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            return "Error retrieving weather";
        }
    }
}
