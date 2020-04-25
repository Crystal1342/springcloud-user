package com.syb.user.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.syb.user.entity.T_user;
import com.syb.user.service.IT_userService;
import com.syb.user.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author syb
 * @since 2020-04-23
 */
@RestController
@RequestMapping("/user")
public class T_userController {

    @Autowired
    private IT_userService it_userService;

    @RequestMapping("getList")
    public ResultEntity getlist(@RequestParam(defaultValue = "1")Integer current,
                                @RequestParam(defaultValue = "3")Integer size, T_user user){
        Page<T_user> page = new Page<>(current,size);
        IPage<T_user> pageInfo = it_userService.getlist(page,user);
        return ResultEntity.ok(pageInfo);
    }

    //@RequestMapping("insert")
    @PostMapping("insert")
    public ResultEntity insert(T_user t_user){
        boolean flag = it_userService.save(t_user);
        return ResultEntity.ok(flag);
    }

    @RequestMapping("update")
    public ResultEntity update(T_user t_user){
        boolean flag = it_userService.updateById(t_user);
        return ResultEntity.ok(flag);
    }

    @RequestMapping("delete")
    public ResultEntity delete(Integer uid){
        return ResultEntity.ok(it_userService.removeById(uid));
    }

    @RequestMapping("/deletes")
    public ResultEntity delete(Integer ids[]){
        //返回boolean
        boolean flag = it_userService.removeByIds(Arrays.asList(ids));
        //返回一个boolean值
        return ResultEntity.ok(flag);
    }

}

