package com.study.bootstudy.config;

import com.study.bootstudy.BootStudyApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * BaseTest实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-13 18:14:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BootStudyApplication.class)
@WebAppConfiguration
@ActiveProfiles("dev")
public class BaseTest {
}
