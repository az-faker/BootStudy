package com.study.bootstudy.service;

import com.study.bootstudy.config.BaseTest;
import com.study.bootstudy.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * TestHello实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-14 16:11:06
 */
public class TestHello extends BaseTest {
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void testWorld() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/hello/world").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(notNullValue()));
    }
}
