package com.zheng.controller;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zheng.model.User;
import com.zheng.service.UserService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@Api(description = "用户信息查询")
@RequestMapping(value = "user")
public class UserController {
	
    @Resource  
    private UserService userService;

    @ApiOperation(value = "根据用户id获取用户对象", httpMethod = "GET",  notes = "根据用户id获取用户对象")
    @RequestMapping(value = "info",method = RequestMethod.GET)
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "用户id", required = true, paramType = "query", dataType = "String")
    })
    public ModelAndView getIndex(String id){
        ModelAndView mav = new ModelAndView("index");
        User user = userService.selectUserById(Integer.valueOf(id));
        mav.addObject("user", user);   
        return mav;    
    }

    @ApiOperation(value = "获取用户列表", httpMethod = "GET",  notes = "获取用户列表")
    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAll(){
        List<User> resultList = new ArrayList<User>();
        resultList=userService.getAll();
        return resultList;
    }
}
