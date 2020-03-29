package com.maple.dmaple.demo.service;

import com.maple.dmaple.demo.pojo.interfaces.IUserService;
import com.maple.dmaple.demo.pojo.model.UserVo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class DemoServiceApplicationTests {

    @Autowired
    IUserService iUserService;
    @Test
    void contextLoads() {
        UserVo userById = iUserService.findUserById(1);
        System.out.println(userById.getUsername());
    }

}
