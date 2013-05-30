package com.quandi.bgs.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.quandi.bgs.bean.User;

public class UserDao
{
    
    private SqlSessionTemplate sqlSession;
    
    public void setSqlSession(SqlSessionTemplate sqlSession)
    {
        this.sqlSession = sqlSession;
    }
    
    public User selectUser()
    {
        User user = null;
        try
        {
            user = (User)sqlSession.selectOne("UserInfo.selectUser", "1");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return user;
    }
    
}
