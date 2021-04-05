package com.zyw.dao;

import com.zyw.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * Query the list of users
     */
    @Select("select * from user")
    public abstract List<User> findAll();

    /**
     * Query a user by using its id number
     */
    @Select(" select * from user where id = #{userId} ")
    public abstract User findOneById(Integer id);

    /**
     * Update a user that predetermined
     * @param user
     */
    @Update(" update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id} ")
    public abstract void updateUser(User user);
}
