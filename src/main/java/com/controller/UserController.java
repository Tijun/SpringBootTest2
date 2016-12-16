package com.controller;

import com.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2016/12/16.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    public UserService userService;

    @GetMapping("/{id}")
    public Object findUserById(@PathVariable("id")Integer id){
        logger.info("find userId = "+id);
        return userService.findUserById(id);
    }
}
