package com.quandi.bgs.service;

import com.quandi.bgs.bean.User;

public interface UserService
{
    public User findUser(String userID) throws Exception;
    
    public void insertUser(User user) throws Exception;
}
