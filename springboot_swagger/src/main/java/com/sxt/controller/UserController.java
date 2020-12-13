package com.sxt.controller;

import com.sxt.domain.User;
import com.sxt.utils.ResultObj;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("user")
@Api(tags = "用户管理2")
public class UserController {

    @GetMapping("hello")
    @ApiOperation(value = "你好swgger",consumes = "测试",notes = "测试用")
    public ResultObj hello(){
        return new ResultObj(110,"你好，swgger");
    }

    @ApiOperation(value = "新增用户",notes = "新增注册")
    @RequestMapping(value = "createUser",method = RequestMethod.POST)
    public ResultObj createUser(@RequestBody User user){
        System.out.println("createUser:::"+user.toString());
        return new ResultObj(HttpStatus.OK.value(),"新增成功");
    }

    @ApiOperation(value = "更新用户",notes = "更新用户")
    @RequestMapping(value = "updateUser",method = RequestMethod.POST)
    public RequestBody updateUser(@RequestBody User user){
        System.out.println("updateUser:::"+user.toString());
        return (RequestBody) new ResultObj(HttpStatus.OK.value(),"更新成功");
    }

    @ApiOperation(value = "删除用户",notes = "删除用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId",value = "用户标识",required = true,paramType = "query",dataType = "String")
    })
    @RequestMapping(value = "deleteUser",method = RequestMethod.DELETE)
    public ResultObj deleteUser(@RequestParam("userId") String userId){
        System.out.println("deleteUser:::"+userId);
        return new ResultObj(HttpStatus.OK.value(),"删除成功");
    }

    @ApiOperation(value = "查询用户",notes = "查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId",value = "用户标识",required = true,paramType = "query",dataType = "Integer")
    })
    @RequestMapping(value = "queryUser",method = RequestMethod.GET)
    public ResultObj queryUser(@RequestParam("userId") Integer userId){
        System.out.println("queryUser:::"+userId);
        User user = new User(userId,"张天爱","湖南",new Date());
        return new ResultObj(HttpStatus.OK.value(),user);
    }
}
