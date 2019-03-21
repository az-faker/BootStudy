package com.study.bootstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * BootStudyApplication实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-13 17:36:56
 */
@Slf4j
@SpringBootApplication
public class BootStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootStudyApplication.class, args);

//        ApplicationContext context = SpringApplication.run(BootStudyApplication.class, args);
//        Binder binder = Binder.get(context.getEnvironment());
//
//        ComStudyConfig com = binder.bind("com.study", Bindable.of(ComStudyConfig.class)).get();
//        System.out.println(com.getDb());
//        System.out.println(com.getName());
    }
}
