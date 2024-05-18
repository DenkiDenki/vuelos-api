package com.codeki.vuelosapi.configuration;

import dollar.model.Dollar;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FlightConfiguration {

        @Value("$dollar.card-url")
        private String URL_DOLLAR;

        @Bean
        public RestTemplate restTemplate(){
            return new RestTemplate();
        }

        public Dollar fetchDollar(){
            RestTemplate restTemplate = restTemplate();
            return restTemplate.getForObject(URL_DOLLAR+ "/tarjeta", Dollar.class);
        }
        public Dollar[] fetchAllDollars(){
            RestTemplate restTemplate = restTemplate();
            return restTemplate.getForEntity(URL_DOLLAR, Dollar[].class).getBody();
    }
}
