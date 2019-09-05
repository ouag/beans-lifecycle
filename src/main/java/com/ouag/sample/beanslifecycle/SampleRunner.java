package com.ouag.sample.beanslifecycle;

import com.ouag.sample.beanslifecycle.config.StrategyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    public StrategyBean strategyBean;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(strategyBean.beansSet.size());
    }
}
