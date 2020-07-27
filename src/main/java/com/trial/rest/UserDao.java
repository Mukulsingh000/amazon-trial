package com.trial.rest;

import java.util.ArrayList;
import java.util.List;


import com.trial.rest.Model.Users;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public static int usersCount=0;  
    //creating an instance of ArrayList  
    private static List<Users> users=new ArrayList<>();  
    
    //method that retrieve all users from the list  
    public List<Users> findAll()  
    {  
        return users;  
    }  
    //method that add the user in the list   
    public Users save(Users user)  
    {  
            user.setId(++usersCount);
            users.add(user);  
            return user;  
    }

    public Users findOne(int id)
    {
        for(Users user: users){
            if(user.getId() == id)
                return user;
        }
        return null;
    }



    
}