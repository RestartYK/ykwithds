package com.ykwithds.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;


@OpenAPIDefinition(info = @Info(title = "YK Edu Swagger", description = "샘플 REST API", version = "1.0.0"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi groupOpenApi(){
        String[] paths = {"/**"};

        return GroupedOpenApi.builder()
                .group("OPEN API v1")
                .pathsToMatch(paths)
                .build();
    }

    
}
