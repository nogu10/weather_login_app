package com.example.weatherapp.controller;

import com.example.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

/**
 * 天気情報を表示するためのコントローラークラスです。
 * <p>
 * ユーザーがアクセスした際に、特定の都市（現状は「Tokyo」）の天気情報を取得して、
 * ビューに表示します。
 * </p>
 */
@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    /**
     * 「/weather」エンドポイントへのGETリクエストを処理します。
     * <p>
     * 天気情報を取得し、ビューに渡して表示します。
     * 現在は都市名「Tokyo」で固定されています。
     * </p>
     *
     * @param model     ビューにデータを渡すためのモデル
     * @param principal ログイン中のユーザー情報（未使用だが将来的な拡張に備えて保持）
     * @return 天気情報を表示するビューの名前（"weather"）
     */
    @GetMapping("/weather")
    public String getWeather(Model model, Principal principal) {
        String weatherInfo = weatherServ
