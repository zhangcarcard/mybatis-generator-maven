package com.slx.zsxt.dao;

import com.slx.zsxt.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userInstid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userInstid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}