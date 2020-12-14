package com.example.demo;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class kania {

    @GetMapping("/test")
    public String kania(){
        RestTemplate rest = new RestTemplate();
        ResponseEntity<String> response = rest.exchange(
                "http://192.168.55.109:8080/kania",
                HttpMethod.POST,
                HttpEntity.EMPTY,
                String.class);
        System.out.println(response.getBody());
        return "kania";
    }
}
