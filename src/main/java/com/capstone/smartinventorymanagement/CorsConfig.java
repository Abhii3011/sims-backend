package com.capstone.smartinventorymanagement;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Example CORS configuration in a Spring Boot application

@Configuration
public class CorsConfig implements WebMvcConfigurer {
 @Override
 public void addCorsMappings(CorsRegistry registry) {
     registry.addMapping("/**")
     .allowCredentials(true)
             .allowedOrigins("https://brave-island-054155610.4.azurestaticapps.net/") // Add your React app's URL
             .allowedMethods("GET", "POST", "PUT", "DELETE");
 }
}
