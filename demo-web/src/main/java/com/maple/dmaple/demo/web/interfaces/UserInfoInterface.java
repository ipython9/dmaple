package com.maple.dmaple.demo.web.interfaces;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maple.dmaple.demo.pojo.interfaces.IUserService;
import com.maple.dmaple.demo.pojo.model.UserVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/25 0:00
 */
@Service
public class UserInfoInterface implements UserInterface{
        @Reference(version = "1.0.1")
        private IUserService iUserService;
    public List<UserVo> getlist() {
        UserVo user = new UserVo();
        List<String> userNames = new ArrayList<>();
        userNames.add("2");
        userNames.add("3");
        userNames.add("4");
        user.setUserNames(userNames);
        return iUserService.selectList(user);
    }

}
