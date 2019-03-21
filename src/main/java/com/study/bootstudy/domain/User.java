package com.study.bootstudy.domain;

import lombok.Data;

/**
 * User实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-18 17:43:04
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
}
