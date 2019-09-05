package com.ouag.sample.beanslifecycle.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class StrategyBean {

    ApplicationContext context;
    public Set<Object> beansSet = new HashSet<>();


    public StrategyBean(ApplicationContext context){
        this.context = context;
        beansSet.addAll(context.getBeansOfType(Object.class).values());
    }









}
