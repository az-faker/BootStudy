package com.study.bootstudy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * IndexController实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-20 17:52:20
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "https://www.baidu.com");
        return "index";
    }
}
