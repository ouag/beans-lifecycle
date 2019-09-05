package com.ouag.sample.beanslifecycle;

import com.ouag.sample.beanslifecycle.config.SampleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SampleConfig.class)
public class BeansLifecycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansLifecycleApplication.class, args);
	}

}
