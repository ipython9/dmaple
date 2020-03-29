package com.maple.dmaple.demo.web.controller;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.config.annotation.Reference;
import com.maple.dmaple.demo.pojo.interfaces.IUserService;
import com.maple.dmaple.demo.pojo.model.UserVo;
import com.maple.dmaple.demo.web.interfaces.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/2/15 22:02
 */
@Controller
@RequestMapping("index")
public class IndexController {
    @Reference(version = "1.0.1")
    private IUserService iUserService;
    @Autowired
    private UserInterface userInterface;

    @RequestMapping("hello")
    @ResponseBody
    public String Index(){
        String username = iUserService.findUserById(1).getUsername();
        System.out.println(username);
        return  username;
    }

    @RequestMapping("selectList")
    @ResponseBody
    public List<UserVo> selectList(){
        List<UserVo> getlists =new  ArrayList<>();
        getlists =  userInterface.getlist();
        System.out.println(getlists);
        return getlists;
    }
}
