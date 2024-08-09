package com.melizalde_ds.springboot_test.java_api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @RequestMapping("/get")
    public String getUser() {
        return "User";
    }

    @RequestMapping("/get/{id}")
    public String getUserById(@PathVariable String id) {
        return "User with id: " + id;
    }

    @RequestMapping("/getAll")
    public String getAllUsers() {
        return "All Users";
    }

    @RequestMapping("/add")
    public String addUser() {
        return "User Added";
    }

    @RequestMapping("/update")
    public String updateUser() {
        return "User Updated";
    }

    @RequestMapping("/delete")
    public String deleteUser() {
        return "User Deleted";
    }

}
