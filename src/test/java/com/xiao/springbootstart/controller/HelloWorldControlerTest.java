package com.xiao.springbootstart.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/*
 * @Title: HelloWorldControllerTest
 * @Package: com.xiao.springbootstart.controller
 * @Description:
 * @author: xiaoyh
 * @date: 2019/5/25 16:20
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControlerTest {
    private MockMvc mvc;
    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }
    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}