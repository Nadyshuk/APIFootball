package com.example.demo.services;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class FootballApiService {
    private static final String API_KEY = "a8866e71c1msh4d942d0932cef2ep1ade96jsn24ae36013753";
    private static final String API_URL = "https://rapidapi.com/api-sports/api/api-football/";

    public String getStatus() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-host", "v3.football.api-sports.io");
        headers.set("x-rapidapi-key", API_KEY);
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> response = restTemplate.exchange(API_URL, HttpMethod.GET, entity, String.class);
        return response.getBody();
    }
}
