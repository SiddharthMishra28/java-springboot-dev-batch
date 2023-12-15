package com.learningspringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdDataSourceConfig {
    // PROD DATA SOURCE CONFIG GOES HERE
}
