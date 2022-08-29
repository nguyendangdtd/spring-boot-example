/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.nguyen.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author XV
 */
@Configuration
public class SpringMvcConfiguration implements WebMvcConfigurer  {

     private static final String[] CLASSPATH_RESOURCE_LOCATIONS =
    {
        "classpath:/META-INF/resources/", "classpath:/resources/",
        "classpath:/static/", "classpath:/static/upload/"
    };
     
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
    }
}
