package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.User;
import com.example.demo.service.Userservice;

@RestController
public class Usercontroller {
@Autowired
    Userservice us;

    @PostMapping("/post/user")
    public User addLoginData( @RequestBody User ul)
    {
       return us.post(ul) ;
    }

    //get
    @GetMapping("/get/user")
    public ResponseEntity<List<User>> showLoginDate()
    {
        return new ResponseEntity<>(us.getUser(),HttpStatus.OK);


    }

    //put
    @PutMapping("/put/user/{name}")
    public ResponseEntity<User> updateLogin(@PathVariable("name") String name,@RequestBody User u )
    {   
        if(us.update(name, u)==true)
        {

            return new ResponseEntity<>(u,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    //DELETE
    @DeleteMapping("/delete/user/{name}")
    public ResponseEntity<Boolean> deleteLogin(@PathVariable("name") String name)
    {
        if(us.delete(name)==true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

    
}

