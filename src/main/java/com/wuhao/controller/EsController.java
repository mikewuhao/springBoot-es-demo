package com.wuhao.controller;

import com.wuhao.domain.User;
import com.wuhao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EsController {

    @Autowired
    private UserRepository  userRepository;

    @RequestMapping("/addUser2Es")
    public void addUser2Es(){
        User user= new User();
        user.setId(1L);
        user.setAddress("北京");
        user.setSex("男");
        user.setUsername("小吴");
        userRepository.index(user);
    }



}
