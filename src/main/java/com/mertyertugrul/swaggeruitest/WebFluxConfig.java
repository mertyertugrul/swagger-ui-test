package com.mertyertugrul.swaggeruitest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@EnableWebFlux
@ComponentScan(basePackages = "com.mertyertugrul.swaggeruitest")
public class WebFluxConfig {
}

