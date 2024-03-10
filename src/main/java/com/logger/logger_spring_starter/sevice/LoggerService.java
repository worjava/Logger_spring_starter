package com.logger.logger_spring_starter.sevice;

import org.springframework.boot.logging.LogLevel;

public interface LoggerService {
    void logMessage (String message, LogLevel logLeve);



}
