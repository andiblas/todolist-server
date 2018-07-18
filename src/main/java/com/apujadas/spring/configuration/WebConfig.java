package com.apujadas.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.MappedInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public MappedInterceptor allRequestsInterceptor() {
        return new MappedInterceptor(new String[]{"/todos"}, new AllRequestsInterceptor());
    }

}
