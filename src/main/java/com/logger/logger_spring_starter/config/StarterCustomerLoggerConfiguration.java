package com.logger.logger_spring_starter.config;

import com.logger.logger_spring_starter.sevice.LoggerService;
import com.logger.logger_spring_starter.sevice.LoggerServiceImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AutoConfiguration
@EnableConfigurationProperties(StarterCustomerLoggerProperties.class)
public class StarterCustomerLoggerConfiguration {

    @Bean
    LoggerService loggerService(StarterCustomerLoggerProperties prop) {

        return new LoggerServiceImpl(prop);
    }

}
