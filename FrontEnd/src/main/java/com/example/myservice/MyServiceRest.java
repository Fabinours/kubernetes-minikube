package com.example.myservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;


@RestController
public class MyServiceRest {

    @Value("${backEndURL}")
    String backEndURL;

    @GetMapping("/")
    public String sayHello() throws java.io.IOException {
        String s;
        try {
            RestTemplate restTemplate = new RestTemplate();
            s = restTemplate.getForObject(backEndURL, String.class);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            s = "...";
        }

        InputStream is = getClass().getClassLoader().getResourceAsStream("index.html");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb.append(line);
            if(line.equals("<head>")){
                sb.append("<title>" + s + "</title>");
            }
        }

        return sb.toString();
    }
}
