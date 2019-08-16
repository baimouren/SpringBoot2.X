package com.example.lookbilibili.controller.async;

import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/**
 * @Description 测试
 * @Auther CB
 * @Date 2019-07-11 16:34
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes  = MockServletContext.class)
@WebAppConfiguration
public class AsyncControllerTest {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new AsyncController()).build();
    }

//    @Test
//    public void asyncPage() throws Exception {
//
//        mvc.perform(MockMvcRequestBuilders.get("/async/page")
//                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                .param("lat", "123.123").param("lon", "456.456")
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print()
//        );
//
//    }

}
