package com.example.myswaggertomacdowndemo.controller;

import com.example.myswaggertomacdowndemo.entity.User;
import com.example.myswaggertomacdowndemo.service.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/api")
public class UserManageController {
    @Autowired
    private IUserService userService;

    @PostMapping(value = "/getUser", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @ApiOperation(value = "获取用户信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "user", value = "用户对象1")})
    public User getUser(@RequestBody User user) {
        return userService.getUser();
    }

    @GetMapping(value = "/getName")
    @ApiOperation(value = "get方法测试服务通否")
    public String get() {
        return "gmm";
    }


}
