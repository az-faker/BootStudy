package com.study.bootstudy.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ComStudyConfig实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-13 19:07:26
 */
@Data
@Component
@ConfigurationProperties(prefix = "com.study")
public class ComStudyConfig {
    private String db;
    private String name;
}
