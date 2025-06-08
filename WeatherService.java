package com.example.weatherapp.service;

import org.springframework.stereotype.Service;
import java.net.http.*;
import java.net.URI;

/**
 * 天気情報を外部API（OpenWeatherMap）から取得するサービスクラスです。
 * <p>
 * 指定された都市の現在の天気情報を取得し、JSON形式のレスポンスを返します。
 * </p>
 */
@Service
public class WeatherService {

    /**
     * OpenWeatherMap APIの認証に使用されるAPIキー。
     * <p>
     * 本番環境ではハードコーディングではなく、環境変数や設定ファイルから取得することが推奨されます。
     * </p>
     */
    private final String API_KEY = "YOUR_API_KEY";

    /**
     * 指定された都市の天気情報をOpenWeatherMap APIから取得します。
     *
     * @param city 取得対象の都市名（例："Tokyo"）
     * @return APIのレスポンスボディ（JSON文字列）、またはエラー時には固定のエラーメッセージ
     */
    public String getWeather(String city) {
        try {
            String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city
                    + "&appid=" + API_KEY + "&units=metric";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            return "Error retrieving weather";
        }
    }
}

