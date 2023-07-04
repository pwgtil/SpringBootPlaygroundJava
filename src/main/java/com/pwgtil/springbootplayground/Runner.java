package com.pwgtil.springbootplayground;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.logging.LoggingApplicationListener;
import org.springframework.stereotype.Component;

@Component
class Runner implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingApplicationListener.class);

    @Override
    public void run(String... args) {
        LOGGER.info("Spring Boot application was launched!");
    }
}
