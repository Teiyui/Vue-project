package com.zyw.test;

import com.zyw.domain.User;
import com.zyw.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Test for service of user
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll(){
        List<User> users = userService.findAll();
        System.out.println(users);
    }

    @Test
    public void testFindOneById(){
        User user = userService.findOneById(1);
        System.out.println(user);
    }

    @Test
    public void testUpdate(){
        User user = userService.findOneById(1);
        System.out.println("Before updated : "+user);

        user.setAge(55);
        userService.updateUser(user);

        user = userService.findOneById(1);
        System.out.println("After updated : "+user);
    }
}
