package com.ouag.sample.beanslifecycle.config;

import com.ouag.sample.beanslifecycle.Bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    @Bean
    public StrategyBean getStrategyBean(ApplicationContext context) {
        return new StrategyBean(context);
    }

    @Bean
    public Bean1 getBean1(ApplicationContext context) {
        return new Bean1();
    }

}
