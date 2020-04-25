package com.syb.user.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.syb.user.entity.T_user;
import com.syb.user.mapper.T_userMapper;
import com.syb.user.service.IT_userService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author syb
 * @since 2020-04-23
 */
@Service
public class T_userServiceImpl extends ServiceImpl<T_userMapper, T_user> implements IT_userService {

    @Autowired
    private T_userMapper t_userMapper;

    @Override
    public IPage<T_user> getlist(Page<T_user> page, T_user user) {
        return t_userMapper.getlist(page,user);
    }

    @Override
    public Object insert(T_user user) {
        return t_userMapper.insertUser(user);
    }
}
