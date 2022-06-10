package com.example.demo.swager;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class Config {

        @Bean
        public OpenAPI openApiConfig() {
            return new OpenAPI().info(apiInfo());
        }

        public Info apiInfo() {
            Info info = new Info();
            info
                    .title("Live Code API")
                    .description("Live Code System Swagger Open API")
                    .version("v1.0.0");
            return info;
        }
    }

