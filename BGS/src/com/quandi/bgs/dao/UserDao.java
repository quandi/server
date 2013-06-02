package com.quandi.bgs.dao;

import com.quandi.bgs.bean.User;

public interface UserDao
{
    public User findUser(String userID) throws Exception;
    
    public void insertUser(User user) throws Exception;
}
