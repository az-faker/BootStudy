package com.study.bootstudy.controller;

import com.study.bootstudy.basic.RpcResponse;
import com.study.bootstudy.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserController实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-03-18 17:44:24
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value = "获取用户列表", notes = "")
    @GetMapping("/")
    public RpcResponse<List<User>> getUserList() {
        List<User> r = new ArrayList<>(users.values());
        return RpcResponse.success(r);
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User")
    @PostMapping("/")
    public RpcResponse<User> postUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return RpcResponse.success(user);
    }

    @ApiOperation(value = "获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户Id")
    @GetMapping(value="/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @ApiOperation(value = "更新用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    })
    @PutMapping(value="/{id}")
    public String putUser(@PathVariable Long id, @ModelAttribute User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @DeleteMapping(value="/{id}")
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }
}
