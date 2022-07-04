package com.example.immersioncamp1;

public class Weather {
    String city;
    String temp;
    String Weather;

    public Weather(String city, String temp, String weather) {
        this.city = city;
        this.temp = temp;
        this.Weather = weather;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWeather() {
        return Weather;
    }

    public void setWeather(String weather) {
        Weather = weather;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", temp='" + temp + '\'' +
                ", Weather='" + Weather + '\'' +
                '}';
    }
}