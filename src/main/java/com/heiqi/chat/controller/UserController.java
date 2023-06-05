package com.heiqi.chat.controller;

import com.heiqi.chat.entity.User;
import com.heiqi.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/id/{UserId}")
    public User getUserById(@PathVariable("UserId") int UserId) {
        return userService.getUserById(UserId);
    }

    @GetMapping("/name/{UserName}")
    public User getUserByName(@PathVariable("UserName") String UserName) {
        return userService.getUserByName(UserName);
    }

    @GetMapping("/age/{Age}")
    public User getUserByAge(@PathVariable("Age") int Age) {
        return userService.getUserByAge(Age);
    }

    // 这里写更多的 getter 函数...

    @PostMapping("/")
    public void insertUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    @DeleteMapping("/{UserId}")
    public void deleteUser(@PathVariable("UserId") int UserId) {
        userService.deleteUser(UserId);
    }

    @PutMapping("/{UserId}/name")
    public void updateUserName(@PathVariable("UserId") int UserId, @RequestBody String UserName) {
        userService.updateUserName(UserId, UserName);
    }

    @PutMapping("/{UserId}/age")
    public void updateUserAge(@PathVariable("UserId") int UserId, @RequestBody int Age) {
        userService.updateUserAge(UserId, Age);
    }

    // 这里写更多的 setter 函数...
}