package com.syb.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author syb
 * @since 2020-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class T_user implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private String uname;

    private Integer did;

    private Date birthday;

    private Date createtime;

    private String imgurl;

    private String proviceld;

    private String cityId;


}
