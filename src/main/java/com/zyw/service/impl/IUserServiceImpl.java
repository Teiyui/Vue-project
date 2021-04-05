package com.zyw.service.impl;

import com.zyw.dao.IUserDao;
import com.zyw.domain.User;
import com.zyw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    public List<User> findAll() {
        return iUserDao.findAll();
    }

    @Override
    public User findOneById(Integer id) {
        return iUserDao.findOneById(id);
    }

    @Override
    public void updateUser(User user) {
        iUserDao.updateUser(user);
    }
}
