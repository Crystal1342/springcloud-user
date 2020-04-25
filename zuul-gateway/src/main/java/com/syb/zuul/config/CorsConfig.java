package com.syb.zuul.config;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class CorsConfig implements WebMvcConfigurer {
    static final String[] ORIGINS = new String[]{"GET", "POST", "PUT",
            "DELETE"};

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowedMethods(ORIGINS).allowedHeaders("*").allowCredentials(true).maxAge(3600);
    }
}
