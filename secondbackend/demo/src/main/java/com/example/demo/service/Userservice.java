package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.modal.User;
import com.example.demo.repository.Userrepo;

@Service
public class Userservice
 {

    @Autowired
    Userrepo ur;

    //post
    public User post(User u)
    {
        return ur.save(u);
    }
    
    //get
    public List<User> getUser() {
        return ur.findAll();
    }

    //get by id
    public Optional<User> get(String name) {
        return ur.findById(name);
    }
   
    //update
    public boolean update(String name,User u)
    {
        if(this.get(name)==null)
        {
            return false;
        }
        try{
              ur.save(u);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

       //delete
       public boolean delete(String name)
       {
           if(this.get(name)==null)
           {
               return false;
           }
           ur.deleteById(name);
           return true;
       } 
  }

