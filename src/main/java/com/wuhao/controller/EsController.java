package com.wuhao.controller;

import com.wuhao.domain.User;
import com.wuhao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EsController {

    @Autowired
    private UserRepository  userRepository;

    /**
     * 数据添加进es
     */
    @RequestMapping("/addUser2Es")
    public void addUser2Es(){
        User user= new User();
        user.setId(1L);
        user.setAddress("北京");
        user.setSex("男");
        user.setUserName("mike");
        userRepository.index(user);
    }

    /**
     * 从es查询数据
     */
    @RequestMapping("/query")
    public String query(){
        List<User> userList = userRepository.findByUserNameLike("mike");
        return userList.toString();

    }


}
