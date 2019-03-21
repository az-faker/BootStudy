package com.study.bootstudy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * DataConfig实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-13 17:40:07
 */
@Component
@Configuration
public class DataConfig {

    @Value("${com.study.db}")
    public String platform;

//    @Value("${com.study.faker}")
//    public String faker;

    @Value("${com.study.name}")
    public List<String> names;

//    @Value("${com.study.url}")
//    public List<String> urls;

//    @Value("${com.study.map}")
//    public Map<String, String> map;

    public String getPlatform() {
        return platform;
    }

//    public String getFaker() {
//        return faker;
//    }

    public List<String> getNames() {
        return names;
    }

//    public List<String> getUrls() {
//        return urls;
//    }

//    public Map<String, String> getMap() {
//        return map;
//    }
}
