package com.maple.dmaple.demo.pojo.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/2/15 22:03
 */
public class UserVo implements Serializable {
    private static final long serialVersionUID = -8673903611813161395L;
    private Integer userid;

    private String username;

    private List<String> userNames;

    public List<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
