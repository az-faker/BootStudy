package com.study.bootstudy.controller;

import com.study.bootstudy.basic.RpcResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-14 15:59:02
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    public RpcResponse<String> index() {
        return RpcResponse.success("Hello World");
    }

    @GetMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }
}
