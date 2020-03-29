package com.maple.dmaple.demo.service.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.maple.dmaple.demo.pojo.bo.User;
import com.maple.dmaple.demo.pojo.model.UserVo;
import com.maple.dmaple.demo.service.dao.mapper.UserMapper;
import com.maple.dmaple.demo.service.dao.mapper.UserSMapper;
import com.maple.dmaple.demo.pojo.interfaces.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/7 23:42
 */
@Component
@Service(version = "1.0.1")
public class UserServiceImpl implements IUserService {
    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserSMapper userSMapper;


    @Override
    public UserVo findUserById(Integer userId){
        User user = userMapper.selectByPrimaryKey(userId);
        log.info("user{}",JSON.toJSONString(user));
        UserVo userVo = new UserVo();
//        if()
//        userVo.setUsername();
        BeanUtils.copyProperties(user,userVo);
        log.info("uservo{}",JSON.toJSONString(userVo));
        return userVo ;
    }

    @Override
    public List<UserVo> selectList(UserVo userVo) {
        User user = new User();
        List<UserVo> userVos = new ArrayList<>();
        BeanUtils.copyProperties(userVo,user);
        List<User> users = userSMapper.selectList(user);
        if(!CollectionUtils.isEmpty(users)){

            for (User user1 : users) {
                UserVo userVo1 = new UserVo();
                BeanUtils.copyProperties(user1,userVo1);
                userVos.add(userVo1);
            }
        }
        return userVos;
    }
}
