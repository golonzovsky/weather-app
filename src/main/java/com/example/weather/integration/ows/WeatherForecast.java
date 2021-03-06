package com.example.weather.integration.ows;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.Setter;


public class WeatherForecast implements Serializable {

    @Getter @Setter
    private String name;

    private List<WeatherEntry> entries = new ArrayList<>();

    @JsonProperty("entries")
    public List<WeatherEntry> getEntries() {
        return this.entries;
    }

    @JsonSetter("list")
    public void setEntries(List<WeatherEntry> entries) {
        this.entries = entries;
    }

    @JsonProperty("city")
    public void setCity(Map<String, Object> city) {
        setName(city.get("name").toString());
    }

}
