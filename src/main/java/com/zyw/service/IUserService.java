package com.zyw.service;

import com.zyw.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户的业务层接口
 */
public interface IUserService {

    /**
     * Query the list of users
     */
    public abstract List<User> findAll();

    /**
     * Query a user by using its id number
     */
    public abstract User findOneById(Integer id);

    /**
     * Update a user that predetermined
     * @param user
     */
    public abstract void updateUser(User user);
}
