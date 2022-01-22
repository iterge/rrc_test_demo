package com.iterge.rrc_test_demo;

import com.iterge.rrc_test_demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RrcTestDemoApplicationTests {
    @Autowired
    private TestService service;

    @Test
    void contextLoads() {
        List list = service.selectAll();
        System.out.println(list.size());
    }

}
