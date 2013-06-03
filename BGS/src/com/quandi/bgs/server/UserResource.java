package com.quandi.bgs.server;

import java.io.Writer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.quandi.bgs.bean.User;

@Component
@Path("/user")
public class UserResource
{
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getUser() throws JsonProcessingException
    {
        User user = new User();
        user.setAge(22);
        user.setName("girl");
        user.setId("123");
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(user);
        return s;
    }
}