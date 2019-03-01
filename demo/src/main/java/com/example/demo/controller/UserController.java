package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.BaseResult;
import com.example.demo.entity.PageResult;
import com.example.demo.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lu shun zhi
 * @version 2.0.0
 * @date 2019/2/27 17:06
 */

@RestController
public class UserController {

    @Resource
    UserMapper userMapper;

    @RequestMapping(value = "selectUser")
    public BaseResult select() {
        List<User> users = userMapper.selectUser();
        BaseResult baseResult = new BaseResult(BaseResult.SUCCESS, "查询成功", users);
        return baseResult;
    }

    @RequestMapping(value = "addUser")
    @PostMapping
    public BaseResult add(@RequestBody User user) {
        userMapper.addUser(user);

        return new BaseResult(BaseResult.SUCCESS, "添加成功");
    }

    @RequestMapping(value = "updateUser")
    @PostMapping
    public BaseResult update(@RequestBody User user) {
        userMapper.updateUser(user);

        return new BaseResult(BaseResult.SUCCESS, "修改成功");
    }

    @RequestMapping(value = "deleteUser/{id}")
    public BaseResult delete(@PathVariable("id") int id) {
        int i = userMapper.deleteUser(id);
        if (i == 0) {
            return new BaseResult(BaseResult.FAIL, "删除失败");
        } else
            return new BaseResult(BaseResult.SUCCESS, "删除成功");
    }
}
