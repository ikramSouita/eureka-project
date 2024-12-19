package com.example.clientservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        config.setAllowCredentials(true); // Autorise les cookies si nécessaires
        config.addAllowedOriginPattern("*"); // Autorise toutes les origines
        config.addAllowedHeader("*"); // Autorise tous les headers
        config.addAllowedMethod("*"); // Autorise toutes les méthodes (GET, POST, PUT, DELETE, etc.)
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
