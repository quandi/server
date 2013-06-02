package com.quandi.bgs.service.impl;

import com.quandi.bgs.bean.User;
import com.quandi.bgs.dao.UserDao;
import com.quandi.bgs.service.UserService;

public class UserServiceImpl implements UserService
{
    private UserDao userDao;
    
    @Override
    public User findUser(String userID)
        throws Exception
    {
        return this.userDao.findUser(userID);
    }
    
    @Override
    public void insertUser(User user)
        throws Exception
    {
        this.userDao.insertUser(user);
        //throw new Exception("≤‚ ‘“Ï≥£ªÿπˆ£°");
    }
    
    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }
    
}
