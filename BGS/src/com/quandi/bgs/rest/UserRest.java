/*
 * �� �� ��:  UserRest.java
 * ��    ��:  UserRest.java
 * ʱ    ��:  2013-6-6
 */
package com.quandi.bgs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.quandi.bgs.bean.User;
import com.quandi.bgs.service.UserService;
import com.quandi.bgs.util.RestResult;

/**
 * �û�Rest��������
 * 
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-6]
 */

@Path("/user")
public class UserRest
{
    /**
     * jacksonת������
     */
    private static ObjectMapper objectMapper = new ObjectMapper();
    
    /**
     * User���ݷ�����
     */
    private UserService userService;
    
    /**
     * ���� userService
     * 
     * @param ��userService���и�ֵ
     */
    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }
    
    /**
     * 
     * ����ID��ѯUser����
     * 
     * @param userID
     * @return
     * @throws Exception
     * @see [�ࡢ��#��������#��Ա]
     */
    @GET
    @Path("/{userID}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getUserByUserID(@PathParam("userID")
    String userID)
        throws Exception
    {
        User user = userService.findUser(userID);
        return objectMapper.writeValueAsString(user);
    }
    
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)  
    @Produces(MediaType.APPLICATION_JSON)
    public String addUser(@FormParam("age")
    String age, @FormParam("name")
    String name)
    {
        RestResult restResult = new RestResult();
        
        try
        {
            User user = new User();
            user.setAge(Integer.parseInt(age));
            user.setName(name);
            userService.insertUser(user);
        }
        // TODO ����������������
        catch (Exception e)
        {
            restResult.setResultCode("-1");
            restResult.setResultMsg(e.getMessage());
        }
        restResult.setResultCode("0");
        try
        {
            return objectMapper.writeValueAsString(restResult);
        }
        catch (JsonProcessingException e)
        {
            // TODO �쳣�����֧���ܹ�
            return "�ڲ�����";
        }
    }
}
