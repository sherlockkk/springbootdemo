package com.sherlockkk.mybatisannotation.controller;

import com.sherlockkk.mybatisannotation.entity.User;
import com.sherlockkk.mybatisannotation.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

  @Autowired
  private UserMapper userMapper;

  @GetMapping("/find/{id}")
  public User findOneUserById(@PathVariable long id) {
    return userMapper.findOne(id);
  }

  @GetMapping("index")
  public String index() {
    return "Hello";
  }
}
