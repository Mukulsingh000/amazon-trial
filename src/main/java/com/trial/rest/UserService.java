package com.trial.rest;


import java.util.List;
import com.trial.rest.Model.Users;
import org.json.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    @Autowired
    private UserDao service;

    //method that gets every user
    @GetMapping("/users")
    public List<Users> retrieveAllUsers()
    {
        return service.findAll();
    }

    //method that posts a new user detail   
    @PostMapping("/users")  
    public ResponseEntity<?> createUser(@RequestBody Users user)
    {
        service.save(user);      
        JSONObject response = new JSONObject();
        response.put("id", user.getId());

        return new ResponseEntity<> (response.toMap(),HttpStatus.CREATED);
    }
    
}