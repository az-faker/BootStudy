package com.study.bootstudy.service;

import com.study.bootstudy.config.BaseTest;
import com.study.bootstudy.config.ComStudyConfig;
import com.study.bootstudy.config.DataConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;

import static org.hamcrest.Matchers.equalTo;

/**
 * TestConfig实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-13 18:18:38
 */
public class TestConfig extends BaseTest {

    @Resource
    private DataConfig dataConfig;
    @Resource
    private ComStudyConfig comStudyConfig;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testConfig() {
        System.out.println(dataConfig.getPlatform());
//        System.out.println(dataConfig.getFaker());
        System.out.println(dataConfig.getNames());
//        System.out.println(dataConfig.getUrls());
//        System.out.println(dataConfig.getMap());
        Assert.assertThat(true, equalTo(true));
    }

    @Test
    public void testDataConfig() {
        System.out.println(comStudyConfig.getDb());
        System.out.println(comStudyConfig.getName());
        Assert.assertThat(true, equalTo(true));
    }
}
