package com.ouag.sample.beanslifecycle.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    @Bean
    public StrategyBean getStrategyBean(ApplicationContext context) {
        return new StrategyBean(context);
    }
}
