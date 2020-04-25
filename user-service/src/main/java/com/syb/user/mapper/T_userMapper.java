package com.syb.user.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.syb.user.entity.T_user;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author syb
 * @since 2020-04-23
 */
public interface T_userMapper extends BaseMapper<T_user> {

    IPage<T_user> getlist(Page<T_user> page, T_user user);

    Object insertUser(T_user user);
}
