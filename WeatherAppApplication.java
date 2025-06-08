package com.example.weatherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * エントリーポイントとなるクラスです。
 * <p>
 * Spring Boot アプリケーションとして {@code WeatherAppApplication} を起動します。
 * </p>
 */
@SpringBootApplication
public class WeatherAppApplication {

    /**
     * アプリケーションのメインメソッドです。
     * <p>
     * Spring Boot の {@link SpringApplication#run(Class, String...)} を使用して
     * アプリケーションを起動します。
     * </p>
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        SpringApplication.run(WeatherAppApplication.class, args);
    }
}
