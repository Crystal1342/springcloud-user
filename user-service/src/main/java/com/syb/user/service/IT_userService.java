package com.syb.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.syb.user.entity.T_user;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author syb
 * @since 2020-04-23
 */
public interface IT_userService extends IService<T_user> {

    IPage<T_user> getlist(Page<T_user> page, T_user user);

    Object insert(T_user user);
}
