package com.logger.logger_spring_starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "starter-custom-logger")
@Data
public class StarterCustomerLoggerProperties {

    private String author;
    private boolean enabled;
    private String level;
    private String pattern;

}
// Шаг 1: Создаем файл настроек в формате YAML
// Например, starter-custom-logger.yml

// Шаг 2: Создаем класс для хранения настроек
// Например, StarterCustomLoggerProperties.java

// Шаг 3: Создаем класс автоконфигурации
// Например, StarterCustomLoggerConfiguration.java
// Этот класс будет содержать бин, который мы хотим автоматически настроить в нашем приложении

// Шаг 4: Создаем файл spring.factories в директории META-INF
// Например, src/main/resources/META-INF/spring.factories
// В этом файле указываем путь к классу автоконфигурации, чтобы Spring автоматически его обнаружил

// Шаг 5: Описываем логику стартера в классе автоконфигурации
// В методе конфигурации создаем бины и настраиваем их в соответствии с нашими требованиями
