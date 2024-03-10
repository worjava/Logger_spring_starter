package com.logger.logger_spring_starter.sevice;

import com.logger.logger_spring_starter.config.StarterCustomerLoggerProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.logging.LogLevel;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RequiredArgsConstructor
public class LoggerServiceImpl implements LoggerService {


    private final Logger logger = LoggerFactory.getLogger(LoggerService.class);
    private final StarterCustomerLoggerProperties loggerProperties;


    @Override
    public void logMessage(String message, LogLevel logLevel) {
        if (loggerProperties.isEnabled()) {
            if (logLevel == null) {
                logLevel = LogLevel.INFO; // Устанавливаем уровень INFO по умолчанию, если не указан явно
            }
            switch (logLevel) {
                case TRACE -> logger.trace(message);
                case DEBUG -> logger.debug(message);
                case INFO -> logger.info(message);
                case WARN -> logger.warn(message);
                case ERROR -> logger.error(message);
            }
        }
    }
}


