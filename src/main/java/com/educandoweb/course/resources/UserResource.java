package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserResource {

    @RequestMapping(value = "/users")
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "samuel", "samuel@gmail.com", "99999999", "12345");

        return ResponseEntity.ok().body(u);
    }

}


