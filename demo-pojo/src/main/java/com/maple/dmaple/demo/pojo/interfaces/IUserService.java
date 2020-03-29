package com.maple.dmaple.demo.pojo.interfaces;


import com.maple.dmaple.demo.pojo.model.UserVo;

import java.util.List;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/7 23:41
 */
public interface IUserService {
    UserVo findUserById(Integer userId);

    List<UserVo> selectList(UserVo userVo);

}
