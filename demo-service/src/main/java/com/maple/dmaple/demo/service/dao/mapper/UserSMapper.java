package com.maple.dmaple.demo.service.dao.mapper;


import com.maple.dmaple.demo.pojo.bo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/12 10:04
 */
@Repository
public interface UserSMapper {

    List<User> selectList(User user);
}
